package com.kamps;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KampsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KampsApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapperBean() {
		return new ModelMapper();
	}
}
