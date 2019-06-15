package com.gs.ilp.corejava.inheriatnce;

import java.util.Arrays;

public class Book {
	
	private String name;
	private Author[] authors;
	private double price;
	private int quantity;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, Author[] authors, double price, int quantity) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
