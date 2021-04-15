package com.pp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pp.model.Info;

@Component
public class Runner  implements CommandLineRunner{

	@Autowired private Info info;
	@Override
	public void run(String... args) throws Exception {
		
				System.out.println(info);
	}

}
