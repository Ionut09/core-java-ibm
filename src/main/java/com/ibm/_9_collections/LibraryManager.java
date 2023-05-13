package com.ibm._9_collections;

public interface LibraryManager {
	
	//CRUD
	public abstract void addBookToLibrary(Book book); //public abstract by default in interfete
	
	boolean findBook(Book book);
	
	void replaceOldBook(Book oldBook, Book newBook);
	
	void removeBook(Book book);
	
	void listContent();
	
}
