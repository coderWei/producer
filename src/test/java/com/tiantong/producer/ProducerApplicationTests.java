package com.tiantong.producer;

import com.tiantong.producer.bean.SysUserBean;
import com.tiantong.producer.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ProducerApplicationTests {


    @Resource
    private SysUserMapper sysUserMapper;

	@Test
	void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<SysUserBean> sysUserBeans = sysUserMapper.selectList(null);
        sysUserBeans.forEach(System.out::println);
	}

}
