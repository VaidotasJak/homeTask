package com.automationframe.test;

import org.junit.jupiter.api.Test;

import com.automationframe.Pages.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test 
	public void homePageModule_tc1 () {
        HomePage homePage = new HomePage(driver);
        homePage.tc1();
    }
 
    
 


}