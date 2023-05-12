package com.ibm._5_inheritance;

public class Dog extends Animal { //in Java extindem o singura clasa intotdeauna
	
	private String breed;
	private String color;
	
	public Dog(String breed, String color, double weight, String diet) {
		super(weight, diet);
		this.breed = breed;
		this.color = color;
//		this.weight = 0;
	}
	
	public Dog() {
		super(0.0, "omnivore");
	}
	
	public void walk() {
		System.out.println("Dog walks");
	}
	
	@Override
	public void eat(){
		System.out.println("Dog eats dog food");
	}
}
