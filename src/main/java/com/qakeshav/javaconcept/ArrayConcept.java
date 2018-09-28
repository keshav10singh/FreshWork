package com.qakeshav.javaconcept;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]=new int[3];
		i[0]=23;
		i[1]=32;
		i[2]=10;
		System.out.println("Size of integet array :"+i.length);
		for(int j=0;j<i.length;j++) {
			System.out.println("Number in Array are:"+i[j]);
		}
		double db[]=new double[3];
		db[0]=2.3;
		db[1]=5.3;
		db[2]=8.3;
		System.out.println("Size of double array :"+db.length);
		for(int j=0;j<db.length;j++) {
			System.out.println("Number in double array are:"+db[j]);
		}

		char ch[]=new char[3];
		ch[0]='a';
		ch[1]='2';
		ch[2]='$';
		System.out.println("Size of character array :"+ch.length);
		for(int j=0;j<ch.length;j++) {
			System.out.println("Number in character array are:"+ch[j]);
		}
		
		boolean bo[]=new boolean[2];
		bo[0]=true;
		bo[1]=false;
	
		System.out.println("Size of boolean array :"+bo.length);
		for(int j=0;j<bo.length;j++) {
			System.out.println("Number in character array are:"+bo[j]);
		}
		
		String st[]=new String[3];
		st[0]="Test";
		st[1]="Java";
		st[2]="Selenium";
		System.out.println("Size of String array :"+st.length);
		for(int j=0;j<st.length;j++) {
			System.out.println("Number in character array are:"+st[j]);
		}
		
		Object obj[]=new Object[5];
		obj[0]=23;
		obj[1]=23.4;
		obj[2]=false;
		obj[3]="test";
		obj[4]='r';
		System.out.println("Size of Object array :"+obj.length);
		for(int j=0;j<obj.length;j++) {
			System.out.println("Number in character array are:"+obj[j]);
		}
		
		
		
	}

}
