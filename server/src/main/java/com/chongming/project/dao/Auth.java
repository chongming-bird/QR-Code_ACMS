package com.chongming.project.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户权限管理
 * @TableName auth
 */
@TableName(value ="auth")
@Data
public class Auth implements Serializable {
    /**
     * 授权ID：
     */
    @TableId(value = "auth_id", type = IdType.AUTO)
    private Integer auth_id;

    /**
     * 用户组：
     */
    @TableField(value = "user_group")
    private String user_group;

    /**
     * 模块名：
     */
    @TableField(value = "mod_name")
    private String mod_name;

    /**
     * 表名：
     */
    @TableField(value = "table_name")
    private String table_name;

    /**
     * 页面标题：
     */
    @TableField(value = "page_title")
    private String page_title;

    /**
     * 路由路径：
     */
    @TableField(value = "path")
    private String path;

    /**
     * 位置：
     */
    @TableField(value = "position")
    private String position;

    /**
     * 跳转方式：
     */
    @TableField(value = "mode")
    private String mode;

    /**
     * 是否可增加：
     */
    @TableField(value = "add")
    private Integer add;

    /**
     * 是否可删除：
     */
    @TableField(value = "del")
    private Integer del;

    /**
     * 是否可修改：
     */
    @TableField(value = "set")
    private Integer set;

    /**
     * 是否可查看：
     */
    @TableField(value = "get")
    private Integer get;

    /**
     * 添加字段：
     */
    @TableField(value = "field_add")
    private String field_add;

    /**
     * 修改字段：
     */
    @TableField(value = "field_set")
    private String field_set;

    /**
     * 查询字段：
     */
    @TableField(value = "field_get")
    private String field_get;

    /**
     * 跨表导航名称：
     */
    @TableField(value = "table_nav_name")
    private String table_nav_name;

    /**
     * 跨表导航：
     */
    @TableField(value = "table_nav")
    private String table_nav;

    /**
     * 配置：
     */
    @TableField(value = "option")
    private String option;

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