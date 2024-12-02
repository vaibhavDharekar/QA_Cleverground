package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Admission {
	
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

    @FindBy(xpath="//button[contains(text(), 'Testing')]")
    WebElement Showinstitude;
    
    @FindBy(xpath="//a[contains(text(), 'LMS Testing')]")
    WebElement Selectinstitude;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole;
    
    @FindBy(xpath="//a[normalize-space()='Student']")
    WebElement SelectRole;
    
    @FindBy(xpath="(//span[@class='linkText'][normalize-space()='Admissions'])[1]")
    WebElement SelectAdmission;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement AdmissionPortal;
    
    @FindBy(xpath ="(//a[@class='c-btn success'][normalize-space()='Applied'])[1]")
    WebElement Applied;
    
    @FindBy(xpath ="(//span[normalize-space()='View Application'])[1]")
    WebElement ViewApplication;
    
    @FindBy(xpath ="(//a[contains(text(),'View')])[1]")
    WebElement MedicalView;
    
    @FindBy(xpath ="(//span[normalize-space()='Edit'])[1]")
    WebElement MedicalEdit;
    
    @FindBy(xpath ="(//input[@id='basic_weight'])[1]")
    WebElement Weight;
    
    @FindBy(xpath ="(//input[@id='basic_weight_unit'])[1]")
    WebElement WeightIn;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='KG'])[1]")
    WebElement KG;
    
    @FindBy(xpath ="(//input[@id='basic_height'])[1]")
    WebElement Height;
    
    @FindBy(xpath ="(//input[@id='basic_height_unit'])[1]")
    WebElement HeightIn;
    
    @FindBy(xpath ="(//div[contains(text(),'FEET')])[1]")
    WebElement Feet;
    
    @FindBy(xpath ="(//input[@id='basic_blood_group'])[1]")
    WebElement BloodGroup;
    
    @FindBy(xpath ="(//div[contains(text(),'B Rh positive (B+)')])[1]")
    WebElement BPositive;
    
    @FindBy(xpath ="(//input[@id='basic_physical_disability'])[1]")
    WebElement Disablity;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='No'])[1]")
    WebElement DisablityNo;
    
    @FindBy(xpath ="(//input[@value='First Dose'])[1]")
    WebElement FirstDose;
    
    @FindBy(xpath ="(//button[@class='ant-btn'])[1]")
    WebElement uploadFile;
    
    @FindBy(xpath ="(//input[@id='basic_are_you_on_medication'])[1]")
    WebElement Medication;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='No'])[1]")
    WebElement MedicationYes;
    
    @FindBy(xpath ="(//input[@id='basic_medical_illness_history'])[1]")
    WebElement illness;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='Yes'])[1]")
    WebElement illnessYes;
    
    @FindBy(xpath ="(//input[@id='basic_surgical_history'])[1]")
    WebElement History;
    
    @FindBy(xpath ="(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='No'])[3]")
    WebElement HistoryNo;
    
    @FindBy(xpath ="(//input[@id='basic_allergy'])[1]")
    WebElement Allergy;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='No'])[1]")
    WebElement AllergyNo;
    
    @FindBy(xpath ="(//input[@id='basic_family_disease_history'])[1]")
    WebElement FamilyHistory;
    
    @FindBy(xpath ="//body/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement FamilyHistoryNo;
    
    @FindBy(xpath ="(//span[normalize-space()='Save Progress'])[1]")
    WebElement saveProgress;
    
    @FindBy(xpath ="(//span[contains(text(),'Medical Information')])[1]")
    WebElement MedicalBack;
    
    
    
 // Constructor
    public Admission(WebDriver driver) {
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

    public void Showinstitude(){
    	Showinstitude.click();
    }

    public void Selectinstitude() {
    	Selectinstitude.click();
    }

    public void ShowRole() {
    	ShowRole.click();
    }

    public void SelectRole() {
    	SelectRole.click();
    }
    
    public void SelectAdmission()  {
  //  	JavascriptExecutor js = (JavascriptExecutor) driver;
 //       js.executeScript("window.scrollTo(0, 0);"); 
    	SelectAdmission.click();
    }
    public void  AdmissionPortal() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	       js.executeScript("window.scrollTo(0, 0);"); 
    	 AdmissionPortal.click();
    }
    public void Applied() {
    	Applied.click();
    }
    public void ViewApplication() {
    	ViewApplication.click();
    }
    public void MedicalView() {
    	MedicalView.click();
    }
    public void MedicalEdit() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", MedicalEdit);
    }
    public void Weight() {
    	Weight.clear();
    	String currentText = Weight.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	Weight.sendKeys("\u0008");     // Unicode for Backspace
        }
    	Weight.sendKeys("69");
    }
    public void WeightIn() {
    	Weight.clear();
    	String currentText = WeightIn.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	WeightIn.sendKeys("\u0008");     // Unicode for Backspace
        }
    	WeightIn.click();
    }
    public void KG() {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//	       js.executeScript("window.scrollTo(0, 0);"); 
    	KG.click();
    }
    public void Height() {
    	Height.clear();
    	Weight.clear();
    	String currentText = Height.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	Height.sendKeys("\u0008");     // Unicode for Backspace
        }
    	Height.sendKeys("6.2");
    }
    public void HeightIn() {
    	HeightIn.click();
    }
    public void Feet() {
    	Feet.click();
    }
    public void BloodGroup() {
    	BloodGroup.click();
    }
    public void BPositive() {
    	BPositive.click();
    } 
    public void Disablity() {
    	Disablity.click();
    }
    public void DisablityNo() {
    	DisablityNo.click();
    }
    public void FirstDose() {
    	FirstDose.click();
    }
    public void uploadFile(String filePath) {
        // Wait until the file input element is visible and present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By uploadFileLocator = null;
		WebElement uploadFile = wait.until(ExpectedConditions.visibilityOfElementLocated(uploadFileLocator));
        
        // Use sendKeys to upload the file
		uploadFile.sendKeys(filePath);
    }
    
    public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
    }
    public void Medication() {
    	Medication.sendKeys("Yes");
    }
    public void MedicationYes(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Locate the element
        WebElement medicationYes = driver.findElement(By.xpath("//div[@title='No']//span[@class='ant-select-item-option-state']"));
        
        // Scroll the element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", medicationYes);

        // Wait until the element is visible and clickable
        wait.until(ExpectedConditions.visibilityOf(medicationYes));
        wait.until(ExpectedConditions.elementToBeClickable(medicationYes));

        // Click the element using JavaScript as a fallback
        try {
            medicationYes.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", medicationYes);
        }
    }
    public void illness() {
    	illness.sendKeys("No");
    }
    public void illnessYes() {
    	illnessYes.click();
    }
    public void History() {
    	History.sendKeys("No");
    }
    public void HistoryNo(WebDriver driver, WebElement HistoryNo) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", HistoryNo);
    }
    public void Allergy() {
    	Allergy.click();
    }
    public void AllergyNo() {
    	Allergy.click();
    }
    public void FamilyHistory() {
    	FamilyHistory.click();
    }
    public void FamilyHistoryNo() {
    	FamilyHistoryNo.click();
    }
    public void saveProgress() {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", saveProgress);
    //	saveProgress.click();
    }
    public void MedicalBack() {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", MedicalBack);
    //	MedicalBack.click();
    }

    
    
    
    
    
    
    
   

}
