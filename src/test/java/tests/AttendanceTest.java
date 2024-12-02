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
import pages.Attendance;
public class AttendanceTest extends BaseTest {
	
	WebDriver driver;
	Attendance attendancepage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        attendancepage = new Attendance(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }
//	SCENARIO 1
	@Test(priority=-2)
	public void CGlogin() throws InterruptedException {
		attendancepage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
		Thread.sleep(5000);;
	}

	@Test(priority=-1)
	public void ShowInstitute() throws InterruptedException{
		Thread.sleep(1000);
		attendancepage.ShowInstitutes();
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void SelectInstitute() {
		attendancepage.Selectinstitutes();
	}
  	 
	@Test(priority=2)
	public void ShowRoles() {
		attendancepage.ShowRoles();
	}	
	
	

	@Test(priority=3)
	public void SelectRoleAdministrator() throws InterruptedException {
		attendancepage.SelectRoleAdministrator();
		Thread.sleep(1000);
	}

	@Test(priority=4)
	public void SelectInstituteManagerModule() throws InterruptedException {
		Thread.sleep(1000);
		attendancepage.SelectInstituteManagerModule();
	}
	
	@Test(priority=5)
	public void ManageBatches() {
		attendancepage.ManageBatches();
	}
	
	@Test(priority=6)
	public void SelectBatch() {
		attendancepage.SelectBatch();
	}
	
	@Test(priority=7)
	public void RollNumbers() {
		attendancepage.RollNumbers();
	}
	
	@Test(priority=8)
	public void EnableDisable() {
		attendancepage.EnableDisable();
	}
	
	@Test(priority=9)
	public void EnableDisableOk1() {
		attendancepage.EnableDisableOk1();
	}
	
	@Test(priority=10)
	public void EnableDisableOk2() throws InterruptedException {
		attendancepage.EnableDisableOk2();
	}
	
	@Test(priority=11)
	public void ResetAllRollNo() {
	    attendancepage.ResetAllRollNo();
	}

	@Test(priority=13)
	public void RollNumberPrefix() {
	    attendancepage.RollNumberPrefix("");
	}

	@Test(priority=12)
	public void RollNumberStartsFrom() {
	    attendancepage.RollNumberStartsFrom("1");
	}

	@Test(priority=14)
	public void ShowFormatType() {
	    attendancepage.ShowFormatType();
	}

	@Test(priority=15)
	public void SelectedFormatType() {
	    attendancepage.SelectedFormatType();
	}

	@Test(priority=16)
	public void Save() {
	    attendancepage.Save();
	}

	@Test(priority=17)
	public void Ok() throws InterruptedException {
		Thread.sleep(1000);
	    attendancepage.Ok();
	}
	
	@Test(priority=18)
	public void StudentAttendenceManagement() {
	    attendancepage.StudentAttendenceManagement();
	}
	
	@Test(priority=19)
	public void Lectures() {
	    attendancepage.Lectures();
	}

	@Test(priority=20)
	public void DownloadReportsBtn() {
	    attendancepage.DownloadReportsBtn();
	}

	@Test(priority=21)
	public void BasicStartDate() throws InterruptedException {
		Thread.sleep(1000);	
		attendancepage.BasicStartDate();
		Thread.sleep(1000);
	}

	@Test(priority=22)
	public void SelectedStartDate() throws InterruptedException {
		Thread.sleep(1000);
	    attendancepage.SelectedStartDate();
	    Thread.sleep(1000);
	}

	@Test(priority=23)
	public void BasicEndDate() throws InterruptedException {
		Thread.sleep(1000);
	    attendancepage.BasicEndDate();
	    Thread.sleep(1000);
	}
	
	@Test(priority=24)
	public void SelectedEndDate() throws InterruptedException {
		Thread.sleep(1000);
	    attendancepage.SelectedEndDate();
	    Thread.sleep(1000);
	}

	@Test(priority=25)
	public void Downloadcsv() {
	    attendancepage.Downloadcsv();
	}

	@Test(priority=26)
	public void View() throws InterruptedException {
		Thread.sleep(1000);
	
	    attendancepage.View();
	    Thread.sleep(1000);
	}

	@Test(priority=27)
	public void ViewLectureReport() {
	    attendancepage.ViewLectureReport();
	}

	@Test(priority=28)
	public void CloseReport() {
	    attendancepage.CloseReport();
	}
	
	@Test(priority=29)
	public void TeachingPlan() {
	    attendancepage.TeachingPlan();
	}
	
	@Test(priority=30)
	public void CloseTeachingPlan() {
	    attendancepage.CloseTeachingPlan();
	}

	@Test(priority=31)
	public void GridAttendence() {
	    attendancepage.GridAttendence();
	}

	@Test(priority=32)
	public void SelectRollNo1() {
	    attendancepage.SelectRollNo1();
	}

	@Test(priority=33)
	public void SelectRollNo2() {
	    attendancepage.SelectRollNo2();
	}

	@Test(priority=34)
	public void CloseGridAttendence() {
	    attendancepage.CloseGridAttendence();
	}

	@Test(priority=35)
	public void MarkAllAs() {
	    attendancepage.MarkAllAs();
	}

	@Test(priority=36)
	public void AlphabeticalOrder() {
	    attendancepage.AlphabeticalOrder();
	}
	
//	@Test(priority=37)
//	public void Feedback() {
//	    attendancepage.Feedback();
//	}
//	
//	@Test(priority=38)
//	public void Back() {
//	    attendancepage.Back();
//	}


	
	
	



	




}
