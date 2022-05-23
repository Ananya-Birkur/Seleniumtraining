package com.testqa.training;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowncss {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By dropdown_locator=By.cssSelector("select[name='url']");
		WebElement dropdown_element=driver.findElement(dropdown_locator);
		
		Select select=new Select(dropdown_element);
		select.selectByIndex(9);
		Thread.sleep(3000);
		
		select.selectByValue("search-alias=industrial");
		Thread.sleep(3000);
		
		select.selectByVisibleText("Baby");
		Thread.sleep(3000);
		
		List<WebElement> allOptions=select.getOptions();
		for (Iterator iterator = allOptions.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			
		}
	
		driver.close();
		
		

	}

}
