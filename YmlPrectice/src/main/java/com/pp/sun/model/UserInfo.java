package com.pp.sun.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "my.data")
@Component
public class UserInfo {
	private Integer id;
	private String name;
	private String form;

}
