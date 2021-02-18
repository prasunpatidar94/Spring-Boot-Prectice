package com.pp.sun.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prod")
public class Product {
	@Value("100")
	private Long id ;
	@Value("HP Leptop")
	private String pname;
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + "]";
	}
	
	

}
