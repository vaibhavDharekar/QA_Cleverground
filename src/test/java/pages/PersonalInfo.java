package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
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
    
    @FindBy(xpath="(//a[normalize-space()='LMS Testing'])[1]")
    WebElement Selectinstitude;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole;
    
    @FindBy(xpath="//a[normalize-space()='Student']")
    WebElement SelectRole;
    
    @FindBy(xpath="(//span[@class='linkText'][normalize-space()='Admissions'])[1]")
    WebElement SelectAdmission;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement AdmissionPortal;
    
    @FindBy(xpath ="//div[@id='rc-tabs-0-panel-Admission Portal']//div[4]//div[1]//div[7]//a[1]")
    WebElement Applied;
    
    @FindBy(xpath ="(//span[normalize-space()='View Application'])[1]")
    WebElement ViewApplication;
    //persoanlInfo
    
    @FindBy(xpath ="(//a[@class='c-btn link'][normalize-space()='View'])[6]")
    WebElement PersonalView;
    
    @FindBy(xpath ="//span[normalize-space()='Edit']")
    WebElement PersonalEdit;
    
    @FindBy(xpath ="(//span[@title='Mr'])[1]")
    WebElement Mr;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='Mr'])[1]")
    WebElement MrSelect;
    
    @FindBy(xpath ="(//input[@id='basic_first_name'])[1]")
    WebElement PersonalFirstName;
    
    @FindBy(xpath ="(//input[@id='basic_middle_name'])[1]")
    WebElement PersonalMiddleName;
    
    @FindBy(xpath ="(//input[@id='basic_last_name'])[1]")
    WebElement PersonalLastName;
    
    @FindBy(xpath ="(//input[@id='basic_mother_name'])[1]")
    WebElement MotherNameP;
    
    @FindBy(xpath ="(//input[@id='basic_email_id'])[1]")
    WebElement PersonalEmail;
    
     @FindBy(xpath ="(//input[@id='basic_DOB'])[1]")
     WebElement DOB;
    
    @FindBy(xpath ="(//div[normalize-space()='21'])[1]")
    WebElement DOBSelect;
    
    @FindBy(xpath ="(//input[@value='Male'])[1]")
    WebElement Male;
    
    @FindBy(xpath ="(//input[@id='basic_phone_no_1'])[1]")
    WebElement Contact;
    
    @FindBy(xpath ="(//input[@id='basic_phone_no_2'])[1]")
    WebElement AddContact;
    
    @FindBy(xpath ="(//input[@id='basic_whatsapp_number'])[1]")
    WebElement WhatsApp;
    
    @FindBy(xpath ="(//input[@id='basic_local_address_line_1'])[1]")
    WebElement AddressLine1;
    
    @FindBy(xpath ="(//input[@id='basic_local_address_line_2'])[1]")
    WebElement AddressLine2;
    
    @FindBy(xpath ="(//input[@id='basic_local_country'])[1]")
    WebElement Country;
    
    @FindBy(xpath ="//div[@class='ant-select-item-option-content'][normalize-space()='India']")
    WebElement India;
    
    @FindBy(xpath ="(//input[@id='basic_local_state'])[1]")
    WebElement StateP;
    
  @FindBy(xpath ="(//div[contains(text(),'Maharashtra')])[1]")
  WebElement Maharashtra;
    
    @FindBy(xpath ="(//input[@id='basic_local_district'])[1]")
    WebElement District;
    
    @FindBy(xpath ="(//div[contains(text(),'Kolhapur')])[1]")
    WebElement Kolhapur;
    
    @FindBy(xpath ="(//input[@id='basic_local_city'])[1]")
    WebElement Town;
    
    @FindBy(xpath ="(//input[@id='basic_local_pincode'])[1]")
    WebElement PinCodeP;
    
    @FindBy(xpath ="(//input[@type='checkbox'])[37]")
    WebElement ChackAddress;
    
    @FindBy(xpath ="(//input[@id='basic_nationality'])[1]")
    WebElement Nationality;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='Indian'])[1]")
    WebElement Indian;
    
    @FindBy(xpath ="(//input[@id='basic_is_minority'])[1]")
    WebElement IsMinority;
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='No'])[1]")
    WebElement MinorityNo;
    
    @FindBy(xpath ="(//input[@id='basic_religion'])[1]")
    WebElement Religion;
    
    @FindBy(xpath ="(//div[contains(text(),'Hindu')])[1]")
    WebElement Hindu;
    
    @FindBy(xpath ="(//input[@id='basic_caste'])[1]")
    WebElement Caste;
    
    @FindBy(xpath ="(//div[contains(text(),'Other')])[1]")
    WebElement Other;
    
    @FindBy(xpath ="(//input[@id='basic_other_caste'])[1]")
    WebElement OtherCaste;
    
    @FindBy(xpath ="(//input[@id='basic_catagory'])[1]")
    WebElement Catagory;
    
    
    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='OPEN'])[1]")
    WebElement Open;
    
    @FindBy(xpath ="(//input[@id='basic_mother_tongue'])[1]")
    WebElement MotherTongue;
    
    @FindBy(xpath ="(//div[@class='rc-virtual-list-holder-inner'])[10]")
    WebElement MotherTongueDropdown;
    
    @FindBy(xpath ="(//div[contains(text(),'Hindi')])[1]")
    WebElement Hindi;
    
    @FindBy(xpath ="(//div[contains(text(),'Hindi')])[2]")
    WebElement Hindi2;
    
    @FindBy(xpath ="(//div[@class='ant-select-selection-overflow'])[1]")
    WebElement Language;
    
    @FindBy(xpath ="//input[@id='basic_facebook_account_id']")
    WebElement FacebookId;
    
    @FindBy(xpath ="//input[@id='basic_linkedin_account_id']")
    WebElement LinkedinId;
    
    @FindBy(xpath ="//input[@id='basic_twitter_account_id']")
    WebElement TwitterId;
    
    @FindBy(xpath ="//input[@id='basic_instagram_account_id']")
    WebElement InstaId;
    
    @FindBy(xpath ="(//input[@type='file'])[1]")
    WebElement Profile;
    
    @FindBy(xpath ="(//input[@type='file'])[2]")
    WebElement Signature;
    
    @FindBy(xpath ="//span[text()='Confirm']")
    WebElement Confirm;
    
    @FindBy(xpath ="(//span[text()='Confirm'])[2]")
    WebElement Confirm2;
    
   
    
   
    
    public PersonalInfo(WebDriver driver) {
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
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", Showinstitude);
  //  	Showinstitude.click();
    }

    public void Selectinstitude() {
    	//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
      //  jsExecutor.executeScript("arguments[0].click();", Selectinstitude);
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
    public void PersonalView() {
    	PersonalView.click();
    }
    public void PersonalEdit() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0, 0);"); 
    	PersonalEdit.click();
    }
    public void Mr() {
    	Mr.click();
    }
    public void MrSelect() {
    	MrSelect.click();
    }
    public void PersonalFirstName() {
    	PersonalFirstName.sendKeys("ABC");
    }
    public void PersonalMiddleName() {
    	PersonalMiddleName.sendKeys("ABC");
    }
    public void PersonalLastName() {
    	PersonalLastName.sendKeys("ABC");
    }
    public void MotherNameP() {
    	MotherNameP.sendKeys("ABC");
    }
    public void PersonalEmail() {
    	PersonalEmail.sendKeys("Personal@gmail.com");
    }
    public void DOB() {
    	DOB.click();
    }
    public void DOBSelect() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0, 0);"); 
    	DOBSelect.click();
    }
    public void Male() {
    	Male.click();
    }
    public void Contact() {
    	Contact.sendKeys("7038498444");
    }
    public void AddContact() {
    	AddContact.sendKeys("7038498444");
    }
    public void WhatsApp() {
    	WhatsApp.sendKeys("7038498444");
    }
    public void AddressLine1() {
    	AddressLine1.sendKeys("Sangli");
    }
    public void AddressLine2() {
    	AddressLine2.sendKeys("Pune");
    }
    public void Country() {
    	Country.click();
    }
    public void India() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0, 0);"); 
    	India.click();
    }
    public void StateP() {
    	StateP.click();
    }
    public void Maharashtra() {
    	Maharashtra.click();
    }
    public void District() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0, 0);"); 
    	District.click();
    }
    public void Kolhapur() {
    	Kolhapur.click();
    }
    public void Town() {
    	Town.sendKeys("Sangli");
    }
    public void PinCodeP() {
    	PinCodeP.sendKeys("416410");
    }
    public void ChackAddress() {
    	ChackAddress.click();
    }
    public void Nationality() {
    	Nationality.click();
    }
    public void Indian() {
    	Indian.click();
    }
    public void IsMinority() {
    	IsMinority.click();
    }
    public void MinorityNo() {
    	MinorityNo.click();
    }
    public void Religion() {
    	Religion.click();
    }
    public void Hindu() {
    	Hindu.click();
    }
    public void Caste() {
    	Caste.click();
    }
    public void Other() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", Other);	
