package com.ibm._2_methods;

public class VarArgs {
	
	public static void main(String[] args) {
		
		System.out.println(sum(2)); //numbers e ca new int[0]
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 8, 9, 18));
		
		int[] existingArray = new int[]{1, 2, 3};
		System.out.println("sum(existingArray) = " + sum(2, existingArray));
		
	}
	//
	//	static int sum(int... numbers) { //numbers este un var-args
	//		if (numbers.length == 0) {
	//			return 0;
	//		}
	//		int sum = 0;
	//		for (int number : numbers) {
	//			sum += number;
	//		}
	//		return sum;
	//	}
	
	static int sum(int first, int... numbers) { //numbers este un var-args
		if (numbers.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
