package annotation;

public class Test {
    //@AnnotationDemo(age = 18,name = "tom",value = "100",anno = )

    @MutilAnnotation(timeout = 1000)
    public void test() {
        System.out.println("test()");
    }

    @MutilAnnotation
    public void testUpdate() {
        System.out.println("testUpdate()");
    }

    public void hello() {
        System.out.println("Hello, annotation");
    }
}
