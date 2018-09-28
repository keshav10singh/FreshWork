package com.qakeshav.javaconcept;

public class LocalvsGlobal {
	//Global or Class variable
	String month="September";
	int number=9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=8;//local variable and scope of this variable is only inside main method
		
		System.out.println("Local variable inside main method: "+i);
		LocalvsGlobal obj1=new LocalvsGlobal();
		System.out.println("Global variable value is: "+obj1.month);
		System.out.println("Global variable value is: "+obj1.number);
		obj1.sum();
		

	}
	
	public void sum() {
		int number=11;//local variable and scope of this variable is only inside current method
		int i=10;//local variable and scope of this variable is only inside current method
		String month="September";//local variable and scope of this variable is only inside current method
		System.out.println("Local variable of sum method :"+i);
		System.out.println("Local variable of sum method :"+number);
	}

}
