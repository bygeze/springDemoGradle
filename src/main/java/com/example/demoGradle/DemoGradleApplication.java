package com.example.demoGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 * Added exclude = {DataSourceAutoConfiguration.class }
 * since I dont need to use data-jpa dependency and create the DataSource right now.
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleApplication.class, args);
	}

}
