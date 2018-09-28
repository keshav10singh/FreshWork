package com.qakeshav.seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\\\Automation-Project\\\\selenium-java-3.4.0\\\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		//driver.findElement(By.id("pushDenied")).click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All Offers')]"))).build().perform();
		driver.findElement(By.linkText("Anti Mosquito Store")).click();
		System.out.println("Action Done");
		boolean b1=driver.findElement(By.xpath("//div[@class='cardOfferHeading lfloat'][contains(text(),'Mosquito Nets')]")).isDisplayed();
		System.out.println(b1);
		driver.quit();
		

	}

}
