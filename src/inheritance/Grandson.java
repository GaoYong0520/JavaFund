package inheritance;

public class Grandson implements A,B {
    @Override
    public void eat() {
        System.out.println("eat.");
    }

    @Override
    public void speak() {
        System.out.println("speak.");
    }

    @Override
    public void show() {
        System.out.println("show.");
    }
}
