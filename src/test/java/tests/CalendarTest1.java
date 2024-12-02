package tests;

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
public class CalendarTest1 extends BaseTest {
	WebDriver driver;
	Calendar1 calendarpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        calendarpage = new Calendar1(driver); // Initialize Calendar1 page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }

	
	@Test(priority=1)
	public void CGlogin() {
		calendarpage.CGlogin("rahul.mali@cleverground.com", "Rahul123@");
	}

	@Test(priority=2)
	public void ShowInstitudes() {
		calendarpage.ShowInstitudes();
	}	  
	  
	@Test(priority=3)
	public void Selectinstitudes() {
		calendarpage.Selectinstitudes();
	}	  
	  
	@Test(priority=4)
	public void ShowRoles() {
		calendarpage.ShowRoles();
	}	  

	@Test(priority=5)
	public void SelectRoles() {
		calendarpage.SelectRoles();
	}	  
	  
	@Test(priority=6)
	public void calendar() {
		calendarpage.Calendar();
	}
	
	@Test(priority=7)
	public void ListView() {
		calendarpage.ListView();
	}
	 @Test(priority=8)
	 public void View() {
		 calendarpage.View();
	 }
     @Test(priority=9)
     public void View1() {
       calendarpage.View1();
}
     
     @Test(priority=10)
     public void DownloadProgress() {
    	 calendarpage.DownloadProgress();
     }
     @AfterClass
   public void tearDown() {
       driver.quit();
   }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	