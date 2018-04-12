# 重写与重载之间的区别

- 重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
- 重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。
- 重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。

| 区别点   | 重载方法 | 重写方法                                       |
| -------- | -------- | ---------------------------------------------- |
| 参数列表 | 必须修改 | 一定不能修改                                   |
| 返回类型 | 可以修改 | 一定不能修改                                   |
| 异常     | 可以修改 | 可以减少或删除，一定不能抛出新的或者更广的异常 |
| 访问     | 可以修改 | 一定不能做更严格的限制（可以降低限制）         |

```java
class Animal{
   public void move(){
      System.out.println("动物可以移动");
   }
}

class Dog extends Animal{
   public void move(){
      System.out.println("狗可以跑和走");
   }
}

public class TestDog{
   public static void main(String args[]){
      Animal a = new Animal(); // Animal 对象
      Animal b = new Dog(); Proxy

      a.move();// 执行 Animal 类的方法

      b.move();Proxy
   }
}
```

- 这是由于在编译阶段，只是检查参数的引用类型。
- 然而在运行时，Java虚拟机(JVM)指定对象的类型并且运行该对象的方法。
- 因此在上面的例子中，之所以能编译成功，是因为Animal类中存在move方法，然而运行时，运行的是特定对象的方法