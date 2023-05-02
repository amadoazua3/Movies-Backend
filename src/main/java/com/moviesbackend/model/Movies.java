package com.moviesbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Movies")
public class Movies {

    private String title;

    private String rating;

    @Id
    private int _id;

    private String genre;

    private String actors;

    private String director;

    private String plot;

    private String year;

    private String poster;

}
