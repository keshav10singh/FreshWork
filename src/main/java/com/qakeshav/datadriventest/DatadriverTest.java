package com.qakeshav.datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qakeshav.utility.Xls_Reader1;

public class DatadriverTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		
Xls_Reader1 reader=new Xls_Reader1("D:\\Automation-Project\\GitFreshWork\\src\\main\\java\\com\\qakeshav\\testdata\\freecrmtest.xlsx");
		
		String firstname=reader.getCellData("RegsTestData", "firstname", 2);
		System.out.println(firstname);
		
		String lastname=reader.getCellData("RegsTestData", "lastname", 2);
		System.out.println(lastname);
		
		String email=reader.getCellData("RegsTestData", "email", 2);
		System.out.println(email);
		
		String username=reader.getCellData("RegsTestData", "username", 2);
		System.out.println(username);
		
		String password=reader.getCellData("RegsTestData", "password", 2);
		System.out.println(password);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register/");
		
		
		
		
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
		Thread.sleep(2000);
		driver.close();
		System.out.println("All Run successfully");
	}

}
