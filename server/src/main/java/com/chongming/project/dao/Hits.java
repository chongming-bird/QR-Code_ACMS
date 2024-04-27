package com.chongming.project.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户点击
 * @TableName hits
 */
@TableName(value ="hits")
@Data
public class Hits implements Serializable {
    /**
     * 点赞ID：
     */
    @TableId(value = "hits_id", type = IdType.AUTO)
    private Integer hits_id;

    /**
     * 点赞人：
     */
    @TableField(value = "user_id")
    private Integer user_id;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}