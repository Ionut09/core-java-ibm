package com.ibm._1_intro;

public class Operators {
	
	public static void main(String[] args) {
		int i = 1;
		i++;
		System.out.println(i); //2
		//i este 2
		System.out.println(i++); //2 -> POST incrementare
		//i este 3
		System.out.println(i);
		//		========================
		//i este 3
		System.out.println(++i); //4 -> PRE incrementare
		//i este 4
		System.out.println(i); //4
		
		//&&, ||, !
		//		String s; //s nu pointeaza catre nimic
		String s = null; //s pointeaza catre un obiect inexistent
		if (s != null && s.length() > 2) { //false && anythingElse = false
			System.out.println(s);
		}
		
		if (s != null && (s.length() > i--)) { //false && anythingElse = false
			System.out.println(s);
		}
		//		cat e i? -> i=4
		System.out.println("i after && = " + i);
		
		//ternar operator
		
		boolean even;
		even = i % 2 == 0;
		
		even = i % 2 == 0;
		//		return (i % 2 == 0) ? true : false;
		
		i = 0;
		while (i < 3) {
			System.out.println("Rule #" + i++);
			//			i = i + 1; // i++;/ i+=1;
		}
		for (; i < 3; i = i + 1) {
			System.out.println("Inside a bad loop");
		}
		for (; true; ) { //edge case -> infinite loop
			System.out.println("Inside a bad loop");
		}
	}
}
