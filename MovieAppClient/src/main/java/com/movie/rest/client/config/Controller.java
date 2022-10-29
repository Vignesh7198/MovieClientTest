package com.movie.rest.client.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	
	@GetMapping("test")
	public Movies test() {
		
		System.out.println("Test");
		
		return new Movies();
	}


//	private static final String GET_ALL_MOVIES = "http://localhost:8080/movies/getall";
//	private static final String GET_MOVIES_BY_NAME = "http://localhost:8080/movie/{moviename}";
    

 @Autowired	
 RestTemplate restTemplate;
	
	@RequestMapping(path="/getAll", method = RequestMethod.GET)
	public Movies[] callGetAll() {
		System.out.println("Testing");
		
	return restTemplate.exchange("http://localhost:8080/movies/getall", HttpMethod.GET, null, Movies[].class).getBody();
		
	}
	
	
	@RequestMapping(path="/getOne/{moviename}", method = RequestMethod.GET)
	public Movies callMovie() {
		System.out.println("Testing");
		
	return restTemplate.exchange("http://localhost:8080/movie/{moviename}", HttpMethod.GET, null, Movies.class).getBody();
		
	} 
	
	
}
