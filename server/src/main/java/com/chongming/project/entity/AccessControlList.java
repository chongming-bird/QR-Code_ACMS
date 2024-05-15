package com.chongming.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 门禁列表
 * @TableName access_control_list
 */
@TableName(value ="access_control_list")
@Data
public class AccessControlList implements Serializable {
    /**
     * 门禁列表ID
     */
    @TableId(value = "access_control_list_id", type = IdType.AUTO)
    private Integer access_control_list_id;

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
     * 承包单位
     */
    @TableField(value = "contracting_unit")
    private String contracting_unit;

    /**
     * 负责人员
     */
    @TableField(value = "person_in_charge")
    private String person_in_charge;

    /**
     * 维修人员
     */
    @TableField(value = "repair_personnel")
    private String repair_personnel;

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