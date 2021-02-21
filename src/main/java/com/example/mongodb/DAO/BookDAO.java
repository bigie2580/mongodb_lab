package com.example.mongodb.DAO;

import com.example.mongodb.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    private final BookRepository repository;

    public BookDAO(BookRepository repository) {
        this.repository = repository;
    }

    public Collection<Book> getBooks() {
        return repository.findAll();
    }

    public Book createBook(Book book) {
        return repository.insert(book);
    }

}
