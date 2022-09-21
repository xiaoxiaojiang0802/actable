package com.jiangjin.actable.api.annotation;

import java.lang.annotation.*;


/**
 * 作者：guoyzh
 * 时间：2021/5/6 9:43
 * 功能：忽略字段更新
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreUpdate {

    /**
     * 是否忽略对当前字段的更新操作
     */
    boolean value() default true;
}
