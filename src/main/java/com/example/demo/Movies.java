package com.example.demo;


import javax.persistence.*;
import javax.transaction.Transactional;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Transactional
@Entity
public class Movies implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column(nullable = false, name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "entry_created_time")
    private LocalDateTime entryCreatedTime;

    @Column(name = "duration")
    private Double duration;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "rating")
    private Integer rating;

    public Movies(String name, LocalDate releaseDate, Double duration, byte[] image, Integer rating) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.entryCreatedTime = LocalDateTime.now();
        this.duration = duration;
    }

    protected Movies() {

    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public LocalDateTime getEntryCreatedTime() {
        return entryCreatedTime;
    }

    public Double getDuration() {
        return duration;
    }

    public byte[] getImage() {

        return image;
    }

    public Integer getRating() {
        return rating;
    }
}
