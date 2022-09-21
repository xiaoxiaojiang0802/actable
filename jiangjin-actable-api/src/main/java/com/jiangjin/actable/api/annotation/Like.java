package com.jiangjin.actable.api.annotation;

import java.lang.annotation.*;

/**
 * 用于模糊查询
 *
 * @author xiaojiang
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Like {
}
