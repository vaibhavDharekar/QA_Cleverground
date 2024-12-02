package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar {
    WebDriver driver;
    JavascriptExecutor jsExecutor;

    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement UserName;

    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement Password;

    @FindBy(xpath="//input[@id='formBasicCheckbox1']")
    WebElement Chkboxbtn;    
    
    @FindBy(xpath="//button[text()='Login']")
    WebElement Loginbtn;

    @FindBy(xpath="//button[normalize-space()='Master Testing']")
    WebElement Showinstitude;
    
    @FindBy(xpath="//a[@role='button']")
    WebElement Selectinstitude;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole;
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRole;
    
    @FindBy(xpath="//span[@class='linkText'][normalize-space()='Calendar']")
    WebElement ClickCalendar;
    
    @FindBy(xpath = "//div[@role='tablist']//div[3]")
    WebElement ClickEventsTab;
    
    @FindBy(xpath = "//div[@id='rc-tabs-0-panel-events']//div//div[@class='text-right mt-10']//button[@type='button']")
    WebElement CreateEvent;
    
    @FindBy(xpath = "//input[@id='basic_event_type']")
    WebElement EnterEventType;
    
    @FindBy(xpath = "//input[@id='basic_is_enable']")
    WebElement ShowEnableDisableEvent;
    
    @FindBy(xpath = "//div[contains(text(),'Enable')]")
    WebElement SelectEnableEvent;
    
    @FindBy(xpath = "//div[contains(text(),'Disable')]")
    WebElement SelectDisableEvent;
    
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement ClickOnCreateBtn;
    
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement EventPopupchkbtn;
    
    @FindBy(xpath="//div[@id='rc-tabs-3-tab-current']")
    WebElement ScrollUptoCurrent;
    
    //All Calendar - Create Academic Calendar
   
    
    @FindBy(xpath=" //div[@id='rc-tabs-0-tab-allCalenders']")
    WebElement SelectAllCalendar;
    
    @FindBy(xpath=" //span[normalize-space()='Create Academic Calendar']")
    WebElement CreateCalendar;
    
    @FindBy(xpath=" //input[@id='basic_calender_name']")
    WebElement CalendarName;
    
    @FindBy(xpath=" //input[@id='basic_academic_year_id']")
    WebElement AcademicYear;
    
    @FindBy(xpath=" //div[contains(text(),'2024-2025')]")
    WebElement SelectAcademicYear;
    
    @FindBy(xpath=" //input[@id='basic_is_current_calender']")
    WebElement CurrentYear;
    
    @FindBy(xpath=" //div[contains(text(),'Yes')]")
    WebElement SelectCurrentYear;
    
    @FindBy(xpath=" //input[@id='basic_calender_start_date']")
    WebElement ShowDate;
    
    @FindBy(xpath="//div[normalize-space()='11']")
    WebElement SelectDate;
    
    @FindBy(xpath="//input[@id='basic_calender_end_date']")
    WebElement ShowDate2;
    
    @FindBy(xpath="(//div[contains(text(),'31')])[2]")
    WebElement SelectDate2;
    
    @FindBy(xpath="//button[normalize-space()='Create']")
    WebElement ClickOnCreate;
    
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement ClickOnOk;
  
    
    
    
//    Create Activity In Calendar
    
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[7]")
    WebElement ClickAcaCalView;
    
    @FindBy(xpath="//span[normalize-space()='Create Actvity']")
    WebElement ClickOnCreateActivityBtn;
    
    @FindBy(xpath="//button[normalize-space()='Save & Next']")
    WebElement ClickOnSaveNextBtn;
    
    @FindBy(xpath="//div[contains(@class,'ant-col ant-col-14')]//div[contains(@class,'ant-select-selector')]")
    WebElement ShowEventType;
    
    @FindBy(xpath="//body[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]")
    WebElement SelectEventType;
    
    @FindBy(xpath="//input[@id='basic_activity_name']")
    WebElement EnterActivityName;
    
    @FindBy(xpath="//input[@id='basic_start_date']")
    WebElement ShowStartDate;
    
    @FindBy(xpath="//div[normalize-space()='14']")
    WebElement SelectStartDate;
    
    @FindBy(xpath="//input[@id='basic_end_date']")
    WebElement ShowEndDate;
    
    @FindBy(xpath="(//td[contains(@title,'2024-10-23')])[2]")
    WebElement SelectEndDate;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectProfRole;
    
    @FindBy(xpath="//span[@class='linkText'][normalize-space()='Calendar']")
    WebElement SelectProCal;
    
    @FindBy(xpath="//span[normalize-space()='List View']")
    WebElement ClickOnListView;
    
    @FindBy(xpath="//div[@class='c-mainWrapper']//div[2]//div[1]//div[7]//a[1]")
    WebElement ClickView;
    
    @FindBy(xpath="//div[contains(@class,'ant-col ant-col-6')]//div[contains(@class,'ant-row ant-form-item')]//div[contains(@class,'ant-select-selector')]")
    WebElement ShowRepeat;
    
    @FindBy(xpath="//div[contains(@class,'ant-select-item-option-content')][normalize-space()='Daily From Date']")
    WebElement SelectRepeat;
    
    @FindBy(xpath="//button[normalize-space()='Create Activity']")
    WebElement ClickOnCreateActivityButton;
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    WebElement CreateActivityPopupOk;
    
    @FindBy(xpath="//button[normalize-space()='Professor']")
    WebElement ShowRoleStud;
    
    @FindBy(xpath="//a[normalize-space()='Student']")
    WebElement SelectStudRole;
    
    @FindBy(xpath="//span[normalize-space()='Calendar']")
    WebElement ClickOnStudCal;
    
    @FindBy(xpath="//span[normalize-space()='List View']")
    WebElement ClickOnListViewStud;
    
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[7]/a[1]")
    WebElement ClickViewStud;
    
    
    
    // Constructor
    public Calendar(WebDriver driver) {
        this.driver = driver;
        jsExecutor = (JavascriptExecutor) driver; // Initialize JavascriptExecutor
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void CGlogin(String uname, String pwd) {
        UserName.sendKeys(uname);
        Password.sendKeys(pwd);
        Chkboxbtn.click();
        Loginbtn.click();
    }
    
    // Create Event Type 

    public void ShowInstitudes(){
    	Showinstitude.click();
    }

    public void Selectinstitudes() {
    	Selectinstitude.click();
    }

    public void ShowRoles() {
    	ShowRole.click();
    }

    public void SelectRoles() {
    	SelectRole.click();
    }	

    public void ClickCalendar() {
    	ClickCalendar.click();
    }  
    
    public void ClickEventsTab() {
    	ClickEventsTab.click();
    }
    
    public void CreateEvent() {
    	CreateEvent.click();
    }
    
    public void CreateEvent1() {
    	CreateEvent.click();
    }
    
    public void CreateEvent2() {
    	CreateEvent.click();
    }
    
    public void EnterEventType() {
    	EnterEventType.sendKeys("Automation Testing Mayur");
    }    
    
    public void EnterEventTypeWhiteSpace() {
    	EnterEventType.sendKeys("      ");
    } 
    
    public void ShowEnableDisableEvent() {
    	ShowEnableDisableEvent.click();
    }
    
    public void ShowEnableDisableEvent1() {
    	ShowEnableDisableEvent.click();
    }
    
    public void ShowEnableDisableEvent2() {
    	ShowEnableDisableEvent.click();
    }
    
    public void SelectEnableEvent() {
    	SelectEnableEvent.click();
    }
    
    public void SelectEnableEvent1() {
    	SelectEnableEvent.click();
    }
    
    public void SelectDisableEvent() {
    	SelectDisableEvent.click();
    }
    
    public void ClickOnCreateBtn() {
    	ClickOnCreateBtn.click();
    }
    
    public void EventPopupchkbtn() {
    	EventPopupchkbtn.click();
	}
    
    public void EventPopupchkbtn1() {
    	EventPopupchkbtn.click();
	}
    
    public void EventPopupchkbtn2() {
    	EventPopupchkbtn.click();
	}
    
    public void ScrollUptoCurrent() {
        Actions actions = new Actions(driver);
        actions.moveToElement(ScrollUptoCurrent).perform();
    }
    
    public void ScrollUp() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, 0);");
	}
    
    
 // Create Academic Calendar 
    
    public void SelectAllCalendar() {
    	SelectAllCalendar.click();
    }
    
    public void CreateCalendar() {
    	CreateCalendar.click();
    }
     
    public void   CalendarName() {
    	  CalendarName.sendKeys("New Year");
    }
    
    public void  AcademicYear() {
    	AcademicYear.click();
    }
    public void  SelectAcademicYear() {
    	SelectAcademicYear.click();
    }
    
    public void  CurrentYear() {
    	CurrentYear.click();
    }
    
    public void  SelectCurrentYear() {
    	SelectCurrentYear.click();
    }
    
    public void  ShowDate() {
    	 ShowDate.click();
    }
    
    public void  SelectDate() {
    	SelectDate.click();
    }
    
    public void  ShowDate2() {
   	 ShowDate2.click();
   }
    
    public void  SelectDate2() {
    	SelectDate2.click();
    }
    
    public void  ClickOnCreate() {
    	ClickOnCreate.click();
    }
    
    public void  ClickOnOk() {
    	ClickOnOk.click();
    }
    
    
 
    
 // Create Activity 
    
  
    
    public void  ClickAcaCalView() {
    	ClickAcaCalView.click();
    }

    public void  ClickOnCreateActivityBtn() {
    	ClickOnCreateActivityBtn.click();
    }

    public void  ClickOnSaveNextBtn() {
    	ClickOnSaveNextBtn.click();
    }

    public void  ShowEventType() {
    	ShowEventType.click();
    }

    public void  SelectEventType() {
    	SelectEventType.click();
    }

    public void  EnterActivityName() {
    	EnterActivityName.sendKeys("Activity Name");
    }

    public void  ShowStartDate() {
    	ShowStartDate.click();
    }

    public void  SelectStartDate() {
    	SelectStartDate.click();
    }

    public void  ShowEndDate() {
    	ShowEndDate.click();
    }

    public void  SelectEndDate() {
    	SelectEndDate.click();
    }
    
    public void  ShowRepeat() {
    	ShowRepeat.click();
    }

    public void  SelectRepeat() {
    	SelectRepeat.click();
    }

    public void  ClickOnCreateActivityButton() {
    	ClickOnCreateActivityButton.click();
    }
    
    public void  CreateActivityPopupOk() {
    	CreateActivityPopupOk.click();
    }
    
    
    // Professor
    
    public void Refresh() {
		driver.navigate().refresh();
	}
    
    public void  SelectProfRole() {
    	SelectProfRole.click();
    }
    
    public void  SelectProCal() {
    	SelectProCal.click();
    }
    
    public void ClickOnListView() {
		ClickOnListView.click();
	}
    
    public void ClickView() {
		ClickView.click();
	}
    
    // Student
    
    public void  ShowStudRole() {
    	ShowRoleStud.click();
    }
    
    public void  SelectStudRole() {
    	SelectStudRole.click();
    }
    
    public void  ClickOnStudCal() {
    	ClickOnStudCal.click();
    }
    
    public void ClickOnListViewStud() {
    	ClickOnListViewStud.click();
	}
    
    public void ClickViewStud() {
    	ClickViewStud.click();
	}
    
    public void Close() {
    	driver.close();
	}
    
    

}
