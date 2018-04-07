package annotation;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
        File springConfigFile = new File("E:\\Java\\Projects\\JavaFund\\spring.conf");
        Properties springConfig = new Properties();
        springConfig.load(new FileInputStream(springConfigFile));

        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");

        System.out.println("Calc:" + className + " " + methodName);

        //根据类名创建类对象
        Class clazz = Class.forName(className);

        var ms = clazz.getMethods();
        for (var m :
                ms) {
            System.out.println(m);
        }
        System.out.println("------------------------------------------------");
        //根据方法名称获取方法
        Method m = clazz.getMethod(methodName,int.class,int.class);
        //获取构造器
        Constructor constructor = clazz.getConstructor();
        //根据构造器，实例化对象
        Object object = constructor.newInstance();
        var sum =m.invoke(object,45,32);
        System.out.println(sum);
    }
}
