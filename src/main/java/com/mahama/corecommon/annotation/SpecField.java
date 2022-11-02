package com.mahama.corecommon.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;
import java.util.Date;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface SpecField {
    Class<?> listItemClass() default Date.class;
    String datePattern() default "yyyy-MM-dd HH:mm:ss";
}
