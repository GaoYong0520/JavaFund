package interfacedemo;

public interface Animal {
    public void eat();
    public void speak();

    public static void speak(String str) {
        System.out.println("Speak" + str);
    }
    default void run() {
        System.out.println("Animals can run.");
    }
}
