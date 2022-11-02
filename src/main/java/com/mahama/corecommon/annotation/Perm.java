package com.mahama.corecommon.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface Perm {
    /**
     * 需要底层
     */
    @AliasFor("needRoot")
    boolean value() default false;

    /**
     * 需要底层
     */
    @AliasFor("value")
    boolean needRoot() default false;

    /**
     * 需要底层管理员
     */
    boolean needRootAdmin() default false;

    /**
     * 允许apikey访问
     */
    boolean allowApiKey() default false;

    /**
     * 需要租户
     */
    boolean needTenant() default false;

    /**
     * 需要租户管理员
     */
    boolean needTenantAdmin() default false;

    /**
     * 权限code
     */
    String code() default "";

    /**
     * 自定义权限地址
     */
    String url() default "";

    /**
     * 作为其他权限前置。使用,间隔
     */
    String premise() default "";

    /**
     * 允许访问
     */
    boolean allow() default false;

    /**
     * 无权限错误提示
     */
    String errMsg() default "无访问权限";
}
