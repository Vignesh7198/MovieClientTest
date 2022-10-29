package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDetails extends JpaRepository<Movies, Integer> {

	Movies findByMoviename(String moviename);
	
}
