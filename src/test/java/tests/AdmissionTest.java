package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.Admission;


public class AdmissionTest {
	
	WebDriver driver;
	Admission Admissionpage;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Admissionpage = new Admission(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
    	Admissionpage.CGlogin("dhairyashil@cleverground.com", "Dhai@9677");
		Thread.sleep(5000);
		
	}

    
    @BeforeMethod
    public void Scenario_1() {
    }

	//Scenario = 1 I am able to navigate Create Event Page and Create Event Type.
    
	

	@Test(priority=1)
	public void Showinstitude() {
		Admissionpage.Showinstitude();
	}	  
	  
	@Test(priority=2)
	public void Selectinstitude() {
		Admissionpage.Selectinstitude();
	}	  
	  
	@Test(priority=3)
	public void ShowRole() {
		Admissionpage.ShowRole();
	}	  

	@Test(priority=4)
	public void SelectRole() {
		Admissionpage.SelectRole();
	}	
	
	@Test(priority=5)
	public void SelectAdmission() {
		Admissionpage.SelectAdmission();
	}
	@Test(priority=6)
	public void AdmissionPortal() {
		Admissionpage.AdmissionPortal();
	}
	@Test(priority=7)
	public void Applied() {
		Admissionpage.Applied();
	}
	@Test(priority=8)
	public void ViewApplication() {
		Admissionpage.ViewApplication();
	}
	@Test(priority=9)
	public void MedicalView() {
		Admissionpage.MedicalView();
	}
	@Test(priority=10)
	public void MedicalEdit() throws InterruptedException {
		Thread.sleep(1000);
		Admissionpage.MedicalEdit();
	}
	@Test(priority=11)
	public void Weight() {
		Admissionpage.Weight();
	}
	@Test(priority=12)
	public void WeightIn() throws InterruptedException {
		Thread.sleep(500);
		Admissionpage.WeightIn();
	}
	@Test(priority=13)
	public void KG() throws InterruptedException {
		Thread.sleep(500);
		Admissionpage.KG();
	}
	@Test(priority=14)
	public void Height() {
		Admissionpage.Height();
	}
	@Test(priority=15)
	public void HeightIn() {
		Admissionpage.HeightIn();
	}
	@Test(priority=16)
	public void Feet() throws InterruptedException {
		Thread.sleep(500);
		Admissionpage.Feet();
	}
	@Test(priority=17)
	public void BloodGroup() {
		Admissionpage.BloodGroup();
	}
	@Test(priority=18)
	public void BPositive() throws InterruptedException {
		Thread.sleep(500);
		Admissionpage.BPositive();
	}
	@Test(priority=19)
	public void Disablity() {
		Admissionpage.Disablity();
	}
	@Test(priority=20)
	public void DisablityNo() {
		Admissionpage.DisablityNo();
	}
	@Test(priority=21)
	public void FirstDose() {
		Admissionpage.FirstDose();
	}
//	@Test(priority = 21)
    public void uploadFile() {
        // Initialize the Admissionpage with the driver
      

        // Call the uploadFile method to upload the file
        Admissionpage.uploadFile("C:\\Users\\Dhairyashil\\Downloads\\report.pdf");
    }	
    
    @Test(priority=22)
	public void ScrollDown() {
		Admissionpage.ScrollDown();
	}
    @Test(priority=23)
	public void Medication() throws InterruptedException {
    	Thread.sleep(500);
    	Admissionpage.Medication();
	}
    
//    @Test(priority = 24)
    public void MedicationYes() {
      //  AdmissionPage admissionPage = new AdmissionPage(driver); // Initialize AdmissionPage with the WebDriver instance
        Admissionpage.MedicationYes(driver); // Pass the driver instance
    }
    @Test(priority=25)
   	public void illness() {
   		Admissionpage.illness();
   	}
  //  @Test(priority=26)
   	public void illnessYes() throws InterruptedException {
    	Thread.sleep(1000);
   		Admissionpage.illnessYes();
   	}
    @Test(priority=27)
   	public void History() throws InterruptedException {
    	Thread.sleep(1000);
   		Admissionpage.History();
   	}
 //   @Test(priority=28)
   	public void HistoryNo() throws InterruptedException {
    	Thread.sleep(1000);
   		Admissionpage.HistoryNo(driver, null);
   	}
    @Test(priority=29)
   	public void Allergy() throws InterruptedException {
    	Thread.sleep(1000);
   		Admissionpage.Allergy();
   	}
    @Test(priority=30)
   	public void AllergyNo() throws InterruptedException {
    	Thread.sleep(1000);
   		Admissionpage.AllergyNo();
   	}

 //   @Test(priority=31)
   	public void FamilyHistoryNo() throws InterruptedException {
    	Thread.sleep(1000);
   		Admissionpage.FamilyHistoryNo();
   	}
    @Test(priority=32)
   	public void saveProgress()  {
    	
   		Admissionpage.saveProgress();
   	}@Test(priority=33)
   	public void MedicalBack(){
    	
   		Admissionpage.MedicalBack();
   	}
    
    
    
    
    
	
	
    
	


}
