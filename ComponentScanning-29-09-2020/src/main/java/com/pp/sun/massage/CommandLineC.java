package com.pp.sun.massage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineC implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
System.out.println("Command Line Class C");
	}

}
