package com.sun.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class Info {
	
	private Integer port;
	private String url ;
	private String dbName;
	

}
