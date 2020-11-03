package Sergo.Lisens.Lisens2.Annotetion.Page3;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String auther() default "Neil";
    int deteOfCreation() default 2020;
    String purpose();
}
