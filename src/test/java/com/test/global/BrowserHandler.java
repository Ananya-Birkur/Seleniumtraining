package com.test.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandler {
	
	public static WebDriver driver;
	
	public void openBrowser(String browsertype) {
		switch(browsertype) {
		case "chrome":
			
			System.out.println("This is chrome....");
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			break;
			
		case "firefox" :
			
			break;
			
			default:
				
				WebDriverManager.chromedriver().setup();
				
				driver=new ChromeDriver();
			
		
		
		
		
		
		}
	}
	

}
