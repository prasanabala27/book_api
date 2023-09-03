package com.bala.bookstoreapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bala.bookstoreapi.BookstoreapiApplication;
import com.bala.bookstoreapi.entity.Book;
import com.bala.bookstoreapi.service.Bookservice;

@RestController
public class Bookcon {
	@Autowired
	private Bookservice b1;


    
//	@RequestMapping("/hello")
//	public String gethello() {
//		return "helloworld";
//	}
	
//	@RequestMapping("/books")
//	public List<Book> getBooks(){
//		return b1.getBooks();	
//	}
	
	@RequestMapping("/books")
	public List<Book> getBooks(@RequestParam(value = "sno",required = false) Integer snum){
		return b1.getBooks(snum);	
	}
	@PostMapping("/books") 
	public Book createBook(@RequestBody Book book) {
		return b1.createBook(book);
	}
	
	@GetMapping("/books/{id}")
	public Optional<Book> getbookbyid(@PathVariable("id") Integer bookid) {
		return b1.getbookbyid(bookid);
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book inbook) {
		return b1.updateBook(inbook);
	}
	
	@DeleteMapping("/books/{id}")
	public String deleBookbyid(@PathVariable("id") Integer bookid) {
		  b1.deleBookbyid(bookid);
		 return "deleted";
	}
	
	}
