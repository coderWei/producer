package com.tiantong.producer.service;


import com.tiantong.producer.bean.SysUserBean;

public interface SysUserService {

    SysUserBean getOne(SysUserBean bean);

    void insertSysUserService(SysUserBean bean);

}
