package com.ibm._6_polimorphism;

import com.ibm._5_inheritance.Animal;

public class Tiger extends Animal {
	
	public Tiger(double weight) {
		super(weight, "carnivore");
	}
	
	@Override
	public void eat() {
		System.out.println("Tiger eats meat");
	}
	
	@Override
	public String toString() {
		return "Tiger{" +
			       "weight=" + getWeight() +
			       ", diet='" + getDiet() + '\'' +
			       '}';
	}
}
