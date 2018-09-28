package com.qakeshav.parameterTestUsingTestng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	@Test
	@Parameters({"browser","url","emailId"})
	public void ScheduleAgelogintest(String browser,String url,String emailId ) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\chromedriver.exe");
		driver = new ChromeDriver();
		} else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='emailid']")).clear();
		//Enter User Name
		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys(emailId);
		
		driver.findElement(By.id("loginbtn")).click();
		driver.quit();
	}
	
	
	
	
}
