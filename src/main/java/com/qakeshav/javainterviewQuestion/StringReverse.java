package com.qakeshav.javainterviewQuestion;

public class StringReverse {
	
	
	public void usingStringBuffer() {
		StringBuffer st=new StringBuffer("Keshav ");
		// TODO Auto-generated constructor stub
		System.out.println(st.append("Sukanya Singh"));
	System.out.println(st.reverse());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse str=new StringReverse();
		str.usingStringBuffer();
		
	}

}
