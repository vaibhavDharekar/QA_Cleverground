package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CreateBulkIdCards {
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
    WebElement SelectHidcardModule;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
    WebElement Showdepartments;
    
    @FindBy(xpath="//div[contains(text(),'Admit Test')]")
    WebElement Selectdepartment;
    
//    @FindBy(xpath="//span[@title='All Program']]")
//    WebElement Showprograms;
    
    @FindBy(xpath="//span[@title='All Program']")
    WebElement Showprograms;
    
    @FindBy(xpath="//div[contains(text(),'New Admit')]")
    WebElement Selectprogram;
    
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
   
    @FindBy(xpath="//div[contains(text(),'Batch1')]")
    WebElement Selectbatch;
    
    @FindBy(xpath="//span[normalize-space()='Create Bulk ID Cards']")
    WebElement Createbulk;
    
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
    WebElement okbtn;
    
    @FindBy(xpath="//button[text()='View']")
    WebElement View;
    
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement Save;
    
// SCENARIO 2 START
    @FindBy(xpath="//span[normalize-space()='ID Card']")
    WebElement SelectIDcardModule;
    
    @FindBy(xpath="//input[@placeholder='Search by Name...']")
    WebElement SearchByName;
    
    @FindBy(xpath="//span[normalize-space()='View']")
    WebElement ViewS2;
    
    @FindBy(xpath="//button[normalize-space()='View']")
    WebElement ViewBtn;
    
    @FindBy(xpath="//button[@class='c-btn' and text()='Print']")
    WebElement Print1;
    
    @FindBy(xpath="//span[normalize-space()='Print']")
    WebElement Print2;
    
//    16-10-2024 start
    @FindBy(xpath="//div[@class='c-container mt-20']")
    List<WebElement> AllStudentsOfBatch;
    
    @FindBy(xpath="//div[contains(@style,'background-color: rgb(183, 28, 28)')]")
    List<WebElement> NotReadyToPrintStudentsOfTheBatch;
    
    @FindBy(xpath="//input[@id='basic_full_name']")
    WebElement FullName;
    
    @FindBy(xpath="//input[@id='basic_upload_photo']")
    WebElement UploadImage;
    
    

   
//  16-10-2024 end
    
 // Constructor
    public CreateBulkIdCards(WebDriver driver) {
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
    
    public void SelectHidcardModule() {
    	SelectHidcardModule.click();
    }
    
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
    
    public void Showbatches() {
    	Showbatches.click();
    }
    
    public void Selectbatch() {
    	jsExecutor.executeScript("arguments[0].click();", Selectbatch);
//    	Selectbatch.click();
    }
    
    public void Createbulk() {
    	Createbulk.click();
    }
    
    public void okbtn() throws InterruptedException {
    	jsExecutor.executeScript("arguments[0].click();", okbtn);
//    	okbtn.click();
    }
    
    public void viewStudentsInfo(){
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    	List<WebElement> eles = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@style,'background-color: rgb(183, 28, 28)')]")));

    	int len = NotReadyToPrintStudentsOfTheBatch.size();
    	System.out.println(len);
//    	for(int i=0;i<len;i++) {
    		WebElement ele = NotReadyToPrintStudentsOfTheBatch.get(0);
    //		WebElement viewButton = ele.findElement(By.xpath("./div[1]//button[text()='View']"));
    		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",ele);
    		jsExecutor.executeScript("arguments[0].click();", ele);
    		WebElement viewButton = ele.findElement(By.xpath("(//div[contains(@style,'rgb(183, 28, 28)')]//button[text()='View'])[1]"));
    		jsExecutor.executeScript("arguments[0].click();", viewButton);
    	//	viewButton.click();
    		//     ele.click();
//    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void View() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'c-btn') and normalize-space(text())='View']")));
    	button.click();
//    	View.click();
    }
    
    public void fullName(String str) {
    	 FullName.sendKeys(str);
    }
    
    public void uploadImage(String str) {
   	 UploadImage.sendKeys(str);
   }
    
    public void saveBtn() {
    	Save.click();
    }

    }
    

    







    


    
  

   



