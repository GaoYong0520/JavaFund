package abstraction;

public abstract class Animal {
    private int age = 10;
    public Animal() {
        System.out.println("This is animal class.");
    }

    public int getAge() {
        return age;
    }
}
