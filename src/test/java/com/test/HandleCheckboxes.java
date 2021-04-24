package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		// 1. Select single checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		// 2. Select all the checkboxes
		
		int checkboxes_size = checkboxes.size();
		/*System.out.println(checkboxes_size);
		
		for(WebElement checkbox:checkboxes) 
		{
			checkbox.click();
		}*/
		
		// 3. Select specific checkboxes
		/*for(WebElement checkbox:checkboxes) 
		{
			String chkboxname = checkbox.getAttribute("id");
			if(chkboxname.equals("sunday")|| chkboxname.equals("tuesday"))
			{
				checkbox.click();
			}
			
		}*/
		
		// 4. Click on last 2 checkboxes
		/*for(int i=checkboxes_size-2; i<checkboxes_size; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 5. Click on first 2 checkboxes
		/*for(int i=0; i<2; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 6. Click on all the checkboxes except last 2
		/*for(int i=0; i<checkboxes_size-2; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 7. Click on all the checkboxes except first 4
		for(int i=4; i<checkboxes_size; i++)
		{
			checkboxes.get(i).click();
		}
			
	
			
		
		
		
		
		
	}

}
