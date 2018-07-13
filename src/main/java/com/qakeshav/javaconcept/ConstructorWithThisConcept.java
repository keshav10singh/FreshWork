package com.qakeshav.javaconcept;

public class ConstructorWithThisConcept {
	//Class variable
	String name;
	int age;
	
	public ConstructorWithThisConcept(String name,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorWithThisConcept obj=new	ConstructorWithThisConcept("New Class",10);

	}

}
