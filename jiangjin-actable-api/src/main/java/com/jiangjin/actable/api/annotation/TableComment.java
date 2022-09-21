package com.jiangjin.actable.api.annotation;

import java.lang.annotation.*;


/**
 * 表注释
 *
 * @author sunchenbin
 * @version 2020年11月11日 下午6:13:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TableComment {

    /**
     * 表注释
	 */
	String value();
}
