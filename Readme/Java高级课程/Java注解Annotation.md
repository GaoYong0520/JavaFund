# Java注解

### 参考连接
<ul>
    <li>
        <a href="https://zhuanlan.zhihu.com/p/27643133">知乎专栏-注解入门</a>
    </li>
</ul>


## 源注解

- 元注解是可以注解到注解上的注解，或者说元注解是一种基本注解，但是它能够应用到其它的注解上面。
- 如果难于理解的话，你可以这样理解。元注解也是一张标签，但是它是一张特殊的标签，它的作用和目的就是给其他普通的标签进行解释说明的。
- 元标签有 @Retention、@Documented、@Target、@Inherited、@Repeatable 5 种。

1. @Retention
    - RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
    - RetentionPolicy.CLASS 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
    - RetentionPolicy.RUNTIME 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。
2. @Documented
    - 顾名思义，这个元注解肯定是和文档有关。它的作用是能够将注解中的元素包含到 Javadoc 中去。
3. @Target
    - Target 是目标的意思，@Target 指定了注解运用的地方。
    - ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
    - ElementType.CONSTRUCTOR 可以给构造方法进行注解
    - ElementType.FIELD 可以给属性进行注解
    - ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
    - ElementType.METHOD 可以给方法进行注解
    - ElementType.PACKAGE 可以给一个包进行注解
    - ElementType.PARAMETER 可以给一个方法内的参数进行注解
    - ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举
4. @Inherited
    - Inherited 是继承的意思，但是它并不是说注解本身可以继承，而是说如果一个超类被 @Inherited 注解过的注解进行注解的话，那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解。
5. @Repeatable
    - Repeatable 自然是可重复的意思。@Repeatable 是 Java 1.8 才加进来的，所以算是一个新的特性。

```java
@interface Persons {
    Person[]  value();
}


@Repeatable(Persons.class)
@interface Person{
    String role default "";
}


@Person(role="artist")
@Person(role="coder")
@Person(role="PM")
public class SuperMan{

}
```

## 注解的属性

## 预定义注解

1. @override 目的在于标识某一个方法是否覆盖了它的父类的方法
2. @Deprecated
    - 属于标记注解.所谓标记注解，就是在源程序中加入这个标记后，并不影响程序的编译，但有时编译器会显示一些警告信息。
    - 用于标明已经过时的方法或类
3. @SuppressWarnnings
    - 用于有选择的关闭编译器对类、方法、成员变量、变量初始化的警告.
    - deprecation：使用了不赞成使用的类或方法时的警告；
    - unchecked：执行了未检查的转换时的警告，例如当使用集合时没有用泛型 (Generics) 来指定集合保存的类型;
    - fallthrough：当 Switch 程序块直接通往下一种情况而没有 Break 时的警告;
    - path：在类路径、源文件路径等中有不存在的路径时的警告;
    - serial：当在可序列化的类上缺少 serialVersionUID 定义时的警告;
    - finally：任何 finally 子句不能正常完成时的警告;
    - all：关于以上所有情况的警告。

## 自定义注解

> 注解本质上是一个接口

## 注解反射的关系
