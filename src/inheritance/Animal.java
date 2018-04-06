package inheritance;

public class Animal {
    public void Speak() {
        System.out.println("I am an animal.");
    }
    protected void Speak(String species) {
        System.out.println("I am " + species);
    }

    protected void Test() {
        System.out.println("This is a protected test");
    }
}
