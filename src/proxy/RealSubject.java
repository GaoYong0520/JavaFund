package proxy;

public class RealSubject implements Subject {
    @Override
    public void TakeCare() {
        System.out.println("Hello, nice to see you.");
    }

    @Override
    public void Hit() {
        System.out.println("Fuck off!");
    }
}
