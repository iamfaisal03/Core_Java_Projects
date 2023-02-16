package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;
import com.exception.InvalidBookException;


public class bookutil {
	public static void main(String[] args) throws InvalidBookException {
		
		Scanner sc = new Scanner(System.in);			//for taking user input
	
	Book book1 = new Book("B101","Physics","Plank","Science",1099.99f);		//added some data directly
	Book book2 = new Book("B102","Wings of Fire","abdulkalam","Others",1299.99f);
	Book book3 = new Book("B103","Core JAVA","James Glosling","Technology",899.99f);
	
	BookStore bs = new BookStore();
	
	bs.addBook(book1);
	bs.addBook(book2);
	bs.addBook(book3);
	
	int n = 2;
	
	do{
	System.out.println("Press 1 to add a Book");
	System.out.println("Press 2 to search using title");
	System.out.println("Press 3 search using author");
	System.out.println("Press 4 for display");
	System.out.println("Press 5 to exit");
	int value = sc.nextInt();
	
	switch(value) {
	case 1:
		System.out.println("---Enter Book Information---");				
		System.out.print("Book ID: ");
		String bookId = sc.nextLine();						//takes book information from the console
		System.out.print("\nBook title: ");
		String booktitle = sc.nextLine();
		System.out.print("\nBook Author: ");
		String bookauthor = sc.nextLine();
		System.out.print("\nBook Category: ");
		String category = sc.nextLine();
		System.out.print("\nBook price: ");
		float price = sc.nextFloat();
		Book book = new Book(bookId, booktitle, bookauthor, category, price); //passes values to parameterised constructor of Book class
		bs.addBook(book);
		break;
		
	case 2:
		System.out.println("Search your book using title");
		String title = sc.next();
		System.out.println(bs.searchByTitle(title));		//searches for the record and print the output
		break;
		
	case 3:
		System.out.println("Search your book using author");
		String author = sc.next();
		System.out.println(bs.searchByAuthor(author));		//searches for the record and print the output
		break;
		
	case 4:
		bs.displayAll();
		break;
		
	case 5:
		n = 0;
	}
	}while(n>1);
	
	sc.close();
}
}

