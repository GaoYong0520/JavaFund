package singleobj;

class Main {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();

        instance.sayHello();
    }
}
