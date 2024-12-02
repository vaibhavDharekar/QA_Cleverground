
package tests;

import java.time.Duration;

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


import pages.ElogbooksAdd; 

@Listeners(listeners.ExtentTestNGReportListener.class)
public class ElogbooksAddTest extends BaseTest {
	WebDriver driver;
	ElogbooksAdd ElogbooksAddpage; 
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ElogbooksAddpage = new ElogbooksAdd(driver); // Initialize Calendar page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
		ElogbooksAddpage.CGlogin("mayur@cleverground.com", "Patil6319");
		Thread.sleep(5000);
		System.out.println("I have Login Successfully");
	}

    
    @BeforeMethod
    public void Scenario_1() {
    }

	//Scenario = 1 I am able to navigate E-Log Book in Institute Manager.
    
	
	@Test(priority=-17)
	public void Showinstitude() {
		ElogbooksAddpage.Showinstitude();
	}	  
	  
	@Test(priority=-16)
	public void Selectinstitude() {
		ElogbooksAddpage.Selectinstitude();
	}	  
	  
	@Test(priority=-15)
	public void ShowRole() {
		ElogbooksAddpage.ShowRole();
	}	  

	@Test(priority=-14)
	public void SelectRole() {
		ElogbooksAddpage.SelectRole();
	}	
	
	@Test(priority=-13)
	public void SelectInstituteManager() {
		ElogbooksAddpage.SelectInstituteManager();
	}
	
	@Test(priority=-12)
	public void SelectManageProgram() {
		ElogbooksAddpage.SelectManageProgram();
	}
	
	@Test(priority=-11)
	public void SelectSubViewDetails() {
		ElogbooksAddpage.SelectSubViewDetails();
	}
	
	@Test(priority=-10)
	public void DeleteSubViewDetails() throws InterruptedException {
		ElogbooksAddpage.DeleteSubViewDetails();
		Thread.sleep(1000);
	}
	
	@Test(priority=-9)
	public void DeleteSubOk() {
		ElogbooksAddpage.DeleteSubOk();
	}
	
	@Test(priority=-8)
	public void AddSub() throws InterruptedException {
		ElogbooksAddpage.AddSub();
		Thread.sleep(500);
	}
		
	@Test(priority=-7)
	public void EnterSub() throws InterruptedException {
		ElogbooksAddpage.EnterSub();
		Thread.sleep(500);
	}
	
	@Test(priority=-6)
	public void SubmitSub() {
		ElogbooksAddpage.SubmitSub();
	}
	
	@Test(priority=-5)
	public void SelectInstituteManager1() {
		ElogbooksAddpage.SelectInstituteManager();
	}
	
	
	
	@Test(priority=-3)
	public void SelectSelManageBatches() {
		ElogbooksAddpage.SelectSelManageBatches();
	}
	
	@Test(priority=-2)
	public void SelectSub() {
		ElogbooksAddpage.SelectSub();
	}
	
	@Test(priority=-1)
	public void SelectBatch() throws InterruptedException {
		ElogbooksAddpage.SelectBatch();
		Thread.sleep(5000);
	}
	
	@Test(priority=0)
	public void SelectAPro() throws InterruptedException {
		ElogbooksAddpage.SelectAPro();
		
	}
	
