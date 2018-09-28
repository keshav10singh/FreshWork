package com.qakeshav.javaconcept;

/**
 * @author keshav.singh
 * Importance of assertion in program
 */
public class AssertionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing Assertion");
		assert false :"If assertion are on ,this will print";
		
		int a=0;
		while(true) {
			if(a>1) {
				System.out.println("Code is working correctly");
				break;
			}
			assert false : "Code excecution should not reach here something is wrong" +a;
			break;
		}
		
		int x=1;
		assert(x>0) : "Assertion is correct";

	}

}
