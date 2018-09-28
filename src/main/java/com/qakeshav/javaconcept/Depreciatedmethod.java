package com.qakeshav.javaconcept;

/**
 * @author keshav.singh
 *
 */

public class Depreciatedmethod {

	/**
	 * @deprecated As per latest releaser,replace by {@link #getMethod()}
	 * @author keshav.singh
	 *
	 */
	
	
	public int myMethod() {
		return getMethod();
	}
	
	public int getMethod() {
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
