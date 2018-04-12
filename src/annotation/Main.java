package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
//        Class clazz = Test.class;
//        Method[] methods = clazz.getMethods();
//
//        for (Method m : methods) {
//            if (m.isAnnotationPresent(MutilAnnotation.class)) {
//                m.invoke(clazz.newInstance(),null);
//            }
//
//        }

        Class clazz = Test.class;
        Method[] methods = clazz.getMethods();
        for (Method m :
                methods) {
            MutilAnnotation annotation = m.getAnnotation(MutilAnnotation.class);
            if (annotation == null) { //没有注解
                m.invoke(clazz.newInstance());
            } else {
                long timeout = annotation.timeout();//获取注解的属性值
                long start = System.nanoTime();
                m.invoke(clazz.newInstance(),null);
                long end = System.nanoTime();
                long time = start - end;
                if (time > timeout) {
                    System.out.println("超时");
                } else {
                    System.out.println("没有超时");
                }
            }
        }
    }
}
