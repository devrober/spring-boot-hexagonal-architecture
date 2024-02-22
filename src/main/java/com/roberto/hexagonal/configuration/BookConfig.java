package com.roberto.hexagonal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.roberto.hexagonal.adapters.BookJpaAdapter;
import com.roberto.hexagonal.ports.api.BookServicePort;
import com.roberto.hexagonal.ports.spi.BookPersistencePort;
import com.roberto.hexagonal.service.BookServiceImpl;

@Configuration
public class BookConfig {
	@Bean 
	public BookPersistencePort bookPersistence(){ 
		return new BookJpaAdapter();
	}
	@Bean 
	public BookServicePort bookService(){ 
		return new BookServiceImpl(bookPersistence());
	}
}
