package com.tan.sbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.tan.sbootdemo.dao")
public class SbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootdemoApplication.class, args);
	}
}
