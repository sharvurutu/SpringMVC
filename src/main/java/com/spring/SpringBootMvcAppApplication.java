package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring")
public class SpringBootMvcAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Boot World....");
		
		SpringApplication.run(SpringBootMvcAppApplication.class, args);
	}
}
