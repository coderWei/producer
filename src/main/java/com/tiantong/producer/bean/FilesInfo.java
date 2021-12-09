package com.tiantong.producer.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("files_info")
public class FilesInfo implements Serializable {

    /**
     * 文件id
     */
    @TableId
    private String id;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件类型 1-图片 2-文件
     */
    private Integer fileType;
    /**
     * 创建者
     */
    private String createBy;

    /**
     * 修改者
     */
    private String lastUpdBy;

    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTs;

    /**
     * 修改时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdTs;


}