//	@Test(priority=1)
//	public void AddStud() throws InterruptedException {
//		ElogbooksAddpage.AddStud();
//		Thread.sleep(500);
//	}
//	
//	@Test(priority=2)
//	public void EnterStud() throws InterruptedException {
//		ElogbooksAddpage.EnterStud();
//		Thread.sleep(500);
//	}
//	
//	@Test(priority=3)
//	public void close() {
//		ElogbooksAddpage.close();
//	}
//	
//	@Test(priority=4)
//	public void SelectInstituteManager2() {
//		ElogbooksAddpage.SelectInstituteManager();
//	}
//	
//	@Test(priority=5)
//	public void SelectManageProgram2() {
//		ElogbooksAddpage.SelectManageProgram();
//	}
//	
//	@Test(priority=6)
//	public void SelectSubViewDetails2() {
//		ElogbooksAddpage.SelectSubViewDetails();
//	}
//	
//	
//	@Test(priority=7)
//	public void CopySubName() {
//		ElogbooksAddpage.CopySubName();
//	}
//	
//	
//	
//	@Test(priority=8)
//	public void SelectElogbookTab() {
//		ElogbooksAddpage.SelectElogbookTab();
//		System.out.println("I navigate E-Log Book page in Institute Manager Successfully");
//	}
//	
//	@Test(priority=9)
//	public void SelectDisable_EnableBtn() {
//		ElogbooksAddpage.SelectDisable_EnableBtn();
//	}
//	
//	@Test(priority=10)
//	public void SelectEDDropdown() {
//		ElogbooksAddpage.SelectEDDropdown();
//	}
//	
//	@Test(priority=11)
//	public void SelectEnable() {
//		ElogbooksAddpage.SelectEnable();
//	}
//	
//	@Test(priority=12)
//	public void SubmitBtn() throws InterruptedException {
//		ElogbooksAddpage.SubmitBtn();
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority=13)
//	public void SubmitOkBtn() {
//		ElogbooksAddpage.SubmitOkBtn();
//		System.out.println("I have Enable Elob book successfully");
//	}
//	
//	@Test(priority=14)
//	public void DefaultGuidesView_Edit() {
//		ElogbooksAddpage.DefaultGuidesView_Edit();
//	}
//	
//	@Test(priority=15)
//	public void AddGuideBtn() {
//		ElogbooksAddpage.AddGuideBtn();
//	}
//	
//	@Test(priority=16)
//	public void ShowGuide() {
//		ElogbooksAddpage.ShowGuide();
//	}
//	
//	@Test(priority=17)
//	public void SelectGuideMP() {
//		ElogbooksAddpage.SelectGuide();
//	}
//	
//	@Test(priority=18)
//	public void ClickAddBtn() throws InterruptedException {
//		ElogbooksAddpage.SubmitBtn();
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority=19)
//	public void ClickAddOkBtn() {
//		ElogbooksAddpage.SubmitOkBtn();
//		System.out.println("I have added Guide Successfully");
//	}
//	
//	@Test(priority=20)
//	public void BackToDashboardElogbook() throws InterruptedException {
//		ElogbooksAddpage.BackToDashboardElogbook();
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority=21)
//	public void SelectElogbookTab1() {
//		ElogbooksAddpage.SelectElogbookTab();
//	}
//	
//	@Test(priority=22)
//	public void ELogBookCoverInformationView_Edit() {
//		ElogbooksAddpage.ELogBookCoverInformationView_Edit();
//	}
//	
//	@Test(priority=23)
//	public void ELogBookCoverDecription_Edit() {
//		ElogbooksAddpage.ELogBookCoverDecription_Edit();
//	}
//	
//	@Test(priority=24)
//	public void EnterELogBookCoverDescription() {
//		ElogbooksAddpage.EnterELogBookCoverDescription();
//	}
//	
//	@Test(priority=25)
//	public void ELogBookCoverEnableDesable() {
//		ElogbooksAddpage.ELogBookCoverEnableDesable();
//	}
//	
//	@Test(priority=26)
//	public void ELogBookCoverEnable() {
//		ElogbooksAddpage.ELogBookCoverEnable();
//	}
//	
//	@Test(priority=27)
//	public void ELogBookCoverSaveBtn() throws InterruptedException {
//		ElogbooksAddpage.ELogBookCoverSaveBtn();
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority=28)
//	public void ELogBookCoverSaveOKBtn() {
//		ElogbooksAddpage.SubmitOkBtn();
//		System.out.println("I have entered the Description and Enable it Successfully");
//	}
//	
//	@Test(priority=29)
//	public void AddNewSectionBtn() {
//		ElogbooksAddpage.AddNewSectionBtn();
//	}
//	
//	@Test(priority=30)
//	public void EnterSectionName() {
//		ElogbooksAddpage.EnterSectionName();
//	}
//	
//	@Test(priority=31)
//	public void SectionSaveBtn() {
//		ElogbooksAddpage.ELogBookCoverSaveBtn();
//		System.out.println("I have Created a New Section Successfully");
//	}
//	
//	//====================Text Input
//	
//	@Test(priority=32)
//	public void AddNewInputBtn() {
//		ElogbooksAddpage.AddNewInputBtn();
//	}
//	
//	@Test(priority=33)
//	public void AddTextInputBtn() {
//		ElogbooksAddpage.AddTextInputBtn();
//	}
//	
//	@Test(priority=34)
//	public void EnterLabel1() {
//		ElogbooksAddpage.EnterLabel1();
//	}
//	
//	@Test(priority=35)
//	public void EnterPlaseHolder1() {
//		ElogbooksAddpage.EnterPlaseHolder1();
//	}
//	
//	@Test(priority=36)
//	public void TextInputAddBtn() throws InterruptedException {
//		ElogbooksAddpage.TextInputAddBtn();
//		System.out.println("I have Created a New Text Input Successfully");
//		Thread.sleep(2000);
//	}
//	
//	//================ Number Input
//	
//	@Test(priority=37)
//	public void AddNewInputBtn1() {
//		ElogbooksAddpage.AddNewInputBtn();
//	}
//	
//	@Test(priority=38)
//	public void AddNumberInputBtn() {
//		ElogbooksAddpage.AddNumberInputBtn();
//	}
//	
//	@Test(priority=39)
//	public void EnterLabel2() {
//		ElogbooksAddpage.EnterLabel2();
//	}
//	
//	@Test(priority=40)
//	public void EnterPlaseHolder2() {
//		ElogbooksAddpage.EnterPlaseHolder2();
//	}
//	
//	@Test(priority=41)
//	public void TextInputAddBtn1() throws InterruptedException {
//		ElogbooksAddpage.TextInputAddBtn();
//		System.out.println("I have Created a New Number Input Successfully");
//		Thread.sleep(2000);
//	}
//	
//	
//	
//	//================ PDF Input
//	
//		@Test(priority=42)
//		public void AddNewInputBtn2() {
//			ElogbooksAddpage.AddNewInputBtn();
//		}
//		
//		@Test(priority=43)
//		public void AddPDFInputBtn() {
//			ElogbooksAddpage.AddPDFInputBtn();
//		}
//		
//		@Test(priority=44)
//		public void EnterLabel3() {
//			ElogbooksAddpage.EnterLabel3();
//		}
//		
//		@Test(priority=45)
//		public void EnterPlaseHolder3() {
//			ElogbooksAddpage.EnterPlaseHolder3();
//		}
//		
//		@Test(priority=46)
//		public void TextInputAddBtn2() throws InterruptedException {
//			ElogbooksAddpage.TextInputAddBtn();
//			System.out.println("I have Created a New PDF Input Successfully");
//			Thread.sleep(2000);
//		}
//		
//	
//		//================ Image Input
//		
//			@Test(priority=47)
//			public void AddNewInputBtn3() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=48)
//			public void AddImageInputBtn() {
//				ElogbooksAddpage.AddImageInputBtn();
//			}
//			
//			@Test(priority=49)
//			public void EnterLabel4() {
//				ElogbooksAddpage.EnterLabel4();
//			}
//			
//			@Test(priority=50)
//			public void EnterPlaseHolder4() {
//				ElogbooksAddpage.EnterPlaseHolder4();
//			}
//			
//			@Test(priority=51)
//			public void TextInputAddBtn3() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New Image Input Successfully");
//				Thread.sleep(2000);
//			}
//		
//	
//			
//			//================ RadioBtn Input
//			
//			@Test(priority=52)
//			public void AddNewInputBtn4() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=53)
//			public void AddRadioInputBtn() {
//				ElogbooksAddpage.AddRadioInputBtn();
//			}
//			
//			@Test(priority=54)
//			public void EnterLabel5() {
//				ElogbooksAddpage.EnterLabel5();
//			}
//			
//			@Test(priority=55)
//			public void EnterRadioBtn() {
//				ElogbooksAddpage.EnterRadioBtn();
//			}
//			
//			@Test(priority=56)
//			public void EnterRadioBtnAdd() {
//				ElogbooksAddpage.ClickRadioBtnAdd();
//			}
//			
//			
//			@Test(priority=57)
//			public void TextInputAddBtn4() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New Radio Btn Input Successfully");
//			Thread.sleep(2000);			
//			}
//			
//			
////================ Checkboxes Input
//			
//			@Test(priority=58)
//			public void AddNewInputBtn5() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=59)
//			public void AddCheckboxesInputBtn() {
//				ElogbooksAddpage.AddCheckboxesInputBtn();
//			}
//			
//			@Test(priority=60)
//			public void EnterLabel6() {
//				ElogbooksAddpage.EnterLabel6();
//			}
//			
//			@Test(priority=61)
//			public void EnterCheckBox() {
//				ElogbooksAddpage.EnterReqCheckBox();
//			}
//			
//			@Test(priority=62)
//			public void ClickCheckBoxAddBtn() throws InterruptedException {
//				ElogbooksAddpage.ClickCheckBoxAddBtn();
//				Thread.sleep(500);
//			}
//			
//			@Test(priority=63)
//			public void TextInputAddBtn5() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New CheckBox Input Successfully");
//				Thread.sleep(2000);
//			}
//			
//			
//			
////================ Date Input
//			
//			@Test(priority=64)
//			public void AddNewInputBtn6() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=65)
//			public void AddDateInputBtn() {
//				ElogbooksAddpage.AddDateInputBtn();
//			}
//			
//			@Test(priority=66)
//			public void EnterLabel7() {
//				ElogbooksAddpage.EnterLabel7();
//			}
//			
//			@Test(priority=67)
//			public void EnterPlaseHolder7() {
//				ElogbooksAddpage.EnterPlaseHolder7();
//			}
//			
//			@Test(priority=68)
//			public void TextInputAddBtn6() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New Date Input Successfully");
//				Thread.sleep(2000);
//			}
//			
//			
//			
////================ URL Input
//			
//			@Test(priority=69)
//			public void AddNewInputBtn7() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=70)
//			public void AddURLInputBtn() {
//				ElogbooksAddpage.AddURLInputBtn();
//			}
//			
//			@Test(priority=71)
//			public void EnterLabel8() {
//				ElogbooksAddpage.EnterLabel8();
//			}
//			
//			@Test(priority=72)
//			public void EnterPlaseHolder8() {
//				ElogbooksAddpage.EnterPlaseHolder8();
//			}
//			
//			@Test(priority=73)
//			public void TextInputAddBtn7() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New URL Input Successfully");
//				Thread.sleep(2000);
//			}
//			
//			
////================ Time Input
//			
//			@Test(priority=74)
//			public void AddNewInputBtn8() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=75)
//			public void AddTimeInputBtn() {
//				ElogbooksAddpage.AddTimeInputBtn();
//			}
//			
//			@Test(priority=76)
//			public void EnterLabel9()  {
//				ElogbooksAddpage.EnterLabel9();
//			}
//			
//			@Test(priority=77)
//			public void EnterPlaseHolder9() {
//				ElogbooksAddpage.EnterPlaseHolder9();
//			}
//			
//			@Test(priority=78)
//			public void TextInputAddBtn8() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New Time Input Successfully");
//				Thread.sleep(2000);
//			}
//			
//			
////================ Dropdown Input
//			
//			@Test(priority=79)
//			public void AddNewInputBtn9() {
//				ElogbooksAddpage.AddNewInputBtn();
//			}
//			
//			@Test(priority=80)
//			public void AddDropdownInputBtn() {
//				ElogbooksAddpage.AddDropdownInputBtn();
//			}
//			
//			@Test(priority=81)
//			public void EnterLabel10() {
//				ElogbooksAddpage.EnterLabel10();
//			}
//			
//			@Test(priority=82)
//			public void EnterDropDown() {
//				ElogbooksAddpage.EnterDropDown();
//			}
//			
//			@Test(priority=83)
//			public void ClickDropDownAddBtn() {
//				ElogbooksAddpage.ClickDropDownAddBtn();
//			}
//			
//			@Test(priority=84)
//			public void TextInputAddBtn9() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New Drop Down Input Successfully");
//				Thread.sleep(5000);
//			}
//	
//	
//	@Test(priority=85)
//	public void BackToDashboardElogbook1() {
//		ElogbooksAddpage.BackToDashboardElogbook1();
//	}
//	
//	@Test(priority=86)
//	public void SelectElogbookTab2() {
//		ElogbooksAddpage.SelectElogbookTab();
//	}
//	
//	@Test(priority=87)
//	public void ClickAddNewActivityGroupBtn() {
//		ElogbooksAddpage.ClickAddNewActivityGroupBtn();
//	}
//	
//	@Test(priority=88)
//	public void EnterActivityGroupName() {
//		ElogbooksAddpage.EnterActivityGroupName();
//	}
//
//	@Test(priority=89)
//	public void ShowGroupStatus() {
//		ElogbooksAddpage.ShowGroupStatus();
//	}
//	
//	@Test(priority=90)
//	public void SelectGroupStatus() {
//		ElogbooksAddpage.SelectGroupStatus();
//	}
//	
//	@Test(priority=91)
//	public void CreateBtn() throws InterruptedException {
//		ElogbooksAddpage.CreateBtn();
//		Thread.sleep(5000);
//	}
//	
//	@Test(priority=92)
//	public void SubmitActOkBtn() {
//		ElogbooksAddpage.SubmitActOkBtn();
//		System.out.println("I have added activity group successfully");
//	}
//	
//	@Test(priority=93)
//	public void AddNewActivityBtn() throws InterruptedException {
//		ElogbooksAddpage.AddNewActivityBtn();
//	}
//	
//	@Test(priority=94)
//	public void EnterActivityName() {
//		ElogbooksAddpage.EnterActivityName();
//	}
//	
//	@Test(priority=95)
//	public void ClickOnAddButton() throws InterruptedException {
//		ElogbooksAddpage.ClickOnAddButton();
//		Thread.sleep(1000);
//	}
//		
//	@Test(priority=96)
//	public void ClickOnAddOKButton2() {
//		ElogbooksAddpage.SubmitActOkBtn2();
//		System.out.println("I have Created New activity successfully");
//	}
//	
//	@Test(priority=97)
//	public void ClickOnManageBtn() throws InterruptedException {
//		ElogbooksAddpage.ClickOnManageBtn();
//		Thread.sleep(3000);
//	}
//	
//	@Test(priority=98)
//	public void ClickEditBtn() throws InterruptedException {
//		ElogbooksAddpage.ClickEditBtn();
//	}
//	
//	@Test(priority=99)
//	public void ShowDrpdown() {
//		ElogbooksAddpage.ShowDrpdown();
//	}
//	
//	@Test(priority=100)
//	public void SelectDrpdown() {
//		ElogbooksAddpage.SelectDrpdown();
//	}
//	
//	@Test(priority=101)
//	public void EnterDescription() {
//		ElogbooksAddpage.EnterDescription();
//	}
//	
//	@Test(priority=102)
//	public void ActivitySaveBtn() throws InterruptedException {
//		ElogbooksAddpage.ELogBookCoverSaveBtn();
//		Thread.sleep(3000);
//	}
//	
//	@Test(priority=103)
//	public void ActivitySaveOkBtn() {
//		ElogbooksAddpage.SubmitActOkBtn();
//	}
//	
//	@Test(priority=104)
//	public void ScrollDown() throws InterruptedException {
//		ElogbooksAddpage.ScrollDown();
//		Thread.sleep(1000);
//		System.out.println("I have Enabled New activity and added discription successfully");
//	}
//	
//	
//	
//	//====================Text Input
//	
//		@Test(priority=105)
//		public void AddNewInputBtn10() {
//			ElogbooksAddpage.AddNewInputBtn1();
//		}
//		
//		@Test(priority=106)
//		public void AddTextInputBtn1() {
//			ElogbooksAddpage.AddTextInputBtn();
//		}
//		
//		@Test(priority=107)
//		public void EnterLabel11()  {
//			ElogbooksAddpage.EnterLabel11();
//		}
//		
//		@Test(priority=108)
//		public void EnterPlaseHolder11() {
//			ElogbooksAddpage.EnterPlaseHolder11();
//		}
//		
//		@Test(priority=109)
//		public void TextInputAddBtn10() throws InterruptedException {
//			ElogbooksAddpage.TextInputAddBtn();
//			System.out.println("I have Created a New Text Input Successfully");
//			Thread.sleep(2000);
//		}
//		
//		//================ Number Input
//		
//		@Test(priority=110)
//		public void AddNewInputBtn11() {
//			ElogbooksAddpage.AddNewInputBtn1();
//		}
//		
//		@Test(priority=111)
//		public void AddNumberInputBtn1() {
//			ElogbooksAddpage.AddNumberInputBtn();
//		}
//		
//		@Test(priority=112)
//		public void EnterLabel12() {
//			ElogbooksAddpage.EnterLabel12();
//		}
//		
//		@Test(priority=112)
//		public void EnterPlaseHolder12()  {
//			ElogbooksAddpage.EnterPlaseHolder12();
//		}
//		
//		@Test(priority=113)
//		public void TextInputAddBtn11() throws InterruptedException {
//			ElogbooksAddpage.TextInputAddBtn();
//			System.out.println("I have Created a New Number Input Successfully");
//			Thread.sleep(2000);
//		}
//		
//		
//		
//		//================ PDF Input
//		
//			@Test(priority=114)
//			public void AddNewInputBtn12() {
//				ElogbooksAddpage.AddNewInputBtn1();
//			}
//			
//			@Test(priority=115)
//			public void AddPDFInputBtn1() {
//				ElogbooksAddpage.AddPDFInputBtn();
//			}
//			
//			@Test(priority=116)
//			public void EnterLabel13() {
//				ElogbooksAddpage.EnterLabel13();
//			}
//			
//			@Test(priority=117)
//			public void EnterPlaseHolder13() {
//				ElogbooksAddpage.EnterPlaseHolder13();
//			}
//			
//			@Test(priority=118)
//			public void TextInputAddBtn12() throws InterruptedException {
//				ElogbooksAddpage.TextInputAddBtn();
//				System.out.println("I have Created a New PDF Input Successfully");
//				Thread.sleep(2000);
//			}
//			
//		
//			//================ Image Input
//			
//				@Test(priority=119)
//				public void AddNewInputBtn13() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=120)
//				public void AddImageInputBtn1() {
//					ElogbooksAddpage.AddImageInputBtn();
//				}
//				
//				@Test(priority=121)
//				public void EnterLabel14() {
//					ElogbooksAddpage.EnterLabel14();
//				}
//				
//				@Test(priority=122)
//				public void EnterPlaseHolder14() {
//					ElogbooksAddpage.EnterPlaseHolder14();
//				}
//				
//				@Test(priority=123)
//				public void TextInputAddBtn13() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New Image Input Successfully");
//					Thread.sleep(2000);
//				}
//			
//		
//				
//				//================ RadioBtn Input
//				
//				@Test(priority=124)
//				public void AddNewInputBtn14() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=125)
//				public void AddRadioInputBtn1() {
//					ElogbooksAddpage.AddRadioInputBtn();
//				}
//				
//				@Test(priority=126)
//				public void EnterLabel15() {
//					ElogbooksAddpage.EnterLabel15();
//				}
//				
//				@Test(priority=127)
//				public void EnterRadioBtn1() {
//					ElogbooksAddpage.EnterRadioBtn();
//				}
//				
//				@Test(priority=128)
//				public void EnterRadioBtnAdd1() {
//					ElogbooksAddpage.ClickRadioBtnAdd();
//				}
//				
//				@Test(priority=129)
//				public void TextInputAddBtn14() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New Radio Btn Input Successfully");
//					Thread.sleep(2000);
//				}
//				
//				
//	//================ Checkboxes Input
//				
//				@Test(priority=130)
//				public void AddNewInputBtn15() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=131)
//				public void AddCheckboxesInputBtn1() {
//					ElogbooksAddpage.AddCheckboxesInputBtn();
//				}
//				
//				@Test(priority=132)
//				public void EnterLabel16() {
//					ElogbooksAddpage.EnterLabel16();
//				}
//				
//				@Test(priority=133)
//				public void EnterCheckBox1() {
//					ElogbooksAddpage.EnterReqCheckBox();
//				}
//				
//				@Test(priority=134)
//				public void ClickCheckBoxAddBtn1() {
//					ElogbooksAddpage.ClickCheckBoxAddBtn();
//				}
//				
//				@Test(priority=135)
//				public void TextInputAddBtn15() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New CheckBox Input Successfully");
//					Thread.sleep(2000);
//				}
//				
//				
//				
//	//================ Date Input
//				
//				@Test(priority=136)
//				public void AddNewInputBtn16() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=137)
//				public void AddDateInputBtn1() {
//					ElogbooksAddpage.AddDateInputBtn();
//				}
//				
//				@Test(priority=138)
//				public void EnterLabel17() {
//					ElogbooksAddpage.EnterLabel17();
//				}
//				
//				@Test(priority=139)
//				public void EnterPlaseHolder17() {
//					ElogbooksAddpage.EnterPlaseHolder17();
//				}
//				
//				@Test(priority=140)
//				public void TextInputAddBtn16() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New Date Input Successfully");
//					Thread.sleep(2000);
//				}
//				
//				
//				
//	//================ URL Input
//				
//				@Test(priority=141)
//				public void AddNewInputBtn17() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=142)
//				public void AddURLInputBtn1() {
//					ElogbooksAddpage.AddURLInputBtn();
//				}
//				
//				@Test(priority=143)
//				public void EnterLabel18()  {
//					ElogbooksAddpage.EnterLabel18();
//				}
//				
//				@Test(priority=144)
//				public void EnterPlaseHolder18() {
//					ElogbooksAddpage.EnterPlaseHolder18();
//				}
//				
//				@Test(priority=145)
//				public void TextInputAddBtn17() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New URL Input Successfully");
//					Thread.sleep(2000);
//				}
//				
//				
//	//================ Time Input
//				
//				@Test(priority=146)
//				public void AddNewInputBtn18() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=147)
//				public void AddTimeInputBtn7() {
//					ElogbooksAddpage.AddTimeInputBtn();
//				}
//				
//				@Test(priority=148)
//				public void EnterLabel19()  {
//					ElogbooksAddpage.EnterLabel19();
//				}
//				
//				@Test(priority=149)
//				public void EnterPlaseHolder19() {
//					ElogbooksAddpage.EnterPlaseHolder19();
//				}
//				
//				@Test(priority=150)
//				public void TextInputAddBtn18() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New Time Input Successfully");
//					Thread.sleep(2000);
//				}
//				
//				
//	//================ Dropdown Input
//				
//				@Test(priority=151)
//				public void AddNewInputBtn19() {
//					ElogbooksAddpage.AddNewInputBtn1();
//				}
//				
//				@Test(priority=152)
//				public void AddDropdownInputBtn8() {
//					ElogbooksAddpage.AddDropdownInputBtn();
//				}
//				
//				@Test(priority=153)
//				public void EnterLabel20() {
//					ElogbooksAddpage.EnterLabel20();
//				}
//				
//				@Test(priority=154)
//				public void EnterDropDown1() {
//					ElogbooksAddpage.EnterDropDown();
//				}
//				
//				@Test(priority=155)
//				public void ClickDropDownAddBtn1() {
//					ElogbooksAddpage.ClickDropDownAddBtn();
//				}
//				
//				@Test(priority=156)
//				public void TextInputAddBtn19() throws InterruptedException {
//					ElogbooksAddpage.TextInputAddBtn();
//					System.out.println("I have Created a New Drop Down Input Successfully");
//					Thread.sleep(2000);
//				}
//				
//				@Test(priority=157)
//				public void BackToDashboardElogbook2() {
//					ElogbooksAddpage.BackToDashboardElogbook2();
//				}
//				
//				@Test(priority=158)
//				public void SelectElogbookTab3() {
//					ElogbooksAddpage.SelectElogbookTab();
//					System.out.println("I have Created Elog Book Successfully");
//				}
//	
//				
//				
//
//	//=================    Rahul Mali Test Case ==============
//	
//				
//				
//				   
//				
//			      
//			    @Test(priority=161)
//			    public void ShowRole1() {
//			        ElogbooksAddpage.ShowRole1();
//			    }      
//
//			    @Test(priority=162)
//			    public void SelectRole1() {
//			        ElogbooksAddpage.SelectRole1();
//			    }    
//			    
//			    @Test(priority=163)
//			    public void SelectElogbooks() throws InterruptedException {
//			        ElogbooksAddpage.SelectElogbooks();
//			        Thread.sleep(5000);
//			    }   
//			    
//			    @Test(priority=164)
//			    public void AddElogbook() {
//			        ElogbooksAddpage.AddElogbook();
//			    }
//			    @Test(priority=165)
//			    public void SelectName() {
//			        ElogbooksAddpage.SelectName();
//			    }
//			    @Test(priority=166)
//			    public void Logbook() {
//			        ElogbooksAddpage.Logbook();
//			    }
//			    @Test(priority=167)
//			    public void Activity() {
//			        ElogbooksAddpage.Activity();
//			    }
//			    @Test(priority=168)
//			    public void Group() {
//			        ElogbooksAddpage.Group();
//			    }
//			    @Test(priority=169)
//			    public void Activity1() {
//			    ElogbooksAddpage.Activity1();
//			    }
//			    @Test(priority=170)
//			    public void Group1() {
//			    ElogbooksAddpage.Group1();
//			    }
//			    @Test(priority=171)
//			    public void AddLog() {
//			    ElogbooksAddpage.AddLog();
//			    }
//			    @Test(priority=172)
//			    public void Text1() {
//			    ElogbooksAddpage.Test1();
//			    }
//			    
//			    @Test(priority=173)
//			    public void EnterNumber() {
//			    ElogbooksAddpage.EnterNumber();
//			    }
//			    
//			    @Test(priority = 174)
//			    public void uploadSupportingDocTest() { // Path to the document
//			        ElogbooksAddpage.uploadSupportingDoc("C:\\Users\\Lenovo\\Downloads\\Sample PDF\\650KB.pdf");
//			    }
//			    
//			    //@Test(priority = 176)
//			    public void uploadSupportingDocTest2() { // Path to the document
//			        ElogbooksAddpage.uploadSupportingDoc2("C:\\Users\\Lenovo\\Downloads\\Sample Images\\SampleJPGImage_500kbmb.png");
//			    }
//			    
//			    
//			    @Test(priority=176)
//			    public void RadioBtn() {
//			        ElogbooksAddpage.RadioBtn();
//			    }
//			    
//			    
//			    
//			    @Test(priority=177)
//			    public void Checkbox1() {
//			        ElogbooksAddpage.Checkbox1();
//			    }
//			    
//			    @Test(priority=178)
//			    public void ShowStartDate1() {
//			        ElogbooksAddpage.ShowStartDate1();
//			    }
//			    
//			    @Test(priority=179)
//			    public void SelectStartDate1() {
//			        ElogbooksAddpage.SelectStartDate1();  
//			    }
//			    
//			    @Test(priority=180)
//			    public void url1() {
//			        ElogbooksAddpage.url1();
//			    }
//			    
//			    @Test(priority=181)
//			    public void ShowTime1() {
//			        ElogbooksAddpage.ShowTime1();
//			    }
//			    
//			    @Test(priority=182)
//			    public void SelectTime1() {
//			        ElogbooksAddpage.SelectTime1();
//			    }
//			    
//			    
//			        @Test(priority=183)
//			        public void Min() {
//			            ElogbooksAddpage.Min(); 
//			        }
//			        @Test(priority=184)
//			        public void Am() {
//			            ElogbooksAddpage.Am();
//			        }
//			        @Test(priority=185)
//			        public void Ok1() {
//			            ElogbooksAddpage.Ok1();
//			        }
//			    @Test(priority=186)
//			    public void Dropdown1() {
//			        ElogbooksAddpage.Dropdown1();
//			    }
//			    @Test(priority=187)
//			    public void Updown12() {
//			        ElogbooksAddpage.Updown1();
//			    }
//			    @Test(priority=188)
//			    public void Submit3() {
//			        ElogbooksAddpage.Submit();
//			        }
//			    @Test(priority=189)
//			    public void Ok3() {
//			        ElogbooksAddpage.Ok();
//			    }
//			    @Test(priority=190)
//			    public void Back4() {
//			        ElogbooksAddpage.Back4();
//			    }
//				
//			    
//			    
//			    
//			  //=================    Harshada Test Case ==============			
//				
//				
//				
//			    @Test(priority=191)
//			    public void ELogbooks() throws InterruptedException {
//			        Thread.sleep(2000);
//			        ElogbooksAddpage.ELogbooks();
//			        
//			    }    
//			    
//			    @Test(priority=192)
//			    public void view() throws InterruptedException {
//			        Thread.sleep(2000);
//			        ElogbooksAddpage.view();
//			        
//			    }    
//			    
//			    @Test(priority=193)
//			    public void ScrollDown3() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.ScrollDown3();
//			        
//			    }    
//			    @Test(priority=194)
//			    public void manage() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.manage();
//			        
//			    }
//			    
//			    @Test(priority=195)
//			    public void ScrollUp4() {
//			        
//			        ElogbooksAddpage.ScrollUp4();
//			        
//			    }
//			    
//			    @Test(priority=196)
//			    public void AddLog1() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.AddLog1();    
//			    }    
//			    
//			    @Test(priority=197)
//			    public void okbtn() {
//			        ElogbooksAddpage.okbtn();    
//			    }
//			    
//			    @Test(priority=198)
//			    public void Name() {
//			        ElogbooksAddpage.Test1();    
//			    }
//			    
//			    @Test(priority=199)
//			    public void RollNo() {
//			        ElogbooksAddpage.EnterNumber();    
//			    }
//			    
//			    
//			    @Test(priority=200)
//			    public void uploadSupportingDoc3() {
//			        ElogbooksAddpage.uploadSupportingDoc("C:\\Users\\Lenovo\\Downloads\\Sample PDF\\650KB.pdf");    
//			    }
//			    
//			    @Test(priority=201)
//			    public void RadioBtn6() {
//			        ElogbooksAddpage.RadioBtn();    
//			    }
//			    
//			    @Test(priority=202)
//			    public void Checkbox2() {
//			        ElogbooksAddpage.Checkbox1();    
//			    }
//			    
//			    @Test(priority=203)
//			    public void ShowStartDate10() {
//			        ElogbooksAddpage.ShowStartDate1();    
//			    }
//			    
//			    @Test(priority=204)
//			    public void SelectStartDate10() {
//			        ElogbooksAddpage.SelectStartDate1();    
//			    }
//			    
//			    @Test(priority=205)
//			    public void url11() {
//			        ElogbooksAddpage.url1();    
//			    }
//			    
//			    @Test(priority=206)
//			    public void ShowTime11() {
//			        ElogbooksAddpage.ShowTime1();    
//			    }
//			    
//			    @Test(priority=207)
//			    public void SelectTime11() {
//			        ElogbooksAddpage.SelectTime1();    
//			    }
//			    
//			    @Test(priority=208)
//			    public void Min1() {
//			        ElogbooksAddpage.Min();    
//			    }
//			    
//			    @Test(priority=209)
//			    public void Am1() {
//			        ElogbooksAddpage.Am();    
//			    }
//			    
//			    @Test(priority=210)
//			    public void Ok12() {
//			        ElogbooksAddpage.Ok1();    
//			    }
//			    
//			    @Test(priority=211)
//			    public void Dropdown10() {
//			        ElogbooksAddpage.Dropdown1();    
//			    }
//			    
//			    @Test(priority=212)
//			    public void Updown1() {
//			        ElogbooksAddpage.Updown1();    
//			    }
//			    
//			    @Test(priority=214)
//			    public void Submit1() {
//			        ElogbooksAddpage.Submit();    
//			    }
//			    
//			    @Test(priority=215)
//			    public void okay() {
//			        ElogbooksAddpage.okay();    
//			    }
//			    
//			    @Test(priority=216)
//			    public void ScrollUp5() {
//			        
//			        ElogbooksAddpage.ScrollUp1();    
//			    }
//			    
//			    @Test(priority=217)
//			    public void back() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.back();    
//			    }
//			    
//			    @Test(priority=218)
//			    public void backbtn() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.backbtn();    
//			    }
//			    
//			    
//			    
//			    //@Test(priority=219)
//			    public void ViewGuide5() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.ViewGuide();    
//			    }
//			    
//			    //@Test(priority=220)
//			    public void Back1() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.Back1();    
//			    }
//			    
//			    @Test(priority=221)
//			    public void ViewCoverInfo() {
//			        
//			        ElogbooksAddpage.ViewCoverInfo();    
//			    }
//			    
//			    @Test(priority=222)
//			    public void Edit5() {
//			        
//			        ElogbooksAddpage.Edit();    
//			    }
//			    
//			    @Test(priority=223)
//			    public void Name1() {
//			        ElogbooksAddpage.Test2();    
//			    }
//			    
//			    @Test(priority=224)
//			    public void RollNo1() {
//			        ElogbooksAddpage.EnterNumber2();    
//			    }
//			    
//			    
//			    @Test(priority=225)
//			    public void uploadSupportingDoc31() {
//			        ElogbooksAddpage.uploadSupportingDoc222("C:\\Users\\Lenovo\\Downloads\\Sample PDF\\650KB.pdf");    
//			    }
//			    
//			    @Test(priority=226)
//			    public void RadioBtn61() {
//			        ElogbooksAddpage.RadioBtn2();    
//			    }
//			    
//			    @Test(priority=227)
//			    public void Checkbox21() {
//			        ElogbooksAddpage.Checkbox22();    
//			    }
//			    
//			    @Test(priority=228)
//			    public void ShowStartDate12() {
//			        ElogbooksAddpage.ShowStartDate12();    
//			    }
//			    
//			    @Test(priority=229)
//			    public void SelectStartDate12() {
//			        ElogbooksAddpage.SelectStartDate12();    
//			    }
//			    
//			    @Test(priority=230)
//			    public void url12() {
//			        ElogbooksAddpage.url12();    
//			    }
//			    
//			    @Test(priority=231)
//			    public void ShowTime12() {
//			        ElogbooksAddpage.ShowTime12();    
//			    }
//			    
//			    @Test(priority=232)
//			    public void SelectTime12() {
//			        ElogbooksAddpage.SelectTime12();    
//			    }
//			    
//			    @Test(priority=233)
//			    public void Min2() {
//			        ElogbooksAddpage.Min2();    
//			    }
//			    
//			    @Test(priority=234)
//			    public void Am2() {
//			        ElogbooksAddpage.Am2();    
//			    }
//			    
//			    @Test(priority=235)
//			    public void Ok121() {
//			        ElogbooksAddpage.Ok12();    
//			    }
//			    
//			    @Test(priority=236)
//			    public void Dropdown101() {
//			        ElogbooksAddpage.Dropdown12();    
//			    }
//			    
//			    @Test(priority=237)
//			    public void Updown11() {
//			        ElogbooksAddpage.Updown12();    
//			    }
//			    
//			    @Test(priority=238)
//			    public void submit() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.submit();    
//			    }
//			    
//			    @Test(priority=239)
//			    public void submitok() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.submitok();    
//			    }
//			    
////			    @Test(priority=33)
////			    public void ScrollUp() {
////			        
////			        Elogbookspage.ScrollUp();    
////			    }
//			    
//			    
//			    
//			    @Test(priority=240)
//			    public void CoverformBack() {
//			        
//			        ElogbooksAddpage.CoverformBack();    
//			    }
//			    
//			    @Test(priority=241)
//			    public void Communication6() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.Communication();    
//			    }
//			    
//			    @Test(priority=242)
//			    public void Timeline() {
//			        
//			        ElogbooksAddpage.Timeline("Hello, Myself Harshada...!");    
//			    }
//			    
//			    
//			    @Test(priority=243)
//			        public void ScrollTimeline() {
//			            
//			            ElogbooksAddpage.ScrollTimeline();    
//			        }
//			    
//			    @Test(priority=244)
//			    public void Post6() {
//			        
//			        ElogbooksAddpage.Post();    
//			    }
//			    
//			    @Test(priority=245)
//			    public void SuccessOK() {
//			        
//			        ElogbooksAddpage.SuccessOK();    
//			    }
//			    
//			    @Test(priority=246)
//			    public void ScrollUp2() {
//			        
//			        ElogbooksAddpage.ScrollUp2();    
//			    }
//			    
//			    @Test(priority=247)
//			    public void bk() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.bk();    
//			    }    
//
//			    
//			    
//			    
//			  //=================    Vaibhav Test Case ==============
//			    
//			    @Test(priority=255)
//			    public void ShowRole2() {
//			        ElogbooksAddpage.ShowRole2();
//			    }      
//
//			    @Test(priority=256)
//			    public void SelectRole2() {
//			        ElogbooksAddpage.SelectRole2();
//			    }    
//			    
//			    @Test(priority=257)
//			    public void SelectElogbooks2() throws InterruptedException {
//			       ElogbooksAddpage.SelectElogbooks();
//			    }
//			    
//			    @Test(priority = 258)
//			    public void View() {
//			        ElogbooksAddpage.View();
//			    }
//
//			    @Test(priority = 259)
//			    public void ViewGuide() throws InterruptedException {
//			        ElogbooksAddpage.ViewGuide1();
//			        Thread.sleep(1000);
//			    }
//
//			    @Test(priority = 260)
//			    public void GuideBack() {
//			        ElogbooksAddpage.GuideBack();
//			    }
//
//			    @Test(priority = 261)
//			    public void ViewElogbookCover() throws InterruptedException {
//			        ElogbooksAddpage.ViewElogbookCover();
//			        Thread.sleep(1000);
//			    }
//
//			    @Test(priority = 262)
//			    public void Back() {
//			        ElogbooksAddpage.Back2();
//			    }
//
//			    @Test(priority = 263)
//			    public void Manage() throws InterruptedException {
//			        ElogbooksAddpage.Manage();
//			        Thread.sleep(1000);
//			    }
//
//			    @Test(priority = 264)
//			    public void View2() throws InterruptedException {
//			        ElogbooksAddpage.View2();
//			        Thread.sleep(500);
//			    }
//
//			    //@Test(priority = 265)
//			    public void Edit() {
//			        ElogbooksAddpage.Edit1();
//			    }
//
//			    //@Test(priority = 266)
//			    public void text() {
//			        ElogbooksAddpage.text1("12345"); // Ensures input is provided for this method
//			    }
//			    
//			    //@Test(priority = 267)
//			    public void Backk() throws InterruptedException {
//			        ElogbooksAddpage.Backk();
//			        Thread.sleep(1000);
//			    }
//
//			    // @Test(priority = 250)
//			    // public void UploadImage() {
////			         Elogbookspage.UploadImage("C:\\Users\\Asus\\Desktop\\download1.jpg"); // Path provided for image upload
//			    // }
//
//			    //@Test(priority = 268)
//			    public void ShowAssessedDropdown() {
//			        ElogbooksAddpage.ShowAssessedDropdown();
//			    }
//
//			    //@Test(priority = 269)
//			    public void SelectAssessedDropdown() throws InterruptedException {
//			        Thread.sleep(3000);
//			        ElogbooksAddpage.SelectAssessedDropdown();
//			    }
//
//			    // @Test(priority = 253)
//			    // public void OKBtn() {
////			         Elogbookspage.OKBtn();
//			    // }
//
//			    //@Test(priority = 271)
//			    public void SubmitForm() {
//			        ElogbooksAddpage.SubmitForm();
//			    }
//
//			    //@Test(priority = 272)
//			    public void OKBtn2() {
//			        ElogbooksAddpage.OKBtn();
//			    }
//
//			    @Test(priority = 273)
//			    public void Back2() {
//			        ElogbooksAddpage.Back2();
//			    }
//
//			    @Test(priority = 274)
//			    public void AutomationTestingBack() {
//			        ElogbooksAddpage.AutomationTestingBack();
//			    }
//
//			    @Test(priority = 275)
//			    public void Communication() {
//			        ElogbooksAddpage.Communication1();
//			    }
//
//			    @Test(priority = 276)
//			    public void EnterTimeline() {
//			        ElogbooksAddpage.EnterTimeline("Hi student"); // Sample text input for timeline
//			    }
//
//			    @Test(priority = 277)
//			    public void Post() {
//			        ElogbooksAddpage.Post1();
//			    }
//
//			    @Test(priority = 278)
//			    public void OKBtn3() throws InterruptedException {
//			        Thread.sleep(3000);
//			        ElogbooksAddpage.OKBtn();
//			    }
//
//			    @Test(priority = 279)
//			    public void Back3() {
//			        ElogbooksAddpage.Back3();
//			    }
//			    
//			    
//			    
//			    
//			    
//			  //=================    Nikhil Test Case ==============
//			    
//			    
//			    
//			    
//			    @Test(priority=285)
//			    public void ShowRole5() {
//			        ElogbooksAddpage.ShowRole5();
//			    }      
//
//			    @Test(priority=286)
//			    public void SelectRole5() throws InterruptedException {
//			        ElogbooksAddpage.SelectRole5();
//			        Thread.sleep(500);
//			    }  
//			    
//			    @Test(priority=287)
//			    public void ScrollDownDrawer() throws InterruptedException {
//			        ElogbooksAddpage.ScrollDownDrawer();
//			        Thread.sleep(500);
//			    } 
//			    
//			    @Test(priority=288)
//			    public void SelectElogbooks5() {
//			        ElogbooksAddpage.SelectElogbooks5();
//			        System.out.println("SelectElogbooks Double Click Successfully");
//			    }
//			    
//			    @Test(priority=289) 
//			    public void SearchName() throws InterruptedException {
//			        ElogbooksAddpage.SearchName();
//			        Thread.sleep(500);
//			    }    
//			    
//			    
//			    
//			    
////			    @Test(priority=6) 
////			    public void SelectDropdown() {
////			        Elogbookspage.SelectDropdown();
////			    }    
//			//    
////			    @Test(priority=7) 
////			    public void scrollDropdown() {
////			        Elogbookspage.scrollDropdown(); 
////			    }     
//			//    
////			    @Test(priority=8) 
////			    public void SelectSTQA() {
////			        Elogbookspage.SelectSTQA(); 
////			    }    
//			    
//			    @Test(priority=290) 
//			    public void View5() throws InterruptedException {
//			        ElogbooksAddpage.View5();
//			        Thread.sleep(500);
//			    }    
//			    
//			    @Test(priority=291) 
//			    public void ViewEdit() {
//			        ElogbooksAddpage.ViewEdit();
//			    }
//			    
//			    @Test(priority=292) 
//			    public void AddGuide() throws InterruptedException {
//			        ElogbooksAddpage.AddGuide();
//			        Thread.sleep(500);
//			    }    
//			    
//			    @Test(priority=293) 
//			    public void SearchGuide() {
//			        ElogbooksAddpage.SearchGuide();
//			    }    
//			    
//			    @Test(priority=294) 
//			    public void SelectGuide() throws InterruptedException {
//			        ElogbooksAddpage.SelectGuide5();
//			        Thread.sleep(500);
//			    }    
//			    
//			    @Test(priority=295) 
//			    public void ClickAdd() throws InterruptedException {
//			        ElogbooksAddpage.ClickAdd();
//			        Thread.sleep(500);
//			    }
//			    
//			    @Test(priority=296) 
//			    public void ConfirmOk() {
//			        ElogbooksAddpage.ConfirmOk();
//			    }
//			    
//			    @Test(priority=297) 
//			    public void Backbtn() throws InterruptedException {
//			        ElogbooksAddpage.Backbtn();
//			        Thread.sleep(500);
//			    }
//			    
//			    @Test(priority=298) 
//			    public void Elogbookcover() {
//			        ElogbooksAddpage.Elogbookcover();
//			    }
//			    
//			    @Test(priority=299) 
//			    public void ScrollUp() {
//			        ElogbooksAddpage.ScrollUp5();
//			    }
//			    
//			    @Test(priority=300) 
//			    public void ClickNotVerified() {
//			        ElogbooksAddpage.ClickVerified(); 
//			    }
//			    
//			    @Test(priority=301) 
//			    public void ClickVerified() {
//			        ElogbooksAddpage.ClickNotVerified(); 
//			    }
//			    
//			    @Test(priority=302) 
//			    public void ClickOnOk() {
//			        ElogbooksAddpage.ClickOnOk(); 
//			    }
//			    
//			    @Test(priority=303) 
//			    public void Back5() throws InterruptedException {
//			        Thread.sleep(1000);
//			        ElogbooksAddpage.Back5(); 
//			    }
//			    
//			    @Test(priority=304) 
//			    public void Communication5() {
//			        ElogbooksAddpage.Communication5(); 
//			    }
//			    
//			    @Test(priority=305) 
//			    public void EnterTimeLine() {
//			        ElogbooksAddpage.EnterTimeLine(); 
//			    }
//			    
//			    @Test(priority=306) 
//			    public void Post5() {
//			        ElogbooksAddpage.Post5(); 
//			    }
//			    
//			    @Test(priority=307) 
//			    public void Ok() {
//			        ElogbooksAddpage.Ok5(); 
//			    }
//			    
//			    @Test(priority=308) 
//			    public void Backpage() {
//			        ElogbooksAddpage.Backpage(); 
//			    }
//			    
//			// dhairyashil
//			    
//			    @Test(priority=315)
//			    public void ClickView() {
//			        ElogbooksAddpage.ClickViews();
//			    }
//			    @Test(priority=316)
//			    public void Manage6() {
//			        ElogbooksAddpage.Manage6();
//			    }
//			    @Test(priority=317)
//			    public void ManageView() {
//			        ElogbooksAddpage.ManageView();
//			    }
//			    //@Test(priority=318)
//			    public void NotAssesed() {
//			        ElogbooksAddpage.NotAssesed();
//			    }
//			   // @Test(priority=319)
//			    public void SelectAssesed() {
//			        ElogbooksAddpage.SelectAssesed();
//			    }
//			    //@Test(priority=320)
//			    public void AssesedOk() {
//			        ElogbooksAddpage.AssesedOk();
//			    }
//			   // @Test(priority=321)
//			    public void LastOk() {
//			    //    Thread.sleep(500);
//			        ElogbooksAddpage.LastOk();
//			    }
//			    @Test(priority=322)
//			    public void Back6() {
//			        ElogbooksAddpage.Back6();
//			    }
//			    
//			    @Test(priority=323)
//			    public void ScrollUp1() {
//			        ElogbooksAddpage.ScrollUp6();
//			    }
//			    
//			    
//			    
//			    
//			    @Test(priority=324)
//			    public void SelectOption() {
//			        ElogbooksAddpage.SelectOption();
//			    }
//			    @Test(priority=325)
//			    public void NotApllicable() {
//			        ElogbooksAddpage.NotApllicable();
//			    }
//			    @Test(priority=326)
//			    public void Clear() {
//			        ElogbooksAddpage.Clear();
//			    }
//			    @Test(priority=327)
//			    public void DateFilter() {
//			        ElogbooksAddpage.DateFilter();
//			    }
//			    
//			    @Test(priority=328)
//			    public void StartDate() {
//			        ElogbooksAddpage.StartDate();
//			    }
//			    @Test(priority=329)
//			    public void SelectStartDate() throws InterruptedException {
//			        Thread.sleep(500);
//			        ElogbooksAddpage.SelectStartDate();
//			    }
//			    @Test(priority=330)
//			    public void EndDate() {
//			        ElogbooksAddpage.EndDate();
//			    }
//			    @Test(priority=331)
//			    public void selectEndDate(){
//			    //    Thread.sleep(500);
//			        ElogbooksAddpage.selectEndDate();
//			    }
//			    
//			    @Test(priority=332)
//			    public void Submit(){
//			    //    Thread.sleep(500);
//			        ElogbooksAddpage.Submit6();
//			    }
//    
			    
			    
}