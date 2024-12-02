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
import pages.Admissions2; 

@Listeners(listeners.ExtentTestNGReportListener.class)
public class AdmissionsTest2 extends BaseTest {
	WebDriver driver;
	Admissions2 Admissionspage; 
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Admissionspage = new Admissions2(driver); // Initialize Calendar page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
		Admissionspage.CGlogin("nikhil@cleverground.com", "7875497275");
		Thread.sleep(5000);
		System.out.println("I have Login Successfully");
	}

    
    @BeforeMethod 
    public void Scenario_1() {
    }

	//Scenario = 1 I am able to navigate Create Event Page and Create Event Type.
    
	

	@Test(priority=1)
	public void Showinstitude() {
		Admissionspage.Showinstitude();
	}	  
	  
	@Test(priority=2)
	public void Selectinstitude() {
		Admissionspage.Selectinstitude();
	}	  
	  
	@Test(priority=3)
	public void ShowRole() {
		Admissionspage.ShowRole();
	}	  

	@Test(priority=4)
	public void SelectRole() {
		Admissionspage.SelectRole();
	}	
	
	@Test(priority=5)
	public void SelectAdmissions()throws InterruptedException {
		Thread.sleep(1000);
		
		Admissionspage.SelectAdmissions();
	}
	
	@Test(priority = 10)
	public void CreateNewAcademicCycle() {
	    Admissionspage.CreateNewAcademicCycle();
	}

	@Test(priority = 11)
	public void ShowAcademicYears() {
	    Admissionspage.ShowAcademicYears();
	}

	@Test(priority = 12)
	public void SelectAcademicYears() {
	    Admissionspage.SelectAcademicYears();
	}

	@Test(priority = 13)
	public void EnterAcademicCycleName() {
	    Admissionspage.EnterAcademicCycleName("2024-2025 Cycle15"); // Adjust input as needed
	}

	@Test(priority = 14)
	public void SubmitBtn() {
	    Admissionspage.SubmitBtn();
	}
	
	@Test(priority = 15)
	public void OKbtn() throws InterruptedException {
		Thread.sleep(1000);
		Admissionspage.OKbtn();
		Thread.sleep(1000);
	}

	@Test(priority = 16)
	public void ViewAcademicCycle() {
	    Admissionspage.ViewAcademicCycle();
	}

	@Test(priority = 17)
	public void CreateNewAdmissionRegister() {
	    Admissionspage.CreateNewAdmissionRegister();
	}

	@Test(priority = 18)
	public void ShowAAT() {
	    Admissionspage.ShowAAT();
	}

	@Test(priority = 19)
	public void SelectAAT() {
	    Admissionspage.SelectAAT();
	}
	
	@Test(priority = 20)
	public void SubmitBtn2() {
	    Admissionspage.SubmitBtn();
	}
	
	@Test(priority = 21)
	public void ShowDepartment() {
	    Admissionspage.ShowDepartment();
	}

	@Test(priority = 22)
	public void SelectDepartment() {
	    Admissionspage.SelectDepartment();
	}

	@Test(priority = 23)
	public void ShowProgram() {
	    Admissionspage.ShowProgram();
	}

	@Test(priority = 24)
	public void SelectProgram() {
	    Admissionspage.SelectProgram();
	}

	@Test(priority = 25)
	public void ShowYear() {
	    Admissionspage.ShowYear();
	}

	@Test(priority = 26)
	public void SelectYear() {
	    Admissionspage.SelectYear();
	}

	@Test(priority = 27)
	public void Add() {
	    Admissionspage.Add();
	}

	@Test(priority = 28)
	public void Create() {
	    Admissionspage.Create();
	}
	
	@Test(priority = 29)
	public void View1() {
	    Admissionspage.View1(); 
	}
	
	@Test(priority = 30)
	public void ApplicationForm() {
	    Admissionspage.ApplicationForm();   
	}
	
	@Test(priority = 31)
	public void Edit1() {
	    Admissionspage.Edit1();   
	}
	
	@Test(priority = 32)
	public void Textboxinfo() {
	    Admissionspage.Textboxinfo();   
	} 
	
	@Test(priority = 33)
	public void Savebtn() {
	    Admissionspage.Savebtn();   
	}  
	
	@Test(priority = 34)
	public void OKbtn1() {
	    Admissionspage.OKbtn1();    
	}  
	
	@Test(priority = 35)
	public void IntakeFormView() {
	    Admissionspage.IntakeFormView();    
	}  
	
	@Test(priority = 36)
	public void IntakeFormBack() {
	    Admissionspage.IntakeFormBack();    
	}  
	
	@Test(priority = 37)
	public void Edit2() {
	    Admissionspage.Edit2();     
	}  
	
	@Test(priority = 37)
	public void MedicoInfo() {
	    Admissionspage.MedicoInfo();     
	}  
	
	@Test(priority = 38)
	public void FamilyInfo() {
	    Admissionspage.FamilyInfo();     
	}  
	
	@Test(priority = 39)
	public void FinacInfo() {
	    Admissionspage.FinacInfo();     
	}  
	
	@Test(priority = 40)
	public void UniqId() {
	    Admissionspage.UniqId();     
	}  
	
	@Test(priority = 41)
	public void EductionInfo() {
	    Admissionspage.EductionInfo();     
	}  
	
	@Test(priority = 42)
	public void PersonalInfo() {
	    Admissionspage.PersonalInfo();      
	}  
	
	@Test(priority = 43)
	public void SaveInfo() {
	    Admissionspage.SaveInfo();      
	}  
	
	@Test(priority = 44)
	public void OkInfo() {
	    Admissionspage.OkInfo();      
	}  
	
	@Test(priority = 45)
	public void CreateCustom() {
	    Admissionspage.CreateCustom();      
	}  
	
	@Test(priority = 46)
	public void NameCustom() {
	    Admissionspage.NameCustom();      
	}  
	
	@Test(priority = 47)
	public void SaveCustom() {
	    Admissionspage.SaveCustom();      
	}  
	
	@Test(priority = 48)
	public void VIEW2() {
	    Admissionspage.VIEW2();      
	}  
	
	@Test(priority = 49)
	public void AddNewSection() {
	    Admissionspage.AddNewSection();      
	}  
	
	@Test(priority = 50)
	public void SectionName() {
	    Admissionspage.SectionName();      
	} 
	
	@Test(priority = 51)
	public void SectionNameSave() {
	    Admissionspage.SectionNameSave();      
	}  
	
	@Test(priority = 52)
	public void AddNewInputClick() {
	    Admissionspage.AddNewInputClick();      
	}   
	
	@Test(priority = 53)
	public void Text() {
	    Admissionspage.Text();      
	}   
	
	@Test(priority = 54)
	public void Label() {
	    Admissionspage.Label();      
	}   
	
	@Test(priority = 55)
	public void Placeholder() {
	    Admissionspage.Placeholder();      
	}   
	
	@Test(priority = 56)
	public void AddText() {
	    Admissionspage.AddText();      
	} 
	
	@Test(priority = 57)
	public void AddNewInputClick1() {
	    Admissionspage.AddNewInputClick1();      
	}   
	
	
	@Test(priority = 58)
	public void Number() {
	    Admissionspage.Number();      
	}   
	
	@Test(priority = 59)
	public void Label1() {
	    Admissionspage.Label1();      
	}   
	
	@Test(priority = 60)
	public void Placeholder1() {
	    Admissionspage.Placeholder1();       
	}   
	
	@Test(priority = 61)
	public void AddNumber() {
	    Admissionspage.AddNumber();      
	}  
	
	@Test(priority = 62)
	public void AddNewInputClick2() {
	    Admissionspage.AddNewInputClick2();      
	}   
	
	@Test(priority = 63)
	public void PDFuploader() {
	    Admissionspage.PDFuploader();      
	}   
	
	@Test(priority = 64)
	public void Label2() {
	    Admissionspage.Label2();      
	}   
	@Test(priority = 65)
	public void Placeholder2() {
	    Admissionspage.Placeholder2();        
	}  
	
	@Test(priority = 66)
	public void AddPDF() {
	    Admissionspage.AddPDF();      
	}  
	
	@Test(priority = 67)
	public void AddNewInputClick3() {
	    Admissionspage.AddNewInputClick3();      
	}   
	
	@Test(priority = 68)
	public void Imageupload() {
	    Admissionspage.Imageupload();      
	}   
	
	@Test(priority = 69)
	public void Label3() {
	    Admissionspage.Label3();      
	}   
	
	@Test(priority = 70)
	public void Placeholder3() {
	    Admissionspage.Placeholder3();         
	}  
	
	@Test(priority = 71)
	public void AddImage() {
	    Admissionspage.AddImage();      
	}  
	
	
	@Test(priority = 72)
	public void AddNewInputClick4() {
	    Admissionspage.AddNewInputClick4();      
	}   
	
	@Test(priority = 73)
	public void Radiobutton() {
	    Admissionspage.Radiobutton();      
	}   
	
	@Test(priority = 74)
	public void Label4() {
	    Admissionspage.Label4();      
	}   
	
	@Test(priority = 75)
	public void Placeholder4() {
	    Admissionspage.Placeholder4();         
	}  
	
	@Test(priority = 76)
	public void Addoption1() {
	    Admissionspage.Addoption1();         
	}  
	
	@Test(priority = 77)
	public void AddRadio() {
	    Admissionspage.AddRadio();      
	}  
	
