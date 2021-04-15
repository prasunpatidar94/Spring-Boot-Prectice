package com.pp.sun.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "my.data")
@Data
public class InfoMail {
	
	private String to ;
	private String cc ;
	private String bcc ;
	private String sub ;
	private String text;
	private String filepath;



}
