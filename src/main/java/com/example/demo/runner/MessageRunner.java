package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("Application Testing...");
		System.out.println("Applying some modifications "+10);
	}

}
