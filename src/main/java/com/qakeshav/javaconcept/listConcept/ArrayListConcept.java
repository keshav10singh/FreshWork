package com.qakeshav.javaconcept.listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
/**
 * Static array size is fixed
 * Dynamic Array that is Array list size is dynamic
 * 
 * ------------------------------------
 * Array list can contain duplicate value
 * Array list add value in order insertion
 * Array list synchronized(slow)
 * Allow random access to fetch element becoz stores value at index
 * To print all value use:1.for loop 2.iterator
 * Non generic vs generic
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
			ArrayList ar = new ArrayList();
			ar.add(12);//0
			ar.add(13);//1
			ar.add(15);//2
			
			System.out.println(ar.size());
			ar.add(20);//3
			ar.add(25);//4
			ar.add(15);//5
			ar.add("keshav");
			ar.add(12.5);
			ar.add(true);
			System.out.println(ar.size());//size of array
			System.out.println(ar.get(4));//get value from index
			
			for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i));
				
			}
			
			
			 ArrayList<Integer> ar1 = new ArrayList<Integer>();
			 
			 ar1.add(20);
			 ar1.add(14);
			 
			 System.out.println("----------------------");
			 ar.addAll(ar1);
			 for(int j=0;j<ar.size();j++) {
					System.out.println(ar.get(j));
					
				}
			 
			 System.out.println("----------------------");
			 System.out.println("==================================");
			 ar.retainAll(ar1);
			 for(int l=0;l<ar.size();l++) {
					System.out.println(ar.get(l));
					
				}
			 System.out.println("==================================");
			 System.out.println("+++++++++++++++++++++++++++++++++");
			 ar.removeAll(ar1);
			 for(int k=0;k<ar.size();k++) {
					System.out.println(ar.get(k));
					
				}
			 System.out.println("+++++++++++++++++++++++++++++++++");
			 
			 
			 ArrayList<String> ar2 = new ArrayList<String>();
			 ar.add("AB");
			 ar.add("AC");
			 ar.add("AD");
			 ar.add("AE");
			 
			 /////Creating EmployeeList class obj
			 EmployeeList	 e1=new EmployeeList("Jack",30,"Market");
			 EmployeeList	 e2=new EmployeeList("Luis",35,"OPS");
			 EmployeeList	 e3=new EmployeeList("Jila",40,"HeadOffice");
			 
			 //Create array List
			 ArrayList<EmployeeList> ar3=new ArrayList<EmployeeList>();
			 ar3.add(e1);
			 ar3.add(e2);
			 ar3.add(e3);
			 
			 //iterator to traverse the value
			 Iterator<EmployeeList> it = ar3.iterator();
			 while(it.hasNext()) {
				 EmployeeList emp=it.next();
				 System.out.println("Details of EMP: "+emp.name+" "+ emp.age +" "+ emp.dept);
			 }
			
	}

}
