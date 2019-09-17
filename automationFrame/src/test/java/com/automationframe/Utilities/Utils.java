package com.automationframe.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.automationframe.test.BaseTest;


public class Utils extends BaseTest{

	public void hightRed(By elementBy) {
		WebElement ele = driver.findElement(elementBy);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",ele);
	}
	
}
