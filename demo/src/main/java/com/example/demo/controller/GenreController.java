package com.example.demo.controller;

import com.example.demo.model.Genre;
import com.example.demo.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {
    @Autowired
    private GenreService genreSrv;

    @DeleteMapping("/{id}")
    public void removeGenre(@PathVariable Long id) {
        genreSrv.removeGenre(id);
    }

    @PostMapping("/")
    public Genre addNewGenre(@RequestBody Genre genre) {
        return genreSrv.addNewGenre(genre);
    }

    @GetMapping("/")
    public List<Genre> getAllTheGenres() {
        return genreSrv.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre fetchGenre(@PathVariable Long id) {
        return genreSrv.fetchGenre(id);
    }
    /**
     * Updates a genre with the given ID.
     *
     * @param  id     the ID of the genre to update
     * @param  genre  the genre object with updated information
     * @return        the updated genre object
     */
    @PutMapping("/{id}")
    public Genre updateGenre(@PathVariable Long id, @RequestBody Genre genre) {
        return genreSrv.updateGenre(id, genre);
    }
}
