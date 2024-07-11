package com.codepractice.module1.assignment.com.codepractice.module1.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1AssignmentApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(Module1AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.cakeBake();
	}
}
