package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;


public class SpaceManagement {

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
    
    
    
    @FindBy(xpath="//a[contains(text(), 'LMS Testing')]")
    WebElement SelectInstitute;
    
    @FindBy(xpath="//button[contains(text(), 'Testing')]")
    WebElement ShowInstitute;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRoles;
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRoleAdministrator;
    
    @FindBy(xpath="//span[normalize-space()='Spaces Management']")
    WebElement SelectSpaceManagementModule;
    
    @FindBy(xpath="//span[normalize-space()='Create New Space']")
    WebElement SelectCreateNewSpace;
    
    @FindBy(xpath="//input[@id='spaceform_space_name']")
    WebElement EnterSpaceName;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")
    WebElement ShowSpaceType;
    
    @FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='Classroom']")
    WebElement SelectSpaceTypeClassroom;
    
    @FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='Library']")
    WebElement SelectSpaceTypeLibrary;
    
    @FindBy(xpath="//span[normalize-space()='Add Space Image']")
    WebElement AddAlbum;
    
    @FindBy(xpath="//span[normalize-space()='Create Space Album']")
    WebElement CreateSpaceAlbum;
    
    @FindBy(xpath="//textarea[@id='basic_description']")
    WebElement Description;
    
    @FindBy(xpath="//input[@id='basic_upload_image_link']")
    WebElement ClickToUpload;
    
    @FindBy(xpath="//span[normalize-space()='Add']")
    WebElement AddBtn;
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    WebElement ConfirmPopupOK;
    
    @FindBy(xpath="//div[@class='ant-modal-wrap']//span[@class='ant-modal-close-x']")
    WebElement Cancelok;
    
    @FindBy(xpath="//button[@class='ant-btn ant-btn-primary c-btn']")
    WebElement Savebtn;
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    WebElement Okbtn;
    
    @FindBy(xpath="//div[@class='c-container is-filled mt-20']//div[2]//div[1]//div[5]//a[1]")
    WebElement ViewSpace;
    
    @FindBy(xpath="//span[normalize-space()='Edit Space']")
    WebElement EditSpace;
    
    
    
    @FindBy(xpath="//input[@id='spaceform_space_code']")
    WebElement SpaceCode;
    
    @FindBy(xpath="//input[@id='spaceform_space_capacity']")
    WebElement SpaceCapacity;
    
    @FindBy(xpath="//input[@id='spaceform_total_capacity']")
    WebElement CarpetTotalArea;
    
    @FindBy(xpath="//input[@id='spaceform_area']")
    WebElement SpaceTotalArea;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/form[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    WebElement ShowUnit;
    
//    @FindBy(xpath="(//div[@title='Sq.ft'])[1]")
//    WebElement ClickUnitSqfeet;
    
  @FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='Sq.ft']")
  WebElement ClickUnitSqfeet;
    
    
  
    
    @FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='inch']")
    WebElement ClickUnitInch;
    
    
  
    
    @FindBy(xpath="//input[@id='spaceform_building']")
    WebElement BuildingName;
    
    @FindBy(xpath="(//input[@id='spaceform_floor'])[1]")
    WebElement EnterLevel;
    
    
    
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
    WebElement DeleteSpaceOk;
    
    @FindBy(xpath="//span[text()='Delete Space']")
    WebElement DeleteSpace;
    
    @FindBy(xpath="//input[@id='spaceform_building']")
    WebElement Building;
    
    @FindBy(xpath="//input[@id='spaceform_floor']")
    WebElement Floor;
    
    @FindBy(xpath="//input[@id='spaceform_event']")
    WebElement Event;
    
    @FindBy(xpath="//input[@id='spaceform_exam']")
    WebElement Exam;
    
    @FindBy(xpath="//input[@id='spaceform_lectures']")
    WebElement Lecture;
    
    @FindBy(xpath="//span[text()='Create New Space']")
    WebElement CreateNewSpace;
    
    @FindBy(xpath="//span[text()='Space Management']")
    WebElement SpanSpaceManagement;
    
    @FindBy(xpath="//span[text()='Delete']")
    WebElement DeleteImage;
    
    @FindBy(xpath="//button[text()='OK']")
    WebElement DeleteImageOkBtn;
    
    @FindBy(xpath="//span[normalize-space()='Download Space List']")
    WebElement DownloadSpaceList;
    
  
    
    
    
  //input[@id='spaceform_event']

    
  
    

    
 
    
  
   
  
   
  
  
    
 // Constructor
    public SpaceManagement(WebDriver driver)  {

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
    
    
    public void ShowInstitutes() throws InterruptedException{
    	Thread.sleep(1000);
    	ShowInstitute.click();
    }
    
    public void SelectInstitutes() throws InterruptedException {
    	Thread.sleep(1000);
    	SelectInstitute.click();
    }
    
    public void ShowRoles() {
    	ShowRoles.click();
    }
    
    public void SelectRoleAdministrator() {
    	SelectRoleAdministrator.click();
    }
    
    public void SelectSpaceManagementModule() {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",SelectSpaceManagementModule);
        SelectSpaceManagementModule.click();

    }
    
    public void SelectCreateNewSpace() {
    	Actions actions = new Actions(driver);
        actions.doubleClick(SelectCreateNewSpace).perform();
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",SelectCreateNewSpace);
    }
    
    public void EnterSpaceName(String str)throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", CreateNewSpace);
    	EnterSpaceName.click();
    	EnterSpaceName.clear();
    	String currentText = EnterSpaceName.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	EnterSpaceName.sendKeys("\u0008");     // Unicode for Backspace
        }
    	EnterSpaceName.sendKeys(str);
    }
  
    public void ShowSpaceType()throws InterruptedException {
		Thread.sleep(500);

    	ShowSpaceType.click();
    }
    
    public void SelectSpaceTypeClassroom()throws InterruptedException {
		Thread.sleep(500);
    	SelectSpaceTypeClassroom.click();
    }
   
    public void SelectSpaceTypeLibrary() throws InterruptedException {
		Thread.sleep(500);
    	SelectSpaceTypeLibrary.click();
    }
    
    public void AddAlbum() throws InterruptedException {
		Thread.sleep(500);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",AddAlbum);
    
    }
    
    public void CreateSpaceAlbum() throws InterruptedException {
		Thread.sleep(500);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",CreateSpaceAlbum);
    	
    }
    
    public void Description(String des) throws InterruptedException {
		Thread.sleep(500);
    	Description.sendKeys(des);
    }
    
    public void Building(String des) throws InterruptedException {
		Thread.sleep(500);
    	Building.sendKeys(des);
    }
    
    public void Floor(String des) throws InterruptedException {
		Thread.sleep(500);
    	Floor.sendKeys(des);
    }
	
    public void ClickToUpload(String filepath) throws InterruptedException {
		Thread.sleep(500);
    	ClickToUpload.sendKeys(filepath);
    }
    
    public void AddBtn() throws InterruptedException {
		Thread.sleep(500);
		Actions actions = new Actions(driver);
        actions.doubleClick(AddBtn).perform();
//    	AddBtn.click();
    }
    
    
    public void ConfirmPopupOK() throws InterruptedException {
		Thread.sleep(500);
		Actions actions = new Actions(driver);
        actions.doubleClick(ConfirmPopupOK).perform();
//    	ConfirmPopupOK.click();
    }
    
    public void DeleteImage() throws InterruptedException {
		Thread.sleep(500);
    	DeleteImage.click();
    }
    
    public void DeleteImageOkBtn() throws InterruptedException {
		Thread.sleep(500);
    	DeleteImageOkBtn.click();
    }
    
    public void Cancelok() throws InterruptedException {
		Thread.sleep(500);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",Cancelok);
    	
    }
    
    public void Savebtn() throws InterruptedException {
    	Thread.sleep(1500);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",Savebtn);
    	Thread.sleep(1500);
    }
    
    public void Okbtn() throws InterruptedException {
		Thread.sleep(500);
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second wait
//        wait.until(ExpectedConditions.elementToBeClickable(Okbtn));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",Okbtn);
    }
    
    public void ViewSpace() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", SpanSpaceManagement);
		Actions actions = new Actions(driver);
        actions.doubleClick(ViewSpace).perform();
