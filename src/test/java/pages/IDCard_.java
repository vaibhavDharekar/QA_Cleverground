package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IDCard_ {

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

    @FindBy(xpath="//button[normalize-space()='Master Testing']")
    WebElement Showinstitude;
    
    @FindBy(xpath="//a[@role='button']")
    WebElement Selectinstitude;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole;
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRole;
    
    @FindBy(xpath = "//span[normalize-space()='ID Card']")
    WebElement IDCardModule;
    
    
    
    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-Templates']")
    WebElement SelectTemplateTab;
    
    @FindBy(xpath = "//div[@class='text-center']")
    WebElement SelectTemplate;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[4]/button[1]")
    WebElement SelectViewTemplate;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[4]/button[1]/span[1]")
    WebElement SelectSmallLogoSquareEdit;
    
    @FindBy(xpath = "//div[@id='basic_small_logo_square']//span[contains(text(),'Remove')]")
    WebElement SelectRemovePreviousImage;
    
    @FindBy(xpath = "//input[@style='display: none;']")
    WebElement UploadImage;
    
    @FindBy(xpath = "//span[normalize-space()='Save']")
    WebElement ImageSaveBtn;
    
    @FindBy(xpath = "//div[@class='c-container mt-20']//div[5]//div[1]//span[1]")
    WebElement ScrollDowntoBackView;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[4]")
    WebElement SelectBigLogoRectangleEdit;
    
    @FindBy(css = "//div[@id='basic_small_logo_square']//span[contains(text(),'Remove')]")
    WebElement SelectRemovePreviousImage2;
    
    @FindBy(xpath = "//input[@style='display: none;']")
    WebElement UploadImage2;
    
    @FindBy(xpath = "//span[normalize-space()='Save']")
    WebElement ImageSaveBtn2;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[4]/button[1]/span[1]")
    WebElement FullNameEdit;
    
    @FindBy(xpath = "//div[@class='ant-select c-project-status ant-select-single ant-select-show-arrow ant-select-open']//span[@title='Middle Name - Last Name - First Name'][normalize-space()='Middle Name - Last Name - First Name']")
    WebElement ShowFullNames;
    
    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Middle Name - First Name - Last Name']")
    WebElement SelectFullNames;
    
    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/button[2]/span[1]")
    WebElement SaveFullNames;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[7]/div[4]/button[1]/span[1]")
    WebElement EditBackText_Upper;
    
    @FindBy(xpath = "//textarea[@id='basic_back_text_upper']")
    WebElement EnterBackText_Upper;
    
    @FindBy(xpath = "//body[1]/div[8]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/button[2]")
    WebElement SaveBackText_Upper;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[4]/button[1]/span[1]")
    WebElement EditBackText_Lower;
    
    @FindBy(xpath = "//textarea[@id='basic_back_text_lower']")
    WebElement EnterBackText_Lower;
    
    @FindBy(xpath = "//body[1]/div[9]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/button[2]")
    WebElement SaveBackText_Lower;
    
    @FindBy(xpath = "//span[@title='All Departments']")
    WebElement ShowDep;
    
    @FindBy(xpath = "//div[contains(text(),'Admit Test')]")
    WebElement SelectDep;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")
    WebElement ShowPro;
    
    @FindBy(xpath = "//div[contains(text(),'New Admit')]")
    WebElement SelectPro;
    
    @FindBy(xpath = "//span[@title='All Year']")
    WebElement ShowYear;
    
    @FindBy(xpath = "//div[contains(text(),'Admit New program')]")
    WebElement SelectYear;
    
    @FindBy(xpath = "//span[@title='All Semester']")
    WebElement ShowSem;
    
    @FindBy(xpath = "//div[contains(text(),'semester -1')]")
    WebElement SelectSem;
    
    @FindBy(xpath = "//span[@title='All Batch']")
    WebElement ShowBatch;
    
    @FindBy(xpath = "//div[contains(text(),'Batch1')]")
    WebElement SelectBatch;
    
    @FindBy(xpath = "//span[normalize-space()='Create Bulk ID Cards']")
    WebElement CreateBulkCard;
    
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement CreateBulkCardPopupOk;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[5]/div[1]/button[1]")
    WebElement ViewStudent;
    
    @FindBy(xpath = "//span[contains(text(),'Click to Upload')]")
    WebElement StudentPhoto;
    
    @FindBy(xpath = "//input[@id='basic_full_name']")
    WebElement FullName;
    
    @FindBy(xpath = "//input[@id='basic_department_name']")
    WebElement DeptName;
    
    @FindBy(xpath = "//input[@id='basic_roll_no']")
    WebElement RollNo;
    
    @FindBy(xpath = "//input[@id='basic_phone_no_1']")
    WebElement PhoneNo;
    
    @FindBy(xpath = "//input[@id='basic_parent_no']")
    WebElement ParentNo;
    
    @FindBy(xpath = "//input[@id='basic_DOB']")
    WebElement DOB;
    
    @FindBy(xpath = "//input[@id='basic_blood_group']")
    WebElement BloodGroup;
    
    @FindBy(xpath = "//span[normalize-space()='Save']")
    WebElement SaveBtn;
    
    @FindBy(xpath = "//span[normalize-space()='Print ID Cards']")
    WebElement PrintIDCards;
    
    @FindBy(xpath = "//span[normalize-space()='Print']")
    WebElement Print;
    
    // Constructor
    public IDCard_(WebDriver driver) {
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
    
    public void IDCardModule() {
    	//IDCardModule.click();
    	Actions actions = new Actions(driver);
    	actions.doubleClick(IDCardModule).perform();
	}
    
    public void SelectTemplateTab() {
    	SelectTemplateTab.click();
	}
    
    public void SelectTemplate() {
    	SelectTemplate.click();
	}
    
    public void SelectViewTemplate() {
    	SelectViewTemplate.click();
	}
    
    public void SelectSmallLogoSquareEdit() {
    	SelectSmallLogoSquareEdit.click();
	}
    
    public void SelectRemovePreviousImage() {
    	
    	if (SelectRemovePreviousImage.isDisplayed()) {
    		SelectRemovePreviousImage.click(); // Click the element if it's displayed
            System.out.println("Element was clicked successfully.");
        } else {
            System.out.println("Element is not displayed, cannot click.");
        }
	}
   
	public void UploadImage(String filepath) {
    	UploadImage.sendKeys(filepath);
	}
    
    public void ImageSaveBtn() {
    	ImageSaveBtn.click();
	}
    
    public void ScrollDowntoBackView() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollDowntoBackView);
	}
        
    public void SelectBigLogoRectangleEdit() {
    	SelectBigLogoRectangleEdit.click();
	}
    
    public void SelectRemovePreviousImage2() {
    	if (SelectRemovePreviousImage2.isDisplayed()) {
    		SelectRemovePreviousImage2.click(); // Click the element if it's displayed
        System.out.println("Element was clicked successfully.");
    } else {
        System.out.println("Element is not displayed, cannot click.");
    }
    	
	}
    
    public void UploadImage2(String filepath) {
    	UploadImage2.sendKeys(filepath);
	}
    
    public void ImageSaveBtn2() {
    	ImageSaveBtn2.click();
	}
    
    public void FullNameEdit() {
    	FullNameEdit.click();
	}
    
    public void ShowFullNames() {
    	ShowFullNames.click();
	}
    
    public void SelectFullNames() {
    	SelectFullNames.click();
	}
    
    public void SaveFullNames() {
    	SaveFullNames.click();
	}
    
    public void EditBackText_Upper() {
    	EditBackText_Upper.click();
	}
    
    public void EnterBackText_Upper() {
    	EnterBackText_Upper.sendKeys("Entered_BackText_Upper");
	}
    
    public void SaveBackText_Upper() {
    	SaveBackText_Upper.click();
	}
    
    public void EditBackText_Lower() {
    	EditBackText_Lower.click();
	}
    
    public void EnterBackText_Lower() {
    	EnterBackText_Lower.sendKeys("Entered_BackText_Lower");
	}
    
    public void SaveBackText_Lower() {
    	SaveBackText_Lower.click();
	}
    
    public void ShowDep() {
    	ShowDep.click();
	}
    
    public void SelectDep() {
    	SelectDep.click();
	}
    
    public void ShowPro() {
    	ShowPro.click();
	}
    
    public void SelectPro() {
    	SelectPro.click();
	}
    
    public void ShowYear() {
    	ShowYear.click();
	}
    
    public void SelectYear() {
    	SelectYear.click();
	}
    
    public void ShowSem() {
    	ShowSem.click();
	}
    
    public void SelectSem() {
    	SelectSem.click();
	}
    
    public void ShowBatch() {
    	ShowBatch.click();
	}
    
    public void SelectBatch() {
    	SelectBatch.click();
	}
    
    public void CreateBulkCardPopupOk() {
    	CreateBulkCardPopupOk.click();
	}
    
    public void ViewStudent() {
    	ViewStudent.click();
	}
    
    public void StudentPhoto(String filePath) {
    	StudentPhoto.sendKeys(filePath);
	}
    
    public void FullName() {
    	FullName.sendKeys("Mayur Maruti Patil");
	}
    
    public void DeptName() {
    	DeptName.sendKeys("Mech");;
	}
    
    public void RollNo() {
    	RollNo.sendKeys("36");
	}
    
    public void PhoneNo() {
    	PhoneNo.sendKeys("7304922773");
	}
    
    public void ParentNo() {
    	ParentNo.sendKeys("7304922773");
	}
    
    public void DOB() {
    	DOB.sendKeys("03:03:1994");
	}
    
    public void BloodGroup() {
    	BloodGroup.sendKeys("O Rh positive (O+)");
	}
    
    public void SaveBtn() {
    	Actions actions = new Actions(driver);
      	actions.doubleClick(SaveBtn).perform();
	}
    
    public void PrintIDCards() {
    	PrintIDCards.click();
	}
    
    public void Print() {
    	Actions actions = new Actions(driver);
      	actions.doubleClick(Print).perform();
	}
    
    
    
    
}
