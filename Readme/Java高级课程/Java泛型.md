# Java 泛型

Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。
泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。

## 泛型方法

你可以写一个泛型方法，该方法在调用时可以接收不同类型的参数。根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用。

下面是定义泛型方法的规则：

- 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
- 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
- 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
- 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。

#### 有界的类型参数:

可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。

要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。

```java
public class GenericDemo {
    public static void main(String[] args) {
        Integer[] numArray = {1,2,3,4};
        String[] strArray = {"sjakdbk","akjsbd","ahsvdjag"};

        printArray(numArray);
        printArray(strArray);

        int max = maxValue(1,2,3);
        String maxStr = maxValue("apple","pig","dog");

        System.out.println(max);
        System.out.println(maxStr);
    }

    public static <T> void printArray(T[] array) {
        for (T element :
                array
             ) {
            System.out.println(element);
        }
    }

    public static <T extends Comparable<T>> T maxValue(T x, T y, T z) {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }

}
```

## 泛型类

泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。

和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，
是用于指定一个泛型类型名称的标识符。因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。

```java
public class Box<T> {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.setT(5);
        stringBox.setT("Generic");

        System.out.println(integerBox.getT());
        System.out.println(stringBox.getT());
    }
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
```

## 类型通配符

- 类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
- 类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
- 类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如Objec类型的实例。

```java
package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        integers.add(4);
        strings.add("mser");

        getData(strings);
        getNumData(integers);
        // getNumData("mser"); error
    }

    public static void getData(List<?> list) {
        System.out.println(list.get(0));
    }

    public static void getNumData(List<? extends Number> data) {
        System.out.println(data.get(0));
    }
}

```

```java
<? extends T>和<? super T>的区别
<? extends T>表示该通配符所代表的类型是T类型的子类。
<? super T>表示该通配符所代表的类型是T类型的父类。

```


