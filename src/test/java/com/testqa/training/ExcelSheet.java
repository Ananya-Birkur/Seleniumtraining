package com.testqa.training;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.test.global.BrowserHandler;

public class ExcelSheet extends BrowserHandler  {

	public static void main(String[] args) throws Exception {


   InputStream file=new FileInputStream("E:\\eclipseworkspace\\MavenExampleProject\\src\\test\\resources\\config.properties");

   Properties pro=new Properties();

   pro.load(file);

   BrowserAutomation ba=new BrowserAutomation();
   ba.openBrowser("chrome");

   System.out.println("My Project URL :" +pro.getProperty("url"));

   driver.navigate().to(pro.getProperty("url"));
   
   Thread.sleep(3000);
   
   driver.manage().window().maximize();
   
  /* Thread.sleep(5000);
   
   Actions actions=new Actions(driver);
   actions.moveToElement(driver.findElement(Locators.hellosignin)).build().perform();
   Thread.sleep(4000);
   actions.moveToElement(driver.findElement(Locators.signin)).click();
   
   actions.moveToElement(driver.findElement(Locators.youraccount)).click();
*/


}
}