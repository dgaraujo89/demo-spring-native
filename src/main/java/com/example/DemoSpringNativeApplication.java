package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.nativex.hint.TypeHint;

@TypeHint(types = HttpStatus.class, typeNames = "org.springframework.http.HttpStatus")
@EnableMongoRepositories(basePackages = "com.example")
@SpringBootApplication
public class DemoSpringNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringNativeApplication.class, args);
	}

}
