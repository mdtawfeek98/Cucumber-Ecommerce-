package com.java.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtils extends SLF4j {

	

	public static WebDriver driver = null;


	public static void browserLaunch(String key) {
		switch(key) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case"edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
	}

	public static void browserMax() {
		driver.manage().window().maximize();
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}


	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



	public static  WebElement elementFindById(String locator) {
		return driver.findElement(By.id(locator));
	}  

	public static  WebElement elementFindByName(String locator) {
		return driver.findElement(By.name(locator));
	}

	public static  WebElement elementFindByXpath(String locator) {
		return driver.findElement(By.xpath(locator));
	}


	public static WebElement elementFinder(By locator) {
		return driver.findElement(locator);


	}

	public static By locateFindById(String locator) {
		return By.id(locator);

	}

	public static By locateFindByName(String locator) {
		return By.name(locator);

	}

	public static By locateFindByXpath(String locator) {
		return By.xpath(locator);

	}



	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

//    public static void jsMethod(String scroll, String setValue, WebElement wb) {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(scroll);
//		js.executeScript(setValue, wb);
//    }






	public static void browserClose() {
		driver.close();
	}








}
