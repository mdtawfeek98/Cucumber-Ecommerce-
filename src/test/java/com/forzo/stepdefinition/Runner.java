package com.forzo.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/Feature",
		                     },
		         glue = "com.forzo.stepdefinition",
		         monochrome= true,
		         plugin = {"html:target/htmlreport","json:target/jsreport",
		        		 "rerun:src/test/resources/failed/failed.txt"
		        		 }
		         )

public class Runner {
	



}
