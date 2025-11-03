package Utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {

	AndroidDriver driver;
	WebDriverWait waits;
 

	public AndroidActions(AndroidDriver driver) {
		
		this.driver = driver;
		 
	}

	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
		} while (canScrollMore);
	}

	public void scrollToText(String text) {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"))"));
	}
	
	 public WebElement waitForPresence(By locator) {
	        return waits.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }

	// Swipe from left to right
	public void swipe(WebElement categoriesList) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Map<String, Object> params = new HashMap<>();
		params.put("elementId", ((RemoteWebElement) categoriesList).getId());
		params.put("direction", "left"); // swipe from left to right
		params.put("percent", 1.0); // how much to swipe (0.0 to 1.0)

		js.executeScript("mobile: swipeGesture", params);
	}
	
	 public WebElement waitForElement(By locator) {
	        return waits.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }
}
