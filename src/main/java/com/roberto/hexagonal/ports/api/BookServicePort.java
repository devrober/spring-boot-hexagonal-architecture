package com.roberto.hexagonal.ports.api;

import java.util.List;

import com.roberto.hexagonal.data.BookDto;

public interface BookServicePort {
	BookDto addBook(BookDto bookDto);
	void deleteBookById(Long id);
	BookDto updateBook(BookDto bookDto);
	List<BookDto> getBooks();
	BookDto getBookById(Long bookId);
}
