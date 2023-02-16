package com.book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	
	List<Book> books = new ArrayList<>(); //List to taking number of books 
	
	/**
	 * method to add a book to Collection
	 * 
	 * @param author
	 * @return String
	 */
	
	public String addBook(Book book) {
		books.add(book);
		return "Book" + book + " added!";
	}
	
	/**
	 * method to search a book with particular title
	 * 
	 * @param author
	 * @return bookResult
	 */
	
	public Book searchByTitle(String title) {
		Book bookResult = null;
		for(Book book : books) {
			if(title.equalsIgnoreCase(book.getTitle())) {
				bookResult = book;
			}
		}
		return bookResult;
	}
	
	/**
	 * method to search a book with particular author
	 * 
	 * @param author
	 * @return bookResult
	 */
	
	public Book searchByAuthor(String author) {
		Book bookResult = null;
		for(Book book : books) {
			if(author.equalsIgnoreCase(book.getAuthor())) {
				bookResult = book;
			}
		}
		return bookResult;
	}
	
	/**
	 * This method is used to display all the books stored in the collection
	 * 
	 */
	
	public void displayAll() {
		for(Book book : books) {
			System.out.println(book);
		}
	}

}
