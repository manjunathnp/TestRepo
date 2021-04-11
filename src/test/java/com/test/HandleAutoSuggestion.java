package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.bing.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		System.out.println("Size of Auto Suggestions: "+list.size());
		
		for(WebElement listitem:list)
		{
			if(listitem.getText().contains("selenium webdriver"))
			{
				listitem.click();
				break;
			}
		}
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> glist = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println("Size of Auto Suggestions: "+glist.size());
		
		for(WebElement listitem:glist)
		{
			if(listitem.getText().contains("java interview questions"))
			{
				listitem.click();
				break;
			}
		}
		
		

	}

}
