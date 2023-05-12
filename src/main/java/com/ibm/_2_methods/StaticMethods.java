package com.ibm._2_methods;

import com.ibm._1_intro.FlowStatements;

public class StaticMethods {
	
	public static void main(String[] args) {
		String month = "jun";
		//static method -> specifica clasei -> va fi invocata folosing numele clasei
		//metodele statice sunt ca functiile din alte limbaje
		int numberOfDays = FlowStatements.getNumberOfDaysUsingSwitch(month);
		
		System.out.println("Month: " + month.toUpperCase() + " has " + numberOfDays + " days");
	}
}
