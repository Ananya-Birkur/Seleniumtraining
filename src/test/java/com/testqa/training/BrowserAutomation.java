package com.testqa.training;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import com.test.global.BrowserHandler;

public class BrowserAutomation extends BrowserHandler {
	
	public static void main(String[] args) throws InterruptedException, Exception {
		
		InputStream file=new FileInputStream("E:\\eclipseworkspace\\MavenExampleProject\\src\\test\\resources\\config.properties");
		
		Properties pro=new Properties();
		
		pro.load(file);
		
		BrowserAutomation ba=new BrowserAutomation();
		ba.openBrowser("chrome");
		
		System.out.println("My Project URL :" +pro.getProperty("url"));
		
		driver.navigate().to(pro.getProperty("url1"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000); 
		
		String searchitem="iphone 13";
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys(searchitem);
		
		driver.findElement(By.xpath("//path[contains(@class,'34RNph')]")).click();
		Thread.sleep(3000);
		String res=driver.findElement(By.xpath("(//span[@class='a-truncate-cut'][contains(.,'iPhone 13. Superbright. Supercolorful. Supersharp.')])[1]")).getText();
		
		if(res.equalsIgnoreCase(searchitem))
		{
			System.out.println("As expected");
		}else {
			System.out.println("res not matched");
		}
			
		driver.close();
		
		
		
	}

	
}
