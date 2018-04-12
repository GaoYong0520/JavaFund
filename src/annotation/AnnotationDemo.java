package annotation;

// 自定义注解
public @interface AnnotationDemo {
    int age();
    String name();
    String sex() default "";
    String value();
    String[] values();

    MutilAnnotation anno();
}
