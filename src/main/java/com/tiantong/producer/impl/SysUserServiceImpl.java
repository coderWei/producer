package com.tiantong.producer.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tiantong.producer.bean.SysUserBean;
import com.tiantong.producer.mapper.SysUserMapper;
import com.tiantong.producer.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper mapper;

    @Override
    public int insertSysUser(SysUserBean bean) {
        return mapper.insert(bean);
    }

    @Override
    public void updateSysUserById(SysUserBean bean) {
        mapper.updateById(bean);

    }

    @Override
    public void deleteSysUserById(SysUserBean bean) {
        mapper.deleteById(bean.getId());
    }

    @Override
    public SysUserBean getSysUserById(SysUserBean bean) {
        return mapper.selectById(bean.getId());
    }

    @Override
    public List<SysUserBean> listSysUser(SysUserBean bean) {
        QueryWrapper<SysUserBean> sysUserBeanQueryWrapper = new QueryWrapper<>();
        sysUserBeanQueryWrapper.eq("userName", bean.getUserName());
        return mapper.selectList(sysUserBeanQueryWrapper);
    }

    @Override
    public IPage<SysUserBean> pageSysUser(IPage<SysUserBean> page, SysUserBean bean) {
        QueryWrapper<SysUserBean> sysUserBeanQueryWrapper = new QueryWrapper<>();
        sysUserBeanQueryWrapper.eq("userName", bean.getUserName());
        return mapper.selectPage(page, sysUserBeanQueryWrapper);
    }
}
