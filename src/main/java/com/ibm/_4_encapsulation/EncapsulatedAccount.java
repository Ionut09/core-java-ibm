package com.ibm._4_encapsulation;

import java.math.BigDecimal;

public class EncapsulatedAccount {
	
	private String iban;
	private String user;
	private BigDecimal balance;
	private String currency;
	
	public EncapsulatedAccount(String iban, String user, BigDecimal balance, String currency) {
		this.iban = iban;
		this.user = user;
		setBalance(balance);
		this.currency = currency;
	}
	
	public String getIban() {
		return iban;
	}
	
	public String getUser() {
		return user;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void setBalance(BigDecimal newBalance) {
		BigDecimal zeroBigDecimal = new BigDecimal(0);
//		if(newBalance < zeroBigDecimal)  <,>,== merg doar pe numere
//		if (newBalance.compareTo(zeroBigDecimal) < 0) { //pentru a compara obiecte folosim compareTo
		if (newBalance.doubleValue() < 0) {
			this.balance = zeroBigDecimal;
		} else {
			this.balance = newBalance;
		}
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getCurrency() {
		return currency;
	}
}
