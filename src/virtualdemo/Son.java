package virtualdemo;

public class Son extends Father {
    public double height;

    public Son() {
        System.out.println("Son()");
    }

    public Son(int age, String name) {
        super(age, name);
        System.out.println(this.getName() + " " + this.getAge());
    }

    @Override
    public void speak() {
        System.out.println("Father, I'm your son.");
    }
}
