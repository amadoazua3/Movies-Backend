package com.moviesbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Movies")
public class Movie {

    private String title;

    private String rating;

    @Id
    private long _id;

    private String genre;

    private String actors;

    private String director;

    private String plot;

    private String year;

    private String poster;

    //This constructor will be used by Jackson to handle JSON deserialization
//    public Movie(@JsonProperty("title") String title,
//                 @JsonProperty("rating") String rating,
//                 @JsonProperty("_id") long _id,
//                 @JsonProperty("genre") String genre,
//                 @JsonProperty("actors") String actors,
//                 @JsonProperty("director") String director,
//                 @JsonProperty("plot") String plot,
//                 @JsonProperty("year") String year,
//                 @JsonProperty("poster") String poster) {
//
//        this.title = title;
//        this.rating = rating;
//        this._id = _id;
//        this.genre = genre;
//        this.actors = actors;
//        this.director = director;
//        this.plot = plot;
//        this.year = year;
//        this.poster = poster;
//
//    }

}
