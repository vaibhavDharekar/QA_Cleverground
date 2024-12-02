package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;

import Utils.TestUtils;
//import pages.Calendar1;
import pages.Calendar1;

@Listeners(listeners.ExtentTestNGReportListener.class)
public class CalendarStudentTest extends BaseTest {
	WebDriver driver;
	Calendar1 calendarStudentpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        calendarStudentpage = new Calendar1(driver); // Initialize Calendar1 page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }

	
	@Test(priority=1)
	public void CGlogin() {
		calendarStudentpage.CGlogin("rahul.mali@cleverground.com", "Rahul123@");
	}

	@Test(priority=2)
	public void ShowInstitudes() {
		calendarStudentpage.ShowInstitudes();
	}	  
	  
	@Test(priority=3)
	public void Selectinstitudes() {
		calendarStudentpage.Selectinstitudes();
	}	  
	  
	@Test(priority=4)
	public void ShowRoles() {
		calendarStudentpage.ShowRoles();
	}	  

	@Test(priority=5)
	public void SelectRoles() {
		calendarStudentpage.SelectRoles();
	}	  
	  
	@Test(priority=6)
	public void calendar() {
		calendarStudentpage.Calendar();
	}
	
	@Test(priority=7)
	public void ListView() {
		calendarStudentpage.ListView();
	}
	 @Test(priority=8)
	 public void View() {
		 calendarStudentpage.View();
	 }
     @Test(priority=9)
     public void View1() {
       calendarStudentpage.View1();
      }
     
     @Test(priority=10)
     public void DownloadProgress() {
    	 calendarStudentpage.DownloadProgress();
     }
     
	@AfterClass
   public void tearDown() {
       driver.quit();
   }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	