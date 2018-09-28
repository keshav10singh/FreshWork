package com.qakeshav.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	
	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver = null;
		Properties pro=new Properties();
		FileInputStream fp=new FileInputStream("D:\\Automation-Project\\GitFreshWork\\src\\main\\java\\com\\qakeshav\\utility\\config.properties");
		pro.load(fp);
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("browsername"));
		
		
		String URL=pro.getProperty("url");
		System.out.println(URL);
		
		String browser=pro.getProperty("browsername");
		System.out.println(browser);
		
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else if(browser.equals("Chrome")) 
				{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get(URL);
		driver.findElement(By.id("loginform-email"));
		System.out.println("Email Entered");
		driver.findElement(By.id("loginform-password"));
		System.out.println("Login Entered");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("Applicatio Closed");
	}
	
}
