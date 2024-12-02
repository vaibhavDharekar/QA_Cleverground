package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AdmissionsLocators;

public class AdmissionsMethods {
    WebDriver driver;
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    AdmissionsLocators locators;

// Constructor
public AdmissionsMethods(WebDriver driver) {
    this.driver = driver;
    jsExecutor = (JavascriptExecutor) driver; // Initialize JavascriptExecutor
    locators = new AdmissionsLocators();
    PageFactory.initElements(driver, locators);
    
}

// Methods
public void CGlogin(String uname, String pwd) {
    locators.UserName.sendKeys(uname);
    locators.Password.sendKeys(pwd);
    locators.Chkboxbtn.click();
    locators.Loginbtn.click();
}

public void Showinstitude(){
	locators.Showinstitude.click();
}

public void Selectinstitude() {
    locators.Selectinstitude.click();
}

public void ShowRole() {
    locators.ShowRole.click();
}

public void SelectRole() {
    locators.SelectRole.click();
}

public void SelectAdmissions() throws InterruptedException {
    locators.SelectAdmissions.click();
}

public void CreateNewAcademicCycle() {
    jsExecutor.executeScript("arguments[0].click();", locators.CreateNewAcademicCycle);
}

public void ShowAcademicYears() {
    locators.ShowAcademicYears.click();
}

public void SelectAcademicYears() {
    locators.SelectAcademicYears.click();
}

public void EnterAcademicCycleName(String cycleName) {
    locators.EnterAcademicCycleName.sendKeys(cycleName);
}

public void SubmitBtn() {
    locators.SubmitBtn.click();
}

public void OKbtn() {
    locators.OKbtn.click();
}

public void ViewAcademicCycle() {
    locators.ViewAcademicCycle.click();
}

public void CreateNewAdmissionRegister() {
    locators.CreateNewAdmissionRegister.click();
}

public void ShowAAT() {
    locators.ShowAAT.click();
}

public void SelectAAT() {
    locators.SelectAAT.click();
}

public void ShowDepartment() {
    locators.ShowDepartment.click();
}

public void SelectDepartment() {
    locators.SelectDepartment.click();
}

public void Save1() throws InterruptedException {
    Thread.sleep(2000);
    locators.Save1.click();
    Thread.sleep(2000);
}

public void ShowProgram() {
    locators.ShowProgram.click();
}

public void SelectProgram() {
    locators.SelectProgram.click();
}

public void ShowYear() {
    locators.ShowYear.click();
}

public void SelectYear() {
    locators.SelectYear.click();
}

public void Add() {
    jsExecutor.executeScript("arguments[0].click();", locators.Add);
}

public void Create() {
    jsExecutor.executeScript("arguments[0].click();", locators.Create);
}

public void view() {
    locators.view.click();
}

public void AdmissionDetails() {
    jsExecutor.executeScript("arguments[0].click();", locators.AdmissionDetails);
}

public void EditBasicInformation() {
    locators.EditBasicInformation.click();
}

public void EditDate() {
    locators.EditDate.click();
}

public void ShowDate() {
    locators.ShowDate.click();
}

public void SelectDate() {
    locators.SelectDate.click();
}

public void Save() {
    jsExecutor.executeScript("arguments[0].click();", locators.Save);
}

public void EnterWebsite(String url) {
    locators.EnterWebsite.sendKeys(url);
}

public void EnterBrochureName(String brochureName) {
    locators.EnterBrochureName.sendKeys(brochureName);
}

public void UploadBrochure(String filePath) {
    locators.UploadBrochure.sendKeys(filePath);
}

public void ShowProgramDetails() {
    jsExecutor.executeScript("arguments[0].click();", locators.ShowProgramDetails);
}

public void ShowProgramOutcomes() {
    jsExecutor.executeScript("arguments[0].click();", locators.ShowProgramOutcomes);
}

public void ShowVerified() {
    locators.ShowVerified.click();
}

public void SelectVerified() {
    locators.SelectVerified.click();
}

public void IntakeSetup() {
    locators.IntakeSetup.click();
}

public void EditIntake1() {
    locators.EditIntake1.click();
}

public void Category1(String value) {
    locators.Category1.sendKeys(value);
}

public void Category2(String value) {
    locators.Category2.sendKeys(value);
}

public void Category3(String value) {
    locators.Category3.sendKeys(value);
}

public void Category4(String value) {
    locators.Category4.sendKeys(value);
}

public void Category5(String value) {
    locators.Category5.sendKeys(value);
}

public void EditIntake2() {
    locators.EditIntake2.click();
}

public void Category19(String value) {
    locators.Category19.sendKeys(value);
}

public void Category20(String value) {
    locators.Category20.sendKeys(value);
}

public void DisplayOnAdmissionPortal() {
    locators.DisplayOnAdmissionPortal.click();
}

public void Draft() {
    locators.Draft.click();
}

public void Live() {
    locators.Live.click();
}

public void IntakeSetupBack() {
    jsExecutor.executeScript("arguments[0].click()", locators.IntakeSetupBack);
}

public void ScrollToViewAdmissionDetails() {
    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", locators.IntakeSetupBack);
}

public void ApplicationForm() {
    locators.ApplicationForm.click();
}

public void Edit1() {
    locators.Edit1.click();
}

public void Textboxinfo() {
    locators.Textboxinfo.sendKeys("New Admission Process");
}

public void Savebtn() {
    locators.Savebtn.click();
}

public void OKbtn1() {
    locators.OKbtn1.click();
}

public void IntakeFormView() {
    locators.IntakeFormView.click();
}

public void IntakeFormBack() {
    locators.IntakeFormBack.click();
}

public void Edit2() {
    locators.Edit2.click();
}

public void MedicoInfo() {
    locators.MedicoInfo.click();
}

public void FamilyInfo() {
    locators.FamilyInfo.click();
}

public void FinacInfo() {
    locators.FinacInfo.click();
}

public void UniqId() {
    locators.UniqId.click();
}

public void EductionInfo() {
    locators.EductionInfo.click();
}

public void PersonalInfo() {
    locators.PersonalInfo.click();
}

public void SaveInfo() {
    locators.SaveInfo.click();
}

public void OkInfo() {
    locators.OkInfo.click();
}

public void CreateCustom() {
    locators.CreateCustom.click();
}

public void NameCustom() {
    locators.NameCustom.sendKeys("New Custom Form");
}

public void SaveCustom() {
    locators.SaveCustom.click();
}

public void VIEW2() {
    locators.VIEW2.click();
}

public void AddNewSection() {
    locators.AddNewSection.click();
}

public void SectionName() {
    locators.SectionName.sendKeys("New Section 1");
}

public void SectionNameSave() {
    locators.SectionNameSave.click();
}

public void AddNewInputClick() {
    locators.AddNewInputClick.click();
}

public void Text() {
    locators.Text.click();
}

public void Label() {
    locators.Label.sendKeys("Text");
}

public void Placeholder() {
    locators.Placeholder.sendKeys("Placeholder");
}

public void AddText() {
    locators.AddText.click();
}

public void AddNewInputClick1() {
    locators.AddNewInputClick1.click();
}

public void Number() {
    locators.Number.click();
}

public void Label1() {
    locators.Label1.sendKeys("Enter Name");
}

public void Placeholder1() {
    locators.Placeholder1.sendKeys("Enter Placeholder");
}

public void AddNumber() {
    locators.AddNumber.click();
}

public void AddNewInputClick2() {
    locators.AddNewInputClick2.click();
}

public void PDFuploader() {
    locators.PDFuploader.click();
}

public void Label2() {
    locators.Label2.sendKeys("Enter Name");
}

public void Placeholder2() {
    locators.Placeholder2.sendKeys("Enter Placeholder");
}

public void AddPDF() {
    locators.AddPDF.click();
}

public void AddNewInputClick3() {
    locators.AddNewInputClick3.click();    
}

public void Imageupload() {
    locators.Imageupload.click();    
}

public void Label3() {
    locators.Label3.sendKeys("Enter Name");    
}

public void Placeholder3() {
    locators.Placeholder3.sendKeys("Enter Placeholder");    
}

public void AddImage() {
    locators.AddImage.click();    
}

public void AddNewInputClick4() {
    locators.AddNewInputClick4.click();    
}

public void Radiobutton() {
    locators.Radiobutton.click();    
}

public void Label4() {
    locators.Label4.sendKeys("Enter Name");    
}

public void Placeholder4() {
    locators.Placeholder4.sendKeys("Enter Placeholder");    
}

public void Addoption1() {
    locators.Addoption1.click();   
}

public void AddRadio() {
    locators.AddRadio.click();    
}

public void AddNewInputClick5() {
    jsExecutor.executeScript("arguments[0].click();", locators.AddNewInputClick5);  
}

public void Checkbox() {
    locators.Checkbox.click();    
}

public void Label5() {
    locators.Label5.sendKeys("Enter Name");    
}

public void Placeholder5() {
    locators.Placeholder5.sendKeys("Enter");     
}

public void Addoption2() {
    locators.Addoption2.click();    
}

public void AddCheckbox() {
    locators.AddCheckbox.click();    
}

public void AddNewInputClick6() {
    jsExecutor.executeScript("arguments[0].click();", locators.AddNewInputClick6);   
}

public void Date() {
    locators.Date.click();    
}

public void Label6() {
    locators.Label6.sendKeys("Enter Name");    
}

public void Placeholder6() {
    locators.Placeholder6.sendKeys("Enter Placeholder");    
}

public void AddDate() {
    locators.AddDate.click();    
}

public void AddNewInputClick7() throws InterruptedException {
    Thread.sleep(5000);
    locators.AddNewInputClick7.click();    
}

public void URL() {
    locators.URL.click();    
}

public void Label7() {
    locators.Label7.sendKeys("Enter Name");
}

public void Placeholder7() {
    locators.Placeholder7.sendKeys("Enter Placeholder");    
}

public void AddURL() {
    locators.AddURL.click();    
}

public void BACK() {
    locators.BACK.click();     
}

public void ScrollDown() {
    jsExecutor.executeScript("window.scrollBy(0, 200);");
}

public void Diseble() {
    locators.Diseble.click();     
}

public void DisebleOK() {
    locators.DisebleOK.click();     
}

public void ScrollUp1() {
    jsExecutor.executeScript("window.scrollTo(0, 0);");
}

public void NOTverified() {
    locators.NOTverified.click();     
}

public void verified() {
    locators.verified.click();      
}

public void OKverified() {
    locators.OKverified.click();      
}

public void BACKbtn() {
    locators.BACKbtn.click();      
}

public void FEEtemplet() {
    locators.FEEtemplet.click();       
}

public void ADDnew() {
    locators.ADDnew.click();       
}

public void FeeLabelName() {
    locators.FeeLabelName.sendKeys("MAC Department");       
}

public void SAVEbtn() {
    locators.SAVEbtn.click();       
}

public void ManageOpen() throws InterruptedException {
    Thread.sleep(2000);
    jsExecutor.executeScript("arguments[0].click();", locators.ManageOpen);      
}

public void PayableFEES() {
    locators.PayableFEES.sendKeys("100000");       
}

public void SCHOLARSHIP() {
    locators.SCHOLARSHIP.sendKeys("50000");       
}

public void FEESINSTALLMENT() {
    locators.FEESINSTALLMENT.sendKeys("2");       
}

public void SELECTdate() {
    locators.SELECTdate.click();       
}

public void CLICKtoselect() {
    locators.CLICKtoselect.click();       
}

public void SELECTdate1() {
    locators.SELECTdate1.click();       
}

public void CLICKtoselect1() {
    locators.CLICKtoselect1.click();       
}

public void CLICKsubmit() {
    jsExecutor.executeScript("arguments[0].click();", locators.CLICKsubmit);       
}

public void NOTverified2() {
    jsExecutor.executeScript("arguments[0].click();", locators.NOTverified2);       
}

public void verified2() {
    jsExecutor.executeScript("arguments[0].click();", locators.verified2);       
}

public void OKverified2() {
    jsExecutor.executeScript("arguments[0].click();", locators.OKverified2);       
}

public void FeesTemplateBack() {
    jsExecutor.executeScript("arguments[0].click();", locators.FeesTemplateBack);        
}

public void ViewIntakeBack() {
    jsExecutor.executeScript("window.scrollBy(0,-1500)");
}
}
