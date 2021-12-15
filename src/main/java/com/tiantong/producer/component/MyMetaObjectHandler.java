package com.tiantong.producer.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


/**
 * mybatis-plus 自动填充时间方法
 *
 * 自动填充字段值策略测试
 * 通道塞值和默认方法塞值
 *
 * @author wei
 */
@Component
@Configuration
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "create_ts", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "last_upd_ts", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "create_ts", LocalDateTime::now, LocalDateTime.class);
        // 默认提供的strictUpdateFill为有值不覆盖， gmtModified需要覆盖，利用通用塞值的方法填充
        this.setFieldValByName("last_upd_ts", LocalDateTime.now(), metaObject);
    }

}
