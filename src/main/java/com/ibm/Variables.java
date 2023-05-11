package com.ibm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Variables {
	
	public static void main(String[] args) {
		byte b = 5;
		short s = 5;
		int i = 5;
		
		b = (byte) i; //am nevoie de cast
		
		i = s; // nu e nevoie de cast pt ca se aloca mai multa memorie pt int
		
		long myLong = 1027162877L; //nu mai trata acest literal ca int ci ca long
		//		int maxInt = Integer.MAX_VALUE; //<==>
		int maxInt = 2147483647;
		int castedFromLong = (int) myLong;
		
		System.out.println(castedFromLong);
		
		int overflow = maxInt + 2;
		System.out.println(overflow);
		System.out.println(Integer.MIN_VALUE);
		
		//conversion from String
		
		String number = "123";
		
		int fromString = Integer.parseInt(number);
		long longFromString = Long.parseLong("1027162877");
		System.out.println(fromString);
		System.out.println(longFromString);
		
		//conversion to String
		
		String fromInt = i + "";
		System.out.println(fromInt);
		
		System.out.println("hello " + (10 - 5));// hello 5
		System.out.println("hello " + 10 * 5);  //hello 50
		System.out.println("hello " + 10 * 5 + 10); //hello 5010
		System.out.println("hello " + 10 * 5 + 10 / 2); //hello 505
		
		float f = 3.2f;//sau F --> 32 biti
		double d = 3.2;  //64 biti
		
		double irationalNumber = 1 / 3.0;
		irationalNumber = 2 / 3.0;
		System.out.println(irationalNumber);
		System.out.println(1 / 3.0 == 0.3); //false
		System.out.println(1 / 3.0 == 2 / 6.0); //true
		
		//		BigDecimal --> pentru operatii cu sume de bani
		BigDecimal decimal = new BigDecimal("1");
		BigDecimal result = decimal.divide(new BigDecimal(3), RoundingMode.HALF_DOWN);//decid cum sa aproximez
		
		double parseDouble = Double.parseDouble("0.33");
		
		System.out.println(parseDouble + 2.3);
	}
}
