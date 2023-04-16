package com.toting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TotingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TotingApplication.class, args);
	}

}
