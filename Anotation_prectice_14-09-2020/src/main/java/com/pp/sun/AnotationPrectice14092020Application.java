package com.pp.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pp.sun.entity.Clint;

@SpringBootApplication
public class AnotationPrectice14092020Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(AnotationPrectice14092020Application.class, args);
	
	ac.getBean("clint", Clint.class).show();
	
	}

}
