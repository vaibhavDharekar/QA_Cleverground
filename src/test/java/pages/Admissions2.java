package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admissions2 {
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
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRole;
    
    @FindBy(xpath="//span[normalize-space()='Admissions']")
    WebElement SelectAdmissions; 
    
    @FindBy(xpath="//span[normalize-space()='Create a New - Academic Cycle']")
    WebElement CreateNewAcademicCycle; 
    
    @FindBy(xpath="//input[@id='basic_academic_year_id']")
    WebElement ShowAcademicYears; 
    
    @FindBy(xpath="//div[contains(text(),'2024-2025')]")
    WebElement SelectAcademicYears; 
    
    @FindBy(xpath="//input[@id='basic_cycle_name']")
    WebElement EnterAcademicCycleName; 
    
    @FindBy(xpath="//span[normalize-space()='Submit']")
    WebElement SubmitBtn; 
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    WebElement OKbtn; 
    
    @FindBy(xpath="(//a[text()='view'])[1]")
    WebElement ViewAcademicCycle; 
    
    @FindBy(xpath="//span[normalize-space()='Create a New - Admission Register']")
    WebElement CreateNewAdmissionRegister; 
    
    @FindBy(xpath="//div[@role='dialog']//div[1]//div[1]//span[1]//input[1]")
    WebElement ShowAAT; 
    
    @FindBy(xpath="//div[contains(text(),'Pune University - HEI')]")
    WebElement SelectAAT; 
    
    @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")
    WebElement ShowDepartment; 
    
    @FindBy(xpath="//div[contains(text(),'Automation Testing')]")
    WebElement SelectDepartment; 
    
    @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/span[1]/input[1]")
    WebElement ShowProgram; 
    
    @FindBy(xpath="//div[contains(text(),'Selenium edit')]")
    WebElement SelectProgram; 
    
    @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]")
    WebElement ShowYear;
    
    @FindBy(xpath="//div[contains(text(),'Fy')]")
    WebElement SelectYear; 
    
    @FindBy(xpath="(//span[normalize-space()='Create'])[1]")
    WebElement Create; 
    
    @FindBy(xpath="//span[contains(text(),'Add')]")
    WebElement Add;
    
    @FindBy(xpath="(//a[normalize-space()='view'])[1]")
    WebElement View1; 
    
    @FindBy(xpath="//span[@class='c-heading static-text fontColor bold m0 admission-register-card admission-form']")
    WebElement ApplicationForm;  
    
    @FindBy(xpath="(//span[@aria-label='edit'])[1]")
    WebElement Edit1;  
    
    @FindBy(xpath="(//textarea[@class='ant-input c-ant-input'])[1]")
    WebElement Textboxinfo; 
    
    @FindBy(xpath="(//span[normalize-space()='Save'])[1]")
    WebElement Savebtn;  
    
    @FindBy(xpath="(//button[normalize-space()='OK'])[1]")
    WebElement OKbtn1; 
    
    @FindBy(xpath="(//span[normalize-space()='View Form'])[1]")
    WebElement IntakeFormView;
    
    @FindBy(xpath="(//button[@class='c-btn link m0'])[1]")
    WebElement IntakeFormBack;
    
    @FindBy(xpath="(//span[@aria-label='edit'])[2]")
    WebElement Edit2; 
    
    @FindBy(xpath="(//input[@type='checkbox'])[1]")
    WebElement MedicoInfo;
    
    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    WebElement FamilyInfo;
    
    @FindBy(xpath="(//input[@type='checkbox'])[3]")
    WebElement FinacInfo;
    
    @FindBy(xpath="(//input[@type='checkbox'])[4]")
    WebElement UniqId;
    
    @FindBy(xpath="(//input[@type='checkbox'])[5]")
    WebElement EductionInfo;
    
    @FindBy(xpath="(//input[@type='checkbox'])[6]")
    WebElement PersonalInfo; 
    
    @FindBy(xpath="(//span[normalize-space()='Save'])[1]")
    WebElement SaveInfo; 
    
    @FindBy(xpath="(//button[normalize-space()='OK'])[1]")
    WebElement OkInfo; 
    
    @FindBy(xpath="(//span[normalize-space()='Create'])[1]")
    WebElement CreateCustom; 
    
    @FindBy(xpath="(//input[@id='basic_form_name'])[1]")
    WebElement NameCustom; 
    
    @FindBy(xpath="(//button[@type='submit'])[1]")
    WebElement SaveCustom; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[5]/div[3]/div[1]/div[4]/button[1]/span[1]")
    WebElement VIEW2; 
    
    @FindBy(xpath="(//span[normalize-space()='Add new Section'])[1]")
    WebElement AddNewSection; 
    
    @FindBy(xpath="(//input[@placeholder='section_name'])[1]")
    WebElement SectionName; 
    
    @FindBy(xpath="(//button[normalize-space()='Save'])[1]")
    WebElement SectionNameSave; 
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick;  
    
    @FindBy(xpath="(//button[normalize-space()='Text'])[1]")
    WebElement Text;
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label;
    
    @FindBy(xpath="(//input[@id='basic_placeholder'])[1]")
    WebElement Placeholder; 
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddText;  
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick1;
    
    
    @FindBy(xpath="(//button[normalize-space()='Number'])[1]")
    WebElement Number;
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label1;
    
    @FindBy(xpath="(//input[@id='basic_placeholder'])[1]")
    WebElement Placeholder1; 
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddNumber; 
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick2;
    
    @FindBy(xpath="(//button[normalize-space()='PDF Uploader'])[1]")
    WebElement PDFuploader; 
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label2;
    
    @FindBy(xpath="(//input[@id='basic_placeholder'])[1]")
    WebElement Placeholder2; 
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddPDF;  
    
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick3;
    
    
    @FindBy(xpath="(//button[normalize-space()='Image Upload'])[1]")
    WebElement Imageupload; 
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label3;
    
    @FindBy(xpath="(//input[@id='basic_placeholder'])[1]")
    WebElement Placeholder3; 
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddImage; 
    
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick4;
    
    
    @FindBy(xpath="(//button[normalize-space()='Radio Buttons'])[1]")
    WebElement Radiobutton;
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label4;
    
    @FindBy(xpath="(//input[@placeholder='Add Option from here'])[1]")
    WebElement Placeholder4; 
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement addplaceholder;
    
    @FindBy(xpath="(//button[@class='ant-btn c-btn bordered'])[1]")
    WebElement Addoption1;
    
    
    
    
    
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddRadio; 
    
    
    
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick5;
    
    
    @FindBy(xpath="(//button[normalize-space()='Checkboxes'])[1]")
    WebElement Checkbox;
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label5;
    
    @FindBy(xpath="(//input[@placeholder='Add Option from here'])[1]")
    WebElement Placeholder5; 
    
    @FindBy(xpath="(//button[@class='ant-btn c-btn bordered'])[1]")
    WebElement Addoption2;  
    
    
    
    
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddCheckbox;  
    
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick6;
    
    
    @FindBy(xpath="(//button[normalize-space()='Date'])[1]")
    WebElement Date;
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label6;
    
    @FindBy(xpath="(//input[@id='basic_placeholder'])[1]")
    WebElement Placeholder6; 
    
    
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddDate;  
    
    @FindBy(xpath="(//span[normalize-space()='Add new input'])[1]")
    WebElement AddNewInputClick7;
    
    
    @FindBy(xpath="(//button[normalize-space()='URL'])[1]")
    WebElement URL; 
    
    @FindBy(xpath="(//input[@id='basic_label'])[1]")
    WebElement Label7;
    
    @FindBy(xpath="(//input[@id='basic_placeholder'])[1]")
    WebElement Placeholder7; 
    
    @FindBy(xpath="(//button[normalize-space()='ADD'])[1]")
    WebElement AddURL; 
    
    @FindBy(xpath="(//span[contains(text(),'New Custom Form')])[1]")
    WebElement BACK; 
    
    @FindBy(xpath="(//div[@class='ant-switch-handle'])[3]")
    WebElement Diseble; 
    
    @FindBy(xpath="(//button[normalize-space()='OK'])[1]")
    WebElement DisebleOK; 
    
    
    
    
    
    
    
    
    
