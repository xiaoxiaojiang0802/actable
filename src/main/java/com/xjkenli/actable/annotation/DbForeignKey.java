package com.xjkenli.actable.annotation;


import java.lang.annotation.*;

/**
 * 外键关联注解
 *
 * @author xiaojiang
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DbForeignKey {

    /**
     * 关联表名
     *
     * @return 关联表名
     */
    String tName() default "";

    /**
     * 关联字段名称
     *
     * @return 关联字段名称
     */
    String cName() default "";



}
