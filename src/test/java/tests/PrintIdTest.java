// Download/print id card
package tests;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import Utils.TestUtils;
import pages.PrintId;
public class PrintIdTest extends BaseTest {
	
	WebDriver driver;
	PrintId idcard1page;
	TestUtils utils;


    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        idcard1page = new PrintId(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }
//	SCENARIO 1
	@Test(priority=1)
	public void CGlogin() {
		idcard1page.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
	}
  	  
	@Test(priority=2)
	public void ShowRoles() {
		idcard1page.ShowRoles();
	}	  

	@Test(priority=3)
	public void SelectRoleAdministrator() {
		idcard1page.SelectRoleAdministrator();
	}
	
	@Test(priority=4)
	public void SelectIDcardModule() {
		idcard1page.SelectIDcardModule();
	}

	
	@Test(priority=5)
	public void SearchByName() throws InterruptedException {
		idcard1page.SearchByName("Vaibhav");
		Thread.sleep(1000);
	}
	
	@Test(priority=6)
	public void View() throws InterruptedException {
		idcard1page.View();
		Thread.sleep(1000);
	}
	
//	@Test(priority=7)
//	public void SC() throws InterruptedException {
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sc1 = ts.getScreenshotAs(OutputType.FILE);
//		
//	}

	@Test(priority=8)
	public void Print1() throws InterruptedException {
		idcard1page.Print1();
		Thread.sleep(1000);
	}

	@Test(priority=9)
	public void Print2() throws InterruptedException {
		idcard1page.Print2();
		Thread.sleep(1000);
	}
	




}
