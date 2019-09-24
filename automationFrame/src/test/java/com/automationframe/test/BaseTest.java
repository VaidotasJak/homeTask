package com.automationframe.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	
	public static WebDriver driver;
//	lpublic static String browser;

	@BeforeEach
	public void setup () {
        //Create a Chrome driver. All test classes use this.
		
	   setChromeDriverProperty();
       
 
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
			driver = new ChromeDriver();
		} else if (System.getProperty("os.name").contains("Mac")){
			System.setProperty("webdriver.safari.driver", "Driver\\SafariDriver.safariextz");
			driver = new SafariDriver();
		} else {
			Assertions.fail("This framework only supports Windows or Mac OS");
		}
//			FireFox driver
//			if(System.getProperty("os.name").contains("Windows")) {
//				System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
//				driver = new FirefoxDriver();
			
//			Edge driver
//			if(System.getProperty("os.name").contains("Windows")) {
//				System.setProperty("webdriver.edge.driver", "Driver\\MicrosoftWebDriver.exe");
//				driver = new EdgeDriver();
		}
	}

