# StringBuffer & StringBuilder

- 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
- 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
- StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
- 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

## StringBuffer方法

### 以下是 StringBuffer 类支持的主要方法：

- public StringBuffer append(String s)
  - 将指定的字符串追加到此字符序列。
- public StringBuffer reverse()
  - 将此字符序列用其反转形式取代。
- public delete(int start, int end)
  - 移除此序列的子字符串中的字符。
- public insert(int offset, int i)
  - 将 int 参数的字符串表示形式插入此序列中。
- replace(int start, int end, String str)
  - 使用给定 String 中的字符替换此序列的子字符串中的字符。
  
## 对比

- String 长度大小不可变
- StringBuffer 和 StringBuilder 长度可变
- StringBuffer 线程安全 StringBuilder 线程不安全
- StringBuilder 速度快
