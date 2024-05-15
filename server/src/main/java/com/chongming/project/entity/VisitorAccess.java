package com.chongming.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 访客进出
 * @TableName visitor_access
 */
@TableName(value ="visitor_access")
@Data
public class VisitorAccess implements Serializable {
    /**
     * 访客进出ID
     */
    @TableId(value = "visitor_access_id", type = IdType.AUTO)
    private Integer visitor_access_id;

    /**
     * 门禁名称
     */
    @TableField(value = "name_of_access_control")
    private String name_of_access_control;

    /**
     * 门禁编号
     */
    @TableField(value = "access_control_number")
    private String access_control_number;

    /**
     * 具体位置
     */
    @TableField(value = "specific_location")
    private String specific_location;

    /**
     * 记录时间
     */
    @TableField(value = "record_time")
    private Date record_time;

    /**
     * 记录用户
     */
    @TableField(value = "record_users")
    private Integer record_users;

    /**
     * 访客姓名
     */
    @TableField(value = "visitor_name")
    private String visitor_name;

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
     * 开门状态
     */
    @TableField(value = "door_opening_status")
    private String door_opening_status;

    /**
     * 智能推荐
     */
    @TableField(value = "recommend")
    private Integer recommend;

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