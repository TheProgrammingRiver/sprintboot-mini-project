package com.example.demo.security;

import com.example.demo.model.Genre;
import com.example.demo.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreDetailsService {

    @Autowired
    private GenreRepository genreRepo;

    public Genre loadGenreBName(String name) {
        Genre foundGenre = genreRepo.findByName(name);
        if (foundGenre == null) {
            throw new RuntimeException("Genre doesn't exist.");
        }
        return new Genre((Long) foundGenre.getId(), foundGenre.getName(), foundGenre.getGenre());
    }
}