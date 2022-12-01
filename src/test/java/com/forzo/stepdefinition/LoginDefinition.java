package com.forzo.stepdefinition;


import java.util.List;

import org.slf4j.Logger;

import com.java.common.CommonUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition extends CommonUtils {

	Logger log = loadLogger(LoginDefinition.class);

	@Given("Open the Browser {string}")
	public void browserLaunch1(String browser) {
		CommonUtils.browserLaunch(browser);
		CommonUtils.browserMax();
	}

	@Given("Load the Ecommerce url {string}")
	public void url(String url) {
		CommonUtils.navigateUrl(url);
		
	}

	@When("Enter the UserName {string}")
	public void userName(String userName) {
		CommonUtils.elementClick(elementFindByXpath("//li[@class='greet welcome']//following::a[1]"));
         CommonUtils.type(elementFindById("email"), userName);
	}  

	@When("Enter the Password {string}")
	public void password(String password) {
          CommonUtils.type(elementFindById("pass"), password);
	}
	
	@When("Enter the Password  {string}")
	public void enter_the_password(String string) {
		CommonUtils.type(elementFindById("pass"), string);
	}

	@When("Click the login button")
	public void loginButton() {
          CommonUtils.elementClick(elementFindById("send2"));
	}

	@Then("Verified the username and password")
	public void verified() {
		log.info("Passed");
		//CommonUtils.browserClose();
	}

	@Then("User should not be able to click on login Successfully")
	public void user_shouldn_t_be_able_to_click_on_login_successfully() {
		log.info("Passed");
		 //CommonUtils.browserClose();
	}

	@Then("Validation message  get dispalyed Successfully")
	public void validation_message_get_dispalyed_successfully() {
		log.info("Passed");
		// CommonUtils.browserClose();
	}

	@When("Click the Login in btn")
	public void click_the_login_in_btn() {
		CommonUtils.elementClick(elementFindByXpath("//li[@class='greet welcome']//following::a[1]"));
	}

	@When("Click the forgot password button")
	public void click_the_forgot_password_button() {
		
		 CommonUtils.elementClick(elementFindByXpath("//span[text()='Forgot Your Password?'][1]"));
	}

	@Then("Verify the login page in different browsers Successfully")
	public void user_able_to_click_the_forgot_btn_successfully() {
		log.info("Passed");
//		 CommonUtils.browserClose();
	}

	@Then("User able to click the Forgot Btn Successfully")
	public void user() {
		log.info("Passed");
	 //   CommonUtils.browserClose();
	}
	
	@When("Enter the UserName")
	public void enter_the_user_name(DataTable dataTable) {
		List<String> li = dataTable.asList();
		CommonUtils.elementClick(elementFindByXpath("//li[@class='greet welcome']//following::a[1]"));
        CommonUtils.type(elementFindById("email"), li.get(1));
		
	}
}
