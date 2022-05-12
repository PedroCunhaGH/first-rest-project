package com.example.API.Reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.API.Reader.proxy")
public class ApiReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiReaderApplication.class, args);
	}

}
