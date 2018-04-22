package design.decorator;

/*
具体构件，实现Component接口
 */
public class ComponentImpl implements Component {
    @Override
    public void operation() {
        System.out.println("ComponentImpl");
    }
}
