package com.automationframe.Pages;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	    public WebDriver driver;
	    public WebDriverWait wait;
	 
	    //Constructor
	    public BasePage (WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,15);
	    }
	 
	    //Wait Wrapper Method
	    public void waitVisibility(By elementBy) {
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	    }
	 
	    //Click Method
	    public void click (By elementBy) {
	        waitVisibility(elementBy);
	        
	        driver.findElement(elementBy).click();
	    }
	 
	    //Write Text
	    public void writeText (By elementBy, String text) {
	        waitVisibility(elementBy);
	        driver.findElement(elementBy).sendKeys(text);
	    }
	 
	    //Read Text
	    public String readText (By elementBy) {
	        waitVisibility(elementBy);
	        System.out.println(driver.findElement(elementBy).getText());
	        return driver.findElement(elementBy).getText();
	    }
	 
	    //Assert
	    public void assertEquals (By elementBy, String expectedText) {
	        waitVisibility(elementBy);
	        Assertions.assertEquals(readText(elementBy), expectedText);
	 
	    }
}
