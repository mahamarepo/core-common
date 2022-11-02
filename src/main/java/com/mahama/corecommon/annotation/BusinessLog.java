package com.mahama.corecommon.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BusinessLog {

    /**
     * 业务的名称,例如:"修改菜单",为空时读取ApiOperation的value
     */
    String value() default "";
    String msg() default "";
}
