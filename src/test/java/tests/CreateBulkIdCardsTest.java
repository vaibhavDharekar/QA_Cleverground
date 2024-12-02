// CREATE BULK  ID CARDS
package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.CreateBulkIdCards;


public class CreateBulkIdCardsTest extends BaseTest 																																															

	WebDriver driver;
	CreateBulkIdCards hidcardpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hidcardpage = new CreateBulkIdCards(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }

	
	@Test(priority=1)
	public void CGlogin() {
		hidcardpage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
	}

//	@Test(priority=2)
//	public void ShowInstitudes() {
//		hidcardpage.ShowInstitutes();
//	}	  
	  
//	@Test(priority=3)
//	public void Selectinstitutes() {
//		hidcardpage.Selectinstitutes();
//	}	  
	  
	@Test(priority=2)
	public void ShowRoles() {
		hidcardpage.ShowRoles();
	}	  

	@Test(priority=3)
	public void SelectRoleAdministrator() {
		hidcardpage.SelectRoleAdministrator();
	}
	
	@Test(priority=4)
	public void SelectIDcardModule() {
		hidcardpage.SelectHidcardModule();
	}

	@Test(priority=5)
	public void Showdepartments() {
		hidcardpage.Showdepartments();
	}
	
	@Test(priority=6)
	public void Selectdepartment() {
		hidcardpage.Selectdepartment();
	}
	
	@Test(priority=7)
	public void Showprograms() {
		hidcardpage.Showprograms();
	}
	
	@Test(priority=8)
	public void Selectprogram() {
		hidcardpage.Selectprogram();
	}
	
	@Test(priority=9)
	public void Showyear() {
		hidcardpage.Showyear();
	}
	
	@Test(priority=10)
	public void Selectyear() {
		hidcardpage.Selectyear();
	}
	
	@Test(priority=11)
	public void Showsemester() {
		hidcardpage.Showsemester();
	}
	
	@Test(priority=12)
	public void Selectsemester() {
		hidcardpage.Selectsemester();
	}
	
	@Test(priority=13)
	public void Showbatches() {
		hidcardpage.Showbatches();
	}

	@Test(priority=14)
	public void Selectbatch() {
		hidcardpage.Selectbatch();
	}
	
	@Test(priority=15)
	public void Createbulk() {
		hidcardpage.Createbulk();
	}
	
	@Test(priority=16)
	public void okbtn() throws InterruptedException {
		
		hidcardpage.okbtn();
	}
	
	@Test(priority=17)
	public void viewStudentsInfo(){
		hidcardpage.viewStudentsInfo();
	}
	
	@Test(priority=18)
	public void fullName(){
		hidcardpage.fullName("Student Name");
	}
	
	@Test(priority=19)
	public void uploadImage(){
		hidcardpage.uploadImage("C:\\Users\\Asus\\Desktop\\id.png");
	}
	
	@Test(priority=20)
	public void saveBtn(){
		hidcardpage.saveBtn();
	}

	

}

