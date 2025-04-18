package com.sbapi.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SbapiProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		//test origin
		SpringApplication.run(SbapiProjectApplication.class, args);
	}

}
