package com.qakeshav.javaconcept;

public class ConceptStringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		double c=12.34;
		double d=15.55;
				
		String x="Keshav";
		String y="Singh";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);//Operator starts from left to right
		System.out.println(x+y+a+b);//Operator starts from left to right
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+a+y+b);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
	}

}
