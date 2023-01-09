package com.hemlata.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FlightAwareApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(FlightAwareApplication1Application.class, args);
	}

}