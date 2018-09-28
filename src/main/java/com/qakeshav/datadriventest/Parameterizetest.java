package com.qakeshav.datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qakeshav.utility.Xls_Reader1;

public class Parameterizetest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register/");
		// TODO Auto-generated method stub
		Xls_Reader1 reader = new Xls_Reader1(
				"D:\\Automation-Project\\GitFreshWork\\src\\main\\java\\com\\qakeshav\\testdata\\freecrmtest.xlsx");
		int rowCount = reader.getRowCount("RegsTestData");
			reader.addColumn("RegsTestData", "Status");
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String firstName = reader.getCellData("RegsTestData", "firstname", rowNum);
			System.out.println(firstName);

			String lastName = reader.getCellData("RegsTestData", "lastname", rowNum);
			System.out.println(lastName);

			String Email = reader.getCellData("RegsTestData", "email", rowNum);
			System.out.println(Email);

			String userName = reader.getCellData("RegsTestData", "username", rowNum);
			System.out.println(userName);

			String Password = reader.getCellData("RegsTestData", "password", rowNum);
			System.out.println(Password);

			driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();

			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);

			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);

			driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);

			driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(Email);

			driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);

			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);

			driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(Password);
			
			reader.setCellData("RegsTestData", "Status", rowNum, "Pass");//Write Data into cell
			
		}
		Thread.sleep(2000);
		driver.close();
		System.out.println("All Run successfully");
	}

}
