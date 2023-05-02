package com.moviesbackend.controller;

import com.moviesbackend.model.Movies;
import com.moviesbackend.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesRepository moviesRepository;

    @GetMapping("/")
    public ResponseEntity<List<Movies>> getAll() {
        return ResponseEntity.ok().body(moviesRepository.findAll());
    }

}