//	@Test(priority = 78)
//	public void AddNewInputClick5() {
//	    Admissionspage.AddNewInputClick5();      
//	}   
//	
//	@Test(priority = 79)
//	public void Checkbox() {
//	    Admissionspage.Checkbox();      
//	}   
//	
//	@Test(priority = 80)
//	public void Label5() {
//	    Admissionspage.Label5();      
//	}   
//	
//	@Test(priority = 81)
//	public void Placeholder5() { 
//	    Admissionspage.Placeholder5();         
//	}  
//	
//	@Test(priority = 82)
//	public void Addoption2() {
//	    Admissionspage.Addoption2();         
//	}  
//	
//	@Test(priority = 83)
//	public void AddCheckbox() {
//	    Admissionspage.AddCheckbox();      
//	}  
	
	@Test(priority = 84)
	public void AddNewInputClick6() {
	    Admissionspage.AddNewInputClick6();      
	}   
	
	@Test(priority = 85)
	public void Date() {
	    Admissionspage.Date();      
	}   
	
	@Test(priority = 86)
	public void Label6() {
	    Admissionspage.Label6();      
	}   
	
	@Test(priority = 87)
	public void Placeholder6() {
	    Admissionspage.Placeholder6();         
	}  
	
	@Test(priority = 88)
	public void AddDate()throws InterruptedException {
		Thread.sleep(1000);
	    Admissionspage.AddDate();      
	}  
	
	@Test(priority = 89)
	public void AddNewInputClick7() throws InterruptedException {
		Thread.sleep(5000);
	    Admissionspage.AddNewInputClick7();      
	}   
	
	@Test(priority = 90)
	public void URL()throws InterruptedException {
		Thread.sleep(1000);
	    Admissionspage.URL();      
	}   

	@Test(priority = 91)
	public void Label7()throws InterruptedException {
		Thread.sleep(1000);
	    Admissionspage.Label7();      
	}   
	
	@Test(priority = 92)
	public void Placeholder7()throws InterruptedException {
		Thread.sleep(1000);
	    Admissionspage.Placeholder7();         
	}  
	
	@Test(priority = 93)
	public void AddURL()throws InterruptedException {
		Thread.sleep(1000);
	    Admissionspage.AddURL();      
	}  
	
	@Test(priority = 94)
	public void BACK() throws InterruptedException {
		Thread.sleep(1000);
	    Admissionspage.BACK();      
	}  
	
