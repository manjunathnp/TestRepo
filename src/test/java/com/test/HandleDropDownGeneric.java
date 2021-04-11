package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownGeneric 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		WebElement dobEle = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		selectOptionFromDrpDown(dobEle, "15");
		
		WebElement mobEle = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		selectOptionFromDrpDown(mobEle, "June");
		
		WebElement yobEle = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		selectOptionFromDrpDown(yobEle, "1987");
		
	}

	public static void selectOptionFromDrpDown(WebElement ele, String value)
	{
		Select drpDown = new Select(ele);
		List<WebElement> drpDownOpt = drpDown.getOptions();
		
		for(WebElement drpDownEle:drpDownOpt)
		{
			if(drpDownEle.getText().equals(value))
			{
				drpDownEle.click();
				break;
			}
		}
		
	}
}
