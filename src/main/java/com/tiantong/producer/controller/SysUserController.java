package com.tiantong.producer.controller;


import com.tiantong.producer.bean.SysUserBean;
import com.tiantong.producer.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService service;

    /**
     * 新增
     */
    @PostMapping("/insert")
    public String insertSysUser(@RequestBody SysUserBean bean) {
        System.out.println("hhhhhh");
        int i = service.insertSysUser(bean);
        System.out.println(i);
        return "success";
    }

}
