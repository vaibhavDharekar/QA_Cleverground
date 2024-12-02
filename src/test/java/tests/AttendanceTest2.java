// Download/print id card
package tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.Attendance2;
public class AttendanceTest2 extends BaseTest {
	
	WebDriver driver;
	Attendance2 attendancepage;
	TestUtils utils;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        attendancepage = new Attendance2(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }
//	SCENARIO 1
	@Test(priority=1)
	public void CGlogin() {
		attendancepage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
	}
	
	@Test(priority=2)
	public void ShowInstitute(){
		attendancepage.ShowInstitutes();
	}
	
	@Test(priority=3)
	public void SelectInstitute() {
		attendancepage.Selectinstitutes();
	}
  	 
//	@Test(priority=2)
//	public void ShowRoles() {
//		attendancepage.ShowRoles();
//	}	
//	
//	
//
//	@Test(priority=3)
//	public void SelectRoleAdministrator() {
//		attendancepage.SelectRoleAdministrator();
//	}
//	
//	@Test(priority=4)
//	public void SelectInstituteManagerModule() {
//		attendancepage.SelectInstituteManagerModule();
//	}
//	
//	@Test(priority=5)
//	public void ManageBatches() {
//		attendancepage.ManageBatches();
//	}
//	
//	@Test(priority=6)
//	public void SelectBatch() {
//		attendancepage.SelectBatch();
//	}
//	
//	@Test(priority=7)
//	public void RollNumbers() {
//		attendancepage.RollNumbers();
//	}
//	
//	@Test(priority=8)
//	public void EnableDisable() {
//		attendancepage.EnableDisable();
//	}
//	
//	@Test(priority=9)
//	public void EnableDisableOk1() {
//		attendancepage.EnableDisableOk1();
//	}
//	
//	@Test(priority=10)
//	public void EnableDisableOk2() throws InterruptedException {
//		attendancepage.EnableDisableOk2();
//	}
//	
//	@Test(priority=11)
//	public void ResetAllRollNo() {
//	    attendancepage.ResetAllRollNo();
//	}
//
//	@Test(priority=13)
//	public void RollNumberPrefix() {
//	    attendancepage.RollNumberPrefix("Hello");
//	}
//
//	@Test(priority=12)
//	public void RollNumberStartsFrom() {
//	    attendancepage.RollNumberStartsFrom("501");
//	}
//
//	@Test(priority=14)
//	public void ShowFormatType() {
//	    attendancepage.ShowFormatType();
//	}
//
//	@Test(priority=15)
//	public void SelectedFormatType() {
//	    attendancepage.SelectedFormatType();
//	}
//
//	@Test(priority=16)
//	public void Save() {
//	    attendancepage.Save();
//	}
//
//	@Test(priority=17)
//	public void Ok() {
//	    attendancepage.Ok();
//	}



	




}
