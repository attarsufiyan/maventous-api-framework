package com.dcentmass.maventous_mobile_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpPage {

	AndroidDriver driver;
	SignInPage signInPage;

	SignUpPage(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.sucotech.myapplication.dev:id/btnSignIn")
	private WebElement clickSignIn;

	public SignInPage clicksignIn() {

		clickSignIn.click();
		return  new SignInPage(driver);

	}

}
