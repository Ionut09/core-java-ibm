package com.ibm._7_exceptions;

import com.ibm._4_encapsulation.EncapsulatedAccount;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

public class Playground {
	
	public static void main(String[] args) {
		EncapsulatedAccount account = new EncapsulatedAccount("RORNCB01EUR078719271921", "Ionut Spalatelu", BigDecimal.ONE,
			"EUR");
		
		int i = 1;
		try {
			++i;
			setBalance(account, new BigDecimal(-10));
			i++;
			i += 10;
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
			--i;
		}
		System.out.println("i = " + i);
		System.out.println("Account balance: " + account.getBalance());
		
		Path pathToFile = Path.of("/Users/ionut/workspace/trainings/core-java-ibmii/.gitignore");
		
		try {
			Files.createFile(pathToFile);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		if(Files.exists(pathToFile)){
			printFileContentUsingAResource(pathToFile);
		}
	}
	
	private static void setBalance(EncapsulatedAccount account, BigDecimal newBalance) {
		BigDecimal zeroBigDecimal = new BigDecimal(0);
		if (newBalance.doubleValue() < 0) {
			//			account.setBalance(zeroBigDecimal);
			throw new IllegalArgumentException("Balance should not be negative");
		} else {
			account.setBalance(newBalance);
		}
	}
	
	private static void printFileContentUsingAResource(Path pathToFile) { //} throws IOException { -> declare
		//handle
		//try-with-resources garanteaza inchiderea resurselor (def: implements Closeable/Autocloseable)
		try (BufferedReader reader = Files.newBufferedReader(pathToFile)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("Exception while reading file!");
		}
	}
}
