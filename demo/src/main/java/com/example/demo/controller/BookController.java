package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/")
    public List<Book> fetchAllBooks() {
        return bookSrv.getAllBooks();
    }
    
    @GetMapping("/{id}")
    public Book fetchBook(@PathVariable Long id) {
        return bookSrv.fetchBook(id);
    }


}
