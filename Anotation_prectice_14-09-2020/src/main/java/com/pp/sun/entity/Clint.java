package com.pp.sun.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Clint {
	@Value("1000")
	private Long id ;
	@Value("Prasun Patidar")
	private String cname;
	@Value("${ftp.ip}")
	private String address;
	@Autowired
	private Product product;
	
	
	
	@Override
	public String toString() {
		return "Clint [id=" + id + ", cname=" + cname + ", address=" + address + ", product=" + product + "]";
	}



	public void show () {
		System.out.println("clind is ready :" +toString());
	}
	
	

}
