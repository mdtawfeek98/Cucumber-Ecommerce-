package com.forzo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import com.java.common.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPage extends CommonUtils {

	Logger log = loadLogger(CartPage.class);

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@When("Click on any product displayed on home page")
	public void click_on_any_product_displayed_on_home_page() {
		
		WebElement bag = driver.findElement(By.xpath("//a[@title='Fusion Backpack']"));
		
		js.executeScript("window.scroll(0,1500)");
		js.executeScript("arguments[0].click()", bag);
	}

	@When("Click on add to cart for the product")
	public void click_on_add_to_cart_for_the_product() {
		CommonUtils.implicitWait();
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@id='product-addtocart-button']")));
	}
	
	@When("Again Click on add to cart for the product")
	public void addAgain() {
		CommonUtils.implicitWait();
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@id='product-addtocart-button']")));
	}

	
	@Then("The product should be added to cart btn is clickable successfully")
	public void clickable() {
		 log.info("Passed");
	}
	
	@Then("The product should be added to cart")
	public void the_product_should_be_added_to_cart() {
		 log.info("failed");
	}
	
	
	

}
