package com.a_practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.a_practice.utils.WebDriverFactory;

public class BasePage {

	private static final long EXPLICIT_WAIT = 5;
	private WebDriver driver;
	private WebDriverWait wait;
	private Select select;

	BasePage() {
		this.driver = WebDriverFactory.getChromeDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, EXPLICIT_WAIT);
	}

	public HomePage openBaseURL() {
		driver.get("http://automationpractice.com/index.php");
		return new HomePage();
	}

	void click(WebElement element) {
		waitForElementDisplayed(element);
		element.click();
	}

	void sendKeys(WebElement element, String text) {
		waitForElementDisplayed(element);
		element.clear();
		element.sendKeys(text);
	}

	void selectOption(WebElement element, String visibleText){
		select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	/**
	 * Waiters
	 */

	public void waitForElementDisplayed(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
