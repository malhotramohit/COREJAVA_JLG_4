package com.gs.ilp.corejava.inheriatnce;

import java.util.Arrays;

public class TestBook {
	public static void main(String[] args) {
		//
		// Author author = new Author("mohit", "sdfdf@edfe.com", 'M');
		// System.out.println(author);
		//
		// Book book = new Book("Effecive jav", author, 3434.343, 23);
		// System.out.println(book);
		//
		// System.out.println(book.getName());
		// System.out.println(book.getAuthor().getGender());
		// System.out.println(book.getAuthor().getName());
		// book.getAuthor().setName("Mohit Malhotra");
		// System.out.println(book);
		//
		// Book book2 = new Book("JAVa 2", new Author("Khushboo", "ddf@sds.com", 'F'),
		// 4445.2424, 2);
		// System.out.println(book2);

		Author author1 = new Author("mohit", "sds@edfe.com", 'M');
		Author author2 = new Author("rohit", "23@edfe.com", 'M');
		Author author3 = new Author("ronit", "grg@edfe.com", 'M');

		Author[] authors = new Author[3];
		authors[0] = author1;
		authors[1] = author2;
		authors[2] = author3;

		Book book = new Book("Java", authors, 334.3434, 78);
		System.out.println(book);
		checkNameOfAuthor(book, "ro");
		
		Arrays.stream(authors).forEach(System.out::println);

	}

	private static void checkNameOfAuthor(Book book, String string) {
		Author[] authors = book.getAuthors();

		for (Author auth : authors) {
			if (auth.getName().startsWith(string)) {
				System.out.println(auth);
			}
		}

	}

}
