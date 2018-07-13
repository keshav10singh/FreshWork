package com.qakeshav.seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePitchForSelenium {
	
	WebDriver driver=null;

	public void launchBorwser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation-Project\\selenium-java-3.4.0\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void launchWebsite() {
		driver.get("http://www.espncricinfo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		////a[text()='Live Scores']
		//div[contains(@class,'cb-col-67 cb-col cb-left cb-schdl')]//div[5]//div[1]//nav[1]//a[1]
		//div[contains(@class,'cb-col-67 cb-col cb-left cb-schdl')]//div[6]//div[1]//nav[1]//a[1]
		//div[contains(@class,'cb-col-67 cb-col cb-left cb-schdl')]//div[12]//div[1]//nav[1]//a[1]
	}
	
	public void closeWebsite() {
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PracticePitchForSelenium obj = new PracticePitchForSelenium();
     obj.launchBorwser();
     obj.launchWebsite();
     obj.closeWebsite();
	}

}
