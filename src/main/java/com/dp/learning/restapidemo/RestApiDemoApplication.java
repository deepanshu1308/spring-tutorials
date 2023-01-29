package com.dp.learning.restapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
		System.out.println("Starting rest app");
		SpringApplication.run(RestApiDemoApplication.class, args);
	}
}
