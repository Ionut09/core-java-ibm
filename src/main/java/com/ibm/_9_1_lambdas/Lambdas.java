package com.ibm._9_1_lambdas;

public class Lambdas {
	
	public static void main(String[] args) {
//		Checker checker = new CheckTrait(); //pre Java 8
		
		Checker checker = (Animal a) -> { return a.canHop(); };
		checker = (Animal a) -> a.canHop();
		checker = a -> a.canHop(); //type inference dedudce tipul parametrului
		checker = Animal::canHop; //type inference dedudce tipul parametrului
		
		checker.test(new Animal()); //{ return a.canHop(); }
	}
}
