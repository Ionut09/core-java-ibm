package com.ibm._6_polimorphism;

import com.ibm._5_inheritance.Animal;
import com.ibm._5_inheritance.Dog;

public class Playground {
	
	public static void main(String[] args) {
		//polimorphism: variable rex (referinta) of type Animal points to object of type Dog
		Animal animal = new Dog("Golden Retriever", "Golden", 30, "Pedigree");
		animal = new Tiger(150);
		
		//variable rex can only see methods from Animal
		animal.eat(); //inherited from Animal but overrden in Dog
		
		if (animal instanceof Dog) {
			((Dog) animal).walk(); //folosind cast putem accesa metode din obiect
		} else {
			System.out.println("Object " + animal.toString() + " is not of type Dog");
		}
		
		
		//Asta e anti-pattern
//		try {
//			((Dog) animal).walk();
////			int number = Integer.parseInt("inputFromOutside");
//		} catch (ClassCastException ex) {
//			System.out.println("Object " + animal.toString() + " is not of type Dog");
////			number = 0;
//		}
	}
}
