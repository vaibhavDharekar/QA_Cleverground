// View Id Card History
package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.IDCardHistory;

public class IDCardHistoryTest extends BaseTest {
	
	WebDriver driver;
	IDCardHistory idcardpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        idcardpage = new IDCardHistory(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }

	
	@Test(priority=1)
	public void CGlogin() {
		idcardpage.CGlogin("harshada@cleverground.com", "harshada1819");
	}

	@Test(priority=2)
	public void ShowInstitudes() {
		idcardpage.ShowInstitutes();
	}	  
	  
//	@Test(priority=3)
//	public void Selectinstitutes() {
//		idcardpage.Selectinstitutes();
//	}	  
	  
	@Test(priority=3)
	public void ShowRoles() {
		idcardpage.ShowRoles();
	}	  

	@Test(priority=4)
	public void SelectRoleAdministrator() {
		idcardpage.SelectRoleAdministrator();
	}
	
	@Test(priority=5)
	public void SelectIDcardModule() {
		idcardpage.SelectIDcardModule();
	}
	
	@Test(priority=6)
	public void History() {
		idcardpage.History();
	}
	//scenario1
	@Test(priority=7)
	public void SearchName() {
		idcardpage.SearchName("Harshada");
	}
	
	@Test(priority=8)
	public void view() {
		idcardpage.view();
	}
	
	@Test(priority=9)
	public void back() {
		idcardpage.back();
	}
	
	
	
	
	
	
	//scenario2
	@Test(priority=10)
	public void Showdepartments() {
		idcardpage.Showdepartments();
	}
	
	@Test(priority=11)
	public void Selectdepartment() {
		idcardpage.Selectdepartment();
	}
	
	@Test(priority=12)
	public void Showprograms() {
		idcardpage.Showprograms();
	}
	
	@Test(priority=13)
	public void Selectprogram() {
		idcardpage.Selectprogram();
	}
//	
	@Test(priority=14)
	public void Showyear() {
		idcardpage.Showyear();
	}
	
	@Test(priority=15)
	public void Selectyear() {
		idcardpage.Selectyear();
	}
//	
	@Test(priority=16)
	public void Showsemester() {
		idcardpage.Showsemester();
	}
	
	@Test(priority=17)
	public void Selectsemester() {
		idcardpage.Selectsemester();
	}
//	
	@Test(priority=18)
	public void Showbatches() {
		idcardpage.Showbatches();
	}
	
	@Test(priority=19)
	public void Selectbatch() {
		idcardpage.Selectbatch();
	}
	
	@Test(priority=20)
	public void viewbtn() {
		idcardpage.viewbtn();
	}
	
	@Test(priority=21)
	public void goback() {
		idcardpage.goback();
	}
	
	
	
	
	
//	
//	//scenario3
//	@Test(priority=22)
//	public void viewbt() {
//		idcardpage.viewbt();
//	}	
	
	
}
	