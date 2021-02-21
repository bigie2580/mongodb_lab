package com.example.mongodb.controller;

import com.example.mongodb.DAO.BookDAO;
import com.example.mongodb.Entity.Book;
import com.example.mongodb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/books")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //    @GetMapping
//    public String getBooks(){
//        return "This is just for test";
//    }

    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

}
