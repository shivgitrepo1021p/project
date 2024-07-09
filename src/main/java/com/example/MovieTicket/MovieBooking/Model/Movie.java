package com.example.MovieTicket.MovieBooking.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Component
public class Movie {
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Min(value = 1)
	String id;
@Size(min = 3,max = 20)
    String movieName;
@NotNull(message = "The name of the movie director cannot be null")
     String movieDirector;
     
@Min(value = 1)
@Max(value = 10)
     long movieRating;

     String movieLanguage;

     List<String> writers = new ArrayList<String>();

     List<String> actors  = new ArrayList<String>();

     List<String> genre = new ArrayList<String>();
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieDirector=" + movieDirector + ", movieRating="
				+ movieRating + ", movieLanguage=" + movieLanguage + ", writers=" + writers + ", actors=" + actors
				+ ", genre=" + genre + "]";
	}

	public Movie(String id, String movieName, String movieDirector, long movieRating, String movieLanguage,
			List<String> writers, List<String> actors, List<String> genre) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieRating = movieRating;
		this.movieLanguage = movieLanguage;
		this.writers = writers;
		this.actors = actors;
		this.genre = genre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public long getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(long movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public List<String> getWriters() {
		return writers;
	}

	public void setWriters(List<String> writers) {
		this.writers = writers;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	
}
