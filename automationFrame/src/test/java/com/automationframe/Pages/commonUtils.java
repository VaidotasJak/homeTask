package com.automationframe.Pages;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationframe.Utilities.*;


public class commonUtils {
	
	    public static WebDriver driver;
	    public static WebDriverWait wait;
	    
	    //Constructor
	    public commonUtils (WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,30);
	    }
	 
	    //Wait Wrapper Method
	    public static void waitVisibility(By elementBy) {
	      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	      Utils highlight = new Utils();
	      highlight.hightRed(elementBy);
	    }
	 
	    //Click Method
	    public static void click (By elementBy) {
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
	    
	  //Find element
	    public WebElement find (By elementBy) {
	        waitVisibility(elementBy);
	        return driver.findElement(elementBy);
	    }
	 
	    //Assert
	    public void assertEquals (By elementBy, String expectedText) {
	        waitVisibility(elementBy);
	        Assertions.assertEquals(readText(elementBy), expectedText);
	    }
	    
	  //Write Text + radom Int
	    public void writeTextPlusRandomInt (By elementBy, String text) {
	        waitVisibility(elementBy);
	        driver.findElement(elementBy).sendKeys(text + getRandomInt(100, 100000));
	    }
	    
	  //Write Random Int 
	    public int getRandomInt (int min, int max) {
	    	Random r = new Random();
			return r.nextInt((max - min) + 1) + min;
	    }
}