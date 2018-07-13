package com.qakeshav.javaconcept;

public class ConstructorWithSuperConcept extends Hellojava {

	public ConstructorWithSuperConcept() {

		super();
		System.out.println("Child class Constructor");
	}
	
	public ConstructorWithSuperConcept(int i) {

		super(i);
		System.out.println("Child class Single Param Constructor");
	}
	
	public ConstructorWithSuperConcept(int i,int j) {

		super(i,j);
		System.out.println("Child class DoubleSingle Param Constructor");
	}

	public static void main(String[] args) {
		ConstructorWithSuperConcept obj = new ConstructorWithSuperConcept();
		ConstructorWithSuperConcept obj1 = new ConstructorWithSuperConcept(10);
		ConstructorWithSuperConcept obj2 = new ConstructorWithSuperConcept(20,30);
	}

}
