package com.pp.model;

import java.util.List;
import java.util.Map;

import org.apache.tomcat.jni.Address;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
@ConfigurationProperties(prefix = "my.app")
public class Info {
	private int id;
	private String name ;
	private String city;
	private List<String> technologieslistList;
	private Map<String, String> companyAndDesignation;
	private Adderss address ;
	
	

}

@Data
class Adderss
{
	private int plotNo;
	private String landMark;
}
  


