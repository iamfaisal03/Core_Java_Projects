package com.book;

import com.exception.InvalidBookException;


public class Book {
	
	 	private String bookId;
		private String title;
		private String author;
		private String category;
		private float price;
		
		// Getters and Setters
		
		public String getBookId() {
			return bookId;
		}
		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		/**
		 * Parameterized Constructor for initializing Book object
		 *
		 * @param bookId
		 * @param title
		 * @param author
		 * @param category
		 * @param price
		 * @throws InvalidBookException
		 */
		public Book(String bookId, String title, String author, String category, float price) throws InvalidBookException {
			super();
			
			if(bookId.length() == 4 && bookId.startsWith("B")) {
				this.bookId = bookId;
			} else {
				throw new InvalidBookException("Invalid Book");
			}
			this.title = title;
			this.author = author;
			
			if(category.equalsIgnoreCase("Science") ||
					category.equalsIgnoreCase("Fiction") ||
					category.equalsIgnoreCase("Technology") ||
					category.equalsIgnoreCase("Others")) {
				this.category = category;
			} else {
				throw new InvalidBookException("Invalid Book");
			}
			
			if(price > 0) {
				this.price = price;
			}
		}
		
		
		/**
		 * toString method for displaying the details of Book
		 *
		 */
		
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
					+ ", price=" + price + "]";
		}
		
	}