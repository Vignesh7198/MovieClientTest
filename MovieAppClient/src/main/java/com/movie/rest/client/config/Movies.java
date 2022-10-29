package com.movie.rest.client.config;


public class Movies {

	
	private int id;
	private String moviename;
	private double rating;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	
	
	public Movies() {
	}
	
	
	public Movies(String moviename, double rating) {
		super();
		this.moviename = moviename;
		this.rating = rating;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Movies [id=" + id + ", moviename=" + moviename + ", rating=" + rating + "]";
	}
	
	
}
