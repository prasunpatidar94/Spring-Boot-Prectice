package com.sun.services.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sun.services.AlrlSystem;

import lombok.Data;


@Component
@Profile("dev")
@ConfigurationProperties(prefix = "my.data")
@Data
public class EmailAlertSystem implements AlrlSystem {

	private String data;
	private String mode;
	private String text;

	@Override
	public void alert() {

		System.out.println("Email alert system");
		System.out.println(data+" " +mode +" " +text);
	}


}
