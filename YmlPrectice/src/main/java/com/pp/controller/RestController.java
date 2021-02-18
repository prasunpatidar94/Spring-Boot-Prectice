package com.pp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/hello")
	public Map<String, Object> hello() {
		Map<String, Object> map = new HashMap<>();
		
		map.put("code", 1000);
		map.put("Sucess", "code is running ");
		return map;
		
	}

}
