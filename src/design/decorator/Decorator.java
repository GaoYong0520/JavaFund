package design.decorator;

/*
装饰着
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        //委派给构件
        component.operation();
    }
}
