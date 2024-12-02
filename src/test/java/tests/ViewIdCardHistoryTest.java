package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.ViewIdCardHistroy;

public class ViewIdCardHistoryTest extends BaseTest {

	WebDriver driver;
	ViewIdCardHistroy idcardpage;
	TestUtils utils;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        idcardpage = new ViewIdCardHistroy(driver); // Initialize Awards page here to avoid reinitializing in each test
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
	
	@Test(priority=5)
	public void SearchByName() throws InterruptedException {
		idcardpage.SearchByName("Vaibhav");
		Thread.sleep(1000);
	}
	
	@Test(priority=6)
	public void IsReadyForPrint() {
		idcardpage.IsReadyForPrint();
	}
	
	
//	UP TO ENTERING THE ID CARD MODULE
	


}

