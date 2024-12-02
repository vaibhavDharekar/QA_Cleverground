package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Attendance2 {
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
    
    @FindBy(xpath="//button[normalize-space()='Master Testing']")
    WebElement Showinstitute;
    
    @FindBy(xpath="//a[normalize-space()='LMS Testing']")
    WebElement Selectinstitute;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRoles;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectRoleProfessor;
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRoleAdministrator;
    
    @FindBy(xpath="//span[normalize-space()='Institute Manager']")
    WebElement SelectInstituteManagerModule;
    
    @FindBy(xpath="//a[normalize-space()='Manage Batches']")
    WebElement ManageBatches;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]")
    WebElement SelectBatch;
    
    @FindBy(xpath="//span[normalize-space()='Roll Numbers']")
    WebElement RollNumbers;
    
    @FindBy(xpath="//span[@class='ant-switch-inner']")
    WebElement EnableDisable;
    
    @FindBy(xpath="//div[@class='swal-button-container']//button[normalize-space()='OK']")
    WebElement EnableDisableOk1;
    
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm' and normalize-space()='OK']")
    WebElement EnableDisableOk2;
    
    @FindBy(xpath="//span[normalize-space()='Reset All Roll No.']")
    WebElement ResetAllRollNo;
    
    @FindBy(xpath="//input[@id='basic_roll_no_start_from']")
    WebElement RollNumberStartsFrom;
    
    @FindBy(xpath="//input[@id='basic_roll_prefix']")
    WebElement RollNumberPrefix;
    
    @FindBy(xpath="(//span[@class='ant-select-selection-item'])[2]")
    WebElement ShowFormatType;
    
    @FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='First Name - Middle Name - Last Name']")
    WebElement SelectedFormatType;
    
    @FindBy(xpath="//button[@class='ant-btn c-btn ml-20 large-save']")
    WebElement Save;
    
    
  
    
  
   
    


    
    
  
    
    
    
    
    
    
    
    
 // Constructor
    public Attendance2(WebDriver driver) {
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
    
    public void SelectInstituteManagerModule() {
    	SelectInstituteManagerModule.click();
    }
    
    public void ManageBatches() {
    	ManageBatches.click();
    }
    
    public void SelectBatch() {
    	SelectBatch.click();
    }
    
    public void RollNumbers() {
    	jsExecutor.executeScript("arguments[0].click();", RollNumbers);	
    	
    }
    
    public void EnableDisable() {
    	EnableDisable.click();
    }
    
    public void EnableDisableOk1() {
    	
    	jsExecutor.executeScript("arguments[0].click();", EnableDisableOk1);	

//    	EnableDisableOk1.click();
    }
    
    public void EnableDisableOk2() throws InterruptedException {
    	Thread.sleep(1000);
    	jsExecutor.executeScript("arguments[0].click();", EnableDisableOk2);	
    }
    
    public void ResetAllRollNo() {
    	ResetAllRollNo.click();
    }
    
    public void RollNumberPrefix(String prefix) {
    	RollNumberPrefix.sendKeys(prefix);
    }
    
    public void RollNumberStartsFrom(String num) {
    	RollNumberStartsFrom.sendKeys(num);
    }
    
    public void ShowFormatType() {
    	ShowFormatType.click();
    }
    
    public void SelectedFormatType() {
    	jsExecutor.executeScript("arguments[0].click();", SelectedFormatType);	

//    	SelectedFormatType.click();
    }
    
    public void Save() {
    	jsExecutor.executeScript("arguments[0].click();", Save);	

//    	Save.click();
    }
    
    public void Ok() {
    	jsExecutor.executeScript("arguments[0].click();",EnableDisableOk2 );	

//    	EnableDisableOk2.click();
    }


    

}

