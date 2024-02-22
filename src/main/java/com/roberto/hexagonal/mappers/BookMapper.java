package com.roberto.hexagonal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.roberto.hexagonal.data.BookDto;
import com.roberto.hexagonal.entity.Book;

@Mapper
public interface BookMapper {
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
	
	BookDto bookToBookDto(Book book);
	
	Book bookDtoToBook(BookDto bookDto);
	
	List<BookDto> bookListToBookDtoList(List<Book> bookList);
	
	List<Book> BookDtoListTobookList(List<BookDto> BookDtoList);
}
