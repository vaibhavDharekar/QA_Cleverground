package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utils.TestUtils;

import pages.Elogbooks2; 

@Listeners(listeners.ExtentTestNGReportListener.class)
public class ElogbooksTest2 extends BaseTest {
	WebDriver driver;
	Elogbooks2 Elogbookspage; 
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Elogbookspage = new Elogbooks2(driver); // Initialize Calendar page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
		Elogbookspage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
		Thread.sleep(5000);
		System.out.println("I have Login Successfully");
	}

    
    @BeforeMethod
    public void Scenario_1() {
    }

	//Scenario = 1 I am able to navigate Create Event Page and Create Event Type.
    
	

	@Test(priority=1)
	public void Showinstitude() {
		Elogbookspage.Showinstitude();
	}	  
	  
	@Test(priority=2)
	public void Selectinstitude() {
		Elogbookspage.Selectinstitude();
	}	  
	  
	@Test(priority=3)
	public void ShowRole() {
		Elogbookspage.ShowRole();
	}	  

	@Test(priority=4)
	public void SelectRole() {
		Elogbookspage.SelectRole();
	}	
	
	@Test(priority=5)
	public void SelectElogbooks() throws InterruptedException {
		
		
		Elogbookspage.SelectElogbooks();
	}
	
	@Test(priority = 241)
	public void View() {
	    Elogbookspage.View();
	}

	@Test(priority = 242)
	public void ViewGuide() {
	    Elogbookspage.ViewGuide();
	}

	@Test(priority = 243)
	public void GuideBack() {
	    Elogbookspage.GuideBack();
	}

	@Test(priority = 244)
	public void ViewElogbookCover() {
	    Elogbookspage.ViewElogbookCover();
	}

	@Test(priority = 245)
	public void Back() {
	    Elogbookspage.Back();
	}

	@Test(priority = 246)
	public void Manage() {
	    Elogbookspage.Manage();
	}

	@Test(priority = 247)
	public void View2() {
	    Elogbookspage.View2();
	}

	@Test(priority = 248)
	public void Edit() {
	    Elogbookspage.Edit();
	}

	@Test(priority = 249)
	public void text() {
	    Elogbookspage.text("12345"); // Ensures input is provided for this method
	}

	// @Test(priority = 250)
	// public void UploadImage() {
//	     Elogbookspage.UploadImage("C:\\Users\\Asus\\Desktop\\download1.jpg"); // Path provided for image upload
	// }

	@Test(priority = 251)
	public void ShowAssessedDropdown() {
	    Elogbookspage.ShowAssessedDropdown();
	}

	@Test(priority = 252)
	public void SelectAssessedDropdown() throws InterruptedException {
	    Thread.sleep(3000);
	    Elogbookspage.SelectAssessedDropdown();
	}

	// @Test(priority = 253)
	// public void OKBtn() {
//	     Elogbookspage.OKBtn();
	// }

	@Test(priority = 254)
	public void SubmitForm() {
	    Elogbookspage.SubmitForm();
	}

	@Test(priority = 255)
	public void OKBtn2() {
	    Elogbookspage.OKBtn();
	}

	@Test(priority = 256)
	public void Back2() {
	    Elogbookspage.Back();
	}

	@Test(priority = 257)
	public void AutomationTestingBack() {
	    Elogbookspage.AutomationTestingBack();
	}

	@Test(priority = 258)
	public void Communication() {
	    Elogbookspage.Communication();
	}

	@Test(priority = 259)
	public void EnterTimeline() {
	    Elogbookspage.EnterTimeline("Hi student"); // Sample text input for timeline
	}

	@Test(priority = 260)
	public void Post() {
	    Elogbookspage.Post();
	}

	@Test(priority = 261)
	public void OKBtn3() throws InterruptedException {
	    Thread.sleep(3000);
	    Elogbookspage.OKBtn();
	}

	@Test(priority = 262)
	public void Back3() {
	    Elogbookspage.Back();
	}
}