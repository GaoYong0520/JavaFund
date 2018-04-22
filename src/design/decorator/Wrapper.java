package design.decorator;

/*
具体装饰者
 */
public class Wrapper extends Decorator {

    public Wrapper(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        //业务代码
        super.operation();
        //业务代码
    }
}