//    @FindBy(xpath="(//span[@title='Not Verified'])[1]")
//    WebElement NOTverified; 
    
    @FindBy(xpath="//span[@class='ant-select-selection-item' and @title='Not Verified']")
    WebElement NOTverified; 
    
 
    
    @FindBy(xpath="(//div[text()='Verified'])[2]")
    WebElement verified; 
    
    @FindBy(xpath="(//button[normalize-space()='OK'])[1]")
    WebElement OKverified; 
    
    @FindBy(xpath="(//button[@class='c-btn link m0'])[1]")
    WebElement BACKbtn;
    
    @FindBy(xpath="(//span[@class='c-heading static-text fontColor bold m0 admission-register-card admission-fees'])[1]")
    WebElement FEEtemplet;
    
    @FindBy(xpath="(//span[normalize-space()='Add New'])[1]")
    WebElement ADDnew;
    
    @FindBy(xpath="(//input[@id='basic_fee_label_name'])[1]")
    WebElement FeeLabelName;
    
    @FindBy(xpath="(//button[@type='submit'])[1]")
    WebElement SAVEbtn;
    
    @FindBy(xpath="(//span[contains(text(),'Manage')])[6]")
    WebElement ManageOpen; 
    
    @FindBy(xpath="(//input[@id='basic_interim_fees_0_fees_amount'])[1]")
    WebElement PayableFEES;
    
    @FindBy(xpath="(//input[@id='basic_scholarship'])[1]")
    WebElement SCHOLARSHIP;
    
    @FindBy(xpath="(//input[@id='basic_no_of_installments'])[1]")
    WebElement FEESINSTALLMENT;
    
    @FindBy(xpath="(//input[@id='basic_fees_installment_0_date'])[1]")
    WebElement SELECTdate;
    
    @FindBy(xpath="(//div[@class='ant-picker-cell-inner'][normalize-space()='6'])[1]")
    WebElement CLICKtoselect; 
    
    @FindBy(xpath="(//input[@id='basic_fees_installment_1_date'])[1]")
    WebElement SELECTdate1;
    
    @FindBy(xpath="(//div[contains(text(),'28')])[4]")
    WebElement CLICKtoselect1;
    
    @FindBy(xpath="(//span[normalize-space()='Save'])[2]")
    WebElement CLICKsubmit;
   
    @FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
    WebElement NOTverified2; 
    
    @FindBy(xpath="(//div[@title='Verified'])[1]")
    WebElement verified2; 
    
    @FindBy(xpath="(//button[normalize-space()='OK'])[1]")
    WebElement OKverified2; 
    
    @FindBy(xpath="//span[text()='Fees Template']")
    WebElement FeesTemplateBack;
    
    
  
    
    
    
    
    
    
    
    
    
    
   
    

  

    
    
   
    
    
   
    
    
   
    

    
    
    
    
 
    

    
    
    
    


