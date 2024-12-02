package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utils.TestUtils;
//import pages.Calendar;
import pages.Calendar;

@Listeners(listeners.ExtentTestNGReportListener.class)
public class CalendarTest extends BaseTest {
	WebDriver driver;
	Calendar calendarpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        calendarpage = new Calendar(driver); // Initialize Calendar page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
		calendarpage.CGlogin("mayur@cleverground.com", "Patil6319");
		Thread.sleep(5000);
		System.out.println("I have Login Successfully");
	}

    
    @BeforeMethod
    public void Scenario_1() {
    }

	//Scenario = 1 I am able to navigate Create Event Page and Create Event Type.
    
	

	@Test(priority=1)
	public void ShowInstitudes() {
		calendarpage.ShowInstitudes();
	}	  
	  
	@Test(priority=2)
	public void Selectinstitudes() {
		calendarpage.Selectinstitudes();
	}	  
	  
	@Test(priority=3)
	public void ShowRoles() {
		calendarpage.ShowRoles();
	}	  

	@Test(priority=4)
	public void SelectRoles() {
		calendarpage.SelectRoles();
	}	  
	  
	@Test(priority=5)
	public void ClickCalendar() {
		calendarpage.ClickCalendar();
	}
	
	@Test(priority=6)
	public void ClickEventsTab() {
		calendarpage.ClickEventsTab();
	}
	
	@Test(priority=7)
	public void CreateEvent() {
		calendarpage.CreateEvent();
	}
	
	@Test(priority=8)
	public void EnterEventType() {
		calendarpage.EnterEventType();
	}
	
	@Test(priority=9)
	public void ShowEnableDisableEvent() {
		calendarpage.ShowEnableDisableEvent();
	}
	
	@Test(priority=10)
	public void SelectEnableEvent() {
		calendarpage.SelectEnableEvent();
	}
	
	@Test(priority=11)
	public void ClickOnCreateBtn() {
		calendarpage.ClickOnCreateBtn();
	}
	
	@Test(priority=12)
	public void EventPopupchkbtn() {
		calendarpage.EventPopupchkbtn();
		System.out.println("I am Successfully navigate to Create Event Page and Create Event Type with Enable Status.");
	}
	
	
	
	
	@AfterMethod
	public void Scenario_1comp() {
	}
	
	
	
	@BeforeMethod
    public void Scenario_2() {
    }

	//Scenario = 2 Create Event Type with Disable status.
	
	
	@Test(priority=13)
	public void CreateEvent1() {
		calendarpage.CreateEvent1();
	}
	
	@Test(priority=14)
	public void EnterEventType1() {
		calendarpage.EnterEventType();
	}
	
	@Test(priority=15)
	public void ShowEnableDisableEvent1() {
		calendarpage.ShowEnableDisableEvent();
	}
	
	@Test(priority=16)
	public void SelectDisableEvent() {
		calendarpage.SelectDisableEvent();
	}
	
	@Test(priority=17)
	public void ClickOnCreateBtn1() {
		calendarpage.ClickOnCreateBtn();
	}
	
	@Test(priority=18)
	public void EventPopupchkbtn1() {
		calendarpage.EventPopupchkbtn1();
		System.out.println("Create Event Type Successfully with Disable status");
	}
	
	
	
	@AfterMethod
	public void Scenario_2Comp() {
	}
	
	
	
	@BeforeMethod
    public void Scenario_3() {
    }

	//Scenario = 3 I am not able to Create Event Type with White Space.

	
	@Test(priority=19)
	public void CreateEvent2() {
		calendarpage.CreateEvent2();
	}
	
	@Test(priority=20)
	public void EnterEventTypeWhiteSpace() {
		calendarpage.EnterEventTypeWhiteSpace();
	}
	
	@Test(priority=21)
	public void ShowEnableDisableEvent2() {
		calendarpage.ShowEnableDisableEvent();
	}
	
	@Test(priority=22)
	public void SelectEnableEvent1() {
		calendarpage.SelectEnableEvent1();
	}
	
	@Test(priority=23)
	public void ClickOnCreateBtn2() {
		calendarpage.ClickOnCreateBtn();
	}
	
	@Test(priority=24)
	public void EventPopupchkbtn2() {
		calendarpage.EventPopupchkbtn2();
		System.out.println("I am Successfully Create Event Type with White Space");
	}
	
	@Test(priority=25)
	public void ScrollUp() {
		calendarpage.ScrollUp();
	}
	
	@AfterMethod
	public void Scenario_3Comp() {
	}
	
	
	@BeforeMethod
    public void Scenario_4() {
    }
	
	@Test(priority=26)
	public void SelectAllCalendar() {
		calendarpage.SelectAllCalendar();
	}	
	
	@Test(priority=27)
	public void CreateCalendar() {
		calendarpage.CreateCalendar();
	}	
	
	@Test(priority=28)
	public void  CalendarName() {
		calendarpage. CalendarName();
	}	
	
	@Test(priority=29)
	public void  AcademicYear() {
		calendarpage.AcademicYear();
	}	
	
	@Test(priority=30)
	public void  SelectAcademicYear() {
		calendarpage.SelectAcademicYear();
	}	
	
	@Test(priority=31)
	public void CurrentYear() {
		calendarpage.CurrentYear();
	}
	
	@Test(priority=32)
	public void  SelectCurrentYear() {
		calendarpage.SelectCurrentYear();
	}	
	
	@Test(priority=33)
	public void  ShowDate() {
		calendarpage.ShowDate();
	}	
	
	@Test(priority=34)
	public void  SelectDate() {
		calendarpage.SelectDate();
	}	
	
	@Test(priority=35)
	public void  ShowDate2() {
		calendarpage.ShowDate2();
	}	
	
	@Test(priority=36)
	public void  SelectDate2() {
		calendarpage.SelectDate2();
	}	
	
	@Test(priority=37)
	public void  ClickOnCreate() throws InterruptedException {
		calendarpage.ClickOnCreate();
		Thread.sleep(2000);
	}	
	
	@Test(priority=38)
	public void  ClickOnOk() {
		calendarpage.ClickOnOk();
	}	
	
	@Test(priority=39)
	public void ScrollUp1() {
		calendarpage.ScrollUp();
	}
	
	@AfterMethod
    public void Scenario_4Comp() {
    }
	
	
	
	// Create Activity 
	
	@BeforeMethod
    public void Scenario_5() {
    }
	
	@Test(priority=40)
	public void ClickAcaCalView() {
		calendarpage.ClickAcaCalView();
	}	  

	@Test(priority=41)
	public void ClickOnCreateActivityBtn() {
		calendarpage.ClickOnCreateActivityBtn();
	}	  
	  
	@Test(priority=42)
	public void ClickOnSaveNextBtn() {
		calendarpage.ClickOnSaveNextBtn();
	}
	
	@Test(priority=43)
	public void ShowEventType() {
		calendarpage.ShowEventType();
	}

	@Test(priority=44)
	 public void SelectEventType() {
		 calendarpage.SelectEventType();
	 }
     
	@Test(priority=45)
     public void EnterActivityName() {
       calendarpage.EnterActivityName();
     }
     
	@Test(priority=46)
    public void ShowStartDate() {
      calendarpage.ShowStartDate();
    }
	
	@Test(priority=47)
    public void SelectStartDate() {
      calendarpage.SelectStartDate();
    }
	
	@Test(priority=48)
    public void ShowndDate() {
      calendarpage.ShowEndDate();
    }
	
	@Test(priority=49)
    public void SelectEndDate() {
      calendarpage.SelectEndDate();
    }
	
	@Test(priority=50)
	public void ScrollUp2() {
		calendarpage.ScrollUp();
	}
	
	@Test(priority=51)
    public void ShowRepeat() {
      calendarpage.ShowRepeat();
    }
	
	@Test(priority=52)
    public void SelectRepeat() {
      calendarpage.SelectRepeat();
    }
	
	@Test(priority=53)
	public void ClickOnCreateActivityButton() {
		calendarpage.ClickOnCreateActivityButton();
	}
	
	@Test(priority=54)
	public void CreateActivityPopupOk() {
		calendarpage.CreateActivityPopupOk();
	}
	
     @AfterMethod
     public void Scenario_5Comp() {
     }
     
     
     //Professor
     
     
     
     @BeforeMethod
 	public void Scenario_6() {
 	}
     
     @Test(priority=55)
  	public void Refresh() {
  		calendarpage.Refresh();
  	}
     
     @Test(priority=56)
 	public void ShowInstitute() {
 		calendarpage.ShowInstitudes();
 	}	  
 	  
 	@Test(priority=57)
 	public void Selectinstitute() {
 		calendarpage.Selectinstitudes();
 	}	  
 	  
 	@Test(priority=58)
 	public void ShowRoles2() {
 		calendarpage.ShowRoles();
 	}
 	
     @Test(priority=59)
 	public void SelectProfRole() {
 		calendarpage.SelectProfRole();
 	}
     
     @Test(priority=60)
  	public void SelectProCal() {
  		calendarpage.SelectProCal();
  	} 
     
     @Test(priority=61)
   	public void ClickOnListView() {
   		calendarpage.ClickOnListView();
   	}
     
     @Test(priority=62)
    	public void ClickView() {
    		calendarpage.ClickView();
    	}
 	
 	@AfterMethod
 	public void Scenario_6Comp() {
 	}
 	
 	
 	@BeforeMethod
 	public void Scenario_7() {
 	}
 	
 	// Student
 	
 	@Test(priority=63)
  	public void RefreshStud() {
  		calendarpage.Refresh();
  	}
 	
 	@Test(priority=64)
 	public void ShowInstitute2() {
 		calendarpage.ShowInstitudes();
 	}	  
 	  
 	@Test(priority=65)
 	public void Selectinstitute2() {
 		calendarpage.Selectinstitudes();
 	}	  
 	  
 	@Test(priority=66)
 	public void ShowRoleStud() {
 		calendarpage.ShowStudRole();
 	}
 	
     @Test(priority=67)
 	public void SelectStudRole() {
 		calendarpage.SelectStudRole();
 	}
     
     @Test(priority=68)
  	public void ClickOnStudCal() {
  		calendarpage.ClickOnStudCal();
  	} 
     
     @Test(priority=69)
   	public void ClickOnListViewStud() {
   		calendarpage.ClickOnListViewStud();
   	}
     
     @Test(priority=70)
    	public void ClickViewStud() {
    		calendarpage.ClickViewStud();
    	}
     
     @Test(priority=71)
 	public void Close() {
 		calendarpage.Close();
 	}
 	
 	@AfterMethod
 	public void Scenario_7Comp() {
 	}
   
     @AfterClass
     public void CG() {
 		
 	}
     
     

}
