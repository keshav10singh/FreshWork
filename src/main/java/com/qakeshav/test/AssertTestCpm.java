package com.qakeshav.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertTestCpm {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://cpm.havasstaging.com/backend/web/user/login");
	}
	
	@Test(priority=1)
	public void cpmSiteTest() {
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Logi", Title,"Title is not matched");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

