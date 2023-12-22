package annotation;

import java.lang.annotation.*;

@Repeatable(RepeatableCompanies.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableCompany {
    String name() default "Tech";
}