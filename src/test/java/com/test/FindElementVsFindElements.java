package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		// findElement() --> Returns Single WebElement
		
		//1
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchBox.sendKeys("Test");
		
		//2
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		
		// findElements() --> Returns Multiple WebElements
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of links: "+links.size());
		
		/*for(int i=0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
		}*/
		
		for(WebElement link:links) 
		{
			System.out.println(link.getText());
		}
		

		driver.quit();		
		
		
		
	}

}
