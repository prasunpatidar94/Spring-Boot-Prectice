package com.sun.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class Info {
	
	private Integer port;
	private String prodev ;
	private String proqa ;
	private String proprasun ;
	private String prodefault;
	private String procom1 ;
	private String procom2 ;

	

}
