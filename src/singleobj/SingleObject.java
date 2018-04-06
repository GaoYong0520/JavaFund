package singleobj;

class SingleObject {
    //创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    //构造函数私有化，该类不会被实例化
    private SingleObject() {}

    //获取唯一可用对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello, single object.");
    }
}
