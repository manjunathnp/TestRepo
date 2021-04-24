package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[@onClick='jsAlert()']"));
		WebElement jsConfirm= driver.findElement(By.xpath("//button[@onClick='jsConfirm()']"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[@onClick='jsPrompt()']"));
		
		// Handle Alert Pop-up with OK Button
		jsAlert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// Handle Alert Pop-up with Cancel Button
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		// Handle Alert Pop-up with input text box
		jsPrompt.click();
		Thread.sleep(3000);
		Alert alertPopup = driver.switchTo().alert();
		System.out.println("Message in Pop-up: "+alertPopup.getText());
		alertPopup.sendKeys("Test Message");
		Thread.sleep(3000);
		alertPopup.accept();
	
		
		//driver.quit();

		
		
		
		
		
		
		
		
		
	}

}	
		
		
		
		
		
		
		
		
		
		
		

