package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestApplication extends SpringBootServletInitializer {
	
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(TestApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
