package singleobj;

class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello, single object.");
    }
}
