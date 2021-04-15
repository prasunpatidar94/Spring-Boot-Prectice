package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "my.app")
@Data
public class Info {
	
	private String def;
	private String qa;
	private String dev;
	private String pro;
	private String mailPro;
	private String mailDev;

	

}
