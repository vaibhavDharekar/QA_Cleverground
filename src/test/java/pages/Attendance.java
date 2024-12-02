package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;


public class Attendance {
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
    
    @FindBy(xpath="//span[contains(text(),'Institute Manager')]")
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
    
    @FindBy(xpath="(//span[normalize-space()='Student Attendence Management'])[2]")
    WebElement StudentAttendenceManagement;
    
    @FindBy(xpath="//a[normalize-space()='Lectures']")
    WebElement Lectures;
    
    @FindBy(xpath="//span[normalize-space()='Download Reports']")
    WebElement DownloadReportsBtn;
    
    @FindBy(xpath="//div[@class='ant-picker']//div[@class='ant-picker-input']//input[@id='basic_start_date']")
    WebElement BasicStartDate;
    
    @FindBy(xpath="//div[normalize-space()='1']")
    WebElement SelectedStartDate;
    
    @FindBy(xpath="//input[@id='basic_end_date']")
    WebElement BasicEndDate;
    
    @FindBy(xpath="(//div[normalize-space()='25'])[2]")
    WebElement SelectedEndDate;
    
    @FindBy(xpath="//span[normalize-space()='Download CSV']")
    WebElement Downloadcsv;
    
    @FindBy(xpath="//span[normalize-space()='View']")
    WebElement View;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/button[1]")
    WebElement ViewLectureReport;
    
    @FindBy(xpath="//span[@class='ant-modal-close-x']")
    WebElement CloseReport;
    
    @FindBy(xpath="//button[@class='btn-2']")
    WebElement TeachingPlan;
    
    @FindBy(xpath="//button[@class='btn-1']")
    WebElement GridAttendence;
    
    @FindBy(xpath="//div[@class='ant-row ant-row-center']//div//div[text()='1']")
    WebElement SelectRollNo1;
    
    @FindBy(xpath="//div[@class='ant-row ant-row-center']//div//div[text()='2']")
    WebElement SelectRollNo2;
    
    @FindBy(xpath="//span[text()='Close']")
    WebElement CloseGridAttendence;
    
    @FindBy(xpath="//span[contains(text(),'Mark all as ')]")
    WebElement MarkAllAs;
    
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement AlphabeticalOrder;
    
    @FindBy(xpath="//span[contains(text(),'Feedback')]")
    WebElement Feedback;
    
    @FindBy(xpath="//span[contains(text(),'Back')]")
    WebElement Back;

    
    
  
    
    
    
  
    
  
   
    


    
    
  
    
    
    
    
    
    
    
    
 // Constructor
    public Attendance(WebDriver driver) {
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
    	jsExecutor.executeScript("arguments[0].click();", SelectInstituteManagerModule);	

//    	SelectInstituteManagerModule.click();
    }
    
    public void ManageBatches() {
    	ManageBatches.click();
    }
    
    public void SelectBatch() {
    	SelectBatch.click();
    }
    
    public void RollNumbers() {
//    	Actions actions = new Actions(driver);
//        actions.doubleClick(RollNumbers).perform();
        
//        actions.click(RollNumbers)
//        .click(RollNumbers)
//        .click(RollNumbers)
//        .perform();
    	jsExecutor.executeScript("arguments[0].click();", RollNumbers);	
//    	jsExecutor.executeScript("var event = new MouseEvent('dblclick', {bubbles: true, cancelable: true}); arguments[0].dispatchEvent(event);", RollNumbers);
    	
    }
    
    public void EnableDisable() {
    	jsExecutor.executeScript("arguments[0].click();",EnableDisable);

//    	EnableDisable.click();
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
    
    public void StudentAttendenceManagement() {
//    	Actions actions = new Actions(driver);
//      actions.doubleClick(StudentAttendenceManagement).perform();
        StudentAttendenceManagement.click();
    }

    public void Lectures() {
    	jsExecutor.executeScript("arguments[0].click();", Lectures);	

    }

    public void DownloadReportsBtn() {
        DownloadReportsBtn.click();
    }

    public void BasicStartDate() {
    	jsExecutor.executeScript("arguments[0].click();", BasicStartDate);	

        BasicStartDate.click();
    }

    public void SelectedStartDate() {
    	jsExecutor.executeScript("arguments[0].click();", SelectedStartDate);
    }

    public void BasicEndDate() {
    	jsExecutor.executeScript("arguments[0].click();", BasicEndDate);

//        BasicEndDate.click();
    }

    public void SelectedEndDate() {
    	jsExecutor.executeScript("arguments[0].click();", SelectedEndDate);

    }

    public void Downloadcsv() {
//    	Actions actions = new Actions(driver);
//      actions.doubleClick(Downloadcsv).perform();
        Downloadcsv.click();
    }
    
    public void View() {
    	jsExecutor.executeScript("arguments[0].click();",View);
//        View.click();
    }

    public void ViewLectureReport() {
        ViewLectureReport.click();
    }

    public void CloseReport() {
        CloseReport.click();
    }

    public void TeachingPlan() {
    	jsExecutor.executeScript("arguments[0].click();", TeachingPlan);	

//        TeachingPlan.click();
    }
    
    public void CloseTeachingPlan() {
    	try { 
            CloseReport.click();
        } catch (NoSuchElementException e) {}
    }

    public void GridAttendence() {
        GridAttendence.click();
    }

    public void SelectRollNo1() {
        SelectRollNo1.click();
    }

    public void SelectRollNo2() {
        SelectRollNo2.click();
    }

    public void CloseGridAttendence() {
        CloseGridAttendence.click();
    }

    public void MarkAllAs() {
        MarkAllAs.click();
    }

    public void AlphabeticalOrder() {
        AlphabeticalOrder.click();
    }
    
    public void Feedback() {
        Feedback.click();
    }
    
    public void Back() {
        Back.click();
    }


    
}

