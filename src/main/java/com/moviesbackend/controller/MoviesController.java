package com.moviesbackend.controller;

import com.moviesbackend.model.Movie;
import com.moviesbackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public ResponseEntity<List<Movie>> getAll() {
        return ResponseEntity.ok().body(movieService.getAllMovies());
    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok().body(movieService.createMovie(movie));
    }

}
