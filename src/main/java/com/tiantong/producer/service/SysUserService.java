package com.tiantong.producer.service;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tiantong.producer.bean.SysUserBean;

import java.util.List;

public interface SysUserService  {

    /**
     * 新增
     */
    public int insertSysUser(SysUserBean bean);

    /**
     * 修改
     */
    public void updateSysUserById(SysUserBean bean);

    /**
     * 删除
     */
    public void deleteSysUserById(SysUserBean bean);

    /**
     * 查询单个
     */
    public SysUserBean getSysUserById(SysUserBean bean);

    /**
     * 查询列表
     */
    public List<SysUserBean> listSysUser(SysUserBean bean);

    /**
     * 分页查询
     */
    public IPage<SysUserBean> pageSysUser(IPage<SysUserBean> page, SysUserBean bean);


}
