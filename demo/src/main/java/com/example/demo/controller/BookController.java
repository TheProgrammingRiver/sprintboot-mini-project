package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookSrv;

    @DeleteMapping("/{id}")
    public void removeBook(@PathVariable Long id) {
        bookSrv.removeBook(id);
    }

    @PostMapping("/")
    public Book addNewBook(@RequestBody Book book) {
        return bookSrv.addNewBook(book);
    }

}
