package com.ibm._8_strings;

public class Immutablity {
	
	public static void main(String[] args) {
		String str = "I am immutable"; //o data creat nu poate fi schimbat
		
		str.toUpperCase();   //str nu se schimba
		str = str.toUpperCase();
		str.substring(2, 5);        //str nu se schimba
		str.concat(" forever");//str nu se schimba
		System.out.println(str);
		
	}
}
