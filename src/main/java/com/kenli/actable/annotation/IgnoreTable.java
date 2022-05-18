package com.kenli.actable.annotation;

import java.lang.annotation.*;


/**
 * 忽略建表的注解
 *
 * @author sunchenbin
 * @version 2021年6月23日 下午6:13:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreTable {

}
