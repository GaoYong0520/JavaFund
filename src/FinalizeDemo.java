public class FinalizeDemo {
    public FinalizeDemo() {
        System.out.println("I am born.");
    }
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Fuck this object");
    }
}
