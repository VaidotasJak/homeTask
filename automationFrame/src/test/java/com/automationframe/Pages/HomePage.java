package com.automationframe.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends commonUtils {
	 
    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }
 
    //*********Page Variables*********
    String baseURL = "http://www.pigu.lt/";
 
    //*********Web Elements*********
    By signInButtonBy 		= By.xpath("//a[@href='u/login']");
 
    public void tc1(){
    	click(signInButtonBy);
    }
 
    
}
