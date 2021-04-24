package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		WebElement linkElement = expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium WebDriver']")));
		linkElement.click();
		
		
		//driver.findElement(By.xpath("//h3[normalize-space()='Selenium WebDriver']")).click();
		
		

	}

}
