# Java 异常处理

异常是程序中的一些错误，但并不是所有的错误都是异常，并且错误有时候是可以避免的。

- 比如说，你的代码少了一个分号，那么运行出来结果是提示是错误 java.lang.Error；如果你用System.out.println(11/0)，那么你是因为你用0做了除数，会抛出 java.lang.ArithmeticException 的异常。

异常发生的原因有很多，通常包含以下几大类：

- 用户输入了非法数据。
- 要打开的文件不存在。
- 网络通信时连接中断，或者JVM内存溢出。
- 这些异常有的是因为用户错误引起，有的是程序错误引起的，还有其它一些是因为物理错误引起的。

要理解Java异常处理是如何工作的，你需要掌握以下三种类型的异常：

- 检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。
- 运行时异常： 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
- 错误： 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。

#### Exception 类的层次

所有的异常类是从 java.lang.Exception 类继承的子类。

1. Exception 类是 Throwable 类的子类。除了Exception类外，Throwable还有一个子类Error 。

2. Java 程序通常不捕获错误。错误一般发生在严重故障时，它们在Java程序处理的范畴之外。

3. Error 用来指示运行时环境发生的错误。

   - 例如，JVM 内存溢出。一般地，程序不会从错误中恢复。

4. 异常类有两个主要的子类：IOException 类和 RuntimeException 类。


- 捕获异常

```java
import java.io.*;
public class ExcepTest{
 
   public static void main(String args[]){
      try{
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
      
   }
   
}
```

- 多重捕获块


#### throws/throw 关键字：

- 如果一个方法没有捕获一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
- 也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。

下面方法的声明抛出一个 RemoteException 异常：

```java
import java.io.*;
public class className
{
  public void deposit(double amount) throws RemoteException
  {
    // Method implementation
    throw new RemoteException();
  }
  //Remainder of class definition
}
```

一个方法可以声明抛出多个异常，多个异常之间用逗号隔开。

```java
import java.io.*;
public class className
{
   public void withdraw(double amount) throws RemoteException, InsufficientFundsException
   {
       // Method implementation
   }
   //Remainder of class definition
}
```

#### finally关键字

- finally 关键字用来创建在 try 代码块后面执行的代码块。
- 无论是否发生异常，finally 代码块中的代码总会被执行。
- 在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。
- finally 代码块出现在 catch 代码块最后，语法如下：



