package com.qakeshav.seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	WebDriver driver = null;

	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void url() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Locating element by id

		driver.findElement(By.id("email")).sendKeys("hvms.in@gmail.com");
		System.out.println("Sucessfully Done 1");
		driver.findElement(By.id("email")).clear();

		// Locating element by xpath

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hvms.in@gmail.com");
		System.out.println("Sucessfully Done 2");
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("hvms.in@gmail.com");
		System.out.println("Sucessfully Done 3");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email' and @name='email' and @tabindex='1']")).sendKeys("hvms.in@gmail.com");
		System.out.println("Sucessfully Done 4");
		driver.findElement(By.xpath("//input[@type='email' and @name='email' and @tabindex='1']")).clear();
		
		// Locating element by CSS
		driver.findElement(By.cssSelector("#email")).sendKeys("hvms.in@gmail.com");
		System.out.println("Sucessfully Done 5");
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id=email][data-testid=royal_email][name=email]")).sendKeys("hvms.in@gmail.com");
		System.out.println("Sucessfully Done 6");
		driver.close();
	}

	public static void main(String[] args) {
		Locators obj1 = new Locators();
		obj1.launchChrome();
		obj1.url();

	}
}
