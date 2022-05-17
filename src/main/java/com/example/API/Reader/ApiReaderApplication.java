package com.example.API.Reader;

import com.example.API.Reader.controller.StandingsController;
import com.example.API.Reader.model.Standings;
import com.example.API.Reader.proxy.StandingsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.API.Reader.proxy")
@EnableJpaRepositories(basePackages = "com.example.API.Reader.repository")
public class ApiReaderApplication  {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public static void main(String[] args) {

		SpringApplication.run(ApiReaderApplication.class, args);

	}


	/** 
	@Override
	public void run(String... args) throws Exception {
		String sql = "REPLACE INTO person (name, role, pwd) VALUES (?, ?, ?)";
		int result = jdbcTemplate.update(sql, "admin","ADMIN","admin");

		if (result > 0){
			System.out.println("A new ROLE_ADMIN account has been inserted.");
		}
		
	}  */

}
