package com.chongming.project.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户组：用于用户前端身份和鉴权
 * @TableName user_group
 */
@TableName(value ="user_group")
@Data
public class UserGroup implements Serializable {
    /**
     * 用户组ID：[0,8388607]
     */
    @TableId(value = "group_id", type = IdType.AUTO)
    private Integer group_id;

    /**
     * 显示顺序：[0,1000]
     */
    @TableField(value = "display")
    private Integer display;

    /**
     * 名称：[0,16]
     */
    @TableField(value = "name")
    private String name;

    /**
     * 描述：[0,255]描述该用户组的特点或权限范围
     */
    @TableField(value = "description")
    private String description;

    /**
     * 来源表：
     */
    @TableField(value = "source_table")
    private String source_table;

    /**
     * 来源字段：
     */
    @TableField(value = "source_field")
    private String source_field;

    /**
     * 来源ID：
     */
    @TableField(value = "source_id")
    private Integer source_id;

    /**
     * 注册位置:
     */
    @TableField(value = "register")
    private Integer register;

    /**
     * 创建时间：
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Date update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}