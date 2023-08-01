package com.example.demo.config;

import com.example.demo.dto.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DuplicateBookException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }

    // getter methods
}