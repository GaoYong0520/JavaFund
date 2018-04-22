package design.decorator.Human;

/*
定义装饰
 */
public class Wrapper1 extends Decorator {
    public Wrapper1(Human human) {
        super(human);
    }

    public void sleep() {
        System.out.println("sleep()");
    }

    public void drink() {
        System.out.println("drink()");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        sleep();
    }

    @Override
    public void walk() {
        super.walk();
        drink();
    }
}
