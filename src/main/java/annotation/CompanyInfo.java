package annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // location
@Retention(RetentionPolicy.RUNTIME) // available in which level
@Inherited
//@Documented ensures that custom annotations show up in the JavaDocs.
public @interface CompanyInfo {
    //Annotation advantages is using by reflection
    String name() default "Tosan";

    String address() default "Tehran";
}