package com.qakeshav.javaconcept;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("This is Default Constructor" );
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single Param Constructor" );
		System.out.println("The value of i "+i);
	}
	
	public ConstructorConcept(int i,int j) {
		System.out.println("Two Param Constructor" );
		System.out.println("The value of i "+i);
		System.out.println("The value of j "+j);
	}
	
	

	public static void main(String[] args) {
		ConstructorConcept	obj=new ConstructorConcept();
		ConstructorConcept	obj1=new ConstructorConcept(10);
		ConstructorConcept	obj2=new ConstructorConcept(30,20);
			
	}

}
