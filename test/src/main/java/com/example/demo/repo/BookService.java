package com.example.demo.repo;

import java.util.Collection;

import com.example.demo.dto.Book;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}
