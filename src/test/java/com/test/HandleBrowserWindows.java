package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle()
		//String windowId = driver.getWindowHandle(); // Return ID of Single Browser Window
		//System.out.println(windowId); 
		
		
		//getWindowHandles()
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); // Opens the Child Window
		
		Set<String> windowIDs=driver.getWindowHandles(); // Returns IDs of multiple browser windows
		
		// Method 1 - Iterate Windows
		/*Iterator<String> it =  windowIDs.iterator();
		
		// Parent Window ID
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent Window ID: "+ parentWindowID);
		System.out.println("Child Window ID: "+ childWindowID);*/
		
		
		// Method 2 - using List/Array List
		List<String> windowIDsList = new ArrayList(windowIDs); // Converting Set to List
		String parentWindowID = windowIDsList.get(0);
		String childWindowID = windowIDsList.get(1);
		
		System.out.println("Parent Window ID: "+ parentWindowID);
		System.out.println("Child Window ID: "+ childWindowID);
		
		
		// Switching to Child Windows
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent Window Title: "+driver.getTitle());
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window Title: "+driver.getTitle());
		
		// Close only Parent Window
		for(String windID:windowIDsList)
		{
			String title = driver.switchTo().window(windID).getTitle();
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
		//driver.close(); //Closes the Child window
		//driver.quit(); // Closes all the windows
	}

}
