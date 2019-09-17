package com.automationframe.test;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
