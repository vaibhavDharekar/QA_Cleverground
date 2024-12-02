package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v126.browser.model.DownloadProgress;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar1 {
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
    WebElement Showinstitude;
    
    @FindBy(xpath="//a[normalize-space()='master Testing institute 2']")
    WebElement Selectinstitude;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectRole;
    
    @FindBy(xpath="//span[@class='linkText'][normalize-space()='Calendar1']")
    WebElement Calendar;
    
    @FindBy(xpath="//span[normalize-space()='List View']")
    WebElement ListView;
    
    @FindBy(xpath="//div[@class='c-mainWrapper']//div[2]//div[1]//div[7]//a[1]")
    WebElement View;
    
    @FindBy(xpath="//span[normalize-space()='View']")
    WebElement View1;
    
    @FindBy(xpath="//span[normalize-space()='Download PDF']")
    WebElement DownloadProgress;
    
    
    // Constructor
    public Calendar1(WebDriver driver) {
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

    public void ShowInstitudes(){
    	Showinstitude.click();
    }

    public void Selectinstitudes() {
    	Selectinstitude.click();
    }

    public void ShowRoles() {
    	ShowRole.click();
    }

    public void SelectRoles() {
    	SelectRole.click();
    }	

    public void Calendar() {
    	Calendar.click();
    }   
    public void ListView() {
    	ListView.click();
    }   
    public void View() {
    	View.click();
    }
    public void View1() {
    	View1.click();
    }
    public void DownloadProgress() {
    	DownloadProgress.click();
    	
    }
	
		
	}

   
		
	

    
    
    
    
    
    
    


    
   
