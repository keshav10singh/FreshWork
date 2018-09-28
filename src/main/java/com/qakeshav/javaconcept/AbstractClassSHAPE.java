package com.qakeshav.javaconcept;

public abstract class AbstractClassSHAPE {
	
	int color;
	abstract void drawing();
	
	AbstractClassSHAPE(){
		System.out.println("This is abstract class (AbstractClassSHAPE) constructor");
	}
	
	public void fill() {
		System.out.println("Fill the area");
	}

}
