package com.ibm._5_inheritance;

public class Animal  {//extends Object implicitly
	
	protected double weight;
	private String diet;
	
	public Animal(double weight, String diet) {
		this.weight = weight;
		this.diet = diet;
	}
	
	public void eat() {
		System.out.println("Animal eats according to its diet: " + diet);
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getDiet() {
		return diet;
	}
	
	public void setDiet(String diet) {
		this.diet = diet;
	}
}
