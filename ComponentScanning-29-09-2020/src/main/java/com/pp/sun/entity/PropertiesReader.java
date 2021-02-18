package com.pp.sun.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component

public class PropertiesReader {
	
	@Value("${prasun.id}")
	private int id ;
	@Value("${prasun.name}")
	private String name ;
	@Value("${prasun.city}")
	private String city;
	@Override
	public String toString() {
		return "PropertiesReader [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	

}
