package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopupNotificaiton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		// Handle Browser Pop-up Notification
		driver.get("https://redbus.in");

	}

}
