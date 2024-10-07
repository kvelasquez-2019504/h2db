package com.kennethvelasquez.h2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class H2dbApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2dbApplication.class, args);
	}

}
