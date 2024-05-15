package com.chongming.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 普通用户
 * @TableName ordinary_users
 */
@TableName(value ="ordinary_users")
@Data
public class OrdinaryUsers implements Serializable {
    /**
     * 普通用户ID
     */
    @TableId(value = "ordinary_users_id", type = IdType.AUTO)
    private Integer ordinary_users_id;

    /**
     * 用户姓名
     */
    @TableField(value = "user_name")
    private String user_name;

    /**
     * 用户性别
     */
    @TableField(value = "user_gender")
    private String user_gender;

    /**
     * 楼号
     */
    @TableField(value = "building_no")
    private String building_no;

    /**
     * 单元号
     */
    @TableField(value = "unit_no")
    private String unit_no;

    /**
     * 房间号
     */
    @TableField(value = "room_number")
    private String room_number;

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