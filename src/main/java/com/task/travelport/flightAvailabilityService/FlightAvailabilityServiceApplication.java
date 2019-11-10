package com.task.travelport.flightAvailabilityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring boot application for getting flight availability
 */
@SpringBootApplication
public class FlightAvailabilityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAvailabilityServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
