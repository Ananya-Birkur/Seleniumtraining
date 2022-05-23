package com.test.global;

import org.openqa.selenium.By;

public class Locators extends BrowserHandler {
	
	public static By loginPopup=By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]");

    public static By Homelink=By.xpath("//img[contains(@alt,'Home')]");
    
    public static By HomeDecorelink=By.xpath("//a[contains(@href,'view-all&cid=8MDVJVQKUT46')]");
    
    
    
    
    
    
    
    public static By AccountandList=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    
    public static By Babywhislist=By.xpath("//span[@class='nav-text'][contains(.,'Baby Wishlist')]");
    
    public static By hellosignin=By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]");

    public static By signin=By.xpath("(//span[contains(.,'Sign in')])[2]");
    
    public static By youraccount=By.xpath("//span[@class='nav-text'][contains(.,'Your Account')]");

    }
