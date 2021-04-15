package com.pp.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingPreciceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingPreciceApplication.class, args);
	}

}
