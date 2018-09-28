package com.qakeshav.javaconcept;

public class LoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.While Loop
		//Disadvantage of while loop is it generate infinite loop,
		//if we dont give incremental/dcremental part
		int i=0;
		while(i<10) {
			System.out.println("value of i="+" "+i);
			i=i+1;
		}
		
		//2.For loop
		for(int j=0;j<=10;j++) {
			System.out.println("value of j="+" "+j);
		}
		
		for(int k=10;k>1;k--) {
			System.out.println("value of k="+" "+k);
		}
			

	}

}
