package com.automationframe.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationframe.Pages.HomePage;
import com.automationframe.Pages.LoginPage;

public class Scripts extends BaseTest {
	
	@Test 
	public void tc01 () {
		 
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
 
        //*************PAGE METHODS********************
        homePage.goToPiguLt()
                .goToLoginPage()
                .loginToPiguLt("onur@swtestacademy.com", "11223344")
                .verifyLoginUserName(("Neteisingi prisijungimo duomenys"));
    }
 
    @Test 
    public void tc02 () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
 
        //*************PAGE METHODS********************
        homePage.goToPiguLt()
                .goToLoginPage()
                .loginToPiguLt("","")
                .verifyLoginUserName("Įveskite el. pašto adresą")
                .verifyLoginPassword("Įveskite slaptažodį");
    }
    
    @Test 
    public void tc03 () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
 
        //*************PAGE METHODS********************
        homePage.goToPiguLt()
                .goToLoginPage()
                .clickRegister()
        		.findForm();
    }


}