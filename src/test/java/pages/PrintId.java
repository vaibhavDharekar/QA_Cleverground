package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PrintId {
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
    
    @FindBy(xpath="//button[@type='button']//span[text()='View']")
    WebElement View;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/button[1]/span[1]")
    WebElement ViewBtn;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/button[2]")
    WebElement Print1;
    
    @FindBy(xpath="//button[@class='ant-btn c-btn']")
    WebElement Print2;


    
    
  
    
    
    
    
    
    
    
    
 // Constructor
    public PrintId(WebDriver driver) {
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
    
    public void View() throws InterruptedException {
    	Thread.sleep(1000);
    	View.click();
    }

   
    public void Print1() {
    	jsExecutor.executeScript("arguments[0].click();", Print1);	
    }
    
    public void Print2() {
    	jsExecutor.executeScript("arguments[0].click();", Print2);
    }    
}
