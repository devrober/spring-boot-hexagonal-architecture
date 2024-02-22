package com.roberto.hexagonal.service;

import java.util.List;

import com.roberto.hexagonal.data.BookDto;
import com.roberto.hexagonal.ports.api.BookServicePort;
import com.roberto.hexagonal.ports.spi.BookPersistencePort;

public class BookServiceImpl implements BookServicePort { 
	private BookPersistencePort bookPersistencePort;
	
	public BookServiceImpl(BookPersistencePort bookPersistencePort) { 
		this.bookPersistencePort = bookPersistencePort;
	}
	
	@Override 
	public BookDto addBook(BookDto bookDto) { 
		return bookPersistencePort.addBook(bookDto);
	}
	
	@Override public void deleteBookById(Long id) { 
		bookPersistencePort.deleteBookById(id);
	}
	
	@Override public BookDto updateBook(BookDto bookDto) { 
		return bookPersistencePort.updateBook(bookDto);
	}
	
	@Override public List<BookDto> getBooks() { 
		return bookPersistencePort.getBooks();
	}
	
	@Override public BookDto getBookById(Long bookId) { 
		return bookPersistencePort.getBookById(bookId);
	} 
}