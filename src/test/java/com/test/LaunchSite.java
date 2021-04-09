package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchSite 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		System.out.println("Chrome Browser Launched Successfully");
		
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("Site Launched Successfully");

	}

}
