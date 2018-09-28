package com.qakeshav.seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://cpm.havasstaging.com/backend/web/user/login");
			
			driver.findElement(By.xpath("//input[@id='loginform-email']")).sendKeys("neo");
			driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//ul[@class='sidebar-menu tree']//li[9]//a[1]//span[2]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Form Sections')]")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
			
			//Actions action=new Actions(driver);
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Checkbox/Group'])[2]/following::button[1]")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Text'])[2]/following::button[1]")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[2]/following::button[1]")).click();
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[2]/following::button[1]")).click();
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select'])[2]/following::button[1]")).click();
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Textarea'])[2]/following::button[1]")).click();
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Radio Group'])[2]/following::button[1]")).click();
			driver.findElement(By.xpath("//button[@title='Next Group']")).click();
//			
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Header'])[2]/following::button[1]")).click();
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paragraph'])[1]/following::button[1]")).click();
//			driver.findElement(By.xpath("//button[@title='Previous Group']")).click();
			driver.findElement(By.xpath("//button[@title='clearAll']")).click();
			
			
			//action.clickAndHold(driver.findElement(By.xpath("//li[@id='64aa6b20-d6fc-4631-a4b0-a8d9d9cf326f']//button[@type='button']")))
			//.moveToElement(driver.findElement(By.xpath("//ul[@id='52287cb0-0e3c-4c67-b6a0-56f261378b51']")))
			//.release().build().perform();
			//action.clickAndHold(driver.findElement(By.xpath("//li[@id='5c61dcff-6fa5-4f79-9228-7f45cf7c0671']//button[@type='button']")))
			//.moveToElement(driver.findElement(By.xpath("//ul[@id='52287cb0-0e3c-4c67-b6a0-56f261378b51']")))
			//.release().build().perform();
			
			
			driver.quit();
	}

}
