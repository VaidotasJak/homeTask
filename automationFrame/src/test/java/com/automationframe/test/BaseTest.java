package com.automationframe.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public static WebDriver driver;

	@BeforeEach
	public void setup () {
		
        //Create a Chrome driver. All test classes use this.
		setChromeDriverProperty();
       driver = new ChromeDriver();
 
        //Maximize Window
        driver.manage().window().maximize();
    }
	
//	@AfterEach
	public  void closeBrowser() 
	{
		driver.close();
	}	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	private static void setChromeDriverProperty() {
		if(System.getProperty("os.name").contains("Windows")) {
			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		} else {
			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver");

		}
	}
}
