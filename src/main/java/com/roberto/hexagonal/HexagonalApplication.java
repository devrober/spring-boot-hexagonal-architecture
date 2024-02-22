package com.roberto.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.roberto.hexagonal.data.BookDTO;

@SpringBootApplication
public class HexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalApplication.class, args);
		
		BookDTO book = new BookDTO(12L, "Hola", "Hola", 23.53);
		System.out.println(book);
	}
L
}
