package com.tiantong.producer.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


/**
 * 用户信息bean
 * @author wei
 */
@TableName("sys_user")
public class SysUserBean implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户名
     */
    private String userName;

//    /**
//     * 身份 01：机构生产者 02：创新生产者
//     */
//    private String identity;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 密保问题1
     */
    private String passwordQuestion1;

    /**
     * 密保1答案
     */
    private String passwordAnswer1;

    /**
     * 密保问题2
     */
    private String passwordQuestion2;

    /**
     * 密保2答案
     */
    private String passwordAnswer2;

    /**
     * 机构ID
     */
    private String orgId;

    /**
     * 状态 1：已提交 2：已通过 3：审核未补正';
     */
    private String status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPasswordQuestion1() {
        return passwordQuestion1;
    }

    public void setPasswordQuestion1(String passwordQuestion1) {
        this.passwordQuestion1 = passwordQuestion1;
    }

    public String getPasswordAnswer1() {
        return passwordAnswer1;
    }

    public void setPasswordAnswer1(String passwordAnswer1) {
        this.passwordAnswer1 = passwordAnswer1;
    }

    public String getPasswordQuestion2() {
        return passwordQuestion2;
    }

    public void setPasswordQuestion2(String passwordQuestion2) {
        this.passwordQuestion2 = passwordQuestion2;
    }

    public String getPasswordAnswer2() {
        return passwordAnswer2;
    }

    public void setPasswordAnswer2(String passwordAnswer2) {
        this.passwordAnswer2 = passwordAnswer2;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
