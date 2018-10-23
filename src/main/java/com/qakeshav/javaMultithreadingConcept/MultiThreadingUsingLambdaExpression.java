package com.qakeshav.javaMultithreadingConcept;

public class MultiThreadingUsingLambdaExpression {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		Thread t1=new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Lambda");
				try {
					Thread.sleep(1000);
					}
				catch(Exception e) {}
			}
		});
		
		Thread t2=new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Expression");
				try {
					Thread.sleep(2000);
					}
				catch(Exception e) {}
			}
		});
		
		t1.start();
		t2.start();
		//isAlive method checks if thread is running or not and return true false based on that
		System.out.println(t1.isAlive());//Before Join thread will return true
		t1.join();//Join will allow to complete the thread t1 and t2 to complete their thred then hello will get 
		t2.join();//printed by main thread
		System.out.println(t1.isAlive());//After Join thread will return false
		System.out.println("Hello");
		
	}

}
