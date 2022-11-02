package com.mahama.corecommon.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface ReqLimit {
    /**
     * 时间段内允许访问的次数，默认值1
     */
    int count() default 1;

    /**
     * 时间段，单位为秒，默认10s
     */
    int time() default 10;

    /**
     * 错误信息
     */
    String errMsg() default "访问频率过高，请稍后访问。";
	
	 /**
     * 显示倒计时
     */
    boolean showTime() default false;

    /**
     * 达到访问次数上限后继续访问是否重置等待时间
     */
    boolean reset() default false;
    /**
     * 重置时等待时间增涨乘数
     */
    int riseTime() default 0;

    /**
     * 重置时根据访问次数增加等待时间的次方基数
     */
    int power() default 0;

    /**
     * 达到访问次数上限后最大重试次数,0表示不进行限制
     */
    int maxTry() default 0;

    int maxTime() default 60 * 60 * 24;

    String maxErrMsg() default "超过最大访问次数，访问已被限制，请明日再试";
}
