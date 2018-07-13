package com.qakeshav.javaconcept.listConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
		// It is similar to hash map but it is synchronized
		//Stores the value on the basis on key value
		//Key----->Object-----HashCode------->value
		//HashTable does not store duplicate value
	//Hashtable does not store null value for key and values as well,it throuws error
		
		Hashtable h1=new Hashtable();
		h1.put(1,"Selenium");
		h1.put(2,"QTP");
		h1.put(3,"Kotlin");
		h1.put(4, "Sahi");
		h1.put(5,"Ranorex");
		
		//Creating a clone/Shallow copy
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		h1.clear();
		
		//Printing Hashtable values
		System.out.println("Values of h1"+h1);
		System.out.println("Values of h2"+h2);
		
		//Contains Value
		Hashtable h3=new Hashtable();
		h3.put("A", "DLI");
		h3.put("B", "LKO");
		h3.put("C", "BLR");
		
		if(h3.contains("LKO")) {
			System.out.println("Value is Found");
		}
		
		//Itersate through all value of Hashtable using----Enumeration--elements()
		
		Enumeration e=h3.elements();
		System.out.println("---Value are---");
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		//Get all the values from Hashtable using ---entrySet()-----set of hashtable values:
		System.out.println("print values from h3 using entry set");
		Set s=h3.entrySet();
		System.out.println(s);
		
		
		System.out.println("Compare Hashtable");
		//Check Both hashtable are equal are not
		Hashtable h4=new Hashtable();
		h4.put("A", "DLI");
		h4.put("B", "LKO");
		h4.put("C", "BLR");
		h4.put("C", "BLR");//This will be ingored
		//h4.put(null, "MUB");No Null value is allowed
		//h4.put("D", null); No Null value is allowed
		
		if(h3.equals(h4)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		//Get the value from the key
		System.out.println(h4.get("B"));
		
		//Get the hascode of hashtable object:
		System.out.println("The Hashcode value of h4:"+h4.hashCode());
	}

}
