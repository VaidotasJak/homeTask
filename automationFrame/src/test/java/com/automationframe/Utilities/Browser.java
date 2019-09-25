package com.automationframe.Utilities;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	public String browser;

	public Browser(String browser) {
		this.browser = browser;
	}
	
	public WebDriver initBrowser() throws Exception {
		
		String current = browser;
	    Browsers currentBrowser = Browsers.valueOf(current.toUpperCase());
         switch (currentBrowser)
         {
             case CHROME:
            	 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
     			 System.out.println("Scripts are running on Chrome browser");
     			 return	driver = new ChromeDriver();
             case FIREFOX:
            	 System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
     			 System.out.println("Scripts are running on FireFox browser");
     			 return	driver = new FirefoxDriver();
             case EDGE:
            	 System.setProperty("webdriver.edge.driver", "Driver\\MicrosoftWebDriver.exe");
     			 System.out.println("Scripts are running on Edge browser");
     			 return driver = new EdgeDriver();
             default : 
     			 throw new Exception("Non of supported browsers where selected. Check property file. Supported browsers: Chrom, FireFox, Edge.");
         }
    }
}
