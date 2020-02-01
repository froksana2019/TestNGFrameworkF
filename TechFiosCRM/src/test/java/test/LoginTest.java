package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	
	public void loginTest() {
		
		WebDriver driver = BrowserFactory.startBrowser("http://techfios.com/test/billing/?ng=admin/");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("techfiosdemo@gmail.com", "abc123");
		DashBoardPage dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardPage.waitForPage();
		dashboardPage.clickAddDeposit();
		
		Assert.assertTrue("success msg did not show", condition);
	}
	

}
