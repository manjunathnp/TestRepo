package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropdownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		/*WebElement drpElement = driver.findElement(By.xpath("//select[@name='category_id']"));
		
		Select drpSelect = new Select(drpElement);
		List<WebElement> options = drpSelect.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList templList = new ArrayList();
		
		for(WebElement option:options)
		{
			originalList.add(option.getText());
			templList.add(option.getText());
		}
		System.out.println("Original List: \n"+originalList);
		System.out.println("Temp List: \n"+templList);
		
		Collections.sort(templList);
		
		System.out.println("Original List: \n"+originalList);
		System.out.println("Temp List After Sorting: \n"+templList);
		
		if(originalList.equals(templList))
		{
			System.out.println("Dropdown is SORTED");
		}
		else
		{
			System.out.println("Dropdown is UNSORTED");
		}*/
		
		WebElement skillsDDEle = driver.findElement(By.id("Skills"));
		
		Select skillsDD = new Select(skillsDDEle);
		List<WebElement> options = skillsDD.getOptions();
		
		ArrayList orig_list = new ArrayList();
		ArrayList temp_list = new ArrayList();
		
		for(WebElement option:options)
		{
			orig_list.add(option.getText());
			temp_list.add(option.getText());
		}
		
		orig_list.remove("Select Skills");
		temp_list.remove("Select Skills");
		
		System.out.println("Before Sorting");
		System.out.println("Original List: "+orig_list);
		System.out.println("Temp List: "+temp_list);
		
		Collections.sort(temp_list);
		
		
		System.out.println("After Sorting");
		System.out.println("Original List: "+orig_list);
		System.out.println("Temp List: "+temp_list);
		
		
			if(orig_list.equals(temp_list))
			{
				System.out.println("Dropdown Options are SORTED");
			}
			else
			{
				System.out.println("Dropdown Options are UNSORTED");
			}

		driver.close();
	}

}
