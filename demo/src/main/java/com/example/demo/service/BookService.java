package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;

    public Book addNewBook(Book newBook) {
        return bookRepo.save(newBook);
    }

    public void removeBook(Long bookId) {
        bookRepo.deleteById(bookId);
    }

    public Book fetchBook(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    /**
     * Updates the information of a book.
     *
     * @param  id           the ID of the book to update
     * @param  updatedBook  the updated book information
     * @return              the updated book, or null if no book was found
     */
    public Book updateBookInfo(Long id, Book updatedBook) {
        if (bookRepo.existsById(id)) {
            updatedBook.setId(id);
            return bookRepo.save(updatedBook);
        }
        return null; // No book found.
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
