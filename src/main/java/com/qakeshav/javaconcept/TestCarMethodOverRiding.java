package com.qakeshav.javaconcept;

public class TestCarMethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Static polymorphism---compile time polymorphism
		TiagoMethodOverRiding t1=new TiagoMethodOverRiding();
		t1.start();
		t1.autogear();
		t1.stop();
		
		System.out.println("--------------");
		
		CarMethodOverRiding c1=new CarMethodOverRiding();
		c1.start();
		c1.stop();
		//Child class object can be refered by parent class reference variable ---this is called
		//runtime or dynamic polymorphism
		System.out.println("--------------");
		CarMethodOverRiding c2=	new TiagoMethodOverRiding();
		c2.start();
		c2.stop();
		
		
		
		
		
	}

}
