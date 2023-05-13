package com.ibm._9_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLibraryManager implements LibraryManager {
	
	private List<Book> books = new ArrayList<>();
	
	@Override
	public void addBookToLibrary(Book book) {
		books.add(book);
	}
	
	@Override
	public boolean findBook(Book book) {
		//		boolean b = book == new Book(); //comparatie intre zonele de memorie
		return books.contains(book); // foloseste equals
		//		books.indexOf(book)     -> identic cu cel de la String
		//		books.lastIndexOf(book) -> identic cu cel de la String
	}
	
	@Override
	public void replaceOldBook(Book oldBook, Book newBook) {
		int indexOfOldBook = books.indexOf(oldBook);
		//		books.remove(indexOfOldBook);
		//		books.add(indexOfOldBook, newBook);
		if (indexOfOldBook < 0) {
			System.out.println("Old book: " + oldBook + " could not be found in the library!");
			return;
		}
		books.set(indexOfOldBook, newBook);
		System.out.println("Old book: " + oldBook + " has been replaced in the library by new book: " + newBook);
	}
	
	@Override
	public void removeBook(Book book) {
		//		boolean removed = books.remove(book);
		//		if (removed) {
		if (books.remove(book)) {
			System.out.println("Old book: " + book + "has been removed from the library!");
		} else {
			System.out.println("Old book: " + book + " could not be found in the library!");
		}
	}
	
	@Override
	public void listContent() {
		System.out.println("\nLibrary size is: " + books.size());
		for (Book book : books) {//arrays / Iterable collections
			System.out.println(book);
		}
	}
}
