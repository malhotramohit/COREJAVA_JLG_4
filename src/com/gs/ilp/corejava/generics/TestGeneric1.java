package com.gs.ilp.corejava.generics;

class Parcel<T> {

	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}

class Book {

}

class Pen {

}

public class TestGeneric1 {

	public static void main(String[] args) {

		Parcel<Book> bookParcel = new Parcel<Book>();
		
		bookParcel.setObj(new Book());

		Book bookReturned = (Book) bookParcel.getObj();
		
		System.out.println(bookReturned);
	}

}
