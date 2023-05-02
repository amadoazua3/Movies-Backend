package com.moviesbackend.repository;


import com.moviesbackend.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoviesRepository extends MongoRepository<Movie, String> {

}
