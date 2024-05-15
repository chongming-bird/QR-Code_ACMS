package com.chongming.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 外出记录
 * @TableName out_of_office_records
 */
@TableName(value ="out_of_office_records")
@Data
public class OutOfOfficeRecords implements Serializable {
    /**
     * 外出记录ID
     */
    @TableId(value = "out_of_office_records_id", type = IdType.AUTO)
    private Integer out_of_office_records_id;

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
     * 用户姓名
     */
    @TableField(value = "user_name")
    private String user_name;

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