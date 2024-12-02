package pages;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElogbooksAdd {
    WebDriver driver;
    JavascriptExecutor jsExecutor;
    
  //=================    Mayur Patil Locators ==============

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
    
    @FindBy(xpath="//a[normalize-space()='Administrator']")
    WebElement SelectRole;
    
    @FindBy(xpath="//span[normalize-space()='Institute Manager']")
    WebElement SelectInstituteManager; 
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    WebElement SelectManageProgram;
    
    
    //New Subject
    
    @FindBy(xpath = "(//a[@activeclassname='active'][normalize-space()='View Details'])[2]")
    WebElement SelectSubViewDetails;
    
    @FindBy(xpath = "(//button[normalize-space()='Delete Subject'])[1]")
    WebElement DeleteSubViewDetails;
    
    @FindBy(xpath = "(//button[normalize-space()='OK'])[1]")
    WebElement DeleteSubOk;
    
    @FindBy(xpath = "(//button[normalize-space()='Add Subject'])[1]")
    WebElement AddSub;
    
    @FindBy(xpath = "(//input[@name='subject_name'])[1]")
    WebElement EnterSub;
    
    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement SubmitSub;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]")
    WebElement CopySubName;
   
    
    //Assign Subject To Professor and Student
    
    @FindBy(xpath = "(//a[@class='manage-batches-bt'][normalize-space()='Manage Batches'])[5]")
    WebElement SelectSelManageBatches;
    				
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]")
    WebElement SelectSub;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]")
    WebElement SelectBatch;
    
    @FindBy(xpath = "(//input)[2]")
    WebElement SelectAPro;
    
    @FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
    WebElement AddStud;
    
    @FindBy(xpath = "(//div[contains(text(),'Select...')])[2]")
    WebElement EnterStud;
    
    @FindBy(xpath = "(//span[@class='ant-modal-close-x'])[1]")
    WebElement close;
    
    @FindBy(xpath = "(//div[@class='ant-tabs-tab'])[3]")
    WebElement SelectElogbookTab;
    
    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Disabled')]")
    WebElement SelectDisable_EnableBtn;
    
    
    
    @FindBy(xpath = "//input[@id='basic_status_enable_disable']")
    WebElement SelectEDDropdown;
    
    @FindBy(xpath = "//div[contains(text(),'Enable')]")
    WebElement SelectEnable;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitBtn;
    
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement SubmitOKBtn;
    
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]")
    WebElement SubmitActOKBtn;
    
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]")
    WebElement SubmitActOKBtn1;
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]")
    WebElement DefaultGuidesView_Edit;
    
    @FindBy(xpath = "//span[normalize-space()='Add Guide +']")
    WebElement AddGuideBtn;
    
    @FindBy(xpath = "(//input[@id='basic_staff_role_id'])[1]")
    WebElement ShowGuide;
    
    @FindBy(xpath = "//div[contains(text(),'Patil Mayur')]")
    WebElement SelectGuide;
    
    @FindBy(xpath = "//span[contains(text(),'Default Guides')]")
    WebElement BackToDashboardElogbook;
    
    @FindBy(xpath = "(//span[contains(text(),'View/Edit')])[2]")
    WebElement ELogBookCoverInformationView_Edit;
    
    @FindBy(xpath = "//span[normalize-space()='Edit']")
    WebElement ELogBookCoverDecription_Edit;
    
    @FindBy(xpath = "//textarea[@id='book_description']")
    WebElement EnterELogBookCoverDescription;
    
    @FindBy(xpath = "//span[@title='Disabled']")
    WebElement ELogBookCoverEnableDesable;
    
    @FindBy(xpath = "//div[contains(text(),'Enabled')]")
    WebElement ELogBookCoverEnable;
    
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement ELogBookCoverSaveBtn;
    
    @FindBy(xpath = "//span[normalize-space()='Add New Section']")
    WebElement AddNewSectionBtn;
    
    @FindBy(xpath = "//input[@placeholder='section_name']")
    WebElement EnterSectionName;
    
 
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement AddNewInputBtn;
    
    @FindBy(xpath = "//span[normalize-space()='Add new input']")
    WebElement AddNewInputBtn1;
    
    @FindBy(xpath = "//button[normalize-space()='Text']")
    WebElement AddTextInputBtn;
    
    @FindBy(xpath = "//input[@id='basic_label']")
    WebElement EnterLabel;
    
    @FindBy(xpath = "//input[@id='basic_placeholder']")
    WebElement EnterPlaseHolder;
    
    @FindBy(xpath = "//button[normalize-space()='ADD']")
    WebElement TextInputAddBtn;
    
    @FindBy(xpath = "//input[@placeholder='Add Option from here']")
    WebElement EnterRadioBtn;
    
    @FindBy(xpath = "//span[normalize-space()='Add']")
    WebElement ClickRadioBtnAdd;
    
    
    
    
    @FindBy(xpath = "//button[normalize-space()='Number']")
    WebElement AddNumberInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='PDF Uploader']")
    WebElement AddPDFInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='Image Upload']")
    WebElement AddImageInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='Radio Buttons']")
    WebElement AddRadioInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='Checkboxes']")
    WebElement AddCheckboxesInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='Date']")
    WebElement AddDateInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='URL']")
    WebElement AddURLInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='Time']")
    WebElement AddTimeInputBtn;
    
    @FindBy(xpath = "//button[normalize-space()='Dropdown']")
    WebElement AddDropdownInputBtn;
    
    
    
    @FindBy(xpath = "(//input[@placeholder='Add Option from here'])[1]")
    WebElement EnterReqCheckBox;
    
    @FindBy(xpath = "(//span[normalize-space()='Add'])[1]")
    WebElement ClickCheckBoxAddBtn;
    
    
    
    @FindBy(xpath = "//input[@placeholder='Add Option from here']")
    WebElement EnterDropDown;
    
    @FindBy(xpath = "//span[normalize-space()='Add']")
    WebElement ClickDropDownAddBtn;
    
    
    
    
    @FindBy(xpath = "//span[contains(text(),'E-Log Book Cover Information')]")
    WebElement BackToDashboardElogbook1;
    
    @FindBy(xpath = "//span[contains(text(),'New Activity')]")
    WebElement BackToDashboardElogbook2;
    
    @FindBy(xpath = "(//div[@id='rc-tabs-43-tab-Elog'])[1]")
    WebElement SelectElogbookTab1;
    
    @FindBy(xpath = "//span[normalize-space()='Add New Activity Group +']")
    WebElement ClickAddNewActivityGroupBtn;
    
    @FindBy(xpath = "//input[@id='basic_activity_group_name']")
    WebElement EnterActivityGroupName;
    
    @FindBy(xpath = "//input[@id='basic_activity_group_status']")
    WebElement ShowGroupStatus;
    
    @FindBy(xpath = "//div[@title='Enable']")
    WebElement SelectGroupStatus;
    
    @FindBy(xpath = "//span[normalize-space()='Create']")
    WebElement CreateBtn;
    
    
    
    @FindBy(xpath = "(//button[@type='button'])[10]")
    WebElement AddNewActivityBtn;
    
    @FindBy(xpath = "//input[@id='basic_sub_activity_name']")
    WebElement EnterActivityName;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement ClickOnAddButton;
    
    
    @FindBy(xpath = "(//span[contains(text(),'Manage')])[6]")
    WebElement ClickOnManageBtn;
    
    @FindBy(xpath = "//span[normalize-space()='Edit']")
    WebElement ClickEditBtn;
    
    @FindBy(xpath = "//span[@title='Disabled']")
    WebElement ShowDrpdown;
    
    @FindBy(xpath = "//div[@title='Enabled']")
    WebElement SelectDrpdown;
    
    @FindBy(xpath = "//textarea[@id='description']")
    WebElement EnterDescription;



    
    
    
    
  //=================    Rahul Mali Locators ==============
    
    
    
    
    @FindBy(xpath="//button[normalize-space()='Administrator']")
    WebElement ShowRole1;
    
    @FindBy(xpath="//a[normalize-space()='Student']")
    WebElement SelectRole1;
    
    @FindBy(xpath="(//span[normalize-space()='E-Logbook'])[1]")
    WebElement SelectElogbooks; 
    
    @FindBy(xpath="//span[normalize-space()='Add ELogbook +']")
    WebElement AddElogbook;
    
    @FindBy(xpath="//input[@id='basic_log_book_id']")
    WebElement SelectName;
    
    @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")
    WebElement Logbook;
    
    @FindBy(xpath="//input[@id='basic_activity_group']")
    WebElement Activity;
    
    @FindBy(xpath="//div[contains(text(),'Group 1')]")
    WebElement Group;

    @FindBy(xpath="//input[@id='basic_activity_name']")
    WebElement Activity1;
    
    @FindBy(xpath="//div[contains(text(),'New Activity')]")
    WebElement Group1;
    
    @FindBy(xpath="(//span[normalize-space()='Add Log'])[1]")
    WebElement AddLog;
    
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement Text1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement EnterNumber;
    
    @FindBy(xpath="(//input[@accept='.pdf'])[1]")
    WebElement uploadInputField; 
    
    @FindBy(xpath="(//input[@type='file'])[2]")
    WebElement uploadSupportingDoc2;
    
    @FindBy(xpath="//input[@value='Radio Btn 1']")
    WebElement RadioBtn;
    
    @FindBy(xpath="(//input[@value='Required CheckBox'])[1]")
    WebElement Checkbox2;
    
    @FindBy(xpath="//input[@placeholder='Required Date']")
    WebElement ShowStartDate1;
    
    @FindBy(xpath="(//div[normalize-space()='15'])[1]")
    WebElement SelectStartDate1;
    
    @FindBy(xpath="//input[@placeholder='Required URL']")
    WebElement url1;
    
    @FindBy(xpath="//input[@placeholder='Select time']")
    WebElement ShowTime1;
    
    @FindBy(xpath="(//div[contains(text(),'02')])[1]")
    WebElement SelectTime1;
    
    @FindBy(xpath="(//div[normalize-space()='00'])[1]")
    WebElement Min;
    
    @FindBy(xpath="(//div[normalize-space()='PM'])[1]")
    WebElement Am;
    
    @FindBy(xpath="(//span[normalize-space()='Ok'])[1]")
    WebElement Ok1;
    
    
    
    
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[10]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")
    WebElement Dropdown1;
    
    @FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
    WebElement Updown1; 
   
    @FindBy(xpath="(//span[normalize-space()='Submit Form'])[1]")
    WebElement Submit1;
    
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
    WebElement Ok;
    
    @FindBy(xpath="(//span[@class='c-heading for-page mb-0'])[1]")
    WebElement Back1;
    
    
    
    
    
  //=================    Harshada Locators ==============
    
    
    
    
    @FindBy(xpath="(//div[@role='tab' ])[2]")
    WebElement ELogbooks;
    
    @FindBy(xpath="(//a[@class='c-btn link'][normalize-space()='View'])[1]")
    WebElement view;
    
    @FindBy(xpath="(//a[normalize-space()='Manage'])[1]")
    WebElement manage;
    
    @FindBy(xpath="(//span[normalize-space()='Add Log +'])[1]")
    WebElement AddLog1;

  
    @FindBy(xpath="(//button[normalize-space()='OK'])[1]")
    WebElement okbtn;
    
   
    
  
    @FindBy(xpath="//span[normalize-space()='Submit Form']")
    WebElement Submit;
    
  
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
    WebElement okay;
  
    @FindBy(xpath="//*[name()='path' and contains(@d,'M872 474H2')]")
    WebElement back;
    
    @FindBy(xpath="//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement backbtn;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement ViewGuide;
  
    @FindBy(xpath="//span[@class='c-heading for-page m0 c-arrowback']//*[name()='svg']")
    WebElement Back;
    
    @FindBy(xpath="//body//div[@id='root']//div[@class='ant-spin-container']//div[@class='ant-spin-container']//div//div[2]//a[1]")
    WebElement ViewCoverInfo;
    
  
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")
    WebElement Edit;
    
    @FindBy(xpath="//input[@placeholder='Required Name']")
    WebElement Text2;
    
    @FindBy(xpath="//input[@placeholder='Required Number']")
    WebElement EnterNumber2;
    
    @FindBy(xpath="(//input[@accept='.pdf'])[1]")
    WebElement uploadInputField222; 
    
    @FindBy(xpath="(//input[@type='file'])[2]")
    WebElement uploadSupportingDoc222;
    
    @FindBy(xpath="//input[@value='Radio Btn 1']")
    WebElement RadioBtn2;
    
    @FindBy(xpath="(//input[@value='Required CheckBox'])[1]")
    WebElement Checkbox22;
    
    @FindBy(xpath="//input[@placeholder='Required Date']")
    WebElement ShowStartDate12;
    
    @FindBy(xpath="(//div[normalize-space()='14'])[1]")
    WebElement SelectStartDate12;
    
    @FindBy(xpath="//input[@placeholder='Required URL']")
    WebElement url12;
    
    @FindBy(xpath="//input[@placeholder='Select time']")
    WebElement ShowTime12;
    
    @FindBy(xpath="(//div[contains(text(),'05')])[1]")
    WebElement SelectTime12;
    
    @FindBy(xpath="(//div[normalize-space()='00'])[1]")
    WebElement Min2;
    
    @FindBy(xpath="(//div[normalize-space()='PM'])[1]")
    WebElement Am2;
    
    @FindBy(xpath="(//span[normalize-space()='Ok'])[1]")
    WebElement Ok12;
    
    
    
    
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")
    WebElement Dropdown12;
    
    @FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
    WebElement Updown12;
    
    @FindBy(xpath="//span[normalize-space()='Submit Form']")
    WebElement submit;
    
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
    WebElement submitok;
    
    @FindBy(xpath="//span[@aria-label='arrow-left']//*[name()='svg']")
    WebElement CoverformBack;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement Communication;
    
    @FindBy(xpath="//input[@placeholder='Enter Timeline Item']")
    WebElement Timeline;
    
    @FindBy(xpath="//div[@class='c-v-scrollbar']")
    WebElement ScrollTimeline;
  
    @FindBy(xpath="//span[normalize-space()='Post']")
    WebElement Post;
    
  
    @FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
    WebElement SuccessOK;
    
    @FindBy(xpath="(//span[@class='c-heading for-page c-arrowback'])[1]\r\n"
            + "")
    WebElement bk;
    
    
    
    
  //=================    Vaibhav Locators ==============
    

    
    
   
    
    @FindBy(xpath="//button[normalize-space()='Student']")
    WebElement ShowRole3;
    
    @FindBy(xpath="//a[normalize-space()='Professor']")
    WebElement SelectRole2;
    
    @FindBy(xpath="//span[normalize-space()='E-Logbook']")
    WebElement SelectElogbooks2; 
    
    @FindBy(xpath="(//a[@class='c-btn link'][normalize-space()='View'])[1]")
    WebElement View; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement ViewGuide2;
    
    @FindBy(xpath="//span[text()='Guides']")
    WebElement GuideBack;
    
    
    
    @FindBy(xpath="(//a[text()='View'])[2]")
    WebElement ViewElogbookCover;
    
    @FindBy(xpath="//span[text()='Back']")
    WebElement Back2;
    
    @FindBy(xpath="(//a[normalize-space()='Manage'])[1]")
    WebElement Manage;
    
    @FindBy(xpath="(//a[normalize-space()='View'])[1]")
    WebElement View2;
    
    @FindBy(xpath="(//button[normalize-space()='Edit'])[1]")
    WebElement Edit1;
    
    @FindBy(xpath="(//input[@id='1130'])[1]")
    WebElement text1;
    
    @FindBy(xpath="(//span[@class='c-heading for-page mb-0'])[1]")
    WebElement Backk;
    
    @FindBy(xpath="//span[text()='Click to Upload']")
    WebElement UploadImage;
    
    @FindBy(xpath="//span[text()='Click to Upload']//input")
    WebElement UploadImage2;
    
    @FindBy(xpath="(//span[@title='Not Assessed'])[1]")
    WebElement ShowAssessedDropdown;
    
    @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement SelectAssessedDropdown;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement SubmitForm;
    
    @FindBy(xpath="//button[text()='OK']")
    WebElement OKBtn;
    
    @FindBy(xpath="(//span[contains(text(),'New Activity')])[1]")
    WebElement AutomationTestingBack;
    
    @FindBy(xpath="(//div[@role='tab'])[2]")
    WebElement Communication1;
    
    @FindBy(xpath="//input[@type='text']")
    WebElement EnterTimeline;
    
    @FindBy(xpath="//button[@type='button']//span[text()='Post']")
    WebElement Post1;
    
    @FindBy(xpath="//span[text()='Course Library']")
    WebElement CourseLibrary;
    
    @FindBy(xpath="(//span[@class='c-heading for-page c-arrowback'])[1]")
    WebElement Back3;
    
    
    
  //=================    Nikhil Locators ==============
    
    
    
    
    
    @FindBy(xpath="(//button[normalize-space()='Professor'])[1]")
    WebElement ShowRole5;
    
    @FindBy(xpath="(//a[normalize-space()='Administrator'])[1]")
    WebElement SelectRole5;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement Scroller;
    
    @FindBy(xpath="(//span[normalize-space()='Accreditation'])[1]")
    WebElement Location;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[17]/a[1]/span[1]")
    WebElement SelectElogbooks5; 
    
    @FindBy(xpath="(//input[@placeholder='Search Student...'])[1]")
    WebElement SearchName;  
    

    
//    @FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
//    WebElement SelectDropdown;  
//    
//    @FindBy(xpath=".rc-virtual-list-scrollbar-thumb")
//    WebElement scrollDropdown;  
//    
//    
//    @FindBy(xpath="(//div[@title='STQA'])[1]")
 //   WebElement SelectSTQA;    
    
//    @FindBy(xpath="(//div[@title='STQA'])[1]")
//    WebElement dropdownElement; 
    
    @FindBy(xpath="(//a[@class='c-btn link'][normalize-space()='View'])[1]")
    WebElement View5;   
  //a[@href='#/admindashboard/ELogBookModule/IndividualElogInfo/238/207/492']
    
    @FindBy(xpath="(//a[normalize-space()='View/Edit'])[1]")
    WebElement ViewEdit;  
    
    @FindBy(xpath="(//span[normalize-space()='Add Guide +'])[1]")
    WebElement AddGuide; 
    
    @FindBy(xpath="//input[@id='basic_staff_role_id']")
    WebElement SearchGuide;  
    
    @FindBy(xpath="(//div[contains(text(),'Patil Mayur')])[1]")
    WebElement SelectGuide5;
    
    @FindBy(xpath="//span[normalize-space()='Add']")
    WebElement ClickAdd;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/button[1]")
    WebElement ConfirmOk; 
    
    @FindBy(xpath="(//span[contains(text(),'Guides')])[1]")
    WebElement Backbtn; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
    WebElement Elogbookcover; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]")
    WebElement ClickVerified;
    
    @FindBy(xpath="(//span[@title='Not Verified'])[1]")
    WebElement ClickNotVerified;  
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    WebElement ClickOnOk;
    
    @FindBy(xpath="//span[text()='Back']")
    WebElement Back5; 
    
    @FindBy(xpath="(//div[@class='ant-tabs-tab'])[1]")
    WebElement Communication5; 
    
    @FindBy(xpath="(//input[@placeholder='Enter Timeline Item'])[1]")
    WebElement EnterTimeLine;
    
    @FindBy(xpath="(//span[normalize-space()='Post'])[1]")
    WebElement Post5;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/button[1]")
    WebElement Ok5; 
    
    @FindBy(xpath="(//span[@class='c-heading for-page c-arrowback'])[1]")
    WebElement Backpage;
    
    
    
