package com.forzo.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.java.common.CommonUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends CommonUtils {

	@Before
	public void before() {
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
		CommonUtils.navigateUrl("https://magento.softwaretestingboard.com/");
	}

	
		@After
		public void tearDown(Scenario scenario) throws IOException {
		    if (scenario.isFailed()) {
		    
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			File path = new File("Z:\\Failed Test Case\\srs.png");
			FileHandler.copy(file, path);
		
		    }
			
		}
	

//	@After 
//	public void after() {
//		//CommonUtils.browserClose();
	


}
