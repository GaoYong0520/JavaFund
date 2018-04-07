# Java 集合框架

![集合框架体系](http://www.runoob.com/wp-content/uploads/2014/01/java-coll.png)

## 集合接口

### Set和List的区别

1. Set 接口实例存储的是无序的，不重复的数据。List 接口实例存储的是有序的，可以重复的元素。
2. Set检索效率低下，删除和插入效率高，插入和删除不会引起元素位置改变 <实现类有HashSet,TreeSet>。
3. List和数组类似，可以动态增长，根据实际存储的数据的长度自动增长List的长度。查找元素效率高，插入删除效率低，因为会引起其他元素位置改变 <实现类有ArrayList,LinkedList,Vector> 。

## 集合实现类

> Java提供了一套实现了Collection接口的标准集合类。其中一些是具体类，这些类可以直接拿来使用，而另外一些是抽象类，提供了接口的部分实现。

### 标准集合类

1. LinkedList 
    - 链表 允许null 查找效率低 
    - 没有同步方法，必须自己实现访问同步 Listlist=Collections.synchronizedList(newLinkedList(...));
1. ArrayList
    - 该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时，提供更好的性能。
    - 该类也是非同步的,在多线程的情况下不要使用。
    - ArrayList 增长当前长度的50%，插入删除效率低。
1. HashSet
    - 该类实现了Set接口，不允许出现重复元素。
    - 不保证集合中元素的顺序，允许包含值为null的元素，但最多只能一个。
1. HashMap 
    - HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
    - 该类实现了Map接口，根据键的HashCode值存储数据，具有很快的访问速度，最多允许一条记录的键为null，不支持线程同步。
1. LinkedHashMap 
    - 继承于HashMap，使用元素的自然顺序对元素进行排序.

### java.util包中的类

1. Vector
    - 该类和ArrayList非常相似，但是该类是同步的，可以用在多线程的情况，该类允许设置默认的增长长度，默认扩容方式为原来的2倍。
1. Stack
    - 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
1. Dictionary
    - Dictionary 类是一个抽象类，用来存储键/值对，作用和Map类相似。
1. Hashtable
    - hashtable 是 Dictionary(字典) 类的子类，位于 java.util 包中。
1. Properties
    - Properties 继承于 Hashtable，表示一个持久的属性集，属性列表中每个键及其对应值都是一个字符串。
1. Bitset
    - 一个Bitset类创建一种特殊类型的数组来保存位值。BitSet中数组大小会随需要增加。

## 集合算法

- 集合框架定义了几种算法，可用于集合和映射。这些算法被定义为集合类的静态方法。
- 在尝试比较不兼容的类型时，一些方法能够抛出 ClassCastException异常。当试图修改一个不可修改的集合时，抛出UnsupportedOperationException异常。
- 集合定义三个静态的变量：EMPTY_SET，EMPTY_LIST，EMPTY_MAP的。这些变量都不可改变。

## 迭代器

- 通常情况下，你会希望遍历一个集合中的元素。例如，显示集合中的每个元素。
- 一般遍历数组都是采用for循环或者增强for，这两个方法也可以用在集合框架，但是还有一种方法是采用迭代器遍历集合框架，它是一个对象，实现了Iterator 接口或ListIterator接口。
- 迭代器，使你能够通过循环来得到或删除集合的元素。ListIterator 继承了Iterator，以允许双向遍历列表和修改元素。

```java
import java.util.*;
 
public class Test{
 public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
     list.add("Hello");
     list.add("World");
     list.add("HAHAHAHA");
     //第一种遍历方法使用foreach遍历List
     for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
        System.out.println(str);
     }
 
     //第二种遍历，把链表变为数组相关的内容进行遍历
     String[] strArray=new String[list.size()];
     list.toArray(strArray);
     for(int i=0;i<strArray.length;i++) //这里也可以改写为  foreach(String str:strArray)这种形式
     {
        System.out.println(strArray[i]);
     }
     
    //第三种遍历 使用迭代器进行相关遍历
     
     Iterator<String> ite=list.iterator();
     while(ite.hasNext())//判断下一个元素之后有值
     {
         System.out.println(ite.next());
     }
 }
}
```

## Java 比较器