import interfacedemo.Pig;

public class Main {

    private static int value = 0;
    private static void DivideLine() {
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
//        int a = 0;
//        System.out.println(a);
//        System.out.println("Hello World!");
//        StaticTest st = new StaticTest();
//        System.out.println(StaticTest.value);
//        System.out.println("======================");
//        Father1 f1 = new Father1();
        //f1.

//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//
//        Son son = new Son();
//        son.SonHello();
//
//        StringDemo sd = new StringDemo("123","qwe");
//        sd.ConcatString();
//        String str = sd.FormatString(4,2.0F,"sada");
//        System.out.println(str);
//        System.out.println("--------------------------");
//        String str1 = "123jgj12g";
//        String str2 = str1;
//        str1 = "234kjdjjf";
//        System.out.println(str2);
//
//        Son myson = new Son();
//        Son copySon = myson;
//        System.out.println(copySon.age);
//        myson.age = 10;
//        System.out.println(copySon.age);
//        System.out.println("--------------------------");
//
//        StringBuffer sb = new StringBuffer("Fuck ");
//        sb.append("My ");
//        sb.append("Son.");
//        System.out.println(sb.capacity());
//        System.out.println(sb);
//        DivideLine();
//        String str3 = sb.toString();
//        System.out.println(str3);
//        DivideLine();
//        int[][] nums = new int[4][5];
//
//        //可变参数
//        argsDemo(1,2,3);
//        DivideLine();
//        argsDemo(456465);
//
//        DivideLine();

//        FinalizeDemo fd1 = new FinalizeDemo();
//        FinalizeDemo fd2 = new FinalizeDemo();
//        FinalizeDemo fd3 = new FinalizeDemo();
//        fd2 = fd3 = null;
//        System.gc();
        //scanner.ScannerDemo fsd = new scanner.ScannerDemo();
        //fsd.nextTest();
        //fsd.nextLineTest();

        //fsd.inputNums();

        //exception.ExceptionDemo.exceptionDemo(1,0);

//        Animal animal = new Animal();
//        animal.Speak();
//
//        Dog dog = new Dog();
//        dog.Speak();
//
//        Cat cat = new Cat();
//        cat.Speak();

//        Grandson gson = new Grandson();
//        gson.eat();
//        gson.show();
//        gson.speak();

//        Cat mycat = new Cat();

        //virtualdemo.Son s = new virtualdemo.Son(5,"小强");
        //Father f = new virtualdemo.Son(22,"大强");

//        Father f = new virtualdemo.Son();
//        DivideLine();
//        virtualdemo.Son s = new virtualdemo.Son();


        //abstraction.Dog dog = new abstraction.Dog();
        Pig pig = new Pig();
        Pig.speak("Pig");

    }

    static void argsDemo(double... nums) {
        for (double num :
                nums) {
            System.out.println(num);
        }
    }
}
