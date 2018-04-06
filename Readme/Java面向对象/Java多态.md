# Java 多态

## 多态的实现方式

- 方式一：
  - 这个内容已经在上一章节详细讲过，就不再阐述，详细可访问：Java 重写(Override)与重载(Overload)。
- 方式二：接口
  - 生活中的接口最具代表性的就是插座，例如一个三接头的插头都能接在三孔插座中，因为这个是每个国家都有各自规定的接口规则，有可能到国外就不行，那是因为国外自己定义的接口类型。
  - java中的接口类似于生活中的接口，就是一些方法特征的集合，但没有方法的实现。具体可以看 java接口 这一章节的内容。
- 方式三：抽象类和抽象方法

## 虚方法

- 我们将介绍在Java中，当设计类时，被重写的方法的行为怎样影响多态性。
- 我们已经讨论了方法的重写，也就是子类能够重写父类的方法。
- 当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。
- 要想调用父类中被重写的方法，则必须使用关键字super。

### C++虚函数与Java虚函数对比

- 在某基类中声明为 virtual 并在一个或多个派生类中被重新定 义的成员函数，用法格式为：virtual 函数返回类型 函数名（参数表） {函数体}；实现多态性，通过指向派生类的基类指针或引用，访问派生类中同名覆盖成员函数。
- Java默认就是虚函数，C++要加上virtual关键字
- java的普通成员函数（没有被static、native等关键字修饰）就是虚函数，原因很简单，它本身就实现虚函数实现的功能------多态
- 在编译的时候，编译器使用父类中的 mailCheck() 方法验证该语句， 但是在运行的时候，Java虚拟机(JVM)调用的是子类中的 mailCheck() 方法。

C++ | Java
----|-----
虚函数 | -------- | 普通函数
纯虚函数 | -------- | 抽象函数
抽象类 | -------- | 抽象类
虚基类 | -------- | 接口

- 多态引用时，构造子类对象时的构造方法的调用顺序

  - 先调用超类的构造方法，多重超类首先调用最远超类的方法；

  - 然后再执行当前子类的构造方法；

```java
public class Employee {
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number) {
      System.out.println("Employee 构造函数");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void mailCheck() {
      System.out.println("邮寄支票给： " + this.name
       + " " + this.address);
   }
   public String toString() {
      return name + " " + address + " " + number;
   }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String newAddress) {
      address = newAddress;
   }
   public int getNumber() {
     return number;
   }
}

public class Salary extends Employee
{
   private double salary; // 全年工资
   public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck() {
       System.out.println("Salary 类的 mailCheck 方法 ");
       System.out.println("邮寄支票给：" + getName()
       + " ，工资为：" + salary);
   }
   public double getSalary() {
       return salary;
   }
   public void setSalary(double newSalary) {
       if(newSalary >= 0.0) {
          salary = newSalary;
       }
   }
   public double computePay() {
      System.out.println("计算工资，付给：" + getName());
      return salary/52;
   }
}
public class virtualdemo {
   public static void main(String [] args) {
      Salary s = new Salary("员工 A", "北京", 3, 3600.00);
      Employee e = new Salary("员工 B", "上海", 2, 2400.00);
      System.out.println("使用 Salary 的引用调用 mailCheck -- ");
      s.mailCheck();
      System.out.println("\n使用 Employee 的引用调用 mailCheck--");
      e.mailCheck();
    }
}
```

```java
public class Employee {
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number) {
      System.out.println("Employee 构造函数");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void mailCheck() {
      System.out.println("邮寄支票给： " + this.name
       + " " + this.address);
   }
   public String toString() {
      return name + " " + address + " " + number;
   }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String newAddress) {
      address = newAddress;
   }
   public int getNumber() {
     return number;
   }
}

public class Salary extends Employee
{
   private double salary; // 全年工资
   public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck() {
       System.out.println("Salary 类的 mailCheck 方法 ");
       System.out.println("邮寄支票给：" + getName()
       + " ，工资为：" + salary);
   }
   public double getSalary() {
       return salary;
   }
   public void setSalary(double newSalary) {
       if(newSalary >= 0.0) {
          salary = newSalary;
       }
   }
   public double computePay() {
      System.out.println("计算工资，付给：" + getName());
      return salary/52;
   }
}

public class virtualdemo {
   public static void main(String [] args) {
      Salary s = new Salary("员工 A", "北京", 3, 3600.00);
      Employee e = new Salary("员工 B", "上海", 2, 2400.00);
      System.out.println("使用 Salary 的引用调用 mailCheck -- ");
      s.mailCheck();
      System.out.println("\n使用 Employee 的引用调用 mailCheck--");
      e.mailCheck();
    }
}

/*Employee 构造函数
Employee 构造函数
使用 Salary 的引用调用 mailCheck --
Salary 类的 mailCheck 方法
邮寄支票给：员工 A ，工资为：3600.0

使用 Employee 的引用调用 mailCheck--
Salary 类的 mailCheck 方法
邮寄支票给：员工 B ，工资为：2400.0*/
```
