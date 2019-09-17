package com.automationframe.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	 
    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }
 
    //*********Web Elements*********
    By usernameBy 				= By.xpath("(//input[@name='email'])[1]");
    By passwordBy 				= By.xpath("(//input[@name='password'])[1]");
    //Registration From
    By usernameForm 			= By.xpath("(//input[@name='email'])[2]");
    By passwordForm				= By.xpath("(//input[@name='password'])[2]");
    By confirmPasswordFormBy	= By.xpath("(//input[@name='passconf'])[2]");
    By registerButtonForm		= By.name("register");
    
    By loginButtonBy 			= By.name("login");
    By errorMessageUsernameBy   = By.xpath("//*[@name='email']/following-sibling::div");
    By errorMessagePasswordBy   = By.xpath("//*[@id='passwordCont']/following-sibling::div");
    By registerButtonBy			= By.xpath("//a[contains(@href,'account#register')]");
    By registerForm				= By.xpath("(//form[@class='form-default login-form'])[2]"); 
    By orderButtonBottom		= By.xpath("(//button[@type='submit'])[2]"); 

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
    
    //Click Order button in page bottom.
    public LoginPage clickOrder () {
    	click(orderButtonBottom);
        return this;
    }
    
    //Find registration form
    public LoginPage findForm () {
    	find(registerForm);
        return this;
    }
    
    //Fill in form with random values
    public LoginPage fillInRegistrationForm (String username, String password){
        //Enter Username(Email)
    	writeTextPlusRandomInt(usernameForm, username);
        //Enter Password
    	writeTextPlusRandomInt(passwordForm, username);
        //Confirm Password
    	writeTextPlusRandomInt(confirmPasswordFormBy, password);
        //Click Login Button
        click(registerButtonForm);
        return this;
    }
    
    
}
