package com.sun.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sun.model.Info;

@Component

public class Runner implements CommandLineRunner {

	@Autowired
	private Info info;
	
//	@Value("${data}")
//	private String data ;
//	

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(data);
		System.out.println(info);


	}

}
