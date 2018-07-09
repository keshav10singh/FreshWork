package com.qakeshav.javaconcept;

public class CallByValueandCallByRef {
			
	int p;
	int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueandCallByRef obj=new CallByValueandCallByRef();
		int x=200;
		int y=900;
		System.out.println("Total is "+obj.testSum(x, y)); //call by value OR pass by value
		obj.p=100;
		obj.q=200;
		obj.swap(obj);
		System.out.println("new value of p:"+obj.p);
		System.out.println("new value of q:"+obj.q);
		

	}

	public int testSum(int a,int b) {
		a=10;b=20;
		int c=a+b;
		return c;
}
	public void swap(CallByValueandCallByRef r) {
	int temp;
	temp=r.p;
	r.p=r.q;
	r.q=temp;
	}
	
}
