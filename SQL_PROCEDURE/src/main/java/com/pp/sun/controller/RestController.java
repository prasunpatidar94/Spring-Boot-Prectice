package com.pp.sun.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.sun.services.Services;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	@Autowired
	private Services  services;
	@RequestMapping(value = "/call/{code}",method = RequestMethod.GET )
	public Map<String, Object> callProcedure(@PathVariable(name = "code")String code) {
		Map<String, Object> map = new HashMap<>();
		
		map.put("code", "1000");
		map.put("success", services.callProc( code));
		return map;
		
	}

}
