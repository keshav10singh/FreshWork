package com.qakeshav.javaconcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj1=new MethodOverloading();
		obj1.sum();
		obj1.sum(4);
		obj1.sum(10, 6);
		main(3);
		main(5,6);
	}
	
	public static void main(int r) {
		System.out.println("This is Overloaded Main method");
	}
	public static void main(int r,int s) {
		System.out.println("This is Second Overloaded Main method");
	}
	
	public void sum() {
		System.out.println("Method without Parameter");
	}
	
	
	public void sum(int x) {
		System.out.println("Method with One Parameter");
		System.out.println(x);
	}
	
	
	public void sum(int y,int z) {
		System.out.println("Method with Two Parameter");
		System.out.println(z+y);
	}
	
	
	
}
