# Java反射

![反射](https://pic4.zhimg.com/80/v2-4face8109e0d52ef5894c41c69e4ec6b_hd.jpg)

1. 什么是反射
    - 反射(Reflection)是Java 程序开发语言的特征之一，它允许运行中的 Java 程序获取自身的信息，并且可以操作类或对象的内部属性。
    - 通过反射，我们可以在运行时获得程序或程序集中每一个类型的成员和成员的信息。
    - 程序中一般的对象的类型都是在编译期就确定下来的，而Java反射机制可以动态地创建对象并调用其属性，这样的对象的类型在编译期是未知的。所以我们可以通过反射机制直接创建对象，即使这个对象的类型在编译期是未知的。
    - 反射的核心是JVM在运行时才动态加载类或调用方法/访问属性，它不需要事先（写代码的时候或编译期）知道运行对象是谁。
2. Java反射框架主要提供以下功能：
    1. 在运行时判断任意一个对象所属的类；
    2. 在运行时构造任意一个类的对象；
    3. 在运行时判断任意一个类所具有的成员变量和方法（通过反射甚至可以调用private方法）；
    4. 在运行时调用任意一个对象的方法
    5. 重点：是运行时而不是编译时
3. 反射的基本运用
    1. 获得Class对象
        - 使用Class类的forName静态方法: 得到字节码文件对象
            - public static Class<?> forName(String className)
        - 直接获取某一个对象的class
            - Class<?> klass = int.class;
            - Class<?> classInt = Integer.TYPE;
        - 调用某个对象的getClass()方法
            - StringBuilder str = new StringBuilder("123");
            - Class<?> klass = str.getClass();
    1. 判断是否为某个类的实例
        - 一般地，我们用instanceof关键字来判断是否为某个类的实例。同时我们也可以借助反射中Class对象的isInstance()方法来判断是否为某个类的实例，它是一个Native方法。
            - public native boolean isInstance(Object obj);
    1. 创建实例（两种方式）
        - 使用Class对象的newInstance()方法来创建Class对象对应类的实例
            - Class<?> c = String.class;
            - Object str = c.newInstance();   
        - 先通过Class对象获取指定的Constructor对象，再调用Constructor对象的newInstance()方法来创建实例。这种方法可以用指定的构造器构造类的实例。
            - //获取String所对应的Class对象
            - Class<?> c = String.class;
            - //获取String类带一个String参数的构造器
            - Constructor constructor = c.getConstructor(String.class);
            - //根据构造器创建实例
            - Object obj = constructor.newInstance("23333");
            - System.out.println(obj);
    1. 获取方法
        - getDeclaredMethods()方法返回类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
        - getMethods()方法返回某个类的所有公用（public）方法，包括其继承类的公用方法。
        - getMethod方法返回一个特定的方法，其中第一个参数为方法名称，后面的参数为方法的参数对应Class的对象。
    1. 调用方法
        - 当我们从类中获取了一个方法后，我们就可以用invoke()方法来调用这个方法。
    1. 利用反射创建数组
4. 反射注意事项
    - 由于反射会额外消耗一定的系统资源，因此如果不需要动态地创建一个对象，那么就不需要用反射。
    - 另外，反射调用方法时可以忽略权限检查，因此可能会破坏封装性而导致安全问题。

## Code

```java
//invoke方法的原型为:
public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
```

```java
package annotation;

import inheritance.Animal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        //直接获取一个对象的class
        Class<?> klass = int.class;
        Class<?> classInt = Integer.TYPE;
        System.out.println(klass);
        System.out.println(classInt);

        //调用某个对象的geClass方法
        StringBuilder str = new StringBuilder("name");
        Class<?> klass1 = str.getClass();
        System.out.println(klass1);

        var result = str.getClass().isInstance("StringBuilder");
        System.out.println(result);

        //创建实例
        //使用Class对象的newInstance()方法来创建Class对象对应类的实例
        Class<?> c = String.class;
        Object string = c.newInstance();
        string = "Tom";
        System.out.println(string);
        System.out.println(string.getClass());
        //先通过Class对象获取指定的Constructor对象，再调用Constructor对象的newInstance()方法来创建实例。这种方法可以用指定的构造器构造类的实例。
        Class<?> cs = String.class;
        try {
            Constructor constructor = cs.getConstructor(String.class);
            Object obj = constructor.newInstance("Jack");
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------");

        //获取方法
        Class<?> demo = AnnotationDemo.class;
        Object ojbk = demo.newInstance();

        //获取所有方法
        Method[] methods = demo.getMethods();
        Method[] declaredMethods = demo.getDeclaredMethods();

        //获取该类的Fun1方法
        Method method = demo.getMethod("Fun3",int.class,String.class);
        Method m2 = demo.getMethod("Func4");


        for (Method m :
                methods) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("Fun3:" + method);
        System.out.println("Fun4:" + m2);

        //调用方法
        var rs = method.invoke(ojbk,1,"1232");
        System.out.println(rs);

        System.out.println("========================================");

        // 利用反射创建数组
        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls,25);

        Array.set(array,1,"yyc");
        Array.set(array,2,"dj");
        Array.set(array,4,"dkz");

        for (int i = 0; i < 5; i++) {
            System.out.println(Array.get(array,i));
        }
    }

    protected void Fun1(int a, String b) {}
    private int Fun2() {return 0;}
    public void Fun3(int a, String b) {
        var sum = a + Integer.parseInt(b);
        System.out.println("Invoke: Fun3(), sum=" + sum);
        return;
    }
    public void Func4() {}


}
```
## 参考链接

<a href="https://www.zhihu.com/question/24304289">知乎：如何理解反射<a>
<a href="http://www.sczyh30.com/posts/Java/java-reflection-1/">深入理解Java反射<a>