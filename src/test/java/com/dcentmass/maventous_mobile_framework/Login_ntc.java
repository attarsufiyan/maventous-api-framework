package com.dcentmass.maventous_mobile_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;



public class Login_ntc extends BaseTest{
		
	@Test
	public void invalidlogin() {
		
		welcomepage.clicknextButton();
		welcomepage.clicknextButton();
		SignUpPage signUpPage = welcomepage.clickstartButton();

		SignInPage signInPage = signUpPage.clicksignIn();

		signInPage.enterEmail("student@student.com");
		signInPage.enterPassword("studentssspassword");
		HomePage homepage = signInPage.clickSignIn();
		
		String toastmsg = driver.findElement(AppiumBy.xpath("//android.widget.Toast[@text=\"Invalid credentials. Please try again.\"]")).getText();
		//String toast = signInPage.getToastMessage("Invalid credentials. Please try again.");
		Assert.assertEquals(toastmsg, "Invalid credentials. Please try again.");
		
	}

}
