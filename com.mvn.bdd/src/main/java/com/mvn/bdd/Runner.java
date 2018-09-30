package com.mvn.bdd;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/resources/Features",
		glue = {"salesForceTrail"},		
		tags = {"@SalesForce"},
		plugin = {"pretty","html:target/cucumber",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		monochrome = true
		)
public class Runner{
	
	@AfterClass
	public static void tearDown() {
		
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("user",System.getProperty("user.dir"));
		Reporter.setTestRunnerOutput("Sales Force Trail Version");
	}

	
}


