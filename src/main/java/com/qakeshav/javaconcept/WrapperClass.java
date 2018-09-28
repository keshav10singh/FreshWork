package com.qakeshav.javaconcept;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String x="100";
			System.out.println(x+20);
			//Data conversion: String to int
			//Wrapper Classes:Interger,Double,CharacterBoolean
			int y=Integer.parseInt(x);
			System.out.println(y+20);
			
			//String to Double
			
			String i="15.55";
			double j=Double.parseDouble(i);
			System.out.println(j+15);
			
			//String to Boolean
			String st="true";
			boolean bl=Boolean.parseBoolean(st);
			System.out.println(bl);
			
			//int to String
			int num=200;
			String str=String.valueOf(num);
			System.out.println(str+20);
			
			String str1="100A";
			Integer.parseInt(str1);//Number Format exception for input string "100A"
	}

}
