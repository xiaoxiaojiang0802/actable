package com.jiangjin.actable.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.jiangjin.actable.api.annotation.Column;
import com.jiangjin.actable.api.annotation.Table;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jiangJin
 */
@Data
@Table(comment = "测试实体")
public class DemoEntity {

    @TableId
    private Long id;

    @Column(comment = "演示字段")
    @ApiModelProperty("演示字段")
    private String userNameDemo;

    @Column(comment = "演示字段1")
    @ApiModelProperty("演示字段1")
    private String userNameDemo1;

}
