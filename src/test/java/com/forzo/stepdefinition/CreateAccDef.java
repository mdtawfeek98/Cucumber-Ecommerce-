package com.forzo.stepdefinition;

import org.slf4j.Logger;

import com.java.common.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccDef extends CommonUtils {

	Logger log = loadLogger(CreateAccDef.class);

	@When("Enter the First Name {string} and Last Name {string}")
	public void enter_the_first_name_and_last_name(String fName, String lName) {
		CommonUtils.elementClick(elementFindByXpath("//a[text()='Create an Account'][1]"));
		CommonUtils.type(elementFindById("firstname"), fName);
		CommonUtils.type(elementFindById("lastname"), lName);
	}

	@When("Enter the Email id {string}")
	public void enter_the_email_id(String email) {
		//CommonUtils.type(elementFindByName("email"), email);
		CommonUtils.type(elementFindByXpath("//input[@type='email'][1]"), email);
	}


	@When("Enter the Password {string} and Confirm Password {string}")
	public void enter_the_password_and_confirm_password(String string, String string2) {
		CommonUtils.type(elementFindByXpath("//input[@title='Password']"), string);
		CommonUtils.type(elementFindByXpath("//input[@title='Password']//following::input[1]"), string2);
	}


	@When("Click to create an Account")
	public void click_the_create_an_account() {
		CommonUtils.elementClick(elementFindByXpath("//span[text()='Create an Account'][1]"));
	}

	@Then("Created an account Successfully with valid details")
	public void created_an_account_successfully_with_valid_details() {
		log.info("Passed");
		//CommonUtils.browserClose();
	}

	@Then("Verified an Account was not created Successfully")
	public void created_no_account_() {
		log.info("Passed");
		//CommonUtils.browserClose();
		
	}


}
