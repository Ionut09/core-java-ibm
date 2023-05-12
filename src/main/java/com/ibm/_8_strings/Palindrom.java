package com.ibm._8_strings;

public class Palindrom {
	
	public static void main(String[] args) {
		String input = "no aplindrom"; //-> false
		//0 la length() - 1
		String input2 = "dsdssdsd"; //-> true
		
		System.out.println("isPalindrom(\"no aplindrom\") = " + isPalindrom(input));
		System.out.println("isPalindrom(\"dsdssdsd\") = " + isPalindrom(input2));
		System.out.println("isPalindrom(\"\") = " + isPalindrom("   "));
	}
	
	private static boolean isPalindrom(String input) {
		if (input.isBlank()) {
			return false;
		}
		int length = input.length();
		for (int i = 0; i <= length - 1; i++) {
			if (input.charAt(i) != input.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
}
