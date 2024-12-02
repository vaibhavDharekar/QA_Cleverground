package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class IDCardHistory 
{
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
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]")
    WebElement Showinstitute;
    
    @FindBy(xpath="//a[normalize-space()='Master Testing']")
    WebElement Selectinstitute;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRoles;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectRoleProfessor;
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRoleAdministrator;
    
    @FindBy(xpath="//span[normalize-space()='ID Card']")
    WebElement SelectIDcardModule;
    
    @FindBy(xpath="//span[normalize-space()='View Student ID Card History']")
    WebElement History;
    
    //scenario1
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]/input[1]")
    WebElement SearchName;

    @FindBy(xpath="//span[normalize-space()='View']")
    WebElement view;
    
    //span[@aria-label='arrow-left']//*[name()='svg']
    @FindBy(xpath="//span[@aria-label='arrow-left']//*[name()='svg']")
    WebElement back;
    
    //scenario2 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
    WebElement Showdepartments;
    
    @FindBy(xpath="//div[contains(text(),'Admit Test')]")
    WebElement Selectdepartment;
    
    @FindBy(xpath="//span[@title='All Program']")
    WebElement Showprograms;
    
    @FindBy(xpath="//div[contains(text(),'New Admit')]")
    WebElement Selectprogram;
//    
    @FindBy(xpath="//span[@title='All Year']")
    WebElement Showyear;
    
    @FindBy(xpath="//div[contains(text(),'Admit New program')]")
    WebElement Selectyear;
    
    @FindBy(xpath="//span[@title='All Semester']")
    WebElement Showsemester;
    
    @FindBy(xpath="//div[contains(text(),'semester -1')]")
    WebElement Selectsemester;
    
    @FindBy(xpath="//span[@title='All Batch']")
    WebElement Showbatches;
    
    @FindBy(xpath="//div[contains(text(),'Admit batch')]")
    WebElement Selectbatch;
    
    @FindBy(xpath="//div[@class='c-mainWrapper']//div[2]//div[1]//div[4]//button[1]//span[1]")
    WebElement viewbtn;
    
    //*[name()='path' and contains(@d,'M872 474H2')]
    @FindBy(xpath="//*[name()='path' and contains(@d,'M872 474H2')]")
    WebElement goback;
    
    
    
    
    //scenario3
    @FindBy(xpath="//div[5]//div[1]//div[4]//button[1]//span[1]")
    WebElement viewbt;
    
    
    
 // Constructor
    public IDCardHistory(WebDriver driver) {
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
    
    //idcard history
    public void History() {
        History.click();
    }
    
    
    
    
    
//    //Scenario1
    public void SearchName(String name) {
    	SearchName.sendKeys(name);
    }
    
    public void view() {
    	view.click();
    }
    
    public void back() {
    	back.click();
    }
    

    
    
    
    
    //scenario2
    public void Showdepartments() {
    	Showdepartments.click();
    }
    
    public void Selectdepartment() {
    	Selectdepartment.click();
    }
    
    public void Showprograms() {
    	Showprograms.click();
    }
    
    public void Selectprogram() {
    	Selectprogram.click();
    }
    
    public void Showyear() {
    	Showyear.click();
    }
    
    public void Selectyear() {
    	Selectyear.click();
    }
    
    public void Showsemester() {
    	Showsemester.click();
    }
    
    public void Selectsemester() {
    	Selectsemester.click();
    }
//    
    public void Showbatches() {
    	Showbatches.click();
    }
    
    public void Selectbatch() {
    	Selectbatch.click();
    }
    
    public void viewbtn() {
    	viewbtn.click();
    }
    
    public void goback() {
    	goback.click();
    }
	
    
    
    //scenario3
    
  public void viewbt() {
	viewbt.click();
  }
  
  
}
    