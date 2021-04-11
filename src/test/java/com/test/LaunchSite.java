package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchSite 
{

	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu");

		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
			
		driver.manage().window().maximize();
		System.out.println("Browser Launched Successfully");
		
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("Site Launched Successfully");
		
		driver.quit();

	}

}
