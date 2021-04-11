package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAtttibuteValue 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		
		WebElement emailTextField = driver.findElement(By.id("Email"));
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		
//		emailTextBox.clear();
//		emailTextBox.sendKeys("tester@gmail.com");
		
		System.out.println("Email Text Field Value: "+emailTextField.getAttribute("value"));
		System.out.println("Password Text Field Value: "+passwordTextField.getAttribute("value"));

		System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Log in']")).getText());
		
		System.out.println("Text: "+driver.findElement(By.xpath("//label[normalize-space()='Email:']")).getText());
		driver.quit();
	}

}
