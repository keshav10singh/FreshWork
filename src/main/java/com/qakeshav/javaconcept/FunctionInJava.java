package com.qakeshav.javaconcept;

public class FunctionInJava {
	//Non static method
	
	//Void does not return any value
	//Return type is void
	
	
	public void methodone() { //No Input No Output
		System.out.println("Method One");
	}
	//Return type is int
	public int methodtwo() { //No Input some Output
		int a=10,b=20;
		int c=a+b;
	//	System.out.println("Method two return value:"+c);
		return c;
	}
	
	public String methodthree() { //No Input some Output

		
		String st="JavaConcept";
		//System.out.println("Method three return value:"+st);
		return st;
	}
	
	public int methodfout(int x,int y) {//some Input some Output
		int z=x*y;
		//System.out.println("Method four return value:"+z);
		return z;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInJava obj1=new FunctionInJava();
		//One object is created and obj1 is the reference variable of the object,refering to new FunctionInJava()
		//After creating the object ,copy of all non static method will be given to this object
		
		obj1.methodone();
		int d=obj1.methodtwo();
	System.out.println(d);
		String str=obj1.methodthree();
		System.out.println(str);
		int e=obj1.methodfout(10, 8);
		System.out.println(e);
		
	}
}
