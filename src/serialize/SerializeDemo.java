package serialize;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Jhon";
        e.address = "BUPT";
        e.SSN = 11112233;
        e.number = 101;

        //序列化
        try {
            FileOutputStream fileOut = new FileOutputStream("E:/Java/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialize employee.");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Employee de = null;

        //反序列化
        try {
            FileInputStream fileIn = new FileInputStream("E:/Java/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            de = (Employee) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        System.out.println("Deserialize Employee...");
        System.out.println("Name: " + de.name);
        System.out.println("Address: " + de.address);

        //当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，该值没有被发送到输出流。所以反序列化后 Employee 对象的 SSN 属性为 0
        //SSN = 0
        System.out.println("SSN: " + de.SSN);
        System.out.println("Number: " + de.number);


    }
}