// Constructor
public Admissions2(WebDriver driver) {
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



public void SelectAdmissions() throws InterruptedException {
	Thread.sleep(1000);
	SelectAdmissions.click(); 
}

public void CreateNewAcademicCycle() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", CreateNewAcademicCycle);
}

public void ShowAcademicYears() {
    ShowAcademicYears.click();
}

public void SelectAcademicYears() {
    SelectAcademicYears.click();
}

public void EnterAcademicCycleName(String cycleName) {
    EnterAcademicCycleName.sendKeys(cycleName);
}

public void SubmitBtn() {
    SubmitBtn.click();
}

public void OKbtn() {
    OKbtn.click();
}

public void ViewAcademicCycle() {
    ViewAcademicCycle.click();
}

public void CreateNewAdmissionRegister() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", CreateNewAdmissionRegister);
//    CreateNewAdmissionRegister.click();
}

public void ShowAAT() {
    ShowAAT.click();
}

public void SelectAAT() {
    SelectAAT.click();
}

public void ShowDepartment() {
    ShowDepartment.click();
}

public void SelectDepartment() {
    SelectDepartment.click();
}

public void ShowProgram() {
    ShowProgram.click();
}

public void SelectProgram() {
    SelectProgram.click();
}

public void ShowYear() {
    ShowYear.click();
}

public void SelectYear() {
    SelectYear.click();
}

public void Add() {
    Add.click();
}

public void Create() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", Create);
//    Create.click();
}

public void View1() {
	View1.click();
} 

public void ApplicationForm() {
	ApplicationForm.click(); 
} 

public void Edit1() {
	Edit1.click(); 
} 

public void Textboxinfo() {
	Textboxinfo.sendKeys("New Admission Process"); 
} 

public void Savebtn() {
	Savebtn.click(); 
} 

public void OKbtn1() {
	OKbtn1.click(); 
} 

public void IntakeFormView() {
	IntakeFormView.click();  
} 

public void IntakeFormBack() {
	IntakeFormBack.click();  
} 

public void Edit2() {
	Edit2.click();   
} 

public void MedicoInfo() {
	MedicoInfo.click();   
} 

public void FamilyInfo() {
	FamilyInfo.click();   
} 

public void FinacInfo() {
	FinacInfo.click();    
} 

public void UniqId() {
	UniqId.click();   
} 

public void EductionInfo() {
	EductionInfo.click();   
} 

public void PersonalInfo() {
	PersonalInfo.click();   
} 

public void SaveInfo() {
	SaveInfo.click();   
} 

public void OkInfo() {
	OkInfo.click();    
} 

public void CreateCustom() {
	CreateCustom.click();    
} 

public void NameCustom() {
	NameCustom.sendKeys("New Custom Form");    
} 

public void SaveCustom() {
	SaveCustom.click();    
} 

public void VIEW2() {
	VIEW2.click();    
} 

public void AddNewSection() {
	AddNewSection.click();    
} 

public void SectionName() {
	SectionName.sendKeys("New Section 1");    
} 

public void SectionNameSave() {
	SectionNameSave.click();    
} 

public void AddNewInputClick() {
	AddNewInputClick.click();    
} 

public void Text() {
	Text.click();    
} 

public void Label() {
	Label.sendKeys("Text");    
} 

