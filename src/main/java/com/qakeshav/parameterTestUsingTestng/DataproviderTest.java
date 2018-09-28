package com.qakeshav.parameterTestUsingTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {

	WebDriver driver;
	
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.gecko.driver","D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");//Enter Url
	}
	
	@DataProvider
	public void getTestData() {
		
	}
	

	@Test
	public void freeCRM(String firstname,String lastname,String email,String username,String password) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(password);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	


}
	
	
	

