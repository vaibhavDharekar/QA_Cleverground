package tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.NotReadyToReady;
public class NotReadyToReadyTest extends BaseTest {

	WebDriver driver;
	NotReadyToReady idcard1page;
	TestUtils utils;
	
 @BeforeTest
 public void setup() {
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://master.cleverground.com/#/login");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     idcard1page = new NotReadyToReady(driver); // Initialize Awards page here to avoid reinitializing in each test
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
	public void view(){
		idcard1page.view();
	}
	
	@Test(priority=7)
	public void view2(){
		idcard1page.view2();
	}
	
	@Test(priority=8)
	public void uploadImage(){
		idcard1page.UploadImage("C:\\Users\\Asus\\Desktop\\id.png");
	}
	
	@Test(priority=9)
	public void fullName(){
		idcard1page.fullName("Vaibhav Dharekar");
	}

	@Test(priority=10)
	public void departmentName(){
		idcard1page.departmentName("Testing");
	}
	
	@Test(priority=11)
	public void rollNum(){
		idcard1page.rollNum("12345");
	}
	
	@Test(priority=12)
	public void phoneNo(){
		idcard1page.phoneNo("1234567890");
	}
	@Test(priority=13)
	public void parentNo(){
		idcard1page.parentNo("1234567890");
	}
	
	@Test(priority=14)
	public void dob(){
		idcard1page.dob();
	}
	
	@Test(priority=15)
	public void selectedDOB(){
		idcard1page.SelectedDOB();
	}
	
	@Test(priority=16)
	public void bloodGroup(){
		idcard1page.bloodGroup("AB+");
	}

	
	@Test(priority=17)
	public void isNotReadyForPrint() throws InterruptedException {
		idcard1page.isNotReadyForPrint();
		Thread.sleep(1000);
	}
	
	
	
//	@Test(priority=6)
//	public void View() throws InterruptedException {
//		idcard1page.View();
//		Thread.sleep(1000);
//	}
//
//	@Test(priority=7)
//	public void Print1() throws InterruptedException {
//		idcard1page.Print1();
//		Thread.sleep(1000);
//	}
//
//	@Test(priority=8)
//	public void Print2() throws InterruptedException {
//		idcard1page.Print2();
//		Thread.sleep(1000);
//	}
	




}
