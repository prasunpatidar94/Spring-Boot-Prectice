package com.pp.sun.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class Info {
	private String data ;
	private String infoData;
}
