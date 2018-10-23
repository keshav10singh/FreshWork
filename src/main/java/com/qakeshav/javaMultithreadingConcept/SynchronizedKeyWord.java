package com.qakeshav.javaMultithreadingConcept;

public class SynchronizedKeyWord {

	int count;
	// By Making method synchronized  t1 and t2 thread wont overlap in each other operation ,One thread at time 
	//will work on synchronized method
	public synchronized void increment() {
		count++;
	}

 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SynchronizedKeyWord obj1=new SynchronizedKeyWord();
		//Creating the thread
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					obj1.increment();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					obj1.increment();
				}
			}
		});
		
		t1.start();// Thread t1 get started
		t2.start();
		t1.join();// join will notify the main thread to wait for t1 to complete
		t2.join();
		//t1 and t2 will run and count will 2000
		System.out.println("Count :"+ obj1.count);
		
	}

}

