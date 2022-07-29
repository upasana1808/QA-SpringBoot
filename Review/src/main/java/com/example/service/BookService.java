package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.exception.BookNotFoundException;
import com.example.model.Book;
import com.example.repo.BookRepo;

@Service
public class BookService {
	private BookRepo repo;	
	//public List<Book> list = new ArrayList();	
	public BookService(BookRepo repo) {
		super();
		this.repo = repo;
	}
	public Book addBook(Book b1) {
		return this.repo.save(b1);
	}
	public List<Book> readBook() {
		return this.repo.findAll();
	}
	//(a,b)->{sysout(a+b}
	public Book updateBook(int id,Book b2) {
		Book temp= this.repo.findById(id).orElseThrow(BookNotFoundException::new);
		Optional<Book> myTempBook=Optional.of(temp);
		Book existing=myTempBook.get();
		//existing.setId(b2.getId());//from request body
		existing.setTitle(b2.getTitle());//from request body
		existing.setPrice(b2.getPrice());//from request body
		existing.setAuthor(b2.getAuthor());//from request body
		return this.repo.save(existing);		
	}
	public boolean deleteBook(int id) {
		this.repo.deleteById(id);
		boolean exists=this.repo.existsById(id);
		return !exists;
	}
	
	
	public List<Book> getBookByAuthor(String author) {
		return this.repo.findBookByAuthor(author);
	}
	public List<Book> getBookByTitle(String Title) {
		return this.repo.findBookByTitle(Title);
	}
	
}
