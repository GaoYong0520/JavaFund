# Java 方法

####命令行参数的使用

- 有时候你希望运行一个程序时候再传递给它消息。这要靠传递命令行参数给main()函数实现。
- 命令行参数是在执行程序时候紧跟在程序名字后面的信息。

```java
public class CommandLine {
   public static void main(String args[]){ 
      for(int i=0; i<args.length; i++){
         System.out.println("args[" + i + "]: " + args[i]);
      }
   }
}
```

#### 可变参数

- 在方法声明中，在指定参数类型后加一个省略号(...) 。
- 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。

```java
public class VarargsDemo {
    public static void main(String args[]) {
        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }
 
    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
 
        double result = numbers[0];
 
        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
```

#### finalize() 方法

- Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。

- 例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。

- 在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。

finalize() 一般格式是：

```java

```

```java
class Cake extends Object {  
  private int id;  
  public Cake(int id) {  
    this.id = id;  
    System.out.println("Cake Object " + id + "is created");  
  }  
    
  protected void finalize() throws java.lang.Throwable {  
    super.finalize();  
    System.out.println("Cake Object " + id + "is disposed");  
  }  
}
```

- 关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。

- 当然，Java 的内存回收可以由 JVM 来自动完成。如果你手动使用，则可以使用上面的方法。


