package com.tiantong.producer.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("files_info")
public class FilesInfo implements Serializable {

    /**
     * 文件上传
     */
    private String path;

}
