package com.ibm._2_methods;

public class Overloading {
	
	public static void main(String[] args) {
		Integer x = 5; //conversia implicita dintre primitiva si wrapper class
		//se numeste boxing, invers se numeste unboxing
		
		int unboxed = x;//unboxing
		
		Integer integer = new Integer(5); //asa era inainte de Java 5
		
		printSquare(4); //4 e int
		printSquare(2.5);
	}
	
	private static void printSquare(int x) {
		System.out.println(Math.pow(x, 2));
	}
	
	private static void printSquare(double xDouble) {
		System.out.println(Math.pow(xDouble, 2));
	}
	
	private static void printSquare(Integer x) {
		System.out.println(Math.pow(x, 2));
	}
	
}
