package com.testqa.training;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.global.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.findElement(Locators.loginPopup).click();
		Thread.sleep(3000);
		
		Actions actions =new Actions(driver);
		actions.moveToElement(driver.findElement(Locators.Homelink)).perform();
		
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(Locators.HomeDecorelink)).perform();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
