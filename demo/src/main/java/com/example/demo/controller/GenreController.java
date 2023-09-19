package com.example.demo.controller;

import com.example.demo.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genres")
public class GenreController {
    @Autowired
    private GenreService genreSrv;

    @DeleteMapping("/{id}")
    public void removeGenre(@PathVariable Long id) {
        genreSrv.removeGenre(id);
    }
}
