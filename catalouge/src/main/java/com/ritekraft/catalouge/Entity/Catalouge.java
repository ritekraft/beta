package com.ritekraft.catalouge.Entity;

import org.springframework.data.annotation.Id;


public class Catalouge {
	
	@Id
	int catalougeID;
	
	String bookName;
	String genre;
	String bookDescription;
	String bookCategory;
	String author;
	int bookID;
	int quantity;
	int price;
	/**
	 * @return the catalougeID
	 */
	public int getCatalougeID() {
		return catalougeID;
	}
	/**
	 * @param catalougeID the catalougeID to set
	 */
	public void setCatalougeID(int catalougeID) {
		this.catalougeID = catalougeID;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the bookDescription
	 */
	public String getBookDescription() {
		return bookDescription;
	}
	/**
	 * @param bookDescription the bookDescription to set
	 */
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	/**
	 * @return the bookCategory
	 */
	public String getBookCategory() {
		return bookCategory;
	}
	/**
	 * @param bookCategory the bookCategory to set
	 */
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	public Catalouge(int catalougeID, String bookName, String genre, String bookDescription, String bookCategory,
			String author, int bookID, int quantity, int price) {
		super();
		this.catalougeID = catalougeID;
		this.bookName = bookName;
		this.genre = genre;
		this.bookDescription = bookDescription;
		this.bookCategory = bookCategory;
		this.author = author;
		this.bookID = bookID;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	

}
