package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
	
		WebElement dateEle = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		WebElement monthEle = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		WebElement yearEle = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		
		
		Select dateDrp = new Select(dateEle);
		Select monthDrp = new Select(monthEle);
		Select yearDrp = new Select(yearEle);
		
		
		
		// Select by visibleText()
		//monthDrp.selectByVisibleText("June");
		
		// Select by value()
		//monthDrp.selectByValue("6");
		
		// Select by index()
		//monthDrp.deselectByIndex(7); //UnSupported here
		
		
		// Select Date
		List<WebElement> dateDrpOptions = dateDrp.getOptions();
		for(WebElement dateDrpEle:dateDrpOptions)
		{
			if(dateDrpEle.getText().equals("15"))
			{
				dateDrpEle.click();
				break;
			}
		}
		
		
		// Select Month
		List<WebElement> monthDrpOptions =  monthDrp.getOptions();
		for(WebElement monthDrpEle:monthDrpOptions)
		{
			if(monthDrpEle.getText().equals("June"))
			{
				monthDrpEle.click();
				break;
			}
		}
		
		// Select Year
		List<WebElement> yearDrpOptions = yearDrp.getOptions();
		for(WebElement yearDrpEle:yearDrpOptions)
		{
			if(yearDrpEle.getText().equals("1987"))
			{
				yearDrpEle.click();
				break;
			}
			
		}
		
		
		
		//driver.quit();
		
		
	}

}
