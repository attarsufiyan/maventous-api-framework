package com.dcentmass.maventous_mobile_framework;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;


public class Login_ptc extends BaseTest {
	
	@Test
	public void Cofiguration() throws MalformedURLException, URISyntaxException, InterruptedException {

		welcomepage.clicknextButton();
		welcomepage.clicknextButton();
		SignUpPage signUpPage = welcomepage.clickstartButton();
		SignInPage signInPage = signUpPage.clicksignIn();
		signInPage.enterEmail("student@student.com");
		signInPage.enterPassword("studentpassword");
		HomePage homepage = signInPage.clickSignIn();
		String message = homepage.getToastMessage();
		Assert.assertEquals(message, "Signin Success. You are in a free trial period");

	}
	
	
	

}
