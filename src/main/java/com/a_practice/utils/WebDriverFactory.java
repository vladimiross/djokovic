package com.a_practice.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebDriverFactory {

	private static final long IMPLICIT_WAIT = 2;
	private static WebDriver driver;

	public static void setChromeDriver() {
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	public static WebDriver getChromeDriver() {
		return driver;
	}
}
