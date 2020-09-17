package com.example.demo;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{
	
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class).sources(DemoApplication.class).properties(getProperties()).run(args);
//		SpringApplication.run(DemoApplication.class, args);
		logger.info("Info log");
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(DemoApplication.class).properties(getProperties());
	}
	
	static Properties getProperties() {
		Properties props = new Properties();
		props.put("spring.config.location", "file:///C:\\Users\\Admin\\test\\application.properties");
		return props;
	}

}
