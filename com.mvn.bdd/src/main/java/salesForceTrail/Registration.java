package salesForceTrail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mvn.bdd.Reports;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration extends Reports {
	
	ArrayList<String> tabs;
	
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suuresh\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^I Was In Sales Force Home Page$")
	public void i_Was_In_Sales_Force_Home_Page() {

		driver.get("https://www.salesforce.com/in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			driver.switchTo().activeElement();
			driver.findElement(By.xpath("//*[contains(text(),'NO THANKS')]")).click();
		} catch (Exception e) {
			System.out.println("Welcome Msg is Not displayed");
		}
	}

	@Given("^Click on Try For Free$")
	public void click_on_Try_For_Free() {

		driver.findElement(By.xpath("//div[@class='free-trial-container']")).click();

	}

	@When("^I Navigate to Registration Page$")
	public void i_Navigate_to_Registration_Page() {

		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@Then("^Fill All Mandatory Details$")
	public void fill_All_Mandatory_Details(DataTable table) {

		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		driver.findElement(By.id("UserFirstName")).sendKeys(data.get(0).get("FirstName"));
		driver.findElement(By.id("UserLastName")).sendKeys(data.get(0).get("LastName"));
		driver.findElement(By.id("UserEmail")).sendKeys(data.get(0).get("Email"));
		driver.findElement(By.id("UserPhone")).sendKeys(data.get(0).get("PhoneNum"));
		driver.findElement(By.id("CompanyName")).sendKeys(data.get(0).get("Company"));
		/*new Select(driver.findElement(By.xpath("//select[@id='UserTitle']")))
		.selectByVisibleText("Operations Manager");*/
		driver.switchTo().window(tabs.get(1)).close();
	}

}
