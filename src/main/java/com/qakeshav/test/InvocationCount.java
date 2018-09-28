package com.qakeshav.test;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=5)
	public void incovationcount() {
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}

}
