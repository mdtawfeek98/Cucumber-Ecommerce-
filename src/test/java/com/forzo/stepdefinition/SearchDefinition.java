package com.forzo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import com.java.common.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefinition extends CommonUtils {
	
	Logger log = loadLogger(SearchDefinition.class);

	@When("Enter search text in search field and click on search icon {string}")
	public void searchIcon(String string) {
		WebElement ss = driver.findElement(By.id("search"));
		ss.sendKeys(string);
		ss.submit();
	}

	@When("Enter search text in search field {string}")
	public void enter_search_text_in_search_field(String string) {
	   CommonUtils.type(elementFindById("search"), string);
	}
	
	@When("Click the search field")
	public void entersSearch() {
	   CommonUtils.elementClick(elementFindById("search"));
	}
	
	@Then("Search should be performed according to search text provided by user")
	public void search_should_be_performed_according_to_search_text_provided_by_user() {
		log.info("Passed");
	}
	
	@Then("Search should be not performed according to search text provided by user")
	public void search_should_not_performed() {
		log.info("Passed");
	}
	
	@Then("Searches should be be displayed")
	public void search_should_not_displayed() {
		log.info("Failed");
	}
	
	@Then("AutoSuggestion should be be displayed")
	public void autoSuggestion() {
		log.info("Failed");
	}
	@When("Launch a cursor in search field")
	public void launch_a_cursor_in_search_field() {
		 CommonUtils.elementClick(elementFindById("search"));
	}

	@Then("No action happened successfully")
	public void no_action_needed_successfully() {
	    
	}
	
}