// Dhiryashil Patil
    
    
    @FindBy(xpath ="(//a[@class='c-btn link'][normalize-space()='View'])[1]")
    WebElement ClickView;
    
    @FindBy(xpath ="(//a[normalize-space()='Manage'])[1]")
    WebElement Manage6;
    
  //a[@href='#/admindashboard/ElogBook/SubActivityInfo/238/271/Automation Testing/492']
    
    @FindBy(xpath ="(//a[contains(text(),'View')])[1]")
    WebElement ManageView;

    @FindBy(xpath ="(//div[@class='ant-select-selector'])[1]")
    WebElement NotAssesed;

    @FindBy(xpath ="(//div[@class='ant-select-item-option-content'][normalize-space()='Assessed'])[1]")
    WebElement SelectAssesed;
    
    @FindBy(xpath ="(//button[normalize-space()='OK'])[1]")
    WebElement AssesedOk;
    
    @FindBy(xpath ="(//button[normalize-space()='OK'])[1]")
    WebElement LastOK;

    @FindBy(xpath ="(//span[@class='c-heading for-page mb-0'])[1]")
    WebElement Back6;
    
    
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]")
    WebElement SelectOption;
    
    @FindBy(xpath ="(//div[contains(text(),'Not-Applicable')])[1]")
    WebElement NotApllicable;
    
    @FindBy(xpath ="//span[@aria-label='clear']//*[name()='svg']")
    WebElement Clear;
    
    @FindBy(xpath ="(//span[normalize-space()='Date Filter'])[1]")
    WebElement DateFilter;
    
    @FindBy(xpath ="(//input[@id='basic_start_date'])[1]")
    WebElement StartDate;
    
    @FindBy(xpath ="//td[@title='2024-11-05']//div[@class='ant-picker-cell-inner'][normalize-space()='5']")
    WebElement SelectStartDate;
    
    @FindBy(xpath ="(//input[@id='basic_end_date'])[1]")
    WebElement EndDate;
    
    @FindBy(xpath ="(//div[contains(text(),'25')])[2]")
    WebElement selectEndDate;
    
    @FindBy(xpath ="(//span[normalize-space()='Submit'])[1]")
    WebElement Submit6;

    
    
    
    
    
    
    
    
    

