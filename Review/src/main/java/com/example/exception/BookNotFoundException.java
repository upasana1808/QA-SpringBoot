package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class BookNotFoundException extends EntityNotFoundException{
	public BookNotFoundException() {}
	public BookNotFoundException(String msg) {
		super(msg);
	}
}
