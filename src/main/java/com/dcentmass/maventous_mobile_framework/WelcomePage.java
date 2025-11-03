package com.dcentmass.maventous_mobile_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage {
	AndroidDriver driver;
	public SignUpPage signUpPage;

	public WelcomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.sucotech.myapplication.dev:id/skipBtn")
	private WebElement skipButton;

	@AndroidFindBy(id = "com.sucotech.myapplication.dev:id/nextBtn")
	private WebElement nextButton;

	@AndroidFindBy(id = "com.sucotech.myapplication.dev:id/startBtn")
	private WebElement startButton;

	public void clickskipButton() {
		skipButton.click();
	}

	public void clicknextButton() {
		nextButton.click();
	}

	public SignUpPage clickstartButton() {
		startButton.click();
		return new SignUpPage(driver);
	}

}
