package com.xjkenli.actable.annotation;

import java.lang.annotation.*;


/**
 * 标志该字段需要设置自增
 * 也可通过注解：com.gitee.sunchenbin.mybatis.actable.annotation.Column的isAutoIncrement属性实现
 * @author sunchenbin
 * @version 2020年5月26日 下午6:13:15
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IsAutoIncrement {
}
