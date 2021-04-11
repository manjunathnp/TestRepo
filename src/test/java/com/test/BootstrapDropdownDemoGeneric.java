package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdownDemoGeneric 
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
		selectOptionsFromBootstrapDropdown(productTypeOpts, "Cards");
		
		WebElement productEle = driver.findElement(By.xpath("//a[normalize-space()='Select Product']"));
		productEle.click();
		List<WebElement> productEleOpts =  driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		selectOptionsFromBootstrapDropdown(productEleOpts, "Debit Cards");

	}
	
	public static void selectOptionsFromBootstrapDropdown(List<WebElement> options, String value)
	{
		for(WebElement ele:options)
		{
			if(ele.getText().equals(value))
			{
				ele.click();
				break;
			}
		}
	}

}
