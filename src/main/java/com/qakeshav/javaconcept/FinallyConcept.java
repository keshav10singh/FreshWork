package com.qakeshav.javaconcept;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
		
	}
	
	public static void  test() {
		try {
			System.out.println("Inside Test Method");
			throw new RuntimeException("Test");
		}catch(Exception e) {
			System.out.println("Inside Catch Block");
		}
		finally {
			System.out.println("Inside finally Block");
		}
	}

}
