package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movie {
    private Integer id;

    @JsonProperty(value = "name")
    private String name;
    private LocalDate releaseDate;
    private LocalDateTime entryCreatedTime;
    private Double duration;
    private Integer rating;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDateTime getEntryCreatedTime() {
        return entryCreatedTime;
    }

    public void setEntryCreatedTime(LocalDateTime entryCreatedTime) {
        this.entryCreatedTime = entryCreatedTime;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
