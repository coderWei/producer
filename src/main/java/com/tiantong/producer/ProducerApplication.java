package com.tiantong.producer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tiantong.producer.mapper")
public class ProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

}
