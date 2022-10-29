package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Login {
	
	
    @Autowired
	MovieDetails movieDetails;
    
    
	@GetMapping(path="/movie/{moviename}")
	public Movies movieDetails(@PathVariable("moviename") String moviename) {
		
		Movies mov = movieDetails.findByMoviename(moviename);
		
		return mov;
	}
	
	@GetMapping(path="/movies/getall")
	public List<Movies> allMovies() {
		
		List<Movies> mov = movieDetails.findAll();
		
		System.out.println("*********************");
		System.out.println(mov);
		System.out.println("*********************");

		return mov;

	}
	
	
	
}
