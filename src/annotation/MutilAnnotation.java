package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MutilAnnotation {
    long timeout() default Integer.MAX_VALUE;
}
