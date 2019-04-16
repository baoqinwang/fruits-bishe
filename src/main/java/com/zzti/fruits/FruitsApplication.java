package com.zzti.fruits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@MapperScan("com.zzti.fruits.mapper")
@SpringBootApplication
public class FruitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitsApplication.class, args);
	}

}
