package com.example.mongodb.service;

import com.example.mongodb.DAO.BookDAO;
import com.example.mongodb.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public Collection<Book> getBooks() {
        return bookDAO.getBooks();
    }

    public Book createBook (Book book) {
        return bookDAO.createBook(book);
    }

}
