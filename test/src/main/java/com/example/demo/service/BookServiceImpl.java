package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.config.DuplicateBookException;
import com.example.demo.dto.Book;
import com.example.demo.repo.BookService;

@Service
public class BookServiceImpl implements BookService {

//    private final BookRepository bookRepository;

	// constructors, other override methods

	@Override
	public Book addBook(Book book) {
//        final Optional<BookData> existingBook = bookRepository.findById(book.getIsbn());
//        if (existingBook.isPresent()) {
//            throw new DuplicateBookException(book);
//        }
//
//        final BookData savedBook = bookRepository.add(convertBook(book));
//        return convertBookData(savedBook);
		return new Book("add", "ddsf", "sdf");
	}

	@Override
	public Collection<Book> getBooks() {
		// TODO Auto-generated method stub
		List<Book> list = new ArrayList<>(); 
		list.add(new Book("add", "ddsf", "sdf"));
		return list;
	}

	// conversion logic
}