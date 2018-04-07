package annotation;

import inheritance.Animal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        //class.isInstance()
        //public native boolean isInstance(Object obj);
        String s1 = "1234";
        System.out.println("s1 is instance of String:" + String.class.isInstance(s1));

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
