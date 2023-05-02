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

    @PutMapping("/movie/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable long id, @RequestBody Movie movie) {
        movie.set_id(id);
        return ResponseEntity.ok().body(movieService.updateMovie(movie));
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable long id) {
        return ResponseEntity.ok().body(movieService.getMovieById(id));
    }

}
