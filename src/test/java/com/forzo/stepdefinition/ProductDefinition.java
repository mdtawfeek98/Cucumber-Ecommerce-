package com.forzo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.java.common.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDefinition extends CommonUtils{
    
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@When("Enter the UserName {string} and  Password  {string}")
	public void enter_the_user_name_and_password(String userName, String password) {
		CommonUtils.elementClick(elementFindByXpath("//li[@class='greet welcome']//following::a[0]"));
        CommonUtils.type(elementFindById("email"), userName);
        CommonUtils.type(elementFindById("pass"), password);
        CommonUtils.elementClick(elementFindById("send2"));
	}

	@When("Add the product to a Cart Page")
	public void add_the_product_to_a_cart_page() {
		WebElement bag = driver.findElement(By.xpath("//a[@title='Fusion Backpack']"));
		
		js.executeScript("window.scroll(0,1500)");
		js.executeScript("arguments[0].click()", bag);
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@id='product-addtocart-button']")));

	//	js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@class='action primary tocart']")));
	}

	@When("Proceed to checkout the product")
	public void proceed_to_checkout_the_product() {
		CommonUtils.implicitWait();
		CommonUtils.elementClick(elementFindByXpath("//a[@class='action showcart']"));
		CommonUtils.implicitWait();
		CommonUtils.elementClick(elementFindById("top-cart-btn-checkout"));
	}

	@When("Enter the Address {string} and City {string}")
	public void enter_the_address_and_city(String addr, String city) {
		CommonUtils.type(elementFindById("KK1DM2D"), addr);
		CommonUtils.type(elementFindById("YWUU79W"), city);
	}

	@When("Select the State and Enter Pincode {string}")
	public void select_the_state_and_enter_pincode(String pin) {
		WebElement wb = CommonUtils.elementFindById("W3JKUIK");
		Select sl = new Select(wb);
		sl.selectByVisibleText("Ohio");
		CommonUtils.type(elementFindByXpath("//input[@name='postcode']"), pin);
	}

	@When("Select the Country and Phone Number {string}")
	public void select_the_country_and_phone_number(String phone) {
		WebElement wb1 = CommonUtils.elementFindById("XCNS3M9");
		Select sl1 = new Select(wb1);
		sl1.selectByVisibleText("United States");
		CommonUtils.type(elementFindByXpath("//input[@name='telephone']"), phone);
	}

	@When("Click the Shippig Methods")
	public void click_the_shippig_methods() {
		CommonUtils.elementClick(elementFindByXpath("//input[@name='ko_unique_5']"));
		CommonUtils.elementClick(elementFindByXpath("//button[@class='button action continue primary']"));
	}

	@When("Place the Order")
	public void place_the_order() {
		CommonUtils.elementClick(elementFindByXpath("//span[text()='Place Order']"));
	}

	@Then("Order Created Successfully")
	public void order_created_successfully() {
	
	}
	
}