// Constructor
public ElogbooksAdd(WebDriver driver) {
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



//=================    Mayur Patil Methods ==============


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

public void SelectInstituteManager() {
	SelectInstituteManager.click(); 
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 600);");
}

public void SelectManageProgram() {
	SelectManageProgram.click(); 
}

public void SelectSubViewDetails() {
	SelectSubViewDetails.click(); 
}

public void DeleteSubViewDetails() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
	DeleteSubViewDetails.click();
}

public void DeleteSubOk() {
	DeleteSubOk.click(); 
}

public void AddSub() {
	AddSub.click();
}

public void EnterSub() {
	Random rand = new Random();
    int randomNumber = rand.nextInt(1000);
	EnterSub.sendKeys("Subject = "+ randomNumber);
	}

public void SubmitSub() {
	SubmitSub.click(); 
}


public void CopySubName() {
//	WebElement Sub = driver.findElement(By.linkText(CopySubName.getText()));
	String Txt = CopySubName.getText(); 
	System.out.println(Txt);
}


public void SelectSelManageBatches() {
	SelectSelManageBatches.click(); 
}

public void SelectSub() {
    SelectSub.click();
}

public void SelectBatch() {
	SelectBatch.click(); 
	
}

public void SelectAPro() throws InterruptedException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(5000);
	WebElement d = driver.findElement(By.xpath("(//div[text()='Select...'])[2]"));
	d.click();
	Thread.sleep(1000);
	SelectAPro.sendKeys("Mayur");
	Thread.sleep(1000);
	WebElement name = driver.findElement(By.xpath("//div[text()='Mayur Patil']"));
	name.click();

