package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.IDCard_;

@Listeners(listeners.ExtentTestNGReportListener.class)
public class IDCardTest_ {

	
	WebDriver driver;
	IDCard_ IDCardpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        IDCardpage = new IDCard_(driver); // Initialize Calendar page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
		IDCardpage.CGlogin("mayur@cleverground.com", "Patil6319");
		Thread.sleep(5000);
		System.out.println("I have Login Successfully");
	}

    
    @BeforeMethod
    public void Scenario_1() {
    }

	
    
	

	@Test(priority=1)
	public void ShowInstitudes() {
		IDCardpage.ShowInstitudes();
	}	  
	  
	@Test(priority=2)
	public void Selectinstitudes() {
		IDCardpage.Selectinstitudes();
	}	  
	  
	@Test(priority=3)
	public void ShowRoles() {
		IDCardpage.ShowRoles();
	}	  

	@Test(priority=4)
	public void SelectRoles() {
		IDCardpage.SelectRoles();
	}
	
	@Test(priority = 5)
	public void IDCardModule() {
		IDCardpage.IDCardModule();
	}
	
	@Test(priority = 6)
	public void ShowDep() {
		IDCardpage.ShowDep();
	}
	
	@Test(priority = 7)
	public void SelectDep() {
		IDCardpage.SelectDep();
	}
	
	@Test(priority = 8)
	public void ShowPro() {
		IDCardpage.ShowPro();
	}
	
	@Test(priority = 9)
	public void SelectPro() {
		IDCardpage.SelectPro();
	}
	
	@Test(priority = 10)
	public void ShowYear() {
		IDCardpage.ShowYear();
	}
	
	@Test(priority = 11)
	public void SelectYear() {
		IDCardpage.SelectYear();
	}
	
	@Test(priority = 12)
	public void ShowSem() {
		IDCardpage.ShowSem();
	}
	
	@Test(priority = 13)
	public void SelectSem() {
		IDCardpage.SelectSem();
	}

	@Test(priority = 14)
	public void ShowBatch() {
		IDCardpage.ShowBatch();
	}
	
	@Test(priority = 15)
	public void SelectBatch() {
		IDCardpage.SelectBatch();
	}
	
	@Test(priority = 16)
	public void CreateBulkCardPopupOk() {
		IDCardpage.CreateBulkCardPopupOk();
	}
	
	@Test(priority = 17)
	public void ViewStudent() {
		IDCardpage.ViewStudent();
	}
	
	@Test(priority = 18)
	public void StudentPhoto() {
		IDCardpage.StudentPhoto("C:\\Users\\Lenovo\\Downloads\\Image.jpg");
	}
	
	@Test(priority = 19)
	public void FullName() {
		IDCardpage.FullName();
	}
	
	@Test(priority = 20)
	public void DeptName() {
		IDCardpage.DeptName();
	}
	
	@Test(priority = 21)
	public void RollNo() {
		IDCardpage.RollNo();
	}
	
	@Test(priority = 22)
	public void PhoneNo() {
		IDCardpage.PhoneNo();
	}
	
	@Test(priority = 23)
	public void ParentNo() {
		IDCardpage.ParentNo();
	}
	
	@Test(priority = 24)
	public void DOB() {
		IDCardpage.DOB();
	}
	
	@Test(priority = 25)
	public void BloodGroup() {
		IDCardpage.BloodGroup();
	}
	
	@Test(priority = 26)
	public void SaveBtn() {
		IDCardpage.SaveBtn();
		System.out.println("Double Click");
	}
	
	@Test(priority = 27)
	public void PrintIDCards() {
		IDCardpage.PrintIDCards();
	}
	
	@Test(priority = 28)
	public void Print() {
		IDCardpage.Print();
		System.out.println("Double Click ");
	}
	
	
//	@Test(priority = 6)
//	public void SelectTemplateTab() {
//		IDCardpage.SelectTemplateTab();
//	}
//	
//	@Test(priority = 7)
//	public void SelectTemplate() {
//		IDCardpage.SelectTemplate();
//	}
//	
//	@Test(priority = 8)
//	public void SelectViewTemplate() {
//		IDCardpage.SelectViewTemplate();
//	}
//	
//	@Test(priority = 9)
//	public void SelectSmallLogoSquareEdit() {
//		IDCardpage.SelectSmallLogoSquareEdit();
//	}
//	
//	@Test(priority = 10)
//	public void SelectRemovePreviousImage() {
//		IDCardpage.SelectRemovePreviousImage();
//	}
//	
//	@Test(priority = 11)
//	public void UploadImage() throws InterruptedException {
//		IDCardpage.UploadImage("C:\\Users\\Lenovo\\Downloads\\image13.jpg");
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority = 12)
//	public void ImageSaveBtn() throws InterruptedException {
//		IDCardpage.ImageSaveBtn();
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority = 13)
//	public void ScrollDowntoBackView() {
//		IDCardpage.ScrollDowntoBackView();
//	}
	
	@Test(priority = 14)
	public void SelectBigLogoRectangleEdit() {
		IDCardpage.SelectBigLogoRectangleEdit();
	}
	
	@Test(priority = 15)
	public void SelectRemovePreviousImage2() {
		IDCardpage.SelectRemovePreviousImage2();
	}
	
////	@Test(priority = 16)
////	public void UploadImage2() throws InterruptedException {
////		IDCardpage.UploadImage2("C:\\Users\\Lenovo\\Downloads\\image13.jpg");
////		Thread.sleep(5000);
////	}
////	
////	@Test(priority = 17)
////	public void ImageSaveBtn2() {
////		IDCardpage.ImageSaveBtn2();
////	}
//	
////	@Test(priority = 18)
////	public void FullNameEdit() {
////		IDCardpage.FullNameEdit();
////	}
////	
////	@Test(priority = 19)
////	public void ShowFullNames() {
////		IDCardpage.ShowFullNames();
////	}
////	
////	@Test(priority = 20)
////	public void SelectFullNames() {
////		IDCardpage.SelectFullNames();
////	}
////	
////	@Test(priority = 21)
////	public void SaveFullNames() {
////		IDCardpage.SaveFullNames();
////	}
//	
//	@Test(priority = 22)
//	public void EnterBackText_Upper() {
//		IDCardpage.EnterBackText_Upper();
//	}
//	
//	@Test(priority = 23)
//	public void EditBackText_Upper() {
//		IDCardpage.EditBackText_Upper();
//	}
//	
//	@Test(priority = 24)
//	public void SaveBackText_Upper() {
//		IDCardpage.SaveBackText_Upper();
//	}
//	
//	@Test(priority = 25)
//	public void EditBackText_Lower() {
//		IDCardpage.EditBackText_Lower();
//	}
//	
//	
//	@Test(priority = 26)
//	public void EnterBackText_Lower() {
//		IDCardpage.EnterBackText_Lower();
//	}
//	
//	
//	@Test(priority = 27)
//	public void SaveBackText_Lower() {
//		IDCardpage.SaveBackText_Lower();
//	}
	
	@AfterMethod
	public void Scenario_1comp() {
	}
	
	
	
}
