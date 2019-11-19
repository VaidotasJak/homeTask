package com.automationframe.test;

import org.junit.jupiter.api.Test;

import com.automationframe.Pages.HomePageScripts;

public class HomePageTest extends BaseTest {
	
	@Test 
	public void homeWork_tc1 () throws Exception{
		HomePageScripts homeWork = new HomePageScripts(driver);
        homeWork.tc1();
    }
	
	@Test 
	public void homeWork_tc2 () throws Exception{
		HomePageScripts homeWork = new HomePageScripts(driver);
        homeWork.tc2();
    }
 
    
 


}