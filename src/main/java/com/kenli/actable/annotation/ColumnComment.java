package com.kenli.actable.annotation;

import java.lang.annotation.*;


/**
 * 字段的备注
 *
 * @author sunchenbin
 * @version 2020年11月09日 下午6:13:37
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColumnComment {

	/**
	 * 字段备注
	 * @return 字段备注
	 */
	String value();
}
