package com.pp.sun.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pp.sun.emp.Emp;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {
	
	@Autowired

	private Emp e;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(e);
		
	}
	
	

}
