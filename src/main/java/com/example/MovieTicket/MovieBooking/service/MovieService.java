package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.MovieTicket.MovieBooking.Exceptions.IdAlreadyExist;
import com.example.MovieTicket.MovieBooking.Exceptions.IdNotFound;
import com.example.MovieTicket.MovieBooking.Model.Movie;
@Service
public class MovieService implements MovieServiceInterface {

	List<Movie> moviesList = new ArrayList<Movie>();
	Map<String,Movie> moviesMap = new HashMap<String,Movie>();
	public List<Movie> getAll() {
		return moviesList;
		
	}
	
	public Movie getMovieById(String id) {
		if(ObjectUtils.isEmpty(moviesMap.get(id))) {
			throw new IdNotFound("Movie not present in Database");
		}
		return moviesMap.get(id);
	}

	public void deleteMovieById(String id) {
//		if(ObjectUtils.isEmpty(getMovieById(id))) {
//			throw new IdNotFound("Movie not present in Database");
//		}
		Movie movie = getMovieById(id);
		moviesMap.remove(id);
		moviesList.remove(movie);
	}

	public void updateMovie(Movie updatedMovie) {
		Movie existingMovie = getMovieById(updatedMovie.getId());
		moviesList.remove(existingMovie);
		moviesMap.put(updatedMovie.getId(), updatedMovie);
		
		moviesList.add(updatedMovie);
		
	}




	public void addMovie(Movie movie) {
		if(moviesMap.containsKey(movie.getId())) {
			throw new IdAlreadyExist("Movie Already present");
		}
		moviesList.add(movie);
		moviesMap.put(movie.getId(), movie);
	}






	

	

}
