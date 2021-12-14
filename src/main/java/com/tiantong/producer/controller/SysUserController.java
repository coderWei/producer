package com.tiantong.producer.controller;


import com.tiantong.producer.bean.ResponseBean;
import com.tiantong.producer.bean.SysUserBean;
import com.tiantong.producer.component.JWTUtil;
import com.tiantong.producer.exception.UnauthorizedException;
import com.tiantong.producer.service.SysUserService;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService service;

    @PostMapping("/login")
    public ResponseBean login(@RequestBody SysUserBean bean) {
        SysUserBean sysUserBean = service.getOne(bean);
        if (!ObjectUtils.isEmpty(sysUserBean)) {
            return new ResponseBean(200, "Login success", JWTUtil.sign(bean.getUserName(), bean.getPassword()));
        } else {
            throw new UnauthorizedException();
        }
    }

    @PostMapping("/getUserInfo")
    public ResponseBean getUserInfo(HttpServletRequest request) {
        String authorization = request.getHeader("Authorization");
        String authorization1 = JWTUtil.getUsername(authorization);
        return new ResponseBean(200, "success", authorization1);

    }

    @PostMapping("insert")
    public ResponseBean getUserInfo(@RequestBody SysUserBean bean) {
        service.insertSysUserService(bean);
        return new ResponseBean(200, "success", null);
    }



    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseBean unauthorized() {
        return new ResponseBean(401, "Unauthorized", null);
    }

}
