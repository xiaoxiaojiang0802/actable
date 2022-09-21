package com.jiangjin.actable.api.annotation;

import com.jiangjin.actable.api.constants.MySqlCharsetConstant;

import java.lang.annotation.*;


/**
 * 表字符集
 *
 * @author sunchenbin
 * @version 2020年11月11日 下午6:13:37
 */
//表示注解加在接口、类、枚举等
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TableCharset {

    /**
     * 表注释
	 * 仅支持com.gitee.sunchenbin.mybatis.actable.constants.MySqlCharsetConstant中的枚举字符集
	 * @return
     */
	MySqlCharsetConstant value();
}
