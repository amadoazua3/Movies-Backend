package com.moviesbackend.repository;


import com.moviesbackend.model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoviesRepository extends MongoRepository<Movies, String> {

}
