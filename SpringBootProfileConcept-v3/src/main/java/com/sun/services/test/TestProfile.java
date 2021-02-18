package com.sun.services.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.sun.services.AlrlSystem;

@Service
public class TestProfile implements CommandLineRunner {

	@Autowired
//	@Qualifier("smsAlertSystem")//hard coded
	private AlrlSystem alrlSystem;

	@Override
	public void run(String... args) throws Exception {
		alrlSystem.alert();
	}

}
