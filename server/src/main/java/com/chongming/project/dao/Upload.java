package com.chongming.project.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 文件上传
 * @TableName upload
 */
@TableName(value ="upload")
@Data
public class Upload implements Serializable {
    /**
     * 上传ID
     */
    @TableId(value = "upload_id", type = IdType.AUTO)
    private Integer upload_id;

    /**
     * 文件名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 访问路径
     */
    @TableField(value = "path")
    private String path;

    /**
     * 文件路径
     */
    @TableField(value = "file")
    private String file;

    /**
     * 显示顺序
     */
    @TableField(value = "display")
    private String display;

    /**
     * 父级ID
     */
    @TableField(value = "father_id")
    private Integer father_id;

    /**
     * 文件夹
     */
    @TableField(value = "dir")
    private String dir;

    /**
     * 文件类型
     */
    @TableField(value = "type")
    private String type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}