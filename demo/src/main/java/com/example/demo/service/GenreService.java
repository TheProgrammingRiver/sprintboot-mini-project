package com.example.demo.service;

import com.example.demo.model.Genre;
import com.example.demo.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    private GenreRepository repo;

    public Genre addNewGenre(Genre newGenre) {
        return repo.save(newGenre);
    }

    public void removeGenre(Long genreId) {
        repo.deleteById(genreId);
    }

    public Genre fetchGenre(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Genre updateGenre(Long id, Genre updatedGenre) {
        if (repo.existsById(id)) {
            updatedGenre.setId(id);
            return repo.save(updatedGenre);
        }
        return null; // Couldn't find the genre.
    }

    public List<Genre> getAllGenres() {
        return repo.findAll();
    }
}
