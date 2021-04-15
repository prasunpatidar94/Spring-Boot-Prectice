package com.pp.sun.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		StopWatch watch = new StopWatch("test-stop-watch");
		
		watch.start("first 1");
		
		for (long i = 0; i > 1000000000; i++) {
			Math.pow(i, i);
		}
		watch.stop();

		watch.start("first 2");

		for (long i = 0; i > 800000000; i++) {
			Math.pow(i, i);
		}
		watch.stop();

		System.out.println(watch.prettyPrint());
		System.out.println("time");
		System.out.println(watch.getTotalTimeMillis());
		System.out.println(watch.getTotalTimeSeconds());
		System.out.println(watch.getTotalTimeNanos());


		
	}

}