//    	Other.click();
    }
    public void OtherCaste() {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("arguments[0].click()", OtherCaste);
    	OtherCaste.sendKeys("Maratha");
    }
    public void Catagory() {
    	Catagory.click();
    }
    public void Open() {
    	Open.click();
    }
    public void MotherTongue() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,425)");
    	Thread.sleep(1000);
    	MotherTongue.click();
//    	Thread.sleep(1000);
//    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
//    	js1.executeScript("arguments[0].scrollBy(0,-200);", MotherTongueDropdown);
    }
    public void Hindi() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", Hindi);			
//    	Marathi.click();
    }
    public void Language() {
    	Language.click();
    }
    public void FacebookId(String id) {
    	FacebookId.sendKeys(id);
    }
    public void LinkedinId(String id) {
    	LinkedinId.sendKeys(id);
    }
    public void TwitterId(String id) {
    	TwitterId.sendKeys(id);
    }
    public void InstagramId(String id) {
    	InstaId.sendKeys(id);
   }
    public void Hindi2() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", Hindi2);			
//    	Marathi.click();
    }
    public void ProfilePhoto(String img) {
    	Profile.sendKeys(img);
   }
    public void Signature(String img) {
    	Signature.sendKeys(img);
   }
    public void Confirm() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", Confirm);
//    	Confirm.click();
   }
    public void Confirm2() throws InterruptedException {
    	Thread.sleep(1000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", Confirm2);
//    	Confirm.click();
   }
   
 
 
   
}
