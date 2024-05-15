package com.chongming.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 访客用户
 * @TableName guest_user
 */
@TableName(value ="guest_user")
@Data
public class GuestUser implements Serializable {
    /**
     * 访客用户ID
     */
    @TableId(value = "guest_user_id", type = IdType.AUTO)
    private Integer guest_user_id;

    /**
     * 访客姓名
     */
    @TableField(value = "visitor_name")
    private String visitor_name;

    /**
     * 访客性别
     */
    @TableField(value = "visitor_gender")
    private String visitor_gender;

    /**
     * 二维码
     */
    @TableField(value = "qr_code")
    private String qr_code;

    /**
     * 二维码编号
     */
    @TableField(value = "qr_code_number")
    private String qr_code_number;

    /**
     * 审核状态
     */
    @TableField(value = "examine_state")
    private String examine_state;

    /**
     * 智能推荐
     */
    @TableField(value = "recommend")
    private Integer recommend;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Integer user_id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}