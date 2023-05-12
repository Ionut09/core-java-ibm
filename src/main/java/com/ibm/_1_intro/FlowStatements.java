package com.ibm._1_intro;

import java.util.Scanner;

public class FlowStatements {
	
	public static void main(String[] args) {
		if(args.length > 0){
			String arg = args[0];
			System.out.println("arg = " + arg);
			System.out.println("arg 2 = " + args[1]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month: ");
		String month = scanner.next();
		
		int numberOfDays = getNumberOfDaysUsingSwitch(month);
		
		System.out.println("Month: " + month.toUpperCase() + " has " + numberOfDays + " days");
		
		int[] numbers = new int[]{
			11, 26, 19, 7, 22, 35, 99, 159
		};
		
		printPrimeNumbers(numbers);
		System.out.println();
		printPrimeNumbersUsingForEach(numbers);
		
		System.out.println("\n\nEnter the input number: ");
		int input = scanner.nextInt();
		boolean palindrom = isPalindrom(input);
		System.out.println("Number: " + input + (palindrom ? " is " : " is not ") + " palindrom");
	}
	
	private static void printPrimeNumbers(int[] numbers) {
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (isPrime(numbers[i])) {
				System.out.print(numbers[i] + ", ");
			}
		}
	}
	
	private static void printPrimeNumbersUsingForEach(int[] numbers) {
		for (int number : numbers) {
			if (isPrime(number)) {
				System.out.print(number + ", ");
			}
		}
		return;
	}
	
	/*
		12345
		5
		1234
		54
		123
		543
		12
		5432
		1
		54321
		0
	 */
	private static boolean isPalindrom(int input) {
		int original = input;
		int reverse = 0;
		while (input != 0) {
			reverse = reverse * 10 + input % 10;
//			System.out.println("reverse = " + reverse);
			input = input / 10;
//			System.out.println("input = " + input);
		}
		
		if (original == reverse) {
			return true;
		}
		return false;
	}
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getNumberOfDaysUsingSwitch(String month) {
		month = month.toUpperCase();
		switch (month) {
			case "JAN":
			case "MAR":
			case "MAY":
			case "JUL":
			case "AUG":
			case "OCT":
			case "DEC":
				return 31;
			case "FEB":
				return 28;
			case "APR":
			case "JUN":
			case "SEP":
			case "NOV":
				return 30;
			default:
				return 0;
		}
	}
	
	//This is after Java 15
	private static int getNumberOfDaysUsingEnhancedSwitch(String month) {
		return switch (month.toUpperCase()) {
			case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> 31;
			case "FEB" -> 28;
			case "APR", "JUN", "SEP", "NOV" -> 30;
			default -> 0;
		};
	}
	
	private static int getNumberOfDaysUsingIf(String month) {
		if (month.equalsIgnoreCase("JAN")) { //nu folosim == pentru String !!!
			return 31;
		} else if (month.equalsIgnoreCase("FEB")) {
			return 28;
		} else if (month.equalsIgnoreCase("MAR")) {
			return 31;
		} else if (month.equalsIgnoreCase("APR")) {
			return 30;
		} else if (month.equalsIgnoreCase("MAY")) {
			return 31;
		} else if (month.equalsIgnoreCase("JUN")) {
			return 30;
		} else if (month.equalsIgnoreCase("JUL")) {
			return 31;
		} else if (month.equalsIgnoreCase("AUG")) {
			return 31;
		} else if (month.equalsIgnoreCase("SEP")) {
			return 30;
		} else if (month.equalsIgnoreCase("OCT")) {
			return 31;
		} else if (month.equalsIgnoreCase("NOV")) {
			return 30;
		} else if (month.equalsIgnoreCase("DEC")) {
			return 31;
		} else {
			System.out.println("Wrong month!!");
			return 0;
		}
	}
}
