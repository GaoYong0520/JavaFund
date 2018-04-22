package design.decorator.Human;

/*
定义被装饰者，被装饰者初始状态有自己的装饰
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("I wear my clothes.");
    }

    @Override
    public void walk() {
        System.out.println("I want to walk.");
    }
}
