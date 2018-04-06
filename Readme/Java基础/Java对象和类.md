# Java 对象和类

## 类

- 类可以看成是创建Java对象的模板。

```java
public class Dog{
  String breed;
  int age;
  String color;
  void barking(){
  }
 
  void hungry(){
  }
 
  void sleeping(){
  }
}
```

- 类的组成
  - 局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
  - 成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
  - 类变量：类变量也声明在类中，方法体之外，但必须声明为static类型。

- 构造方法

```java
public class Puppy{
    public Puppy(){
    }
 
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
    }
}
```

- 创建对象
  - 声明：声明一个对象，包括对象名称和对象类型。
  - 实例化：使用关键字new来创建一个对象。
  - 初始化：使用new创建对象时，会调用构造方法初始化对象。

```java
public class Puppy{
   public Puppy(String name){
      //这个构造器仅有一个参数：name
      System.out.println("小狗的名字是 : " + name ); 
   }
   public static void main(String []args){
      // 下面的语句将创建一个Puppy对象
      Puppy myPuppy = new Puppy( "tommy" );
   }
}
```

- 源文件声明规则

  >在本节的最后部分，我们将学习源文件的声明规则。当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。

  - 一个源文件中只能有一个public类
  - 一个源文件可以有多个非public类
  - 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
  - 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
  - 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
  - import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
  - 类有若干种访问级别，并且类也分不同的类型：抽象类和final类等。这些将在访问控制章节介绍。
  - 除了上面提到的几种类型，Java还有一些特殊的类，如：内部类、匿名类。
  
  
## 多态
## 继承
## 封装
## 抽象
## 类
## 对象
## 实例
## 方法
## 重载

