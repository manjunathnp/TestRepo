package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsStatuses 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed()  isEnabled()
		WebElement searchStores = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status of 'Search Stores': "+searchStores.isDisplayed());
		System.out.println("Enabled Status of 'Search Stores': "+searchStores.isDisplayed());
		
		// isSelected()
		WebElement maleRdBtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("'Male' Radio Button Status: "+ maleRdBtn.isSelected());//false
		
		WebElement femaleRdBtn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("'Female' Radio Button Status: "+femaleRdBtn.isSelected()); //false
		
		maleRdBtn.click();
		System.out.println("'Male' Radio Button Status: "+ maleRdBtn.isSelected()); //true
		System.out.println("'Female' Radio Button Status: "+femaleRdBtn.isSelected()); //false
		
		femaleRdBtn.click();
		System.out.println("'Male' Radio Button Status: "+ maleRdBtn.isSelected()); //false
		System.out.println("'Female' Radio Button Status: "+femaleRdBtn.isSelected()); //true
		
		

	}

}
