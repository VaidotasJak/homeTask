package com.automationframe.test;

import org.junit.jupiter.api.Test;

import com.automationframe.Pages.MyAccountPageScripts;
 
public class MyAccountPageTests extends BaseTest {
	
	@Test 
	public void homeWork_tc1 () throws Exception{
        MyAccountPageScripts homeWork = new MyAccountPageScripts(driver);
        homeWork.tc1();
    }
	
	@Test 
	public void homeWork_tc2 () throws Exception{
        MyAccountPageScripts homeWork = new MyAccountPageScripts(driver);
        homeWork.tc2();
    }
	
 
    
 


}