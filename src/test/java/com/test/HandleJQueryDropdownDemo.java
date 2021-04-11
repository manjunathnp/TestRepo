package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDropdownDemo 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement multiSelectinputBox = driver.findElement(By.id("justAnInputBox"));
		multiSelectinputBox.click();
		
		//selectChoiceValues(driver, "choice 2");
		//selectChoiceValues(driver, "choice 1", "choice 2", "choice 2 1", "choice 2 2", "choice 3", "choice 4", "choice 5", "choice 6", "choice 6 2", "choice 6 2 3", "choice 7");
		selectChoiceValues(driver, "all");
	}

	public static void selectChoiceValues(WebDriver driver, String... val)
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!val[0].equalsIgnoreCase("all"))
		{
			for(WebElement ele:choiceList)
			{
				String text = ele.getText();
				
				for(String v:val)
				{
					if(text.equals(v))
					{
						ele.click();
						break;
					}
				}
			}
		}
		else
		{
			try
			{
				for(WebElement ele:choiceList)
				{
					ele.click();
				}
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
}
