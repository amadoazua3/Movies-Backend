package com.moviesbackend.impl;

import com.moviesbackend.model.Movie;
import com.moviesbackend.repository.MoviesRepository;
import com.moviesbackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public Movie createMovie(Movie movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return moviesRepository.findAll();
    }






}
