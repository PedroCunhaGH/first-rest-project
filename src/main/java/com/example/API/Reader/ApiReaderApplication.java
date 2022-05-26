package com.example.API.Reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.API.Reader.proxy")
@EnableJpaRepositories(basePackages = "com.example.API.Reader.repository")
public class ApiReaderApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ApiReaderApplication.class, args);
	}



}
