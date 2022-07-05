package com.xjkenli.actable.api.annotation;

import com.xjkenli.actable.api.constants.MySqlEngineConstant;

import java.lang.annotation.*;


/**
 * 表引擎
 *
 * @author sunchenbin
 * @version 2020年11月11日 下午6:13:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TableEngine {

    /**
     * 表引擎
	 * 仅支持com.gitee.sunchenbin.mybatis.actable.constants.MySqlEngineConstant中的存储引擎枚举
     */
	MySqlEngineConstant value();
}
