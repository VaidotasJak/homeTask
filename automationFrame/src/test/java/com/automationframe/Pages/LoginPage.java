package com.automationframe.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	 
    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }
 
    //*********Web Elements*********
    By usernameBy 				= By.xpath("(//input[@name='email'])[1]");
    By passwordBy 				= By.xpath("(//input[@name='password'])[1]");
    By loginButtonBy 			= By.name("login");
    By errorMessageUsernameBy   = By.xpath("//*[@name='email']/following-sibling::div");
    By errorMessagePasswordBy   = By.xpath("//*[@id='passwordCont']/following-sibling::div");
    By registerButtonBy			= By.xpath("//a[contains(@href,'account#register')]");
    By registerForm				= By.xpath("(//form[@class='form-default login-form'])[2]");
 
    //*********Page Methods*********
 
    public LoginPage loginToPiguLt (String username, String password){
        //Enter Username(Email)
        writeText(usernameBy,username);
        //Enter Password
        writeText(passwordBy, password);
        //Click Login Button
        click(loginButtonBy);
        return this;
    }
 
    //Verify Username Condition
    public LoginPage verifyLoginUserName (String expectedText) {
        assertEquals(errorMessageUsernameBy, expectedText);
        return this;
    }
 
    //Verify Password Condition
    public LoginPage verifyLoginPassword (String expectedText) {
        assertEquals(errorMessagePasswordBy, expectedText);
        return this;
    }
    
    //Verify Password Condition
    public LoginPage clickRegister () {
    	click(registerButtonBy);
        return this;
    }
    
    //Find registration form
    public LoginPage findForm () {
    	find(registerForm);
        return this;
    }
}
