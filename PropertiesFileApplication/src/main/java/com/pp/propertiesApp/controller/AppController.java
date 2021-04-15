package com.pp.propertiesApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	
	@Value("app.name${}")
	private String sms ;
	@Mapping("/")
	public String message() {
		return ;
		
	}

}
