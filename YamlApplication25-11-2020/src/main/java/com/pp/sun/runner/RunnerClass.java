package com.pp.sun.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.pp.sun.entity.PacketInfo;

import lombok.Data;

@ConfigurationProperties(prefix = "my.sun")
@Data
@Component
public class RunnerClass implements CommandLineRunner {

	private Integer id;
	private String name ;
	private Double price; 
	private List<String> list; 
	private Set<String> set; 
	private Map<String,String> map; 
	private PacketInfo  packetInfo;



	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		System.out.println("runnnnn..............");

	}

}