//	  js.executeScript("arguments[0].send",SelectAPro);
//	SelectAPro.sendKeys("Mayur" + Keys.ENTER);
//	driver.findElement(By.xpath("(//div[@class='tab-content'])[1]")).click();
}

public void AddStud() {
	AddStud.click();
}

public void EnterStud() {
	EnterStud.sendKeys("Mayur" + Keys.RETURN);
	//EnterStud.sendKeys("Mayur"); 
}

public void close() {
	close.click(); 
}

public void SelectElogbookTab() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
	SelectElogbookTab.click(); 
}

public void SelectDisable_EnableBtn() {
//	String Enable = "Enabled";
//	String ActEnable = SelectDisable_EnableBtn.getText();
//	if (Enable.equals(ActEnable)) {
//		System.out.println("Already Enabled");
//	} else {
//		SelectDisable_EnableBtn.click();
//	}
	 
	SelectDisable_EnableBtn.click();
}

public void SelectEDDropdown() {
	SelectEDDropdown.click(); 
}

public void SelectEnable() {
	SelectEnable.click();
}

public void SubmitBtn() {
	SubmitBtn.click();
}

public void SubmitOkBtn() {
	SubmitOKBtn.click();
}

public void SubmitActOkBtn() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();",SubmitActOKBtn);
	SubmitActOKBtn.click();
}