//	@Test(priority = 95)
//	public void Diseble() {
//	    Admissionspage.Diseble();      
//	}  
//	
//	@Test(priority = 96)
//	public void DisebleOK() {
//	    Admissionspage.DisebleOK();      
//	}  
	
	
	
	
	
	@Test(priority = 97)
	public void ScrollUp1() {
	    Admissionspage.ScrollUp1();       
	}  

	@Test(priority = 98)
	public void NOTverified() throws InterruptedException {
		Thread.sleep(5000);
		Admissionspage.NOTverified();  
		Thread.sleep(3000);
	}  

	@Test(priority = 99)
	public void verified() {
	    Admissionspage.verified();       
	}  
	
	@Test(priority = 100)
	public void OKverified() {
	    Admissionspage.OKverified();       
	}  
	
	@Test(priority = 101)
	public void BACKbtn() {
	    Admissionspage.BACKbtn();      
	}   
	
	@Test(priority = 102)
	public void FEEtemplet() {
	    Admissionspage.FEEtemplet();      
	}   
	
	@Test(priority = 103)
	public void ADDnew() {
	    Admissionspage.ADDnew();      
	}   
	
	@Test(priority = 104)
	public void FeeLabelName() {
	    Admissionspage.FeeLabelName();      
	}   
	
	@Test(priority = 105)
	public void SAVEbtn() {
	    Admissionspage.SAVEbtn();      
	}
	
	@Test(priority = 106)
	public void ManageOpen() throws InterruptedException {
	    Admissionspage.ManageOpen();      
	}     

	@Test(priority = 107)
	public void PayableFEES() {
	    Admissionspage.PayableFEES();      
	}    
	
	@Test(priority = 108)
	public void SCHOLARSHIP() {
	    Admissionspage.SCHOLARSHIP();      
	}    
	
	@Test(priority = 109)
	public void FEESINSTALLMENT() {
	    Admissionspage.FEESINSTALLMENT();      
	}     
	
	@Test(priority = 110)
	public void SELECTdate() {
	    Admissionspage.SELECTdate();      
	}     

	@Test(priority = 111)
	public void CLICKtoselect() {
	    Admissionspage.CLICKtoselect();      
	}     
	
	@Test(priority = 112)
	public void SELECTdate1() {
	    Admissionspage.SELECTdate1();      
	}     
	
	@Test(priority = 113)
	public void CLICKtoselect1() {
	    Admissionspage.CLICKtoselect1();      
	}    
	
	@Test(priority = 114)
	public void CLICKsubmit() {
	    Admissionspage.CLICKsubmit();      
	}  
	
	@Test(priority = 115)
	public void NOTverified2() {
	    Admissionspage.NOTverified();      
	}  
	
	@Test(priority = 116)
	public void verified2() {
	    Admissionspage.verified();      
	}  

	@Test(priority = 117)
	public void OKverified2() {
	    Admissionspage.OKverified2();      
	}  

	@Test(priority = 118)
	public void FeesTemplateBack() {
	    Admissionspage.FeesTemplateBack();      
	} 
	 
	 
	
	
	
	 
	
	
	
	
	 
	    
	   

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}