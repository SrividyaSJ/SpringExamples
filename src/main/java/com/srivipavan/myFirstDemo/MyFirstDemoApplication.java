package com.srivipavan.myFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hi.....");
		SpringApplication.run(MyFirstDemoApplication.class, args);
		System.out.println("bye");
	}
}
