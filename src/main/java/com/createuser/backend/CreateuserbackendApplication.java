package com.createuser.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.createuser.backend")
@EntityScan(basePackages = "com.createuser.backend")
public class CreateuserbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateuserbackendApplication.class, args);
	}

}