public void SubmitActOkBtn2() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();",SubmitActOKBtn1);
	SubmitActOKBtn1.click();
}

public void DefaultGuidesView_Edit() {
	DefaultGuidesView_Edit.click();
}

public void AddGuideBtn() {
	AddGuideBtn.click();
}

public void ShowGuide() {
	ShowGuide.click();
}

public void SelectGuide() {
	
	SelectGuide.click();
}

public void BackToDashboardElogbook() {
	BackToDashboardElogbook.click();
}

public void SelectElogbookTab2() {
	SelectElogbookTab.click();
}

public void ELogBookCoverInformationView_Edit() {
	ELogBookCoverInformationView_Edit.click();
}

public void ELogBookCoverDecription_Edit() {
	ELogBookCoverDecription_Edit.click();
}

public void EnterELogBookCoverDescription() {
	EnterELogBookCoverDescription.click();
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    EnterELogBookCoverDescription.sendKeys("Science");
}

public void ELogBookCoverEnableDesable() {
	ELogBookCoverEnableDesable.click();
}

public void ELogBookCoverEnable() {
	ELogBookCoverEnable.click();
}

public void ELogBookCoverSaveBtn() {
	ELogBookCoverSaveBtn.click();
}

//======================

public void AddNewSectionBtn() {
	AddNewSectionBtn.click();
}

public void EnterSectionName() {
	EnterSectionName.sendKeys("Section 1");
}

public void AddNewInputBtn() {
	AddNewInputBtn.click();
}

public void AddNewInputBtn1() {
	AddNewInputBtn1.click();
}




public void AddTextInputBtn() {
	AddTextInputBtn.click();
}

public void AddNumberInputBtn() {
	AddNumberInputBtn.click();
}

public void AddPDFInputBtn() {
	AddPDFInputBtn.click();
}

public void AddImageInputBtn() {
	AddImageInputBtn.click();
}


public void AddRadioInputBtn() {
	AddRadioInputBtn.click();
}









public void AddCheckboxesInputBtn() {
	AddCheckboxesInputBtn.click();
}

