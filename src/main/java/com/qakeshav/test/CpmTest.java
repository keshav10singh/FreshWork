package com.qakeshav.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class CpmTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		/*Chrome Launcher
		 * System.setProperty("webdriver.chrome.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\chromedriver.exe");
		driver = new ChromeDriver();
		*/
		
		/*
		 * FireFox Launcher 
		 */
		System.setProperty("webdriver.gecko.driver","D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		//baseUrl = "https://letskodeit.teachable.com/pages/practice";    //Code for Lets Kodeit website
		//baseUrl = "https://prelive.scheduleage.com/#login";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://cpm.havasstaging.com/backend/web/user/login");
	}
	
	
	@Test(priority=1,groups="title")
	public void cpmSiteTest() {
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Login", Title);
	}
	
	@Test(priority=2,groups="Logo")
	public void cpmLogoTest() {
		boolean b1=driver.findElement(By.xpath("//img[@title='Canon PhotoMarathon']")).isDisplayed();
		System.out.println(b1);
	}
	
	@Test(priority=3,groups="Logo")
	public void cpmLoginLogoTest() {
		boolean b2=driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed();
		System.out.println(b2);
	}
	
	@Test(priority=4,groups="title")
	public void cpmEmailTitleTest() {
		boolean b3=driver.findElement(By.xpath("//label[contains(text(),'Email / Username')]")).isDisplayed();
		System.out.println(b3);
	}
	
	@Test(priority=5,groups="title")
	public void cpmPasswordTitleTest() {
		boolean b4=driver.findElement(By.xpath("//label[contains(text(),'Password')]")).isDisplayed();
		System.out.println(b4);
	}
	
	@Test(priority=6,groups="link")
	public void forgotPasswordlinkTest() {
		boolean b5=driver.findElement(By.linkText("Forgot password?")).isDisplayed();
		System.out.println(b5);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
