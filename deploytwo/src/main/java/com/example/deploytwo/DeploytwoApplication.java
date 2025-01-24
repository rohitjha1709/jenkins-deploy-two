package com.example.deploytwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeploytwoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder appliaction){
		return appliaction.sources(DeploytwoApplication.class);
	}

	public static void main(String[] args) {


		SpringApplication.run(DeploytwoApplication.class, args);
	}

}
