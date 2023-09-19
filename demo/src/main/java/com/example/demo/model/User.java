package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String Username;
    private String Password;
}
