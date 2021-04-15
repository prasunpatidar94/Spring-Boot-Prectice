package com.pp.sun.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pp.sun.model.InfoMail;
import com.pp.sun.utility.EmailUtility;

@Component
public class InitialRunner implements CommandLineRunner {

	@Autowired
	private EmailUtility email;
	@Autowired
	private InfoMail info;

	@Override
	public void run(String... args) throws Exception {

		Boolean flag = email.emailSend(info.getTo(), info.getCc(), info.getBcc(), info.getSub(), info.getText(),
				info.getFilepath());

		if (flag) {
			System.out.println("sucess");
		} else {
			System.out.println("failed");

		}

	}

}
