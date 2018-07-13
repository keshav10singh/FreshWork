package com.qakeshav.javaconcept.listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		// add
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("Katalon");
		ll.add("Ranorex");
		//print
		System.out.println("Linked list1 :"+ll);
		//addfirst
		ll.addFirst("keshav");
		//addlast
		ll.addLast("Singh");
		System.out.println("Linked list2 :"+ll);
		//get element
		System.out.println(ll.get(0));
		//Set element
		ll.set(0, "Sahi");
		System.out.println("Linked list3 :"+ll);
		//remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linked list4 :"+ll);
		ll.remove(2);
		System.out.println("Linked list5 :"+ll);
		
		//How to print all value of linked list through iteratio
		//For Loop
		System.out.println("*************Using For Loop*********");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//Advance for Loop
		System.out.println("************* For Each Loop*********");
		for(String str:ll) {
			System.out.println(str);
		}
		
		//Iteration
		System.out.println("************* Using Iterator*********");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//While Loop
		System.out.println("************* Using While Loop*********");
		int num=0;
				while(ll.size()>num) {
					System.out.println(ll.get(num));
					num++;
				}
		
		
	}
	
}
