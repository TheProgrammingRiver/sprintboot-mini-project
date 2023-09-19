package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    private Long id;
    private String name;
}
