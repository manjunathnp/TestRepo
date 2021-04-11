package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println("Launched Google");
		
		driver.navigate().to("https://www.amazon.in");
		System.out.println("Launched Amazon");
		
		driver.navigate().back();
		System.out.println("Navigated back to Google");
		
		driver.navigate().forward();
		System.out.println("Navigated Forward to Amazon");
		
		driver.navigate().refresh();
		System.out.println("Amazon Page Refreshed");
		
		driver.quit();
		
	}

}
