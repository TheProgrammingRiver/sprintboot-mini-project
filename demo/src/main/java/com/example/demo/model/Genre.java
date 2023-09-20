package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Genre{
    @Id
    private Long id;
    private String name;
    private String genre;

    public Genre() {
    }

    public Genre(Long id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Object getId() {
        return id;
    }
}
