package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello world");
		System.out.println("First change - to main");
		System.out.println("feature branch changes");
		System.out.println("feature second branch changes");
		System.out.println("same line changes and commit");
	}
	public void hello(){
		System.out.println("Hello world");
	}

	public void greet(){
		System.out.println("Welcome");
	public void hello(){
		System.out.println("Hello world");
	}

	public void greet(){
		System.out.println("Welcome");
	}

}
