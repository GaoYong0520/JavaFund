package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public ScannerDemo() {
        System.out.println("ScannerDemo.ScannerDemo");
    }

    public void nextLineTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input from keyboard.");
        if (scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.println(str);
        }

        scan.close();
    }

    public void nextTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input from keyboard");
        if (scan.hasNext()) {
            String str = scan.next();
            System.out.println(str);
        }

        scan.close();
    }
    public void inputNums() {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println(sum);
        scan.close();
    }
}
