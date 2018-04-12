package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void main(String[] args) {
        Subject proxy = (Subject) Proxy.newProxyInstance(

                // 生成的字节码由该ClassLoader加载到虚拟器中
                ClassLoader.getSystemClassLoader(),
                // 需要代理的接口，是一个数组，可以代理多个对象
                new Class[]{Subject.class},
                new InvocationHandler() {
                    // 代理对象的代理的真实对象
                    Subject subject = new RealSubject();
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = method.invoke(subject,args);
                        return result;
                    }
                }
        );

        proxy.TakeCare();
        ProxyDemo();
    }


    //JDK中的动态代理通过字节码生成 技术，产生目标代理对象 ，将用户对目标接口的方法调用统一路由到特定的接口 java.lang.reflect.InvocationHandler ，将客户端发起的调用转化成一一对应的Method对象，实现了代理动作的抽象 ，实现代理的目的。

    public static void ProxyDemo() {
        Subject subject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {

            /**
             * @param proxy 系统生成的代理对象实例
             * @param method 客户端调用的目标方法的方法对象
             * @param args 客户端调用目标方法时传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //调用前的逻辑
                //调用代理对象的相关方法
                Object result = method.invoke(subject,args);
                //调用后的逻辑
                //返回处理结果
                return result;
            }
        });
        //调用代理对象的相关方法。
        proxy.Hit();
    }
}
