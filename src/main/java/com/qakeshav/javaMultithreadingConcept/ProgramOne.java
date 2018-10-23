package com.qakeshav.javaMultithreadingConcept;

//Difining first thread --Task of this thread to print number from 0-9
class Thread1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("First Thread "+i);
		}
	}
	
	
}
//Difining second thread --Task of this thread to print number from 10-19
class Thread2 extends Thread{
	
	public void run() {
		for(int j=10;j<20;j++) {
			System.out.println("Second Thread "+j);
		}
	}
	
	
}



public class ProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1=new Thread1();
		t1.start();
		
		System.out.println("-----------------");
		
		Thread2 t2=new Thread2();
		t2.start();
		
	}

}
