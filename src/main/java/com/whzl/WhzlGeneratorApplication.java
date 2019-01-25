package com.whzl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whzl.dao")
public class WhzlGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhzlGeneratorApplication.class, args);
	}
}
