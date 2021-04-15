package com.pp.sun.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pp.sun.model.UserInfo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private UserInfo userInfo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("runner is runing ");
		System.out.println(userInfo);
	}

}
