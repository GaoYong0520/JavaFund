package javaio;

import java.io.*;

public class IODemo {
//    public static void main(String[] args) throws IOException {
//        char c = 's';
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while (c != 'q') {
//            c = (char) br.read();
//            System.out.println(c);
//        }
//
//    }

//    public static void main(String[] args) throws IOException {
//        String str = "";
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while (!str.equals("end")) {
//            str = br.readLine();
//            System.out.println(str);
//        }
//    }

//    public static void main(String[] args) {
//        int ch;
//        ch = 'A';
//        System.out.println((char) ch);
//    }

    public static void main(String[] args) {
        try {
            char[] writeBytes = {'a','b','4'};
            OutputStream os = new FileOutputStream("E:/Java/test.txt");
            for (char b :
                    writeBytes) {
                os.write(b);
            }
            os.close();

            InputStream input = new FileInputStream("E:/Java/test.txt");

            int size = input.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
