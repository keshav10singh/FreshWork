package com.qakeshav.javaconcept;

public class TiagoMethodOverRiding extends CarMethodOverRiding{

	public void start() { // Parent and Child class have same start() method of similar 
		//argument type.This method overriding
		System.out.println("Tiago Class start method");
	}
	
	public void autogear() {
		System.out.println("Tiago Class autogear method");
	}
	
	
}
