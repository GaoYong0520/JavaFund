package proxy;

public class StaticProxy implements Subject {
    private Subject subject;

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        StaticProxy proxy = new StaticProxy();
        proxy.setRealSubject(subject);
        proxy.Hit();
        proxy.TakeCare();
    }

    public Subject getRealSubject() {
        return subject;
    }

    public void setRealSubject(Subject realSubject) {
        this.subject = realSubject;
    }


    @Override
    public void Hit() {
        if (subject != null)
            subject.Hit();
    }

    @Override
    public void TakeCare() {
        if (subject != null)
            subject.TakeCare();
    }
}
