package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdmissionsLocators {
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

     @FindBy(xpath="//span[text()='Create']")
    WebElement Create;

     @FindBy(xpath="//span[contains(text(),'Add')]")
    WebElement Add;

     @FindBy(xpath="//a[contains(text(),'view')]")
    WebElement view;

     @FindBy(xpath="//span[contains(text(),'Admission Details')]")
    WebElement AdmissionDetails;

     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/span[1]/button[1]/span[1]/*[name()='svg'][1]")
    WebElement EditBasicInformation;

     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[1]/button[1]/span[1]/*[name()='svg'][1]")
    WebElement EditDate;

     @FindBy(xpath="//input[@placeholder='Select date']")
    WebElement ShowDate;

     @FindBy(xpath="//div[normalize-space()='15']")
    WebElement SelectDate;

     @FindBy(xpath="//span[text()='Save']")
    WebElement Save;

     @FindBy(xpath="//span[text()='Save']/parent::button")
    WebElement Save1;

     @FindBy(xpath="//input[@id='basic_url']")
    WebElement EnterWebsite;

     @FindBy(xpath="//input[@id='basic_multiBrochure_0_brochure_name']")
    WebElement EnterBrochureName;

     @FindBy(xpath="//input[@accept='.pdf']")
    WebElement UploadBrochure;

     @FindBy(xpath="//input[@type='checkbox']")
    WebElement ShowProgramDetails;

     @FindBy(xpath="(//input[@type='checkbox'])[2]")
    WebElement ShowProgramOutcomes;

     @FindBy(xpath="//span[contains(@title, 'Verified')]")
    WebElement ShowVerified;

     @FindBy(xpath="//div[@class='ant-select-item-option-content' and text()='Verified']")
    WebElement SelectVerified;

     @FindBy(xpath="//span[text()='Intake Setup']")
    WebElement IntakeSetup;

     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[1]/button[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
    WebElement EditIntake1;

     @FindBy(xpath="(//input[@type='number'])[1]")
    WebElement Category1;

     @FindBy(xpath="(//input[@type='number'])[2]")
    WebElement Category2;

     @FindBy(xpath="(//input[@type='number'])[3]")
    WebElement Category3;

     @FindBy(xpath="(//input[@type='number'])[4]")
    WebElement Category4;

     @FindBy(xpath="(//input[@type='number'])[5]")
    WebElement Category5;

     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[4]/div[1]/button[1]/span[1]/*[name()='svg'][1]")
    WebElement EditIntake2;

     @FindBy(xpath="(//input[@type='number'])[19]")
    WebElement Category19;

     @FindBy(xpath="(//input[@type='number'])[20]")
    WebElement Category20;

     @FindBy(xpath="//span[text()='Intake Setup']")
    WebElement IntakeSetupBack;

     @FindBy(xpath="//input[@type='checkbox']")
    WebElement DisplayOnAdmissionPortal;
    
     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
    WebElement Draft;
    
     @FindBy(xpath="//div[@class='ant-select-item-option-content' and text()='Live']")
    WebElement Live;
    
//    ************************************************************************************************************
    
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
    
    

}
