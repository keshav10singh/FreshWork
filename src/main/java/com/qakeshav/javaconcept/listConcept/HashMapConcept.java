package com.qakeshav.javaconcept.listConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap is a class which implements Map interface
		//Extends Abstract Map
		//Hash Map Contains only unique element
		//Stores value in Key,Value pair
		//It may have one null Key and multiple null values
		//It Maintain No order
		//Hash Map is NonSyncronized-----not thread safe
		//It gives Concurrent modification exception -- in case of Fail - Fast condition
		HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		hm.put(1, "Selenium");
		hm.put(2,"VSTS");
		hm.put(3, "QTP");
		hm.put(4, "Sahi");
		hm.put(5, "Katalon");
		
		System.out.println(hm.get(3));
		System.out.println(hm.get(6));
		
		//Pritn all values
		for(Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println(hm);	
		hm.remove(4);
		System.out.println(hm);
		
		//Using Employe class
		HashMap<Integer, EmployeeList> hm1=new HashMap<Integer, EmployeeList> ();
		
		EmployeeList e1=new EmployeeList("QTP",10,"HP");
		EmployeeList e2=new EmployeeList("Selenium",9,"TW");
		EmployeeList e3=new EmployeeList("RFT",15,"IBM");
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		//Traverse the hashMap
		for(Entry<Integer, EmployeeList> m1: hm1.entrySet()) {
			int key=m1.getKey();
			EmployeeList e4=m1.getValue();
			System.out.println("Employee Info: "+ key +" "+e4.name+" "+e4.age+" "+e4.dept);
		}
		
	}

}
