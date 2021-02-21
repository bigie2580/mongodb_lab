package com.example.mongodb.DAO;

import com.example.mongodb.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
    // we can define methods there like find by title or find by author

}
