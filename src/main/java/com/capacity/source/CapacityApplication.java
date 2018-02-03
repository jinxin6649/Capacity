package com.capacity.source;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.capacity.source.*.mapper")
public class CapacityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapacityApplication.class, args);
	}
}