package com.qakeshav.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	
	
	/**
	 *  Setup system property for Chrome
Setup system property for Chrome
Launch Chrome Browser
Enter Url
Login to Application
CPM Title Test
Logout from Application
Close Chrome Browser
Delete All Cookies
	 */
	
	
/*
 * @BeforeMethod
 * @Test1
 * @AfterMethod	
 * 
 * @BeforeMethod
 * @Test2
 * @AfterMethod	
 */
	
	
	

//---------PreCondition Annotation Starting with Before	
@BeforeSuite //1
public void setUp() {
	System.out.println("Setup system property for Chrome");
}

@BeforeTest //2
public void launchBrowser() {
	System.out.println("Launch Chrome Browser");
}

@BeforeClass //3
public void enterUrl() {
	System.out.println("Enter Url");
}



@BeforeMethod //4
public void login() {
	System.out.println("Login to Application");
}

@Test //5
public void cpmTitleTest() {
	System.out.println("CPM Title Test");
}

@Test
public void navigateToWinner() {
	System.out.println("Navigate to Winners Tab");
}

@Test
public void navigateToPrizeTab() {
	System.out.println("Navigate to Prize Tab");
}



//---------PostCondition Annotation Starting with After	

@AfterMethod //6
public void logOut() {
	System.out.println("Logout from Application");
}


@AfterClass //7
public void closeBrowser() {
	System.out.println("Close Chrome Browser");
}


@AfterTest //8
public void deleteAllCookies() {
	System.out.println("Delete All Cookies");
}
	
@AfterSuite //9
public void generateTestReport() {
	System.out.println("Generate Test Report");
}
	
	
	
	
	
	
	
	
	
}
