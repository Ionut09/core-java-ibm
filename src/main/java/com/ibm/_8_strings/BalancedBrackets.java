package com.ibm._8_strings;

public class BalancedBrackets {
	
	public static void main(String[] args) {
		
		String[] strings = {
			"()",
			"[()]", //->"[]" ->"" -> is balanced
			"{[()]}",
			"([{{[(())]}}])",
			"abc[](){}", //-> is balanced
			"{{[]()}}}}",
			"{[(])}" //-> "{[(])}" -> is not balanced
		};
		
		for (String string : strings) {
			System.out.println("String: " + string + (isBalanced(string) ? " is" : " is not") + " balanced");
		}
	}
	
	private static boolean isBalanced(String str) {
		while (str.contains("()")
			       || str.contains("[]")
			       || str.contains("{}")) {
			str = str.replace("()", "");
			str = str.replace("[]", "");
			str = str.replace("{}", "");
		}
		
		boolean stringContainsOnlyLetters = str.matches("[a-zA-Z]+");
		return stringContainsOnlyLetters || str.isEmpty();
	}
}
