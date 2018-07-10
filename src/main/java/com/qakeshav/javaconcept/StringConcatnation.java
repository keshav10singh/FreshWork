package com.qakeshav.javaconcept;

public class StringConcatnation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + is concatanation operator
		
		int a=150;
		int b=250;
		
		String x="Hello";
		String y="World";
		
		double c=10.25;
		double d=7.25;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(c+d+x+y+(a+b));
		System.out.println(x+y+(a+b)+(c+d));
		System.out.println("HelloWorld");
		System.out.println("Value of a+b :"+(a+b));
		System.out.println("Value of x+y :"+x+y);
		System.out.println("Value of c+d :"+(c+d));
		
		
		

	}

}