public void AddDateInputBtn() {
	AddDateInputBtn.click();
}

public void AddURLInputBtn() {
	AddURLInputBtn.click();
}

public void AddTimeInputBtn() {
	AddTimeInputBtn.click();
}

public void AddDropdownInputBtn() {
	AddDropdownInputBtn.click();
}






public void EnterLabel1() {
	EnterLabel.sendKeys("Enter Name");
}

public void EnterLabel2() {
	EnterLabel.sendKeys("Enter Number");
}

public void EnterLabel3() {
	EnterLabel.sendKeys("Enter PDF");
}

public void EnterLabel4() {
	EnterLabel.sendKeys("Enter Image");
}

public void EnterLabel5() {
	EnterLabel.sendKeys("Select Radio Btn");
}

public void EnterLabel6() {
	EnterLabel.sendKeys("Select CheckBox");
}

public void EnterLabel7() {
	EnterLabel.sendKeys("Select Date");
}

public void EnterLabel8() {
	EnterLabel.sendKeys("Enter URL");
}

public void EnterLabel9() {
	EnterLabel.sendKeys("Select Time");
}

public void EnterLabel10() {
	EnterLabel.sendKeys("Select Drop Down");
}

public void EnterPlaseHolder1() {
	EnterPlaseHolder.sendKeys("Required Name");
}

public void EnterPlaseHolder2() {
	EnterPlaseHolder.sendKeys("Required Number");
}

public void EnterPlaseHolder3() {
	EnterPlaseHolder.sendKeys("Required PDF");
}

public void EnterPlaseHolder4() {
	EnterPlaseHolder.sendKeys("Required Image");
}

//Radio Button

public void EnterRadioBtn() {
	EnterRadioBtn.sendKeys("Radio Btn 1");
}


public void ClickRadioBtnAdd() {
	ClickRadioBtnAdd.click();
}


public void EnterReqCheckBox() {
	EnterReqCheckBox.sendKeys("Required CheckBox");
}

public void ClickCheckBoxAddBtn() {
	ClickCheckBoxAddBtn.click();
}



public void EnterPlaseHolder7() {
	EnterPlaseHolder.sendKeys("Required Date");
}

public void EnterPlaseHolder8() {
	
	EnterPlaseHolder.sendKeys("Required URL");
}

public void EnterPlaseHolder9() {
	EnterPlaseHolder.sendKeys("Required Time");
}

public void EnterDropDown() {
	EnterDropDown.sendKeys("Drop Down 1");
}

public void ClickDropDownAddBtn() {
	ClickDropDownAddBtn.click();
}





public void EnterLabel11() {
	EnterLabel.sendKeys("Enter Name");
}

public void EnterLabel12() {
	EnterLabel.sendKeys("Enter Number");
}

public void EnterLabel13() {
	EnterLabel.sendKeys("Enter PDF");
}

public void EnterLabel14() {
	EnterLabel.sendKeys("Enter Image");
}

public void EnterLabel15() {
	EnterLabel.sendKeys("Select Radio Btn");
}

public void EnterLabel16() {
	EnterLabel.sendKeys("Select CheckBox");
}

public void EnterLabel17() {
	EnterLabel.sendKeys("Select Date");
}

public void EnterLabel18() {
	EnterLabel.sendKeys("Enter URL");
}

public void EnterLabel19() {
	EnterLabel.sendKeys("Select Time");
}

public void EnterLabel20() {
	EnterLabel.sendKeys("Select Drop Down");
}

public void EnterPlaseHolder11() {
	EnterPlaseHolder.sendKeys("Required Name");
}

public void EnterPlaseHolder12() {
	EnterPlaseHolder.sendKeys("Required Number");
}

public void EnterPlaseHolder13() {
	EnterPlaseHolder.sendKeys("Required PDF");
}

public void EnterPlaseHolder14() {
	EnterPlaseHolder.sendKeys("Required Image");
}

public void EnterPlaseHolder15() {
	EnterPlaseHolder.sendKeys("Required Radio Btn");
}

public void EnterPlaseHolder16() {
	EnterPlaseHolder.sendKeys("Required CheckBox");
}

public void EnterPlaseHolder17() {
	EnterPlaseHolder.sendKeys("Required Date");
}

public void EnterPlaseHolder18() {
	EnterPlaseHolder.sendKeys("Required URL");
}

public void EnterPlaseHolder19() {
	EnterPlaseHolder.sendKeys("Required Time");
}

public void EnterPlaseHolder20() {
	EnterPlaseHolder.sendKeys("Required Drop Down");
}






public void TextInputAddBtn() {
	TextInputAddBtn.click();
}

public void BackToDashboardElogbook1() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
	BackToDashboardElogbook1.click();
}

public void BackToDashboardElogbook2() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
	BackToDashboardElogbook2.click();
}

public void ClickAddNewActivityGroupBtn() {
	ClickAddNewActivityGroupBtn.click();
}

public void EnterActivityGroupName() {
	EnterActivityGroupName.sendKeys("Group 1");
}

public void ShowGroupStatus() {
	ShowGroupStatus.click();
}

public void SelectGroupStatus() {
	SelectGroupStatus.click();
}

public void CreateBtn() {
	CreateBtn.click();
}

public void AddNewActivityBtn() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 300);");
    Thread.sleep(500);
    AddNewActivityBtn.click();
}

public void EnterActivityName() {
	EnterActivityName.sendKeys("New Activity");
}

public void ClickOnAddButton() {
	ClickOnAddButton.click();
}

