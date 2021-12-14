package com.tiantong.producer.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.tiantong.producer.bean.SysUserBean;
import com.tiantong.producer.service.SysUserService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class SysUserServiceImpl implements SysUserService {


    @Override
    public boolean save(SysUserBean entity) {
        return SysUserService.super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<SysUserBean> entityList) {
        return SysUserService.super.saveBatch(entityList);
    }

    @Override
    public boolean saveBatch(Collection<SysUserBean> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysUserBean> entityList) {
        return SysUserService.super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysUserBean> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return SysUserService.super.removeById(id);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return SysUserService.super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return SysUserService.super.removeByIds(idList);
    }

    @Override
    public boolean updateById(SysUserBean entity) {
        return SysUserService.super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<SysUserBean> updateWrapper) {
        return SysUserService.super.update(updateWrapper);
    }

    @Override
    public boolean update(SysUserBean entity, Wrapper<SysUserBean> updateWrapper) {
        return SysUserService.super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<SysUserBean> entityList) {
        return SysUserService.super.updateBatchById(entityList);
    }

    @Override
    public boolean updateBatchById(Collection<SysUserBean> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SysUserBean entity) {
        return false;
    }

    @Override
    public SysUserBean getById(Serializable id) {
        return SysUserService.super.getById(id);
    }

    @Override
    public List<SysUserBean> listByIds(Collection<? extends Serializable> idList) {
        return SysUserService.super.listByIds(idList);
    }

    @Override
    public List<SysUserBean> listByMap(Map<String, Object> columnMap) {
        return SysUserService.super.listByMap(columnMap);
    }

    @Override
    public SysUserBean getOne(Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.getOne(queryWrapper);
    }

    @Override
    public SysUserBean getOne(Wrapper<SysUserBean> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SysUserBean> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<SysUserBean> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count() {
        return SysUserService.super.count();
    }

    @Override
    public int count(Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.count(queryWrapper);
    }

    @Override
    public List<SysUserBean> list(Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.list(queryWrapper);
    }

    @Override
    public List<SysUserBean> list() {
        return SysUserService.super.list();
    }

    @Override
    public <E extends IPage<SysUserBean>> E page(E page, Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<SysUserBean>> E page(E page) {
        return SysUserService.super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return SysUserService.super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return SysUserService.super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return SysUserService.super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<SysUserBean> queryWrapper, Function<? super Object, V> mapper) {
        return SysUserService.super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<SysUserBean> queryWrapper) {
        return SysUserService.super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return SysUserService.super.pageMaps(page);
    }

    @Override
    public BaseMapper<SysUserBean> getBaseMapper() {
        return null;
    }

    @Override
    public Class<SysUserBean> getEntityClass() {
        return null;
    }

    @Override
    public QueryChainWrapper<SysUserBean> query() {
        return SysUserService.super.query();
    }

    @Override
    public LambdaQueryChainWrapper<SysUserBean> lambdaQuery() {
        return SysUserService.super.lambdaQuery();
    }

    @Override
    public KtQueryChainWrapper<SysUserBean> ktQuery() {
        return SysUserService.super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<SysUserBean> ktUpdate() {
        return SysUserService.super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<SysUserBean> update() {
        return SysUserService.super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<SysUserBean> lambdaUpdate() {
        return SysUserService.super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(SysUserBean entity, Wrapper<SysUserBean> updateWrapper) {
        return SysUserService.super.saveOrUpdate(entity, updateWrapper);
    }
}
