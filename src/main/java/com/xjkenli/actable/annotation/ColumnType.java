package com.xjkenli.actable.annotation;

import com.xjkenli.actable.constants.MySqlTypeConstant;

import java.lang.annotation.*;


/**
 * 字段的类型
 *
 * @author sunchenbin
 * @version 2020年11月09日 下午6:13:37
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColumnType {

	/**
	 * 字段的类型
	 * 仅支持com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant中的枚举数据类型
	 * @return 字段的类型
	 */
	MySqlTypeConstant value() default MySqlTypeConstant.DEFAULT;

	/**
	 * 字段长度，默认是255
	 * 类型默认长度：com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant
	 * @return 字段长度，默认是255
	 */
	int length() default 255;

	/**
	 * 小数点长度，默认是0
	 * 类型默认长度：com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant
	 * @return 小数点长度，默认是0
	 */
	int decimalLength() default 0;
}
