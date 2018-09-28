package com.qakeshav.javaconcept;

public class StaticandNonStatic {

	
	String name="KESHAV";//non static global variable
	static int age=29;//static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticandNonStatic obj1=new StaticandNonStatic();
		obj1.mail();
		obj1.mailagain();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		//How to call static Method and Variable
		//1.By direct calling of  static method
		
		mailagain();
		
		//2.By using classname.methodname
		StaticandNonStatic.mailagain();
		
		
		//3.Static Global Variable can be called directly
		System.out.println(age);
		//4.Static Global Variable can be called classname.variablename
		System.out.println(StaticandNonStatic.age);
	}
	
	public void mail() {
		System.out.println("This is Non Static Method");
	}

	public static void mailagain() {
		System.out.println("This is Static Method");
	}
	
}
