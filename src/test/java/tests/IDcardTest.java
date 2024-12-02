package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.IDcard;

public class IDcardTest extends BaseTest {
	
	WebDriver driver;
	IDcard idcardpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        idcardpage = new IDcard(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }

	
	@Test(priority=1)
	public void CGlogin() {
		idcardpage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
	}

//	@Test(priority=2)
//	public void ShowInstitudes() {
//		idcardpage.ShowInstitutes();
//	}	  
	  
//	@Test(priority=3)
//	public void Selectinstitutes() {
//		idcardpage.Selectinstitutes();
//	}	  
	  
	@Test(priority=2)
	public void ShowRoles() {
		idcardpage.ShowRoles();
	}	  

	@Test(priority=3)
	public void SelectRoleAdministrator() {
		idcardpage.SelectRoleAdministrator();
	}
	
	@Test(priority=4)
	public void SelectIDcardModule() {
		idcardpage.SelectIDcardModule();
	}
	
//	UP TO ENTERING THE ID CARD MODULE
	
	

}

