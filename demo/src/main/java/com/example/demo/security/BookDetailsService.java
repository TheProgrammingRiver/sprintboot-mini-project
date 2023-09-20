package com.example.demo.security;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDetailsService {

    @Autowired
    private BookRepository bookRepo;
    /**
     * Loads a book from the book repository by its title.
     *
     * @param  title  the title of the book to load
     * @return        the loaded book with its ID, title, and genre ID
     */
    public Book loadBookByTitle(String title) {
        Book foundBook = bookRepo.findByTitle(title);
        if (foundBook == null) {
            throw new RuntimeException("Book doesn't exist.");
        }
        return new Book(foundBook.getId(), foundBook.getTitle(), foundBook.getGenreId());
    }
}

