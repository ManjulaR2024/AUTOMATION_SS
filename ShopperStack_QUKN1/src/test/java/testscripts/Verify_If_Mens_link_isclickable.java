package testscripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_Library.BaseTest;

public class Verify_If_Mens_link_isclickable extends BaseTest
{
	
	@Test
	public void wishListTestCase() throws InterruptedException
	{
		base_Page.getMenLink().click();
		utility_Methods.takeScreenshot(driver);
	}
	
	public void Login()
	{
	   base_Page.getLoginButton() .click();	
	   
	}
	
	public void EditProfile()
	{
		
	}
	
	
}
