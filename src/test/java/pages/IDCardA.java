package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IDCardA {
    WebDriver driver;
    JavascriptExecutor jsExecutor;

    // Define all the page elements with @FindBy annotations
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(id = "formBasicCheckbox1")
    WebElement chkboxBtn;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class='c-header']")
    WebElement showInstitutes;

    @FindBy(xpath = "//button[normalize-space()='Master Testing']")
    WebElement selectInstitutes;

    @FindBy(xpath = "//button[normalize-space()='Administrator']")
    WebElement showRole;

    @FindBy(xpath = "//span[normalize-space()='ID Card']")
    WebElement idCardTab;
    
    @FindBy(xpath ="//span[contains(text(),'Click to Upload')]")
    WebElement smalllogo;
    

    //First Scenraio
//    
//    @FindBy(xpath = "//input[@placeholder='Search by Name...']")
//    WebElement searchField;
    
//    Second Scenario
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement templates;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/canvas[1]")
    WebElement Clicktemplates;
    
    @FindBy(xpath ="//div[@class='c-mainWrapper']//div[2]//div[1]//div[4]//button[1]")
    WebElement view;
    
    @FindBy(xpath ="//button[@fdprocessedid='pdzdtc']//span[contains(text(),'Edit')]")
    WebElement editButton;
    
    @FindBy(xpath ="//div[@class='c-wrapper type-vh100']//div[3]//div[4]//button[1]//span[1]")
    WebElement edit3;
    
    @FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement drop;
    
    @FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")
    WebElement name;
    
    @FindBy(xpath ="//button[@type='submit']//span[normalize-space()='Save']")
    WebElement save;
    
    @FindBy(xpath ="//div[5]//div[2]//div[1]//div[4]//button[1]//span[1]")
    WebElement edit5;
    
    @FindBy(xpath ="//textarea[@id='basic_back_text_upper']")
    WebElement upper;
    
    @FindBy(xpath ="//body/div/div[@class='ant-modal-root']/div[2]")
    WebElement save2;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[4]/button[1]/span[1]")
    WebElement edit6;
    
    @FindBy(xpath ="//textarea[@id='basic_back_text_lower']")
    WebElement lower;
    
    @FindBy(xpath ="//div[2]//div[1]//div[2]//div[2]//div[1]//form[1]//div[2]//button[2]//span[1]")
    WebElement save3;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement printd;
    
    @FindBy(xpath ="//button[@type='button']")
    WebElement print;
    
    @FindBy(xpath ="//button[text()='Print Default']")
    WebElement PrintDefault;
    
  
    
    public IDCardA(WebDriver driver) {
        this.driver = driver;
        this.jsExecutor = (JavascriptExecutor) driver; // Initialize JavascriptExecutor
        PageFactory.initElements(driver, this); // Initialize elements using PageFactory
    }

    // Define page actions
    public void CGlogin(String uname, String pwd) {
        userName.sendKeys(uname);
        password.sendKeys(pwd);
        chkboxBtn.click();
        loginBtn.click();
    }

    public void showInstitutes() {
        showInstitutes.click();
    }

    public void selectInstitutes() {
        selectInstitutes.click();
    }

    public void showRoles() {
        showRole.click();
    }

    public void clickIDCard() {
        idCardTab.click();
    }

    //Scenrio 1
    
    
//    public void searchUser(String userName) {
//    	
//      //  searchField.clear();  // Clear the field before sending keys
//        searchField.sendKeys(userName);  // Input the user name to search
//    }
    //Scenrio 2
    public void templates() {
    	templates.click();
		
	}
    public void Clicktemplates() {
    	Clicktemplates.click();
    }
    public void view() {
    	view.click();
    }
    public void edit() {
    	editButton.click();
    }
    public void smalllogo(String filepath) {
    	smalllogo.sendKeys(filepath);;
		
	}
    public void edit3() {
    	edit3.click();
    }
    public void drop() {
    	drop.click();
    }
    public void Name() {
    	name.click();
    }
    public void save() {
    	jsExecutor.executeScript("arguments[0].click();", save);	
//    	save.click();
    }
    public void edit5() {
    	edit5.click();
    }
    public void upperText(String uppertext) {
    	upper.clear();  // Clear the field before sending keys
        upper.sendKeys(uppertext);
    	
    }
    public void save2() {
    	save2.click();
    }
    public void edit6() {
    	edit6.click();
    }
    public void lowerText(String lowertext) {
    	lower.clear();  // Clear the field before sending keys
        lower.sendKeys(lowertext);
    	
    }
    public void save3() {
    	save3.click();
    }
    public void printd() {
    	printd.click();
    }
    public void print() {
    	jsExecutor.executeScript("arguments[0].click();", print);
//    	print.click();
    }
    public void printDefault() {
    	jsExecutor.executeScript("arguments[0].click();", PrintDefault);
    }

}
