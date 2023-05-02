package com.moviesbackend.service;

import com.moviesbackend.model.Movie;

import java.util.List;

public interface MovieService {

    Movie createMovie(Movie movie);

    List<Movie> getAllMovies();

}
