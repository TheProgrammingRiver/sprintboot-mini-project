package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private Long genreId;

    public Book(Long id, String title, Long genreId) {
        this.id = id;
        this.title = title;
        this.genreId = genreId;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Long getGenreId() {
        return genreId;
    }

}
