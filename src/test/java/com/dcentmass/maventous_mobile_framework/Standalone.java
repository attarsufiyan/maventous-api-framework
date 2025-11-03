package com.dcentmass.maventous_mobile_framework;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Standalone extends BaseTest {

	@Test
	public void Cofiguration() throws MalformedURLException, URISyntaxException, InterruptedException {

		// Skip Button
		// driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/skipBtn")).click();
		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/nextBtn")).click();
		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/nextBtn")).click();
		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/startBtn")).click();

		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/btnSignIn")).click();

		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/etSignInEmail"))
				.sendKeys("student@student.com");

		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/etSignInPassword"))
				.sendKeys("studentpassword");

		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/buttonSignIn")).click();

		String toastmsg = driver.findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getAttribute("name");

		Assert.assertEquals(toastmsg, "Signin Success. You are in a free trial period");

		driver.findElement(AppiumBy.xpath(
				"(//android.widget.ImageView[@resource-id=\"com.sucotech.myapplication.dev:id/navigation_bar_item_icon_view\"])[5]"))
				.click();

		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/textView11")).click();

		WebElement firstName = driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/tvStudentFirstName"));
		firstName.clear();
		firstName.sendKeys("Sufiyan");

		WebElement lastName = driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/tvStudentLastName"));
		lastName.clear();
		lastName.sendKeys("Attar");

		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Select gender\")")).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Male\")")).click();

		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/etDOB")).click();

		driver.findElement(AppiumBy.id("android:id/date_picker_header_year")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"1996\")")).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"MAY\")")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"15\")")).click();

		// Confirm OK button
		driver.findElement(AppiumBy.id("android:id/button1")).click();

//		scrollAndClickExactByTextHorizontal("Information Technology");
//		scrollAndClickExactByTextVertical("Software Development");

//		scrollAndClickByPartialTextVertical("IT Support & Networking Essentials");
//		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/action_save")).click();
//		Thread.sleep(3000);
//		
//		Activity activity=new Activity("com.sucotech.myapplication.dev", "com.sucotech.myapplication.activities.MainActivity");
//		
//		 ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(  
//		            "intent","com.sucotech.myapplication.dev/com.sucotech.myapplication.activities.MainActivity" 
//		    ));
//		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/nav_fav")).click();
//
//		driver.findElement(AppiumBy.id("com.sucotech.myapplication.dev:id/btnViewCourse")).click();
//		String msg = driver.findElement(AppiumBy.id("android:id/message")).getText();
//		Assert.assertEquals(msg, "Course available after activation. Please visit our website for more information.");

	}

}
