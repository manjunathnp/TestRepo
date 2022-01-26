package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		// Running in headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", 
							 "--disable-gpu", 
							 "--window-size=1920,1200",
							 "--ignore-certificate-errors",
							 "--disable-extensions",
							 "--no-sandbox",
							 "--disable-dev-shm-usage");
		
		WebDriver driver = new ChromeDriver(options);	
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']"));
		String actualText = element.getText();
		String expectedText = "Welcome to our store";
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualText, expectedText, "Message Pass");
		
		String expectedTitle = "nopCommerce demo store";
		String actualTitle = driver.getTitle();
		
		softAssert.assertEquals(actualTitle, expectedTitle, "Title Pass");
		
		softAssert.assertAll();		

	}

}
