package net.petriv.annotation;

import net.petriv.model.FieldType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UIComponent {

    String label();

    String category();

    String name() default "";

    String id();

    String title() default "";

    boolean required() default false;

    String type();

    String options() default "";

    FieldType fieldType() default FieldType.TEXT;




}
