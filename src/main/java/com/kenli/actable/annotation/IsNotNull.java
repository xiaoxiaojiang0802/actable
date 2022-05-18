package com.kenli.actable.annotation;

import java.lang.annotation.*;


/**
 * 标志该字段不允许为空
 * 也可通过注解：com.gitee.sunchenbin.mybatis.actable.annotation.Column的isNull属性实现
 * @author sunchenbin
 * @version 2020年5月26日 下午6:13:15
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IsNotNull {
}
