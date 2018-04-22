package design.decorator.Human;

public class Test {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new Wrapper(new Wrapper1(person));

        decorator.wearClothes();
        decorator.walk();
    }
}
