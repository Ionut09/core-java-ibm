package com.ibm._9_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLibraryManager implements LibraryManager {
	
	//colectie de tip cheie-valoare
	private Map<String, Book> books = new HashMap<>();
	
	@Override
	public void addBookToLibrary(Book book) {
		books.putIfAbsent(book.getIsbn(), book);
	}
	
	@Override
	public boolean findBook(Book book) {
		//		books.containsValue(book.getIsbn());  -> equals
		return books.containsKey(book.getIsbn());
	}
	
	@Override
	public void replaceOldBook(Book oldBook, Book newBook) {
		//		Book oldBookInLibrary = books.put(oldBook.getIsbn(), newBook); //inlocuieste o valoare existenta daca exista in Map
		//inlocuieste perechea doar daca gaseste cheia oldBook.getIsbn() si este mapata la oldBook
		books.replace(oldBook.getIsbn(), oldBook, newBook); //update propriu-zis
	}
	
	@Override
	public void removeBook(Book book) {
		//		books.remove(book.getIsbn());
		books.remove(book.getIsbn(), book); //conditie extra
	}
	
	@Override
	public void listContent() {
		Set<Entry<String, Book>> entries = books.entrySet();
		System.out.println("\nLibrary size is: " + books.size());
		for (Entry<String, Book> bookEntry : entries) {
			//entry care contine key si value
			System.out.println("Isbn: " + bookEntry.getKey() + ", book: " + bookEntry.getValue());
		}
	}
}
