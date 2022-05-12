package com.example.API.Reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiReaderApplication.class, args);
	}

}
