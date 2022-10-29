package com.movie.rest.client.RestClient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.movie.rest.client.config.Movies;


public class RestClient {
	private static final String GET_ALL_MOVIES = "http://localhost:8080/movies/getall";
//	private static final String GET_MOVIES_BY_NAME = "http://localhost:8080/movie/{moviename}";
    
	
	
	static RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping(path="/getAllMovies")
	private static Movies[] callGetAll() {
		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
		
		Movies[] result =	restTemplate.exchange(GET_ALL_MOVIES, HttpMethod.GET, entity, Movies[].class).getBody();
		
	System.out.println(result[0]);
		
	return result;
    }
}