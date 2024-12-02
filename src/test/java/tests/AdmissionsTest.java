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

import pages.AdmissionsMethods; 

@Listeners(listeners.ExtentTestNGReportListener.class)
public class AdmissionsTest extends BaseTest {
	WebDriver driver;
	AdmissionsMethods Admissionspage; 
	TestUtils utils;

	
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Admissionspage = new AdmissionsMethods(driver); // Initialize Calendar page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
		Admissionspage.CGlogin("vaibhav.dharekar@cleverground.com", "Vaibhav@66gm19");
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
	public void SelectAdmissions() throws InterruptedException {
		
		
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
	    Admissionspage.EnterAcademicCycleName("2024-2025 Cycle10"); // Adjust input as needed
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
	public void view() {
	    Admissionspage.view();
	}
	
	@Test(priority = 30)
	public void AdmissionDetails() {
	    Admissionspage.AdmissionDetails();
	}

	@Test(priority = 31)
	public void EditBasicInformation() {
	    Admissionspage.EditBasicInformation();
	}

	@Test(priority = 32)
	public void EditDate() {
	    Admissionspage.EditDate();
	}

	@Test(priority = 33)
	public void ShowDate() {
	    Admissionspage.ShowDate();
	}

	@Test(priority = 34)
	public void SelectDate() {
	    Admissionspage.SelectDate();
	}

	@Test(priority = 35)
	public void Save() {
	    Admissionspage.Save();
	}
	
	@Test(priority = 36)
	public void OKbtn2() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}

	@Test(priority = 37)
	public void AdmissionDetailsBack() {
	    Admissionspage.AdmissionDetails();
	}

	
	@Test(priority = 38)
	public void AddURLL() {
	    Admissionspage.Add();
	}

	@Test(priority = 39)
	public void EnterWebsite() {
	    Admissionspage.EnterWebsite("https://google.com"); // Provide a sample URL
	}

	@Test(priority = 40)
	public void EnterBrochureName() {
	    Admissionspage.EnterBrochureName("Sample Brochure Name"); // Provide a sample brochure name
	}

	@Test(priority = 41)
	public void UploadBrochure() {
	    Admissionspage.UploadBrochure("C:\\Users\\Asus\\Desktop\\Demo.pdf"); // Provide the path to the brochure file
	}

	@Test(priority = 42)
	public void SaveURL() throws InterruptedException {
	    Admissionspage.Save1();
	    Thread.sleep(5000);
	}
	
	@Test(priority = 43)
	public void ShowProgramDetails() {
	    Admissionspage.ShowProgramDetails();
	}
	
