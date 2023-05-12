package com.ibm._4_encapsulation;

import java.math.BigDecimal;

public class BankingService2 {
	
	public static void main(String[] args) {
		BigDecimal zero = new BigDecimal("-15.5");
		EncapsulatedAccount defaultAccount = new EncapsulatedAccount("RORNCB01EUR078719271921", "Ionut Spalatelu", zero, "EUR");
		//		defaultAccount.balance = new BigDecimal(100);
		//		defaultAccount.currency = "USD";
		defaultAccount.setBalance(new BigDecimal(-10));
		String iban = defaultAccount.getIban();
		System.out.println(iban);
//		System.out.println(defaultAccount.getUser());
		System.out.println(defaultAccount.getBalance());
		System.out.println(defaultAccount.getCurrency());
		
		//		int intValue = zero.intValue();
		//		System.out.println("intValue = " + intValue);
		//		double doubleValue = zero.doubleValue();
		//		System.out.println("doubleValue = " + doubleValue);
		//		if (doubleValue < 0.0) {
		//			System.out.println();
		//		}
		defaultAccount.setBalance(new BigDecimal(1000));
		defaultAccount.withdraw(new BigDecimal(100));
		System.out.println("New balance: " + defaultAccount.getBalance());
		
	}
}
