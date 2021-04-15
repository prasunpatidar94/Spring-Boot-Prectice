package com.pp.sun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pp")
public class Controller {
	@GetMapping("/hi")
	public String hi() {
		return "This is prasun patidar";
		
	}

}
