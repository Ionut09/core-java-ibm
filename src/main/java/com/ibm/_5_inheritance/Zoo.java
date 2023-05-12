package com.ibm._5_inheritance;

public class Zoo {
	
	public static void main(String[] args) {
		Dog rex = new Dog("Golden Retriever", "Golden", 30, "Pedigree");
		
		rex.eat(); //mostenita de la Animal
		rex.walk();
		System.out.println("rex.getDiet() = " + rex.getDiet());
		System.out.println("rex.getWeight() = " + rex.getWeight());
		rex.setDiet("Chappy");
		System.out.println("rex.getDiet() = " + rex.getDiet());
		
	}
}
