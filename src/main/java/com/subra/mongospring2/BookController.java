package com.subra.mongospring2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookRepository repo;
	
	@PostMapping("/addbook")
	public String saveBook(@RequestBody Book book){
		System.out.println("in saveBook()...");
		Book saved = repo.save(book);
		System.out.println("saved..." + saved.toString());
		return "book saved: " + saved.getIsbn();
		
	}

	@GetMapping("/allbooks")
	public List<Book> getBooks(){
		System.out.println("in getBooks()...");
		List<Book> books = repo.findAll();
		System.out.println("total..." + books.size());
		return books;		
	}	
	
	@GetMapping("/abook/{isbn}")
	public Optional<Book>  getABook(@PathVariable String isbn){
		System.out.println("in getABook()...");
		Optional<Book> book = repo.findById(isbn);
		System.out.println("book..." + book);
		return book;		
	}		
	
	@DeleteMapping("/deletebook/{isbn}")
	public String  delteABook(@PathVariable String isbn){
		System.out.println("in delteABook()...");
		repo.deleteById(isbn);
		System.out.println("book... if exist or not?" );
		return "deleted book with id/isbn=" + isbn;		
	}			
}
