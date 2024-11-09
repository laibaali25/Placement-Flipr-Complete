package com.Placement.FullStack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Placement.FullStack")
public class FullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackApplication.class, args);
	}

}
