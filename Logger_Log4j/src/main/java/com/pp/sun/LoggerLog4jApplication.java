package com.pp.sun;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerLog4jApplication implements CommandLineRunner {


	private static Logger log = Logger.getLogger(LoggerLog4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerLog4jApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {


		/*
		 * this is manualy setup logger in spring boot application with out any
		 * .properties file // 1 create layout // Layout layout = new
		 * SimpleLayout();//simpale formate // Layout layout = new HTMLLayout();//html
		 * layout // Layout layout = new XMLLayout();//xml layout // Layout layout = new
		 * PatternLayout("%p %d %C %M %m %n");
		 * 
		 * 
		 * 
		 * // 2 create appander Appender appender = new ConsoleAppender(layout); // 3
		 * link appander with layout log.addAppender(appender);
		 * 
		 */		
		//		4 print the logger method massage

		log.info("this is the INFO");
		log.debug("this is the DEBUG");
		log.error("this is the ERROR");
		log.warn("this is the WARN");
		log.fatal("this is the FATAL");
		log.error("this is the ERROR");






	}

}
