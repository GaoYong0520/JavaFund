package interfacedemo;

public interface P extends Animal {
    @Override
    default void run() {
        System.out.println("P can run.");
    }
}
