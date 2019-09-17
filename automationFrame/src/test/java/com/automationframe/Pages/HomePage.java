package com.automationframe.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.automationframe.test.BaseTest;

public class HomePage extends BasePage {
	 
    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }
 
    //*********Page Variables*********
    String baseURL = "http://www.pigu.lt/";
 
    //*********Web Elements*********
    By signInButtonBy 		= By.xpath("//a[@href='u/login']");
 
    //*********Page Methods*********
    //Go to Homepage
    public HomePage goToPiguLt (){
        driver.get(baseURL);
        return this;
    }
 
    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage(driver);
    }
}
