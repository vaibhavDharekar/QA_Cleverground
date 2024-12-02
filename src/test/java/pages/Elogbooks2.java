package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elogbooks2 {
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
    
    @FindBy(xpath="//a[contains(text(), 'LMS Testing')]")
    WebElement Selectinstitude;
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectRole;
    
    @FindBy(xpath="//span[normalize-space()='E-Logbook']")
    WebElement SelectElogbooks; 
    
    @FindBy(xpath="//a[normalize-space()='View']")
    WebElement View; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement ViewGuide;
    
    @FindBy(xpath="//span[text()='Guides']")
    WebElement GuideBack;
    
    
    
    @FindBy(xpath="(//a[text()='View'])[2]")
    WebElement ViewElogbookCover;
    
    @FindBy(xpath="//span[text()='Back']")
    WebElement Back;
    
    @FindBy(xpath="//a[@class='c-btn link' and contains(@href,'Automation') and contains(@href,'Testing')]")
    WebElement Manage;
    
    @FindBy(xpath="//a[text()='View']")
    WebElement View2;
    
    @FindBy(xpath="//button[text()='Edit']")
    WebElement Edit;
    
    @FindBy(xpath="//input[@type='Number']")
    WebElement text;
    
    @FindBy(xpath="//span[text()='Click to Upload']")
    WebElement UploadImage;
    
    @FindBy(xpath="//span[text()='Click to Upload']//input")
    WebElement UploadImage2;
    
    @FindBy(xpath="//span[contains(@title, 'Assessed')]")
    WebElement ShowAssessedDropdown;
    
    @FindBy(xpath="(//div[text()='Assessed'])[2]")
    WebElement SelectAssessedDropdown;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement SubmitForm;
    
    @FindBy(xpath="//button[text()='OK']")
    WebElement OKBtn;
    
    @FindBy(xpath="//span[text()='Automation Testing']")
    WebElement AutomationTestingBack;
    
    @FindBy(xpath="(//div[@role='tab'])[2]")
    WebElement Communication;
    
    @FindBy(xpath="//input[@type='text']")
    WebElement EnterTimeline;
    
    @FindBy(xpath="//button[@type='button']//span[text()='Post']")
    WebElement Post;
    
    @FindBy(xpath="//span[text()='Course Library']")
    WebElement CourseLibrary;
    

    
    
    
    
 
    

    
    
    



    


// Constructor
public Elogbooks2(WebDriver driver) {
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
	Showinstitude.click();
}

public void Selectinstitude() {
	Selectinstitude.click();
}

public void ShowRole() {
	ShowRole.click();
}

public void SelectRole() {
	SelectRole.click();
}

public void SelectElogbooks() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", CourseLibrary);
    Thread.sleep(1000);
	SelectElogbooks.click(); 
}

//public void View() {
//    View.click();
//}
//
//public void ViewGuide() {
//    ViewGuide.click();
//}
//
//public void GuideBack() {
//    GuideBack.click();
//}
//
//public void ViewElogbookCover() {
//    ViewElogbookCover.click();
//}
//
//public void Back() {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();", Back);
////    Back.click();
//}
//
//public void Manage() {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();", Manage);
//   
//}
//
//public void View2() {
//    View2.click();
//}
//
//public void Edit() {
//    Edit.click();
//}
//
//public void text(String str) {
//    text.sendKeys(str); // Assuming this is a click action; if it's meant for typing, please update accordingly
//}
//
//public void UploadImage(String str) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("arguments[0].scrollIntoView(true);", UploadImage);
//    UploadImage.sendKeys(str);
//}
//
//public void ShowAssessedDropdown() {
//    ShowAssessedDropdown.click();
//}
//
//public void SelectAssessedDropdown() {
//    SelectAssessedDropdown.click();
//}
//
//public void SubmitForm() {
//    SubmitForm.click();
//}
//
//public void OKBtn() {
//    OKBtn.click();
//}
//
//public void AutomationTestingBack() {
//    AutomationTestingBack.click();
//}
//
//public void Communication() {
//    Communication.click();
//}
//
//public void EnterTimeline(String str) {
//    EnterTimeline.sendKeys(str); // If this requires text input, change to `EnterTimeline.sendKeys("your text");`
//}
//
//public void Post() {
//    Post.click();
//}

public void View() {
    Actions actions = new Actions(driver);
    actions.doubleClick(View).perform();
}

public void ViewGuide() {
    Actions actions = new Actions(driver);
    actions.doubleClick(ViewGuide).perform();
}

public void GuideBack() {
//    Actions actions = new Actions(driver);
//    actions.doubleClick(GuideBack).perform();
	GuideBack.click();
}

public void ViewElogbookCover() {
    Actions actions = new Actions(driver);
    actions.doubleClick(ViewElogbookCover).perform();
}

public void Back() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", Back);
}

public void Manage() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", Manage);
}

public void View2() {
    Actions actions = new Actions(driver);
    actions.doubleClick(View2).perform();
}

public void Edit() {
//    Actions actions = new Actions(driver);
//    actions.doubleClick(Edit).perform();
	Edit.click();
}

public void text(String str) {
	text.click();
	text.clear();
	String currentText = text.getAttribute("value");
    for (int i = 0; i < currentText.length(); i++) {
    	text.sendKeys("\u0008");     // Unicode for Backspace
    }
    text.sendKeys(str);
}

public void UploadImage(String str) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", UploadImage);
    UploadImage.sendKeys(str);
}

public void ShowAssessedDropdown() {
//    Actions actions = new Actions(driver);
//    actions.doubleClick(ShowAssessedDropdown).perform();
	ShowAssessedDropdown.click();
}

public void SelectAssessedDropdown() {
//    Actions actions = new Actions(driver);
//    actions.doubleClick(SelectAssessedDropdown).perform();
    SelectAssessedDropdown.click()
;}

public void SubmitForm() {
    Actions actions = new Actions(driver);
    actions.doubleClick(SubmitForm).perform();
}

public void OKBtn() {
    Actions actions = new Actions(driver);
    actions.doubleClick(OKBtn).perform();
}

public void AutomationTestingBack() {
//    Actions actions = new Actions(driver);
//    actions.doubleClick(AutomationTestingBack).perform();
	AutomationTestingBack.click();
}

public void Communication() {
    Actions actions = new Actions(driver);
    actions.doubleClick(Communication).perform();
}

public void EnterTimeline(String str) {
    EnterTimeline.sendKeys(str);
}

public void Post() {
    Actions actions = new Actions(driver);
    actions.doubleClick(Post).perform();
}



}