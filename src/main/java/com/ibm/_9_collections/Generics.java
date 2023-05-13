package com.ibm._9_collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");  //adsaugare
//		list.add(1);
		String s = list.get(0); //retrieve
		
		List list1 = new ArrayList<>();
		list1.add("one");//0
		list1.add(1);
		list1.add(new int[1]);
		
		Object obj = list1.get(1);
		int sum = (Integer) obj + 2;
		
		obj = list1.get(0); //ClassCastException
		if(obj instanceof Integer) {
			sum = (Integer) obj + 2;
		}
		
	}
}
