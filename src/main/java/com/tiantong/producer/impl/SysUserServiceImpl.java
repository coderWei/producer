package com.tiantong.producer.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.tiantong.producer.bean.SysUserBean;

import com.tiantong.producer.mapper.SysUserMapper;
import com.tiantong.producer.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper mapper;


    @Override
    public SysUserBean getOne(SysUserBean bean) {

        SysUserBean sysUserBean = mapper.selectOne(new QueryWrapper<SysUserBean>().eq("user_name", bean.getUserName())
                .eq("password", bean.getPassword()));

        if (StringUtils.isBlank(bean.getPassword())) {
            sysUserBean= mapper.selectOne(new QueryWrapper<SysUserBean>().eq("user_name", bean.getUserName()));
        }

        return sysUserBean;
    }
}
