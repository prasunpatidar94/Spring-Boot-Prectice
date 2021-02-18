package com.pp.sun.runner;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.pp.sun.model.Emp;

@Component
@ConfigurationProperties(prefix = "emp.data")
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	
	private Emp em;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(em);
		
	}

}
