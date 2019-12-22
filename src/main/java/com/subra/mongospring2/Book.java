package com.subra.mongospring2;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Books")
public class Book {
	
	@Id
	String isbn;
	String title;
	String author;
}
