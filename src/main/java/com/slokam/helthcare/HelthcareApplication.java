package com.slokam.helthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "This is Health care API",version = "1.1.2",title = "Health Care"))
public class HelthcareApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelthcareApplication.class, args);
		
	
	}
}

