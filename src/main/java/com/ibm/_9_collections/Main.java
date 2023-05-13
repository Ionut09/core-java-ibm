package com.ibm._9_collections;

import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		//		new ListLibraryManager()
		//		new LibraryManager()
		
		Book book1 = new Book("1872187281", "head first Java", "Kathy Sierra");
		Book book2 = new Book("1872187281", "head first Java", "Kathy Sierra & Bert Rates");
		
		System.out.println("book1 == book2 => " + (book1 == book2));
		System.out.println("book1 == book2 => " + (book1.equals(book2)));
		
		List<String> list;
		/*
		"one" , "two", "three",  ....   "n-th"
		 0       1       2       ....   size() - 1
		 */
		
		LibraryManager manager = new MapLibraryManager(); //polimorphism
	
	
		manager.addBookToLibrary(new Book("1872187281", "head first Java", "Kathy Sierra"));
		manager.addBookToLibrary(new Book("2187268111", "Java 8 in action", "Mario Fusco"));
		manager.addBookToLibrary(new Book("2862822228", "OCA Study guide", "Kathy Sierra"));
		manager.addBookToLibrary(new Book("2187187211", "Moby Dick", "Herman Melville"));
		
		boolean java8 = manager.findBook(new Book("2187268111", "Java 8 in action", "Mario Fusco"));
		System.out.println("Library has Java 8 in action = " + java8);
		
		manager.removeBook(new Book("2187187211", "Moby Dick", "Herman Melville"));
		
		manager.replaceOldBook(
			new Book("1872187281", "head first Java", "Kathy Sierra"),
			new Book("1276178222", "head first Java second edition", "Kathy Sierra"));
		
		manager.listContent();
	}
}
