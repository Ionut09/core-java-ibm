package com.ibm._3_classes;

import java.math.BigDecimal;

public class Account {
	//caracteristicile obiectelor create din clasa Account
	String iban;
	String user;
	BigDecimal balance;
	String currency;
	
	public Account() {
		//Call to 'this()' must be first statement in constructor body
		this("RO000000000000", "", new BigDecimal(0), "RON");
		System.out.println("In no args constructor");
	}
	
	//overloading
	public Account(String iban, String user, BigDecimal balance, String currency) {
		System.out.println("In all args constructor");
//		System.out.println("user: " + user);
//		System.out.println("balance: " + balance);
//		System.out.println("currency: " + currency);
//		System.out.println("iban: " + iban);
//
		this.iban = iban;
		this.user = user;
		this.balance = balance;
		this.currency = currency;
	}
}
