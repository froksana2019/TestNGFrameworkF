package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.ID, using= "username") WebElement Email;

	@FindBy(how = How.ID, using ="password") WebElement Password;
	@FindBy(how = How.NAME, using= "login") WebElement Signin;
	
	public void login(String name, String pwd) {
		
		Email.sendKeys(name);
		Password.sendKeys(pwd);
		Signin.click();
		
	}

}
