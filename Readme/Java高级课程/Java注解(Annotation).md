# Java注解

### 参考连接
<ul>
    <li>
        <a href="https://zhuanlan.zhihu.com/p/27643133">知乎专栏-注解入门</a>
    </li>
</ul>


## 源注解


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
