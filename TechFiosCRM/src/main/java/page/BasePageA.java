package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class BasePageA {

	static WebDriver driver;

	public static void waitForElement(WebElement element, WebDriver driver) {

		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.visibilityOf(element));
	}

	/*
	 * static WebDriver driver;
	 * 
	 * public static void waitForElement(WebElement element, WebDriver driver) {
	 * WebDriverWait wait = new WebDriverWait(driver,10);
	 * wait.until(ExpectedConditions.visibilityOf(element)); }
	 */

}