//    	ViewSpace.click();
    }
   
    public void EditSpace() throws InterruptedException {
    	Thread.sleep(500);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",EditSpace);
    	Thread.sleep(500);

    }
    
    public void SpaceCode(String code) throws InterruptedException {
		Thread.sleep(500);
    	SpaceCode.click();
    	SpaceCode.clear();
    	String currentText = SpaceCode.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	SpaceCode.sendKeys("\u0008");     // Unicode for Backspace
        }
        SpaceCode.sendKeys(code);
    }
    
    public void SpaceCapacity(String capacity) throws InterruptedException {
		Thread.sleep(500);
    	SpaceCapacity.click();
    	SpaceCapacity.clear();
    	String currentText = SpaceCapacity.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	SpaceCapacity.sendKeys("\u0008");     // Unicode for Backspace
        }
        SpaceCapacity.sendKeys(capacity);
    }
    
    public void CarpetTotalArea(String carpet) throws InterruptedException {
		Thread.sleep(500);
    	CarpetTotalArea.click();
    	CarpetTotalArea.clear();
    	String currentText = CarpetTotalArea.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	CarpetTotalArea.sendKeys("\u0008");     // Unicode for Backspace
        }
        CarpetTotalArea.sendKeys(carpet);
    }
    
    public void SpaceTotalArea(String area) throws InterruptedException {
		Thread.sleep(500);
    	SpaceTotalArea.click();
    	SpaceTotalArea.clear();
    	String currentText = SpaceTotalArea.getAttribute("value");
        for (int i = 0; i < currentText.length(); i++) {
        	SpaceTotalArea.sendKeys("\u0008");     // Unicode for Backspace
        }
        SpaceTotalArea.sendKeys(area);
    }
    
    public void ShowUnit() throws InterruptedException {
		Thread.sleep(500);
        ShowUnit.click();
    }
    
    public void ClickUnitSqfeet() throws InterruptedException {
		Thread.sleep(500);
        ClickUnitSqfeet.click();
    }
    
    public void ClickUnitInch() throws InterruptedException {
		Thread.sleep(500);
        ClickUnitInch.click();
    }
   
    public void Event() throws InterruptedException {
		Thread.sleep(500);
        Event.click();
    }
    
    public void Exam() throws InterruptedException {
		Thread.sleep(500);
        Exam.click();
    }
    
    public void Lectures() throws InterruptedException {
		Thread.sleep(500);
        Lecture.click();
    }
    
    public void DeleteSpace() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", CreateNewSpace);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",DeleteSpace);
    }
    
    public void scroll200() throws InterruptedException {
		Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");  // Scrolls down 200 pixels
    }
    
    public void Download() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",DownloadSpaceList);
//        DownloadSpaceList.click();
    }
    
    
    
}
