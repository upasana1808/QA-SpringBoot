package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.BookService;

@RestController
public class BookController {
	private BookService service;
	
	public BookController(BookService service) {
		super();
		this.service = service;
	}
	@PostMapping("/create")
	public Book create(@RequestBody Book b1) {
		return this.service.addBook(b1);
	} 
	@GetMapping("/read")
	public List<Book> read() {
		return this.service.readBook();
	}
	@PutMapping("/update/{id}")
	public Book update(@PathVariable int id, @RequestBody Book b2) {
		return this.service.updateBook(id, b2);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.service.deleteBook(id);
	}
	@GetMapping("/read/{author}")
	public List<Book> read(@PathVariable String author) {
		return this.service.getBookByAuthor(author);
	}
	
	@GetMapping("/read/{title}")
	public List<Book> readByTitle(@PathVariable String title) {
		return this.service.getBookByAuthor(title);
	}	
	
	@GetMapping("/test")
	public String test() {
		return "Hello there!!";
	}

}
