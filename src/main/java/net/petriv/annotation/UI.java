package net.petriv.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface UI {

    String name();

    String thumbnail();

    String icon();

    String info();

    String author();

    String company() default "Mantra";

    String branches() default "success,failure";

    String category();

    String displayname();

    String id();

    String help();


}
