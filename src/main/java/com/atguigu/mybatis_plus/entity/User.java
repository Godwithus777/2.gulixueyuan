
package com.atguigu.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;

import java.util.Date;


@Data
public class User {

//    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic
    private Integer deleted;
}