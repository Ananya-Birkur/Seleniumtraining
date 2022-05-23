package com.excelsheet.xls;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadData {
	
static WebDriver driver;
	
	static By email=By.xpath("//input[contains(@type,'text')]");
	static By password=By.xpath("//input[contains(@type,'password')]");
	static By loginbutton=By.xpath("//input[contains(@type,'submit')]");
	
	public static void main(String[] args) throws Exception {
		File src=new File("E:\\Java\\Automationpractice.xlsx");
	    FileInputStream fis=new FileInputStream(src);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheetAt(0);
	    String username=sheet.getRow(0).getCell(0).getStringCellValue();
	    String passwrd=sheet.getRow(0).getCell(1).getStringCellValue();
	    
	    System.out.println(username);
	    wb.close();
	    fis.close();
	    
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/");
	   
	    driver.findElement(email).sendKeys(username);
	    Thread.sleep(3000);
	    
	    driver.findElement(password).sendKeys(passwrd);
	    Thread.sleep(3000);
	    
	    driver.findElement(loginbutton).click();
	    Thread.sleep(3000);
	    
	    driver.close();
	    
	    
	    
	}
	


}
