package com.chongming.project.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 登陆访问时长
 * @TableName access_token
 */
@TableName(value ="access_token")
@Data
public class AccessToken implements Serializable {
    /**
     * 临时访问牌ID
     */
    @TableId(value = "token_id", type = IdType.AUTO)
    private Integer token_id;

    /**
     * 临时访问牌
     */
    @TableField(value = "token")
    private String token;

    /**
     * 
     */
    @TableField(value = "info")
    private String info;

    /**
     * 最大寿命：默认2小时
     */
    @TableField(value = "maxage")
    private Integer maxage;

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

    /**
     * 用户编号:
     */
    @TableField(value = "user_id")
    private Integer user_id;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}