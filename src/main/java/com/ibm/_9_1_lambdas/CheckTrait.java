package com.ibm._9_1_lambdas;

public class CheckTrait implements Checker {
	
	@Override
	public boolean test(Animal a) {
		return a.canHop();
	}
}
