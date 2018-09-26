package com.mvn.bdd;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webPages.HomePage;
import webPages.LoginPage;

public class SampleLogin1 extends Reports {

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suuresh\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://q4-testh.aviall.com/aviallstorefront/");
		driver.manage().window().maximize();
	}

	@Given("^Click on Login$")
	public void click_on_Login() {

		// Create object of HomePage Class
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.getLoginButton().click();
	}

	@When("^I Entered Username and Password$")
	public void i_Entered_Username_and_Password() {

		// Create object of LoginPage Class
		LoginPage login = new LoginPage(driver);

		login.userName.sendKeys("agusta@helipar.net");
		login.getPassword().sendKeys("Aviall321");
	}

	@When("^Clicked on Submit$")
	public void clicked_on_Submit() {

		// Create object of LoginPage Class
		LoginPage login = new LoginPage(driver);

		login.getSubmitbtn().click();
		
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("1")).click();
		} catch (Exception e) {
			
		}
		waitForPageLoaded();
		
	}

	@When("^I Entered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_Entered_and(String arg1, String arg2) throws Throwable {

		// Create object of LoginPage Class
		LoginPage login = new LoginPage(driver);
		
		login.userName.sendKeys(arg1);
		login.getPassword().sendKeys(arg2);
	}

	@Then("^I validate the User Credentials$")
	public void i_validate_the_User_Credentials() {

		Assert.assertTrue(driver.getTitle().contains("Aircraft"));
	}
	
	@Then("^I Logout From the Application$")
	public void signOut() {

		LoginPage login = new LoginPage(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", login.getLogoutbtn());
		driver.close();

	}

}
