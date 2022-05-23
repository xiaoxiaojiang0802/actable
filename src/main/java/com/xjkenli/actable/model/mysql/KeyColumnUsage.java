package com.xjkenli.actable.model.mysql;

import com.xjkenli.actable.annotation.Table;
import lombok.Data;

/**
 * @author xiaojiang
 */
@Data
@Table(name = "KEY_COLUMN_USAGE")
public class KeyColumnUsage {

    /**
     * 约束所属的目录名称，该值始终为def
     */
    private String constraintCatalog;

    /**
     * 约束所属的数据库名称
     */
    private String constraintSchema;

    /**
     * 约束的名字
     */
    private String constraintName;

    /**
     * 约束所在表所属的目录名称，该值始终为def
     */
    private String tableCatalog;

    /**
     * 所在表的数据库名称
     */
    private String tableSchema;

    /**
     * 约束所在的表的名称
     */
    private String tableName;

    /**
     * 拥有约束的列的名称，如果是外键约束，名称是该外键列，不是所引用的列
     */
    private String columnName;
    /**
     * 约束中列的位置，不是列在表中的位置，从1开始标记
     */
    private String ordinalPosition;

    /**
     * ，如果是唯一或者主键约束，值为NULL,如果是外键约束，该值为被引用表的列的位置
     */
    private String positionInUniqueConstraint;
    /**
     * 被引用的表的数据库名称
     */
    private String referencedTableSchema;
    /**
     * 被引用的表的名称
     */
    private String referencedTableName;
    /**
     * 被引用的列的名称
     */
    private String referencedColumnName;
}
