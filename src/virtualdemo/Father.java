package virtualdemo;

public class Father {
    private int age;
    private String name;
    public double height;

    public Father() {
        System.out.println("Father()");
    }

    public Father(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("This is Father instance.");
    }

    public void speak() {
        System.out.println("Son, i'm your father.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
