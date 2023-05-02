package com.moviesbackend.impl;

import com.moviesbackend.exception.ResourceNotFoundException;
import com.moviesbackend.model.Movie;
import com.moviesbackend.repository.MoviesRepository;
import com.moviesbackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Movie updateMovie(Movie movie) {
        Optional<Movie> movieOptional = moviesRepository.findById(movie.get_id());

        if(movieOptional.isPresent()) {
            return moviesRepository.save(movie);
        } else {
            throw new ResourceNotFoundException(("Record not found with id: " + movie.get_id()));
        }
    }


    @Override
    public Movie getMovieById(long id) {

        Optional<Movie> movieOptional = moviesRepository.findById(id);

        if(movieOptional.isPresent()) {
            return movieOptional.get();
        } else {
            throw new ResourceNotFoundException(("Record not found with id: " + id));
        }

    }




}
