package com.example.springboot_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApplicationRegister {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRegister.class, args);
	}
}
