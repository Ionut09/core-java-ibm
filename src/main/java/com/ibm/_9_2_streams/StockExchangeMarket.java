package com.ibm._9_2_streams;

import com.ibm._9_2_streams.model.Trader;
import com.ibm._9_2_streams.model.Transaction;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StockExchangeMarket {
	
	/*
	1. Find all transactions in the year 2011 and sort them by value (small to high).
    2. What are all the unique cities where the traders work?
    3. Find all traders from Cambridge and sort them by name.
    4. Return a string of all traders’ names sorted alphabetically.
    5. Are any traders based in Milan?
    6. Print all transactions’ values from the traders living in Cambridge.
    7. What’s the highest value of all the transactions?
    8. Find the transaction with the smallest value.
	 */
	
	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Cambridge");
	static Trader brian = new Trader("Brian", "Cambridge");
	
	static List<Transaction> transactions = Arrays.asList(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
	);
	
	public static void main(String[] args) {
		List<String> traderCities = getTraderCities();
		System.out.println(traderCities);
		System.out.println(getTraderNames());
		printTransactions();
	}
	
	// What are all the unique cities where the traders work?
	private static List<String> getTraderCities() {
		return transactions.stream()
		                   .map(transaction -> transaction.getTrader())
		                   .map(trader -> trader.getCity())
		                   //		                   .map(new TraderFunctionImplementation())
		                   .distinct()
		                   .collect(Collectors.toList());
	}
	
	//Return a string of all traders’ names sorted alphabetically.
	private static String getTraderNames() {
		return transactions.stream()
		                   .map(transaction -> transaction.getTrader()
		                                                  .getName())
		                   .distinct()
		                   .sorted()
		                   .collect(Collectors.joining(","));
	}
	
	//Print all transactions’ values from the traders living in Cambridge.
	private static void printTransactions() {
		transactions.stream()
		            .filter(transaction -> transaction.getTrader()
		                                              .getCity()
		                                              .equals("Cambridge"))
		            .forEach(transaction -> System.out.println(transaction.getValue()));
	}
}

class TraderFunctionImplementation implements Function<Trader, String> {
	
	public String apply(Trader trader) {
		return trader.getCity();
	}
}