package com.example.studentproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.boot.controllers")
@EnableJpaRepositories(basePackages = "com.example.reprositry")
@EntityScan(basePackages = "com.example.entity")
public class StudentprojectApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudentprojectApplication.class, args);
	}

}