	@Test(priority = 44)
	public void OKbtn3() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}

	@Test(priority = 45)
	public void ShowProgramOutcomes() {
	    Admissionspage.ShowProgramOutcomes();
	}
	
	@Test(priority = 46)
	public void OKbtn4() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}

	@Test(priority = 47)
	public void ShowVerified() throws InterruptedException {
//		Thread.sleep(5000);
	    Admissionspage.ShowVerified();
	}

	@Test(priority = 48)
	public void SelectVerified() {
	    Admissionspage.SelectVerified();
	}
	
	@Test(priority = 49)
	public void OKbtn7() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}

	
	@Test(priority = 50)
	public void AdmissionDetailsBack2() {
	    Admissionspage.AdmissionDetails();
	}

	@Test(priority = 51)
	public void IntakeSetup() {
	    Admissionspage.IntakeSetup();
	}

	@Test(priority = 52)
	public void EditIntake1() {
	    Admissionspage.EditIntake1();
	}

	@Test(priority = 53)
	public void Category1() {
	    Admissionspage.Category1("10"); // Provide a sample value
	}

	@Test(priority = 54)
	public void Category2() {
	    Admissionspage.Category2("15"); // Provide a sample value
	}

	@Test(priority = 55)
	public void Category3() {
	    Admissionspage.Category3("20"); // Provide a sample value
	}

	@Test(priority = 56)
	public void Category4() {
	    Admissionspage.Category4("25"); // Provide a sample value
	}

	@Test(priority = 57)
	public void Category5() {
	    Admissionspage.Category5("30"); // Provide a sample value
	}

	@Test(priority = 58)
	public void Save1() {
	    Admissionspage.Save();
	}

	@Test(priority = 59)
	public void OKbtn5() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}

	@Test(priority = 60)
	public void EditIntake2() {
	    Admissionspage.EditIntake2();
	}

	@Test(priority = 61)
	public void Category19() {
	    Admissionspage.Category19("35"); // Provide a sample value
	}

	@Test(priority = 62)
	public void Category20() {
	    Admissionspage.Category20("40"); // Provide a sample value
	}

	@Test(priority = 63)
	public void Save2() {
	    Admissionspage.Save();
	}

	@Test(priority = 64)
	public void OKbtn6() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}
	
	@Test(priority = 65)
	public void ViewIntakeBack() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.ViewIntakeBack();
	    Thread.sleep(1000);
	}

	@Test(priority = 66)
	public void ShowVerifiedIntake() throws InterruptedException {
		Thread.sleep(5000);
	    Admissionspage.ShowVerified();
	}
	
	@Test(priority = 67)
	public void SelectVerifiedIntake() {
	    Admissionspage.SelectVerified();
	}
	
	@Test(priority = 68)
	public void OKbtn11() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}
	

	@Test(priority = 69)
	public void ViewAdmissionDetais() throws InterruptedException {
	    Admissionspage.ScrollToViewAdmissionDetails();
	}

	@Test(priority = 70)
	public void IntakeSetupBack() {
	    Admissionspage.IntakeSetupBack();
	}

	@Test(priority = 81)
	public void ApplicationForm() {
	    Admissionspage.ApplicationForm();   
	}

	@Test(priority = 82)
	public void Edit1() {
	    Admissionspage.Edit1();   
	}

	@Test(priority = 83)
	public void Textboxinfo() {
	    Admissionspage.Textboxinfo();   
	} 

	@Test(priority = 84)
	public void Savebtn() {
	    Admissionspage.Savebtn();   
	}  

	@Test(priority = 85)
	public void OKbtn1() {
	    Admissionspage.OKbtn1();    
	}  

	@Test(priority = 86)
	public void IntakeFormView() {
	    Admissionspage.IntakeFormView();    
	}  

	@Test(priority = 87)
	public void IntakeFormBack() {
	    Admissionspage.IntakeFormBack();    
	}  

	@Test(priority = 88)
	public void Edit2() {
	    Admissionspage.Edit2();     
	}  

	@Test(priority = 89)
	public void MedicoInfo() {
	    Admissionspage.MedicoInfo();     
	}  

	@Test(priority = 90)
	public void FamilyInfo() {
	    Admissionspage.FamilyInfo();     
	}  

	@Test(priority = 91)
	public void FinacInfo() {
	    Admissionspage.FinacInfo();     
	}  

	@Test(priority = 92)
	public void UniqId() {
	    Admissionspage.UniqId();     
	}  

	@Test(priority = 93)
	public void EductionInfo() {
	    Admissionspage.EductionInfo();     
	}  

	@Test(priority = 94)
	public void PersonalInfo() {
	    Admissionspage.PersonalInfo();      
	}  

	@Test(priority = 95)
	public void SaveInfo() {
	    Admissionspage.SaveInfo();      
	}  

	@Test(priority = 96)
	public void OkInfo() {
	    Admissionspage.OkInfo();      
	}  

	@Test(priority = 97)
	public void CreateCustom() {
	    Admissionspage.CreateCustom();      
	}  

	@Test(priority = 98)
	public void NameCustom() {
	    Admissionspage.NameCustom();      
	}  

	@Test(priority = 99)
	public void SaveCustom() {
	    Admissionspage.SaveCustom();      
	}  

	@Test(priority = 100)
	public void VIEW2() {
	    Admissionspage.VIEW2();      
	}  

	@Test(priority = 101)
	public void AddNewSection() {
	    Admissionspage.AddNewSection();      
	}
	
	@Test(priority = 102)
	public void SectionName() {
	    Admissionspage.SectionName();      
	} 

	@Test(priority = 103)
	public void SectionNameSave() {
	    Admissionspage.SectionNameSave();      
	}  

	@Test(priority = 104)
	public void AddNewInputClick() {
	    Admissionspage.AddNewInputClick();      
	}   

	@Test(priority = 105)
	public void Text() {
	    Admissionspage.Text();      
	}   

	@Test(priority = 106)
	public void Label() {
	    Admissionspage.Label();      
	}   

	@Test(priority = 107)
	public void Placeholder() {
	    Admissionspage.Placeholder();      
	}   

	@Test(priority = 108)
	public void AddText() {
	    Admissionspage.AddText();      
	} 

	@Test(priority = 109)
	public void AddNewInputClick1() {
	    Admissionspage.AddNewInputClick1();      
	}   

	@Test(priority = 110)
	public void Number() {
	    Admissionspage.Number();      
	}   

	@Test(priority = 111)
	public void Label1() {
	    Admissionspage.Label1();      
	}   

	@Test(priority = 112)
	public void Placeholder1() {
	    Admissionspage.Placeholder1();       
	}   

	@Test(priority = 113)
	public void AddNumber() {
	    Admissionspage.AddNumber();      
	}  

	@Test(priority = 114)
	public void AddNewInputClick2() {
	    Admissionspage.AddNewInputClick2();      
	}   

	@Test(priority = 115)
	public void PDFuploader() {
	    Admissionspage.PDFuploader();      
	}   

	@Test(priority = 116)
	public void Label2() {
	    Admissionspage.Label2();      
	}   

	@Test(priority = 117)
	public void Placeholder2() {
	    Admissionspage.Placeholder2();        
	}  

	@Test(priority = 118)
	public void AddPDF() {
	    Admissionspage.AddPDF();      
	}  

	@Test(priority = 119)
	public void AddNewInputClick3() {
	    Admissionspage.AddNewInputClick3();      
	}   

	@Test(priority = 120)
	public void Imageupload() {
	    Admissionspage.Imageupload();      
	}   

	@Test(priority = 121)
	public void Label3() {
	    Admissionspage.Label3();      
	}   

	@Test(priority = 122)
	public void Placeholder3() {
	    Admissionspage.Placeholder3();         
	}  

	@Test(priority = 123)
	public void AddImage() {
	    Admissionspage.AddImage();      
	}  

	@Test(priority = 124)
	public void AddNewInputClick4() {
	    Admissionspage.AddNewInputClick4();      
	}   

	@Test(priority = 125)
	public void Radiobutton() {
	    Admissionspage.Radiobutton();      
	}   

	@Test(priority = 126)
	public void Label4() {
	    Admissionspage.Label4();      
	}   

	@Test(priority = 127)
	public void Placeholder4() {
	    Admissionspage.Placeholder4();         
	}  

	@Test(priority = 128)
	public void Addoption1() {
	    Admissionspage.Addoption1();         
	}  

	@Test(priority = 129)
	public void AddRadio() {
	    Admissionspage.AddRadio();      
	}  

	@Test(priority = 130)
	public void AddNewInputClick6() {
	    Admissionspage.AddNewInputClick6();      
	}   

	@Test(priority = 131)
	public void Date() {
	    Admissionspage.Date();      
	}   

	@Test(priority = 132)
	public void Label6() {
	    Admissionspage.Label6();      
	}
	@Test(priority = 133)
	public void Placeholder6() {
	    Admissionspage.Placeholder6();         
	}  

	@Test(priority = 134)
	public void AddDate() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.AddDate();      
	}  

	@Test(priority = 135)
	public void AddNewInputClick7() throws InterruptedException {
	    Thread.sleep(5000);
	    Admissionspage.AddNewInputClick7();      
	}   

	@Test(priority = 136)
	public void URL() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.URL();      
	}   

	@Test(priority = 137)
	public void Label7() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.Label7();      
	}   

	@Test(priority = 138)
	public void Placeholder7() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.Placeholder7();         
	}  

	@Test(priority = 139)
	public void AddURL() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.AddURL();      
	}  

	@Test(priority = 140)
	public void BACK() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.BACK();      
	}  

	@Test(priority = 141)
	public void ScrollUp1() {
	    Admissionspage.ScrollUp1();       
	}  

	@Test(priority = 142)
	public void NOTverified() throws InterruptedException {
	    Thread.sleep(5000);
	    Admissionspage.NOTverified();  
	    Thread.sleep(3000);
	}  

	@Test(priority = 143)
	public void verified() {
	    Admissionspage.verified();       
	}  

	@Test(priority = 144)
	public void OKverified() {
	    Admissionspage.OKverified();       
	}  

	@Test(priority = 145)
	public void BACKbtn() {
	    Admissionspage.BACKbtn();      
	}   

	@Test(priority = 146)
	public void FEEtemplet() {
	    Admissionspage.FEEtemplet();      
	}   

	@Test(priority = 147)
	public void ADDnew() {
	    Admissionspage.ADDnew();      
	}   

	@Test(priority = 148)
	public void FeeLabelName() {
	    Admissionspage.FeeLabelName();      
	}   

	@Test(priority = 149)
	public void SAVEbtn() {
	    Admissionspage.SAVEbtn();      
	}

	@Test(priority = 150)
	public void ManageOpen() throws InterruptedException {
	    Admissionspage.ManageOpen();      
	}     

	@Test(priority = 151)
	public void PayableFEES() {
	    Admissionspage.PayableFEES();      
	}    

	@Test(priority = 152)
	public void SCHOLARSHIP() {
	    Admissionspage.SCHOLARSHIP();      
	}    

	@Test(priority = 153)
	public void FEESINSTALLMENT() {
	    Admissionspage.FEESINSTALLMENT();      
	}     

	@Test(priority = 154)
	public void SELECTdate() {
	    Admissionspage.SELECTdate();      
	}     

	@Test(priority = 155)
	public void CLICKtoselect() {
	    Admissionspage.CLICKtoselect();      
	}     

	@Test(priority = 156)
	public void SELECTdate1() {
	    Admissionspage.SELECTdate1();      
	}     

	@Test(priority = 157)
	public void CLICKtoselect1() {
	    Admissionspage.CLICKtoselect1();      
	}    

	@Test(priority = 158)
	public void CLICKsubmit() {
	    Admissionspage.CLICKsubmit();      
	}  

	@Test(priority = 159)
	public void NOTverified2() {
	    Admissionspage.NOTverified();      
	}  

	@Test(priority = 160)
	public void verified2() {
	    Admissionspage.verified();      
	}  

	@Test(priority = 161)
	public void OKverified2() {
	    Admissionspage.OKverified2();      
	}  

	@Test(priority = 162)
	public void FeesTemplateBack() {
	    Admissionspage.FeesTemplateBack();      
	}

	@Test(priority = 163)
	public void DisplayOnAdmissionPortal() {
	    Admissionspage.DisplayOnAdmissionPortal();
	}

	@Test(priority = 164)
	public void OKbtn8() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}

	@Test(priority = 165)
	public void Draft() {
	    Admissionspage.Draft();
	}

	@Test(priority = 166)
	public void Live() {
	    Admissionspage.Live();
	}
	
	@Test(priority = 167)
	public void OKbtn9() throws InterruptedException {
	    Thread.sleep(1000);
	    Admissionspage.OKbtn();
	    Thread.sleep(1000);
	}
}