package serialize;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN; //transient:短暂的
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

