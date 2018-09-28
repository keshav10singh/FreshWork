package com.qakeshav.javaconcept;

public class BankAccountImplementInterfaceConcept implements RBIinterface,SBIinterface{

	public static void main(String[] args) {
		
		BankAccountImplementInterfaceConcept B1=new BankAccountImplementInterfaceConcept();
		// TODO Auto-generated method stub
			
			B1.educationloan();
			B1.homeloan();
			B1.vehicalloan();
			
			B1.savinginterestRate();
			B1.creditinterestRate();
			B1.kycdoc();
			System.out.println(SBIinterface.minBalance);
			
			SBIinterface sbi=new  BankAccountImplementInterfaceConcept();
			sbi.educationloan();
			sbi.homeloan();
			sbi.vehicalloan();
			int MinBalabnce=sbi.minBalance;
			
			
			RBIinterface rbi=new BankAccountImplementInterfaceConcept();
			rbi.creditinterestRate();
			rbi.savinginterestRate();
			rbi.kycdoc();
			
	
	}

	public void homeloan() {
		System.out.println("HomeLoan Rate Starting from 10.5%");
		// TODO Auto-generated method stub
		
	}

	public void vehicalloan() {
		System.out.println("VehicalLoan Rate Starting from 11.5%");
		// TODO Auto-generated method stub
		
	}

	public void educationloan() {
		System.out.println("EducationLoan Rate Starting from 12.5%");
		// TODO Auto-generated method stub
		
	}

	public void creditinterestRate() {
		System.out.println("SBIHomeLoan Rate Starting from 10.5%");
		System.out.println("SBIVehicalLoan Rate Starting from 12%");
		System.out.println("SBIEducationLoan Rate Starting from 13%");
		// TODO Auto-generated method stub
		
	}

	public void savinginterestRate() {
		System.out.println("Saving Rate Starting from 4%");
		// TODO Auto-generated method stub
		
	}

	public void kycdoc() {
		
		System.out.println("Aadhaar Card");
		System.out.println("PAN Card");
		// TODO Auto-generated method stub
		
	}

}
