package com.tiantong.producer.bean;


import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户信息bean
 * @author wei
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class SysUserBean implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 身份 01：机构生产者 02：创新生产者
     */
    private String identitys;

    /**
     * 密码
     */
    private String password;

    /**
     * 密保问题1
     */
    private String passwordQuestion_1;

    /**
     * 密保1答案
     */
    private String passwordAnswer_1;

    /**
     * 密保问题2
     */
    private String passwordQuestion_2;

    /**
     * 密保2答案
     */
    private String passwordAnswer_2;

    /**
     * 机构ID
     */
    private String orgId;

    /**
     * 状态 1：已提交 2：已通过 3：审核未补正';
     * 用户的登录状态  1开启 2禁止
     */
    private Integer status;
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
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTs;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdTs;

    /**
     * 是否删除
     */
    private Integer deleteFlag;

    /**
     * 用户联系方式
     */
    private String userLinkPhone;

}
