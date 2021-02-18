package com.pp.sun;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerMassage implements ApplicationRunner{

	
//	   CommandLineRunner  cob = (args) -> { System.out.println("FROM LAMBDA SYNTAX CODE"); };

	
//	//Command line runner Example:
//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println("command line runner is working ");
//		
//		
//	}

	
	//Application runner Example:
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Application runner is working");
		
	}

	
	//
	
	


	
	
}
