package com.qakeshav.javaconcept;

public class OverloadMainMethod {
	/**
	 * Overloading of main method
	 * JVM will look only for main(String[] args)-public static void
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method-1 ");
		main("testing");
		main(10);
		main(10, 26);
	}

	public static void main(String str) {
		// TODO Auto-generated method stub
		System.out.println("Main Method-2 ");
	}

	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("Main Method-3 ");
	}

	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Main Method-4 ");
	}
}
