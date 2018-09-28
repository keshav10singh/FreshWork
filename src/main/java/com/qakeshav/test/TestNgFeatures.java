package com.qakeshav.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void login() {
		System.out.println("Login Test");
	}
	
	@Test(dependsOnMethods="login")
	public void logout() {
		System.out.println("Logout Test");
	}
	
	
}
