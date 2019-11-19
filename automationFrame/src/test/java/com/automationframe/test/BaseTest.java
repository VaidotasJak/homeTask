package com.automationframe.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import com.automationframe.Utilities.Browser;


public class BaseTest {
	
	public static WebDriver driver;
    String baseURL = "http://shop.demoqa.com";

	@BeforeEach
	public void setup () throws Exception {
		setDriverProperty();
        driver.manage().window().maximize();
        driver.get(baseURL);
        hideElement("[class='woocommerce-store-notice demo_store']");
    }
	
	public void hideElement(String xpath)
	{
		if(driver.findElement(By.cssSelector(xpath)).isDisplayed()) {
		    WebElement element = driver.findElement(By.cssSelector(xpath));       
		    ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
		}
	}
	
	@AfterEach
	public void closeBrowser() 
	{
		driver.close();
	}	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	private void setDriverProperty() throws Exception {
		if(System.getProperty("os.name").contains("Windows")) {
			Properties prop=new Properties();
			InputStream input = null;
			input = new FileInputStream("config.properties");
			prop.load(input);
			Browser browser = new Browser(prop.getProperty("browser"));
			driver = browser.initBrowser();
		} else if (System.getProperty("os.name").contains("Mac")){
			System.setProperty("webdriver.safari.driver", "Driver\\SafariDriver.safariextz");
			driver = new SafariDriver();
		} else {
			Assertions.fail("This framework only supports Windows or Mac OS");
	}
  }
}