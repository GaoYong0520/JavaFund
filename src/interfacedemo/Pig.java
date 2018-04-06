package interfacedemo;

public class Pig implements Animal,P {
    @Override
    public void eat() {
        System.out.println("eat.");
    }

    @Override
    public void speak() {
        System.out.println("speak.");
    }

    public static void speak(String str){};
}
