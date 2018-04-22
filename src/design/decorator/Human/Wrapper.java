package design.decorator.Human;

/*
定义装饰
 */
public class Wrapper extends Decorator {

    public Wrapper(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("goHome()");
    }

    public void eat() {
        System.out.println("eat()");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walk() {
        super.walk();
        eat();
    }
}
