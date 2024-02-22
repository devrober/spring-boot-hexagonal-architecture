package com.roberto.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roberto.hexagonal.data.BookDto;

@SpringBootApplication
public class HexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalApplication.class, args);
		
		BookDto book = new BookDto(12L, "Hola", "Hola", 23.53);
		System.out.println(book);
	}
}