public void ClickOnManageBtn() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
    ClickOnManageBtn.click();
}

public void ClickEditBtn() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
    Thread.sleep(500);
	ClickEditBtn.click();
}

public void ShowDrpdown() {
	ShowDrpdown.click();
}

public void SelectDrpdown() {
	SelectDrpdown.click();
}

public void EnterDescription() {
	EnterDescription.sendKeys("Discription is Entered");
}

public void ScrollDown() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
}



//=================    Rahul Mali Methods ==============





public void ShowRole1() {
    ShowRole1.click();
}

public void SelectRole1() {
    SelectRole1.click();
}

public void SelectElogbooks() {
    SelectElogbooks.click(); 
}

public void AddElogbook() {
     AddElogbook.click();
}
public void SelectName() {
    SelectName.click();
}
public void Logbook() {
	WebElement element = driver.findElement(By.xpath("//button[@class='c-btn link m0']//*[name()='svg']"));
    String text = element.getText();
    WebElement link = driver.findElement(By.linkText(text));
    link.click();
    Logbook.click();
}
public void Activity() {
    Activity.click();
}
public void Group() {
    Group.click();
}
public void Activity1() {
    Activity1.click();
}
public void Group1() {
    Group1.click();
}
public void AddLog() {
    AddLog.click();
    }
public void Test1() {
    Text1.sendKeys("hi.......java");
}

public void EnterNumber() {
	EnterNumber.sendKeys("1234567890");
}

public void uploadSupportingDoc(String filePath) {
     uploadInputField.sendKeys(filePath); 
}
public void uploadSupportingDoc2(String filePath) {
    uploadSupportingDoc2.sendKeys(filePath);
}

public void RadioBtn() {
	RadioBtn.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
}

public void Checkbox1() {
    Checkbox2.click();
}
public void ShowStartDate1() {
    ShowStartDate1.click();
}
public void SelectStartDate1() {
    SelectStartDate1.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
}


public void url1() {
    url1.sendKeys("https://example.com");
    }
public void ShowTime1() {
    ShowTime1.click();
}
public void SelectTime1() {
    SelectTime1.click();
}
public void Min() {
    Min.click();
}
public void Am() {
    Am.click();
}
public void Ok1() {
    Ok1.click();
}
public void Dropdown1() {
    Dropdown1.click();
}
public void Updown1() {
    Updown1.click();
}

public void Submit() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("arguments[0].click();",Submit);
//    Submit.click();
}
public void Ok() {
    Ok.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
    }
public void Back4() {
    Back1.click();
}




//=================    Harshada Methods ==============




public void ELogbooks() {
    
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", ELogbooks);
}


public void view() {
	view.click();
}

public void ScrollDown3() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 1300);");
}

public void manage() {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", manage);
}

public void ScrollUp4() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
}

public void AddLog1() {
    
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", AddLog1);
}

public void okbtn() {
	okbtn.click();
}



public void Submit1() {
	Submit.click();
}

public void okay() {
	okay.click();
}

public void ScrollUp1() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
}

public void back() {
    back.click(); 
}

public void backbtn() {
    backbtn.click(); 
}

public void ViewGuide() {
    // Assuming 'ViewGuide' is a WebElement, locate it using an appropriate locator
    //WebElement viewGuideElement = driver.findElement(By.id("ViewGuide")); // Adjust the locator as needed

    // Using JavascriptExecutor to click the element
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", ViewGuide);
}

public void Back1() {
    Back.click(); 
}

public void ViewCoverInfo() {
	ViewCoverInfo.click();
}

public void Edit() {
    Edit.click(); 
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 500);");
}



public void Test2() {
    Text2.sendKeys("hi.......java");
}

public void EnterNumber2() {
	EnterNumber2.sendKeys("1234567890");
	
}

public void uploadSupportingDoc222(String filePath) {
     uploadInputField222.sendKeys(filePath); 
    
}

public void RadioBtn2() {
	RadioBtn2.click();
}

public void Checkbox22() {
    Checkbox22.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 300);");
}
public void ShowStartDate12() {
    ShowStartDate12.click();
}
public void SelectStartDate12() {
    SelectStartDate12.click();
}


public void url12() {
    url12.sendKeys("https://example.com");
    }
public void ShowTime12() {
    ShowTime12.click();
}
public void SelectTime12() {
    SelectTime12.click();
}
public void Min2() {
    Min2.click();
}
public void Am2() {
    Am2.click();
}
public void Ok12() {
    Ok12.click();
}
public void Dropdown12() {
    Dropdown12.click();
}
public void Updown12() {
    Updown12.click();
}




public void submit() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
    jsExecutor.executeScript("arguments[0].click();", submit);
}

public void submitok() {
    jsExecutor.executeScript("arguments[0].click();", submitok);
}

public void CoverformBack() {
    CoverformBack.click(); 
}
public void Communication() {
  
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", Communication);
}

public void Timeline(String String) {
    Timeline.sendKeys(String); 
}


public void ScrollTimeline() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
}

public void Post() {
	Post.click();
}

public void SuccessOK() {
    SuccessOK.click(); 
}

public void ScrollUp2() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
}

public void bk() {
    jsExecutor.executeScript("arguments[0].click();", bk);
}



//=================    Vaibhav Methods ==============

public void ShowRole2() {
    ShowRole3.click();
}

public void SelectRole2() {
    SelectRole2.click();
}

public void SelectElogbooks2() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", CourseLibrary);
    Thread.sleep(1000);
    SelectElogbooks2.click(); 
}

