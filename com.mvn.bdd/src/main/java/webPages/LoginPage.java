package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mvn.bdd.Reports;

public class LoginPage extends Reports {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="j_username")
	public WebElement userName;
	
	@FindBy(how=How.CSS,using="#loginpassword")
	WebElement password;
	
	public WebElement getPassword() {
		
		return password;
	}
	
	@FindBy(how=How.CSS,using="#submitbtn")
	WebElement submitbtn;
	
	public WebElement getSubmitbtn() {
		
		return submitbtn;
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Log Out')]")
	WebElement logout;
	
	public WebElement getLogoutbtn() {
		
		return logout;
	}
	
	
	
	
	
	
	

}
