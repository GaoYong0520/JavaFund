package exception;

public class ExceptionDemo {
    public static void exceptionDemo(int a, int b) {
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


}