public void Placeholder() {
	Placeholder.sendKeys("Placeholder");    
} 

public void AddText() {
	AddText.click();    
} 

public void AddNewInputClick1() {
	AddNewInputClick1.click();    
} 


public void Number() {
	Number.click();    
} 

public void Label1() {
	Label1.sendKeys("Enter Name");    
} 

public void Placeholder1() {
	Placeholder1.sendKeys("Enter Placeholder");    
} 

public void AddNumber() {
	AddNumber.click();    
} 

public void AddNewInputClick2() {
	AddNewInputClick2.click();    
} 


public void PDFuploader() {
	PDFuploader.click();    
} 

public void Label2() {
	Label2.sendKeys("Enter Name");    
} 

public void Placeholder2() {
	Placeholder2.sendKeys("Enter Placeholder");   
} 

public void AddPDF() {
	AddPDF.click();    
} 

public void AddNewInputClick3() {
	AddNewInputClick3.click();    
} 

public void Imageupload() {
	Imageupload.click();    
} 

public void Label3() {
	Label3.sendKeys("Enter Name");    
} 

public void Placeholder3() {
	Placeholder3.sendKeys("Enter Placeholder");    
} 

public void AddImage() {
	AddImage.click();    
} 

public void AddNewInputClick4() {
	AddNewInputClick4.click();    
} 

public void Radiobutton() {
	Radiobutton.click();    
} 

public void Label4() {
	Label4.sendKeys("Enter Name");    
} 

public void Placeholder4() {
	Placeholder4.sendKeys("Enter Placeholder");    
} 

public void Addoption1() {
	Addoption1.click();   
} 





public void AddRadio() {
	AddRadio.click();    
} 

public void AddNewInputClick5() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", AddNewInputClick5);
//	AddNewInputClick5.click();    
} 



public void Checkbox() {
	Checkbox.click();    
} 

public void Label5() {
	Label5.sendKeys("Enter Name");    
} 

public void Placeholder5() {
	Placeholder5.sendKeys("Enter");     
} 

public void Addoption2() {
	Addoption2.click();    
} 






public void AddCheckbox() {
	AddCheckbox.click();    
} 

public void AddNewInputClick6() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", AddNewInputClick6);
//	AddNewInputClick6.click();    
} 

public void Date() {
	Date.click();    
} 

public void Label6() {
	Label6.sendKeys("Enter Name");    
} 

public void Placeholder6() {
	Placeholder6.sendKeys("Enter Placeholder");    
} 

public void AddDate() {
	AddDate.click();    
} 

public void AddNewInputClick7() throws InterruptedException {
	Thread.sleep(5000);
	AddNewInputClick7.click();    
} 

public void URL() {
	URL.click();    
} 

public void Label7() {
	Label7.sendKeys("Enter Name");
} 

public void Placeholder7() {
	Placeholder7.sendKeys("Enter Placeholder");    
}

public void AddURL() {
	AddURL.click();    
} 

public void BACK() {
	BACK.click();     
} 

public void ScrollDown() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
}


public void Diseble() {
	Diseble.click();     
} 

public void DisebleOK() {
	DisebleOK.click();     
} 
 







public void ScrollUp1() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
}

public void NOTverified() {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();", NOTverified);
	NOTverified.click();     
} 
public void verified() {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();", verified);
    verified.click();      
} 

public void OKverified() {
    OKverified.click();      
} 

public void BACKbtn() {
	BACKbtn.click();      
} 

public void FEEtemplet() {
	FEEtemplet.click();       
} 

public void ADDnew() {
	ADDnew.click();       
} 

public void FeeLabelName() {
	FeeLabelName.sendKeys("MAC Department");;       
} 

public void SAVEbtn() {
	SAVEbtn.click();       
}

public void ManageOpen() throws InterruptedException {
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", ManageOpen);
//	ManageOpen.click();       
} 

public void PayableFEES() {
	PayableFEES.sendKeys("100000");;       
} 


public void SCHOLARSHIP() {
	SCHOLARSHIP.sendKeys("50000");;       
} 

public void FEESINSTALLMENT() {
	FEESINSTALLMENT.sendKeys("2");;       
} 

public void SELECTdate() {
	SELECTdate.click();       
} 

public void CLICKtoselect() {
	CLICKtoselect.click();       
} 

public void SELECTdate1() {
	SELECTdate1.click();       
} 

public void CLICKtoselect1() {
	CLICKtoselect1.click();       
}

public void CLICKsubmit() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", CLICKsubmit); 
//	CLICKsubmit.click();       
} 

public void NOTverified2() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", NOTverified2); 
//	NOTverified2.click();       
}

public void verified2() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", verified2); 
//	verified2.click();       
}

public void OKverified2() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", OKverified2); 
	//OKverified2.click();       
}

public void FeesTemplateBack() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", FeesTemplateBack);        
} 
 
 
 






  













}