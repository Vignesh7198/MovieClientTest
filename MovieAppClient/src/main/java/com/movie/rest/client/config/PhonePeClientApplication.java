package com.movie.rest.client.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@Configuration
public class PhonePeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonePeClientApplication.class, args);
		
		
	}
	

	
	@Bean
	public RestTemplate template() {
		
		
		RestTemplate rest = new RestTemplateBuilder().build();
		
		return rest;
	}


	
	
//  userId
//	userName
//	password
	
	
}
