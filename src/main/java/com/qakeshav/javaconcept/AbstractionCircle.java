package com.qakeshav.javaconcept;

public class AbstractionCircle extends AbstractClassSHAPE{
	
	AbstractionCircle(){
		System.out.println("This is AbstractionCircle constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClassSHAPE rect=new AbstractionCircle();
		rect.drawing();
		rect.fill();
		

	}

	@Override
	void drawing() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Line");
	}

}
