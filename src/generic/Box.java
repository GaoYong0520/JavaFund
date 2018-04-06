package generic;

public class Box<T> {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<>();

        integerBox.setT(5);
        stringBox.setT("Generic");

        System.out.println(integerBox.getT());
        System.out.println(stringBox.getT());
    }
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
