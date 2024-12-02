package tests;

import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.SpaceManagement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class SpaceManagementTest extends BaseTest{
	
	WebDriver driver;
	SpaceManagement SpaceManagementpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        SpaceManagementpage = new SpaceManagement(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }
    
    
//	SCENARIO 1
	@Test(priority=0)
	public void CGlogin() {
		SpaceManagementpage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
	}
  	  
	@Test(priority=1)
	public void ShowInstitute() throws InterruptedException {
		SpaceManagementpage.ShowInstitutes();
	}
	
	@Test(priority=3)
	public void SelectInstitute() throws InterruptedException {
		SpaceManagementpage.SelectInstitutes();
	}

	@Test(priority=4)
	public void ShowRoles() {
		SpaceManagementpage.ShowRoles();
	}
	
	@Test(priority=5)
	public void SelectRoleAdministrator() {
		SpaceManagementpage.SelectRoleAdministrator();
	}
	
	@Test(priority=6)
	public void SelectSpaceManagementModule() {
		SpaceManagementpage.SelectSpaceManagementModule();
	}
	
	@Test(priority=7)
	public void SelectCreateNewSpace() {
		SpaceManagementpage.SelectCreateNewSpace();
	}
	
	@Test(priority=8)
	public void EnterSpaceName()throws InterruptedException {
		SpaceManagementpage.EnterSpaceName("Space123456");
	}
	
	@Test(priority=9)
	public void ShowSpaceType()throws InterruptedException {
		SpaceManagementpage.ShowSpaceType();
	}
	
	@Test(priority=10)
	public void SelectSpaceType()throws InterruptedException {
		SpaceManagementpage.SelectSpaceTypeClassroom();
	}
	
	@Test(priority=11)
	public void SpaceCode()throws InterruptedException {
		SpaceManagementpage.SpaceCode("123456");
    }
    
	@Test(priority=12)
    public void SpaceCapacity() throws InterruptedException{
		SpaceManagementpage.SpaceCapacity("50");
    }
	
	@Test(priority = 13)
	public void AddAlbum()throws InterruptedException {
	    SpaceManagementpage.AddAlbum();
	}

	@Test(priority = 14)
	public void CreateSpaceAlbum1()throws InterruptedException {
	    SpaceManagementpage.CreateSpaceAlbum();
	}

	@Test(priority = 15)
	public void Description1() throws InterruptedException{
	    SpaceManagementpage.Description("description");
	}

	@Test(priority = 16)
	public void ClickToUpload11()throws InterruptedException {
	    SpaceManagementpage.ClickToUpload("C:\\Users\\Asus\\Desktop\\download1.jpg");
	}

	@Test(priority = 17)
	public void AddBtn1()throws InterruptedException {
	    SpaceManagementpage.AddBtn();
	}

	@Test(priority = 18)
	public void ConfirmPopupOK1()throws InterruptedException {
	    SpaceManagementpage.ConfirmPopupOK();
	}

	@Test(priority = 19)
	public void CreateSpaceAlbum2() throws InterruptedException{
	    SpaceManagementpage.CreateSpaceAlbum();
	}

	@Test(priority = 20)
	public void Description2()throws InterruptedException {
	    SpaceManagementpage.Description("description");
	}

	@Test(priority = 21)
	public void ClickToUpload12() throws InterruptedException{
	    SpaceManagementpage.ClickToUpload("C:\\Users\\Asus\\Desktop\\download2.jpg");
	}

	@Test(priority = 22)
	public void AddBtn2()throws InterruptedException {
	    SpaceManagementpage.AddBtn();
	}

	@Test(priority = 23)
	public void ConfirmPopupOK2()throws InterruptedException {
	    SpaceManagementpage.ConfirmPopupOK();
	}

	@Test(priority = 24)
	public void CreateSpaceAlbum3()throws InterruptedException {
	    SpaceManagementpage.CreateSpaceAlbum();
	}

	@Test(priority = 25)
	public void Description3()throws InterruptedException {
	    SpaceManagementpage.Description("description");
	}

	@Test(priority = 26)
	public void ClickToUpload13()throws InterruptedException {
	    SpaceManagementpage.ClickToUpload("C:\\Users\\Asus\\Desktop\\download3.jpg");
	}

	@Test(priority = 27)
	public void AddBtn3()throws InterruptedException {
	    SpaceManagementpage.AddBtn();
	}

	@Test(priority = 28)
	public void ConfirmPopupOK3()throws InterruptedException {
	    SpaceManagementpage.ConfirmPopupOK();
	}
	
	@Test(priority = 29)
	public void DeleteImage() throws InterruptedException {
	    SpaceManagementpage.DeleteImage();
	}

	@Test(priority = 30)
	public void DeleteImageOkBtn() throws InterruptedException {
	    SpaceManagementpage.DeleteImageOkBtn();
	}
	
	@Test(priority = 31)
	public void DeleteImageOkBtn2() throws InterruptedException {
	    SpaceManagementpage.Okbtn();
	}

	@Test(priority = 32)
	public void Cancelok3() throws InterruptedException {
	    SpaceManagementpage.Cancelok();
	}

	@Test(priority = 33)
	public void CarpetTotalArea() throws InterruptedException {
	    SpaceManagementpage.CarpetTotalArea("5000");
	}

	@Test(priority = 34)
	public void SpaceTotalArea() throws InterruptedException {
	    SpaceManagementpage.SpaceTotalArea("50000");
	}

	@Test(priority = 35)
	public void ShowUnit() throws InterruptedException {
	    SpaceManagementpage.ShowUnit();
	}

	@Test(priority = 36)
	public void ClickUnitSqfeet() throws InterruptedException {
	    SpaceManagementpage.ClickUnitSqfeet();
	}

	@Test(priority = 37)
	public void Scroll200() throws InterruptedException {
	    SpaceManagementpage.scroll200();
	}

	@Test(priority = 38)
	public void Building() throws InterruptedException {
	    SpaceManagementpage.Building("50");
	}

	@Test(priority = 39)
	public void Floor() throws InterruptedException {
	    SpaceManagementpage.Floor("50");
	}

	@Test(priority = 40)
	public void Event() throws InterruptedException {
	    SpaceManagementpage.Event();
	}

	@Test(priority = 41)
	public void Exam() throws InterruptedException {
	    SpaceManagementpage.Exam();
	}

	@Test(priority = 42)
	public void Lectures() throws InterruptedException {
	    SpaceManagementpage.Lectures();
	}

	@Test(priority = 43)
	public void Savebtn() throws InterruptedException {
	    SpaceManagementpage.Savebtn();
	    Thread.sleep(2000);
	}

	@Test(priority = 44)
	public void Okbtn() throws InterruptedException {
	    SpaceManagementpage.Okbtn();
	}

	@Test(priority = 45)
	public void ViewSpace() throws InterruptedException {
	    SpaceManagementpage.ViewSpace();
	}

	@Test(priority = 46)
	public void EditSpace() throws InterruptedException {
	    SpaceManagementpage.EditSpace();
	}

	@Test(priority = 47)
	public void EnterEditedSpaceName() throws InterruptedException {
	    SpaceManagementpage.EnterSpaceName("SpaceABCD");
	}

//	@Test(priority = 48)
//	public void EditedShowSpaceType() throws InterruptedException {
//	    SpaceManagementpage.ShowSpaceType();
//	}
//
//	@Test(priority = 49)
//	public void EditedSelectSpaceTypeLibrary() throws InterruptedException {
//	    SpaceManagementpage.SelectSpaceTypeLibrary();
//	}

	@Test(priority = 50)
	public void EditedSpaceCode() throws InterruptedException {
	    SpaceManagementpage.SpaceCode("65431");
	}

	@Test(priority = 51)
	public void EditedSpaceCapacity() throws InterruptedException {
	    SpaceManagementpage.SpaceCapacity("60");
	}

	@Test(priority = 52)
	public void EditedCarpetTotalArea() throws InterruptedException {
	    SpaceManagementpage.CarpetTotalArea("6000");
	}

	@Test(priority = 53)
	public void EditedSpaceTotalArea() throws InterruptedException {
	    SpaceManagementpage.SpaceTotalArea("60000");
	}

	@Test(priority = 54)
	public void EditedShowUnit() throws InterruptedException {
	    SpaceManagementpage.ShowUnit();
	}

	@Test(priority = 55)
	public void EditedClickUnitInch() throws InterruptedException {
	    SpaceManagementpage.ClickUnitInch();
	}

	@Test(priority = 56)
	public void EditedBuilding() throws InterruptedException {
	    SpaceManagementpage.Building("100");
	}

	@Test(priority = 57)
	public void EditedFloor() throws InterruptedException {
	    SpaceManagementpage.Floor("70");
	}

	@Test(priority = 58)
	public void EditedExam() throws InterruptedException {
	    SpaceManagementpage.Exam();
	}

	@Test(priority = 59)
	public void EditedSave() throws InterruptedException {
	    Thread.sleep(5000);
	    SpaceManagementpage.Savebtn();
	}

	@Test(priority = 60)
	public void EditedOkbtn() throws InterruptedException {
	    Thread.sleep(5000);
	    SpaceManagementpage.Okbtn();
	    Thread.sleep(2000);
	}
	
	@Test(priority = 61)
	public void Download() throws InterruptedException {
	    SpaceManagementpage.Download();
	}
//	@Test(priority = 61)
//	public void ViewSpace2() throws InterruptedException {
//	    SpaceManagementpage.ViewSpace();
//	}
//	@Test(priority = 62)
//	public void DeleteSpace() throws InterruptedException {
//	    Thread.sleep(5000);
//	    SpaceManagementpage.DeleteSpace();
//	    Thread.sleep(2000);
//	}
//
//	@Test(priority = 63)
//	public void DeleteSpaceOkbtn() throws InterruptedException {
//	    Thread.sleep(5000);
//	    SpaceManagementpage.Okbtn();
//	    Thread.sleep(2000);
//	}	
	

	
	
//  @Test
//  public void f() {
//  }
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//  }

}
