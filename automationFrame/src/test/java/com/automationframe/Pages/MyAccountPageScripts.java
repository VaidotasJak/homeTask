package com.automationframe.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPageScripts extends commonUtils {
	 
    //*********Constructor*********
    public MyAccountPageScripts (WebDriver driver) {
        super(driver);
    }
 
    //*********Web Elements*********
    By myAccountButton 			= By.xpath("//a[contains(text(),'My Account')]");
    By userNameInputField 		= By.cssSelector("input[id='reg_username']");
    By passwordInputFiled 		= By.cssSelector("input[id='reg_password']");
    By emailInputField	 		= By.cssSelector("input[id='reg_email']");
    By registerButton	 		= By.cssSelector("[name='register']");
    By errolLabel	 			= By.className("woocommerce-error");
    By successLabel	 			= By.className("woocommerce-error");

    
    public void tc1() throws Exception {
    	click(myAccountButton);
    	writeTextPlusRandomInt(userNameInputField, "testUser");
    	writeText(emailInputField, "invalidEmailasfdasf@df");
    	writeText(passwordInputFiled, "PassPhrase123432");
    	click(registerButton);
    	String errorMsg = readText(errolLabel);
    	Assertions.assertTrue(errorMsg.contains("Error:") && errorMsg.contains("Please provide a valid email address."));
    	writeTextPlusRandomInt(emailInputField, "valid@gmail.com");
    	writeText(passwordInputFiled, "PassPhrase123432");
    	click(registerButton);
    	/*Could not validate success message as after clicking register button, user is redirected to different page
    	* and there is no success message.
    	*/
    }
 
    //Error scenario
    public void tc2() throws Exception {
    	click(myAccountButton);
    	writeTextPlusRandomInt(userNameInputField, "testUser");
    	writeText(emailInputField, "invalidEmailasfdasf@df");
    	writeText(passwordInputFiled, "PassPhrase123432");
    	click(registerButton);
    	String errorMsg = readText(errolLabel);
    	Assertions.assertTrue(errorMsg.contains("Success") && errorMsg.contains("Please provide a valid email address."));
    }
    
    
}
