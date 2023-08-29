package com.bala.bookstoreapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.bookstoreapi.entity.Book;
import com.bala.bookstoreapi.repo.Bookrepository;
@Service
public class Bookservice {
	
//	static List<Book> booklist = Arrays.asList(
//			new Book(1, "book1","b1"),
//			new Book(2, "book2","b2"),
//			new Book(3, "book3","b3")
//			);
	
	@Autowired
	private Bookrepository bookrepo;
	
	public List<Book> getBooks(){
		List<Book> booklist = new ArrayList<>();
		bookrepo.findAll().forEach(book -> booklist.add(book));
		return booklist;
	}
	
	public Book createBook(Book book) {
	   return bookrepo.save(book);
	}
	
	public Optional<Book> getbookbyid(Integer bookid) {
		return bookrepo.findById(bookid);
	}

	public Book updateBook(Book inbook) {
		return bookrepo.save(inbook);
	}

	public String deleBookbyid(Integer bookid) {
		
		 bookrepo.deleteById(bookid);
		 return "deleted";
		
	}
	

}
