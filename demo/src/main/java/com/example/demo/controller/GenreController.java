package com.example.demo.controller;

import com.example.demo.model.Genre;
import com.example.demo.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
