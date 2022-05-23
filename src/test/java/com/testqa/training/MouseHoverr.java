package com.testqa.training;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;

import com.test.global.BrowserHandler;
import com.test.global.Locators;

public class MouseHoverr extends BrowserHandler {

	public static void main(String[] args) throws Exception {
InputStream file=new FileInputStream("E:\\eclipseworkspace\\MavenExampleProject\\src\\test\\resources\\config.properties");
		
		Properties pro=new Properties();
		
		pro.load(file);
		
		BrowserAutomation ba=new BrowserAutomation();
		ba.openBrowser("chrome");
		
		System.out.println("My Project URL :" +pro.getProperty("url"));
		
		driver.navigate().to(pro.getProperty("url"));
		
		Thread.sleep(3000);
 
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(Locators.AccountandList)).build().perform();
		
		Thread.sleep(3000);
		
		actions.moveToElement(driver.findElement(Locators.Babywhislist)).click();
		
		Thread.sleep(3000);		
		driver.close();

	}

}
