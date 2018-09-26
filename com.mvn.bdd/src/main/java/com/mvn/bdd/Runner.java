package com.mvn.bdd;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/resources/Features",
		monochrome = true
		)
public class Runner extends Reports {

	
}


