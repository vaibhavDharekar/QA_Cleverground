package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class NotReadyToReady {
	WebDriver driver;
    JavascriptExecutor jsExecutor;
    
// CODE 1 START
    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement UserName;

    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement Password;

    @FindBy(xpath="//input[@id='formBasicCheckbox1']")
    WebElement Chkboxbtn;    
    
    @FindBy(xpath="//button[text()='Login']")
    WebElement Loginbtn;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]")
    WebElement Showinstitute;
    
    @FindBy(xpath="//a[normalize-space()='master Testing institute 2']")
    WebElement Selectinstitute;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRoles;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectRoleProfessor;
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRoleAdministrator;
    
    @FindBy(xpath="//span[normalize-space()='ID Card']")
    WebElement SelectIDcardModule;
    
    @FindBy(xpath="//input[@placeholder='Search by Name...']")
    WebElement SearchByName;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[1]")
    WebElement NotReadyForPrint;
    
    @FindBy(xpath="//span[normalize-space()='View']")
    WebElement View;
    
    @FindBy(xpath="//button[@class='c-btn link color-white mr-20' and text()='View']")
    WebElement View2;
    
    @FindBy(xpath="//span[normalize-space()='Save']")
    WebElement Save;
    
    @FindBy(xpath="//input[@id='basic_upload_photo']")
    WebElement UploadImage;
    
    @FindBy(xpath="//input[@placeholder='Full Name']")
    WebElement FullName;
    
    @FindBy(xpath="//input[@placeholder='Department Name']")
    WebElement DepartmentName;
    
    @FindBy(xpath="//input[@placeholder='Roll No']")
    WebElement RollNo;
    
    @FindBy(xpath="//input[@placeholder='Phone No (Stu)']")
    WebElement StudentPhoneNumber;
    
    @FindBy(xpath="//input[@placeholder='Parent No']")
    WebElement ParentPhoneNumber;
    
    @FindBy(xpath="//input[@id='basic_DOB']")
    WebElement DOB;
    
    @FindBy(xpath="//div[normalize-space()='18']")
    WebElement SelectedDOB;
    
    @FindBy(xpath="//input[@placeholder='Blood Group']")
    WebElement BloodGroup;

    
    
    
    
    
    

    
  
    
    
    
  
    
    



    
    
  
    
    
    
    
    
    
    
    
 // Constructor
    public NotReadyToReady(WebDriver driver) {
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
    
    public void ShowInstitutes(){
    	Showinstitute.click();
    }
    
    public void Selectinstitutes() {
    	Selectinstitute.click();
    }

    public void ShowRoles() {
    	ShowRoles.click();
    }
    
    public void SelectRoleProfessor() {
    	SelectRoleProfessor.click();
    }
    
    public void SelectRoleAdministrator() {
    	SelectRoleAdministrator.click();
    }
    
    public void SelectIDcardModule() {
    	SelectIDcardModule.click();
    }
    
    public void SearchByName(String name) {
    	SearchByName.sendKeys(name);
    }
    
    public void view() {
    	View.click();
    }
    
    public void view2() {
    	jsExecutor.executeScript("arguments[0].click();", View2);	

//    	View2.click();
    }
    
    
   
    public void UploadImage(String filepath) {
    	UploadImage.sendKeys(filepath);
    }
    
    public void fullName(String name) {
    	FullName.sendKeys(name);
    }
    
    public void departmentName(String name) {
    	DepartmentName.sendKeys(name);
    }
    
    public void rollNum(String num) {
    	RollNo.sendKeys(num);
    }
    
    public void phoneNo(String num) {
    	StudentPhoneNumber.sendKeys(num);
    }
    
    public void parentNo(String num) {
    	ParentPhoneNumber.sendKeys(num);
    }
    
    public void dob() {
    	DOB.sendKeys();
    }
    
    
  //div[normalize-space()='18']
    
    public void SelectedDOB() {
    	SelectedDOB.click();
    }
    
    public void bloodGroup(String str) {
    	BloodGroup.sendKeys(str);
    }
    
    
    
    public void isNotReadyForPrint() {
    	String txt = NotReadyForPrint.getText();
    	 if (txt.equalsIgnoreCase("Not ready for print")) {
             
         } else {
             System.out.println("no");
         }
    	}
   
}

