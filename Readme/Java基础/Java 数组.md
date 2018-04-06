# Java 数组

### 1. 二维数组

- s[0]=new String[2] 和 s[1]=new String[3] 是为最高维分配引用空间，也就是为最高维限制其能保存数据的最长的长度，然后再为其每个数组元素单独分配空间 s0=new String("Good") 等操作。

```java
String s[][] = new String[2][];
s[0] = new String[2];
s[1] = new String[3];
s[0][0] = new String("Good");
s[0][1] = new String("Luck");
s[1][0] = new String("to");
s[1][1] = new String("you");
s[1][2] = new String("!");
```

### Arrays 类

- java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。
  - 给数组赋值：通过 fill 方法。
  - 对数组排序：通过 sort 方法,按升序。
  - 比较数组：通过 equals 方法比较数组中元素值是否相等。
  - 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。

### 2. foreach循环

```java
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (double element: myList) {
         System.out.println(element);
      }
   }
}
```
