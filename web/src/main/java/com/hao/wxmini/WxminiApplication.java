package com.hao.wxmini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hao.wxmini.mapper")
@EnableAutoConfiguration
public class WxminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxminiApplication.class, args);
	}
}