public void View() {
View.click();
}

public void ViewGuide1() {
ViewGuide.click();
}

public void GuideBack() {
GuideBack.click();
}

public void ViewElogbookCover() {
ViewElogbookCover.click();
}

public void Back2() {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", Back2);
//Back.click();
}

public void Manage() {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", Manage);

}

public void View2() {
View2.click();
}

public void Edit1() {
Edit1.click();
}

public void text1(String str) {
text1.sendKeys(str); // Assuming this is a click action; if it's meant for typing, please update accordingly
}

public void Backk() {
Backk.click();
}

public void UploadImage(String str) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);", UploadImage);
UploadImage.sendKeys(str);
}

public void ShowAssessedDropdown() {
	ShowAssessedDropdown.click();
}

public void SelectAssessedDropdown() {
SelectAssessedDropdown.click();
}

public void SubmitForm() {
SubmitForm.click();
}

public void OKBtn() {
OKBtn.click();
}

public void AutomationTestingBack() {
AutomationTestingBack.click();
}

public void Communication1() {
Communication1.click();
}

public void EnterTimeline(String str) {
EnterTimeline.sendKeys(str); // If this requires text input, change to `EnterTimeline.sendKeys("your text");`
}

public void Post1() {
Post1.click();

}

public void Back3() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
Back3.click();
}



//=================    Nikhil Methods ==============



public void ShowRole5() {
    ShowRole5.click();
}

public void SelectRole5() {
    SelectRole5.click();
}

public void ScrollDownDrawer() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", Location);
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("window.scrollBy(0, 5000);");
//    ScrollDownDrawer.isDisplayed();
}

public void SelectElogbooks5() {
    //Actions actions = new Actions(driver);
    //actions.doubleClick(SelectElogbooks5).perform();
    SelectElogbooks5.click(); 
}

public void SearchName() {
    SearchName.sendKeys("Mayur");
}



//public void SelectDropdown() {
//    SelectDropdown.click();  
//}
//
//public void scrollDropdown() {
//    scrollDropdown.click();
//}
//  
//
//
//
//public void SelectSTQA() {
////    jsExecutor.executeScript("arguments[0].click();", SelectSTQA);
//    Actions actions = new Actions(driver);
//    actions.scrollToElement(SelectSTQA).perform();
//    SelectSTQA.click();  


public void View5() {
    //Actions actions = new Actions(driver);
    //actions.doubleClick(View5).perform();
   View5.click();  
}

public void ViewEdit() {
   // Actions actions = new Actions(driver);
    //actions.doubleClick(ViewEdit).perform();
    
    ViewEdit.click();  
}

public void AddGuide() {
    AddGuide.click();  
}

public void SearchGuide() {
    SearchGuide.click();
}

public void SelectGuide5() {
    SelectGuide5.click(); 
}

public void ClickAdd() {
   // Actions actions = new Actions(driver);
    //actions.doubleClick(ClickAdd).perform(); 
    ClickAdd.click(); 
}

public void ConfirmOk() {
    ConfirmOk.click(); 
}

public void Backbtn() { 
    Backbtn.click(); 
}

public void Elogbookcover() { 
   // Actions actions = new Actions(driver);
    //actions.doubleClick(Elogbookcover).perform();  
   Elogbookcover.click(); 
}

public void ScrollUp5() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);"); 
}

public void ClickNotVerified() { 
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",ClickNotVerified);
    
    //ClickVerified.click(); 
}

public void ClickVerified() { 
    ClickVerified.click();  
}

public void ClickOnOk() { 
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",ClickOnOk);
    //ClickOnOk.click();  
}

public void Back5() throws InterruptedException {
    Thread.sleep(1000);
//    Actions actions = new Actions(driver);
//    actions.doubleClick(Back).perform();
      Back5.click();  
}

public void Communication5() { 
    //Actions actions = new Actions(driver);
    //actions.doubleClick(Communication5).perform();
   Communication5.click();  
}

public void EnterTimeLine() { 
    EnterTimeLine.sendKeys("Hello Guys");
}

public void Post5() { 
   // Actions actions = new Actions(driver);
    //actions.doubleClick(Post5).perform();
    Post5.click();
}

public void Ok5() { 	
    Ok5.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
}

public void Backpage() { 
   // Actions actions = new Actions(driver);
    //actions.doubleClick(Backpage).perform();
    Backpage.click();
}
// dhiryashil 

public void ClickViews() {
    ClickView.click(); 
}
public void Manage6() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
    Manage6.click(); 
}
public void ManageView() {
    ManageView.click(); 
}
public void NotAssesed() {
    NotAssesed.click(); 
}
public void SelectAssesed() {
    SelectAssesed.click(); 
}
public void AssesedOk() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", AssesedOk);
//    AssesedOk.click(); 
}
public void LastOk() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", LastOK);
}
public void Back6() {
     JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Back6);
    //Back1.click(); 
}

public void ScrollUp6() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 0);");
}

public void SelectOption() {
    SelectOption.click(); 
}
public void NotApllicable() {
    NotApllicable.click(); 
}
public void Clear() {
    Clear.click(); 
}
public void DateFilter() {
    DateFilter.click(); 
}
public void StartDate() {
    StartDate.click(); 
}
public void SelectStartDate() {
     JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", SelectStartDate);
//    SelectStartDate.click(); 
}
public void EndDate() {
    EndDate.click(); 
}

public void selectEndDate() {
    selectEndDate.click(); 
}

public void Submit6() {
    Submit6.click(); 
}









}