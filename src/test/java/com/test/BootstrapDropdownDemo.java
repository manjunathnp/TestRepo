package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdownDemo
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch HDFC Bank Website
		driver.get("https://www.hdfcbank.com/");
		
		// Locate Bootstrap Dropdown
		WebElement productTypesEle = driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']"));
		productTypesEle.click();
		
		List<WebElement> productTypeOpts = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		
		System.out.println("Total Product Types: "+productTypeOpts.size());
		for(WebElement pto:productTypeOpts) 
		{
			if(pto.getText().equals("Accounts"))
			{
				pto.click();
				break;
			}
		}
		
		WebElement productEle = driver.findElement(By.xpath("//a[normalize-space()='Select Product']"));
		productEle.click();
		List<WebElement> productEleOpts =  driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println("Total Products: "+productEleOpts.size());
		
		for(WebElement peo:productEleOpts)
		{
			if(peo.getText().equals("Savings Accounts"))
			{
				peo.click();
				break;
			}

			
		}
		
		//driver.quit();
		
		
	}

}
