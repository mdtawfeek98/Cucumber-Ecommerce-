package com.forzo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import com.java.common.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailSub extends CommonUtils{
	
	Logger log = loadLogger(EmailSub.class);

	@When("Enter the E-mail id {string}")
	public void mailId(String string) {
		WebElement wb = driver.findElement(By.id("newsletter"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3000)");
		js.executeScript("arguments[0].setAttribute('value','tawfeek37988@gmail.com')", wb);
		
	}

	@When("User able to Click the Subscribe btn")
	public void subscribe_btn() {

		CommonUtils.elementClick(elementFindByXpath("//span[text()='Subscribe']"));
	}

	@Then("Subscribed successfully")
	public void subscribed() {
	    log.info("Passed");
	    CommonUtils.browserClose();
	}
	
	@Then("Subscribed unsuccessfully")
	public void unsubscribed() {
	   log.info("Passed");
	   CommonUtils.browserClose();
	}
	
	@Then("Subscribed and got a email successfully")
	public void mail() {
		 log.info("Failed");
		 CommonUtils.browserClose();
	}
	
	@Then("Enable to click a button but throw a error")
	public void error() {
		 log.info("Passes");
		 CommonUtils.browserClose();
	}

	
}
