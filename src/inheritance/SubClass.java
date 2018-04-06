package inheritance;

public class SubClass extends SuperClass{
    public SubClass() {
        super();
    }
    public void Test() {
       int c =  super.sum(1,2);
        System.out.println(c);
    }


}
