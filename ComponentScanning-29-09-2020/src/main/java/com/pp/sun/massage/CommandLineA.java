package com.pp.sun.massage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pp.sun.entity.PropertiesReader;

@Component
public class CommandLineA implements CommandLineRunner {

	@Autowired
	private PropertiesReader propertiesReader;
	@Override
	public void run(String... args) throws Exception {
System.out.println("Command Line Class A");
System.out.println(propertiesReader);

	}

}
