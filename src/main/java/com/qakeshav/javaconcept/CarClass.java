package com.qakeshav.javaconcept;

public class CarClass {
		String modelname;
		int  productionyear;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//alto,kwid,nano is name of reference name of the object
//object is created by this statement new CarClass();
//object are real word enitiy which have attribute eg.modelname and productionyear
// Every class will have attribute which object must have 		
		
		
		
		CarClass alto=new CarClass();
		CarClass kwid=new CarClass();
		CarClass nano=new CarClass();
		
		
		alto.modelname="CNG";
		alto.productionyear=2011;
		
		kwid.modelname="Petrol";
		kwid.productionyear=2013;
		
		nano.modelname="EV";
		nano.productionyear=2007;
		
		System.out.println("This Maruti Barnd Alto have "+alto.modelname+" and production year"+alto.productionyear);
		System.out.println("This Renault Barnd Kwid have "+kwid.modelname+" and production year"+kwid.productionyear);
		
		
		
	}

}
