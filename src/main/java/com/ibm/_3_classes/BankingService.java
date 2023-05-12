package com.ibm._3_classes;

import java.math.BigDecimal;

public class BankingService {
	
	public static void main(String[] args) {
		Account defaultAccount = new Account();
		defaultAccount.balance = new BigDecimal(100);
		defaultAccount.currency = "USD";
		System.out.println("defaultAccount.user: " + defaultAccount.user);
		System.out.println("defaultAccount.balance: " + defaultAccount.balance);
		System.out.println("defaultAccount.currency: " + defaultAccount.currency);
		System.out.println("defaultAccount.iban: " + defaultAccount.iban);
		
		BigDecimal zero = new BigDecimal(0);
		Account euroAccount = new Account("RORNCB01EUR078719271921", "Ionut Spalatelu", zero, "EUR");
		
		System.out.println("euroAccount.user: " + euroAccount.user);
		System.out.println("euroAccount.balance: " + euroAccount.balance);
		System.out.println("euroAccount.currency: " + euroAccount.currency);
		System.out.println("euroAccount.iban: " + euroAccount.iban);
		
	}
}
