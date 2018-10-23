package com.qakeshav.javaMultithreadingConcept;

// Running the thread using Runnable Interface
class ThreadOne implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)
        {
			//Task of this thread is to print multiplication of successive numbers up to 10 numbers
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
	}
	
}

public class ProgramTwoUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadOne t1=new ThreadOne();//Instantiating your thread class that implements Runnable interface
		Thread t=new Thread(t1);//Creating an object to Thread class by passing your thread reference as an argument
		t.start(); //Starting the thread
		
	}

}
