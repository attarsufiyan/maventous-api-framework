package com.dcentmass.maventous_mobile_framework;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
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
	
//	public void setActivity() {
//		
//		Activity activity = new Activity("com.sucotech.myapplication.dev","com.sucotech.myapplication.activities.OnboardingActivity");
//		//driver.startActivity(activity);
//		((JavascriptExecutor) driver).executeScript("mobile: startActivity", 
//			    ImmutableMap.of("intent", "com.sucotech.myapplication.dev/com.sucotech.myapplication.activities.OnboardingActivity"));
//		
//	}
	
	public void setActivity() {
        String pkg = "com.sucotech.myapplication.dev";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        try {
            // preferred: bring app to foreground
            driver.activateApp(pkg);

            // re-init PageFactory elements with a decent decorator timeout
            PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

            // wait until next button is present/clickable
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    AppiumBy.id("com.sucotech.myapplication.dev:id/nextBtn")));

            System.out.println("App activated and WelcomePage elements re-initialized.");
            return;
        } catch (Exception e) {
            System.out.println("activateApp() or wait failed: " + e.getMessage());
            // If you want, add fallback (monkey/startActivity) here — omitted for clarity.
        }
    }

}
