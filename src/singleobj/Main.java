package singleobj;

import java.security.Signature;

class Main {
    public static void main(String[] args) {
        //错误示例
        //Signature object = new SingleObject();

        //获取唯一可用对象
        SingleObject instance = SingleObject.getInstance();

        instance.sayHello();
    }
}
