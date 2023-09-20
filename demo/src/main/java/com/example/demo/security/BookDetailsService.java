package com.example.demo.security;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDetailsService {

    @Autowired
    private BookRepository bookRepo;

    public Book loadBookByTitle(String title) {
        Book foundBook = bookRepo.findByTitle(title);
        if (foundBook == null) {
            throw new RuntimeException("Book doesn't exist.");
        }
        return new Book(foundBook.getId(), foundBook.getTitle(), foundBook.getGenreId());
    }
}

