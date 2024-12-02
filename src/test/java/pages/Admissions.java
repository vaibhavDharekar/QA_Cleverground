package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AdmissionsLocators;

public class Admissions {
    WebDriver driver;
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

// Constructor
public Admissions(WebDriver driver) {
    this.driver = driver;
    jsExecutor = (JavascriptExecutor) driver; // Initialize JavascriptExecutor
    PageFactory.initElements(driver, this);
}

// Methods
public void CGlogin(String uname, String pwd) {
    AdmissionsLocators.UserName.sendKeys(uname);
    AdmissionsLocators.Password.sendKeys(pwd);
    AdmissionsLocators.Chkboxbtn.click();
    AdmissionsLocators.Loginbtn.click();
}

public void Showinstitude(){
	AdmissionsLocators.Showinstitude.click();
}

public void Selectinstitude() {
    AdmissionsLocators.Selectinstitude.click();
}

public void ShowRole() {
    AdmissionsLocators.ShowRole.click();
}

public void SelectRole() {
    AdmissionsLocators.SelectRole.click();
}

public void SelectAdmissions() throws InterruptedException {
    AdmissionsLocators.SelectAdmissions.click();
}

public void CreateNewAcademicCycle() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.CreateNewAcademicCycle);
}

public void ShowAcademicYears() {
    AdmissionsLocators.ShowAcademicYears.click();
}

public void SelectAcademicYears() {
    AdmissionsLocators.SelectAcademicYears.click();
}

public void EnterAcademicCycleName(String cycleName) {
    AdmissionsLocators.EnterAcademicCycleName.sendKeys(cycleName);
}

public void SubmitBtn() {
    AdmissionsLocators.SubmitBtn.click();
}

public void OKbtn() {
    AdmissionsLocators.OKbtn.click();
}

public void ViewAcademicCycle() {
    AdmissionsLocators.ViewAcademicCycle.click();
}

public void CreateNewAdmissionRegister() {
    AdmissionsLocators.CreateNewAdmissionRegister.click();
}

public void ShowAAT() {
    AdmissionsLocators.ShowAAT.click();
}

public void SelectAAT() {
    AdmissionsLocators.SelectAAT.click();
}

public void ShowDepartment() {
    AdmissionsLocators.ShowDepartment.click();
}

public void SelectDepartment() {
    AdmissionsLocators.SelectDepartment.click();
}

public void Save1() throws InterruptedException {
    Thread.sleep(2000);
    AdmissionsLocators.Save1.click();
    Thread.sleep(2000);
}

public void ShowProgram() {
    AdmissionsLocators.ShowProgram.click();
}

public void SelectProgram() {
    AdmissionsLocators.SelectProgram.click();
}

public void ShowYear() {
    AdmissionsLocators.ShowYear.click();
}

public void SelectYear() {
    AdmissionsLocators.SelectYear.click();
}

public void Add() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.Add);
}

public void Create() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.Create);
}

public void view() {
    AdmissionsLocators.view.click();
}

public void AdmissionDetails() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.AdmissionDetails);
}

public void EditBasicInformation() {
    AdmissionsLocators.EditBasicInformation.click();
}

public void EditDate() {
    AdmissionsLocators.EditDate.click();
}

public void ShowDate() {
    AdmissionsLocators.ShowDate.click();
}

public void SelectDate() {
    AdmissionsLocators.SelectDate.click();
}

public void Save() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.Save);
}

public void EnterWebsite(String url) {
    AdmissionsLocators.EnterWebsite.sendKeys(url);
}

public void EnterBrochureName(String brochureName) {
    AdmissionsLocators.EnterBrochureName.sendKeys(brochureName);
}

public void UploadBrochure(String filePath) {
    AdmissionsLocators.UploadBrochure.sendKeys(filePath);
}

public void ShowProgramDetails() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.ShowProgramDetails);
}

public void ShowProgramOutcomes() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.ShowProgramOutcomes);
}

public void ShowVerified() {
    AdmissionsLocators.ShowVerified.click();
}

public void SelectVerified() {
    AdmissionsLocators.SelectVerified.click();
}

public void IntakeSetup() {
    AdmissionsLocators.IntakeSetup.click();
}

public void EditIntake1() {
    AdmissionsLocators.EditIntake1.click();
}

public void Category1(String value) {
    AdmissionsLocators.Category1.sendKeys(value);
}

public void Category2(String value) {
    AdmissionsLocators.Category2.sendKeys(value);
}

public void Category3(String value) {
    AdmissionsLocators.Category3.sendKeys(value);
}

public void Category4(String value) {
    AdmissionsLocators.Category4.sendKeys(value);
}

public void Category5(String value) {
    AdmissionsLocators.Category5.sendKeys(value);
}

public void EditIntake2() {
    AdmissionsLocators.EditIntake2.click();
}

public void Category19(String value) {
    AdmissionsLocators.Category19.sendKeys(value);
}

public void Category20(String value) {
    AdmissionsLocators.Category20.sendKeys(value);
}

public void DisplayOnAdmissionPortal() {
    AdmissionsLocators.DisplayOnAdmissionPortal.click();
}

public void Draft() {
    AdmissionsLocators.Draft.click();
}

public void Live() {
    AdmissionsLocators.Live.click();
}

public void IntakeSetupBack() {
    js.executeScript("arguments[0].click()", AdmissionsLocators.IntakeSetupBack);
}

public void ScrollToViewAdmissionDetails() {
    js.executeScript("arguments[0].scrollIntoView(true);", AdmissionsLocators.IntakeSetupBack);
}

public void ApplicationForm() {
    AdmissionsLocators.ApplicationForm.click();
}

public void Edit1() {
    AdmissionsLocators.Edit1.click();
}

public void Textboxinfo() {
    AdmissionsLocators.Textboxinfo.sendKeys("New Admission Process");
}

public void Savebtn() {
    AdmissionsLocators.Savebtn.click();
}

public void OKbtn1() {
    AdmissionsLocators.OKbtn1.click();
}

public void IntakeFormView() {
    AdmissionsLocators.IntakeFormView.click();
}

public void IntakeFormBack() {
    AdmissionsLocators.IntakeFormBack.click();
}

public void Edit2() {
    AdmissionsLocators.Edit2.click();
}

public void MedicoInfo() {
    AdmissionsLocators.MedicoInfo.click();
}

public void FamilyInfo() {
    AdmissionsLocators.FamilyInfo.click();
}

public void FinacInfo() {
    AdmissionsLocators.FinacInfo.click();
}

public void UniqId() {
    AdmissionsLocators.UniqId.click();
}

public void EductionInfo() {
    AdmissionsLocators.EductionInfo.click();
}

public void PersonalInfo() {
    AdmissionsLocators.PersonalInfo.click();
}

public void SaveInfo() {
    AdmissionsLocators.SaveInfo.click();
}

public void OkInfo() {
    AdmissionsLocators.OkInfo.click();
}

public void CreateCustom() {
    AdmissionsLocators.CreateCustom.click();
}

public void NameCustom() {
    AdmissionsLocators.NameCustom.sendKeys("New Custom Form");
}

public void SaveCustom() {
    AdmissionsLocators.SaveCustom.click();
}

public void VIEW2() {
    AdmissionsLocators.VIEW2.click();
}

public void AddNewSection() {
    AdmissionsLocators.AddNewSection.click();
}

public void SectionName() {
    AdmissionsLocators.SectionName.sendKeys("New Section 1");
}

public void SectionNameSave() {
    AdmissionsLocators.SectionNameSave.click();
}

public void AddNewInputClick() {
    AdmissionsLocators.AddNewInputClick.click();
}

public void Text() {
    AdmissionsLocators.Text.click();
}

public void Label() {
    AdmissionsLocators.Label.sendKeys("Text");
}

public void Placeholder() {
    AdmissionsLocators.Placeholder.sendKeys("Placeholder");
}

public void AddText() {
    AdmissionsLocators.AddText.click();
}

public void AddNewInputClick1() {
    AdmissionsLocators.AddNewInputClick1.click();
}

public void Number() {
    AdmissionsLocators.Number.click();
}

public void Label1() {
    AdmissionsLocators.Label1.sendKeys("Enter Name");
}

public void Placeholder1() {
    AdmissionsLocators.Placeholder1.sendKeys("Enter Placeholder");
}

public void AddNumber() {
    AdmissionsLocators.AddNumber.click();
}

public void AddNewInputClick2() {
    AdmissionsLocators.AddNewInputClick2.click();
}

public void PDFuploader() {
    AdmissionsLocators.PDFuploader.click();
}

public void Label2() {
    AdmissionsLocators.Label2.sendKeys("Enter Name");
}

public void Placeholder2() {
    AdmissionsLocators.Placeholder2.sendKeys("Enter Placeholder");
}

public void AddPDF() {
    AdmissionsLocators.AddPDF.click();
}

public void AddNewInputClick3() {
    AdmissionsLocators.AddNewInputClick3.click();    
}

public void Imageupload() {
    AdmissionsLocators.Imageupload.click();    
}

public void Label3() {
    AdmissionsLocators.Label3.sendKeys("Enter Name");    
}

public void Placeholder3() {
    AdmissionsLocators.Placeholder3.sendKeys("Enter Placeholder");    
}

public void AddImage() {
    AdmissionsLocators.AddImage.click();    
}

public void AddNewInputClick4() {
    AdmissionsLocators.AddNewInputClick4.click();    
}

public void Radiobutton() {
    AdmissionsLocators.Radiobutton.click();    
}

public void Label4() {
    AdmissionsLocators.Label4.sendKeys("Enter Name");    
}

public void Placeholder4() {
    AdmissionsLocators.Placeholder4.sendKeys("Enter Placeholder");    
}

public void Addoption1() {
    AdmissionsLocators.Addoption1.click();   
}

public void AddRadio() {
    AdmissionsLocators.AddRadio.click();    
}

public void AddNewInputClick5() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.AddNewInputClick5);  
}

public void Checkbox() {
    AdmissionsLocators.Checkbox.click();    
}

public void Label5() {
    AdmissionsLocators.Label5.sendKeys("Enter Name");    
}

public void Placeholder5() {
    AdmissionsLocators.Placeholder5.sendKeys("Enter");     
}

public void Addoption2() {
    AdmissionsLocators.Addoption2.click();    
}

public void AddCheckbox() {
    AdmissionsLocators.AddCheckbox.click();    
}

public void AddNewInputClick6() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.AddNewInputClick6);   
}

public void Date() {
    AdmissionsLocators.Date.click();    
}

public void Label6() {
    AdmissionsLocators.Label6.sendKeys("Enter Name");    
}

public void Placeholder6() {
    AdmissionsLocators.Placeholder6.sendKeys("Enter Placeholder");    
}

public void AddDate() {
    AdmissionsLocators.AddDate.click();    
}

public void AddNewInputClick7() throws InterruptedException {
    Thread.sleep(5000);
    AdmissionsLocators.AddNewInputClick7.click();    
}

public void URL() {
    AdmissionsLocators.URL.click();    
}

public void Label7() {
    AdmissionsLocators.Label7.sendKeys("Enter Name");
}

public void Placeholder7() {
    AdmissionsLocators.Placeholder7.sendKeys("Enter Placeholder");    
}

public void AddURL() {
    AdmissionsLocators.AddURL.click();    
}

public void BACK() {
    AdmissionsLocators.BACK.click();     
}

public void ScrollDown() {
    js.executeScript("window.scrollBy(0, 200);");
}

public void Diseble() {
    AdmissionsLocators.Diseble.click();     
}

public void DisebleOK() {
    AdmissionsLocators.DisebleOK.click();     
}

public void ScrollUp1() {
    js.executeScript("window.scrollTo(0, 0);");
}

public void NOTverified() {
    AdmissionsLocators.NOTverified.click();     
}

public void verified() {
    AdmissionsLocators.verified.click();      
}

public void OKverified() {
    AdmissionsLocators.OKverified.click();      
}

public void BACKbtn() {
    AdmissionsLocators.BACKbtn.click();      
}

public void FEEtemplet() {
    AdmissionsLocators.FEEtemplet.click();       
}

public void ADDnew() {
    AdmissionsLocators.ADDnew.click();       
}

public void FeeLabelName() {
    AdmissionsLocators.FeeLabelName.sendKeys("MAC Department");       
}

public void SAVEbtn() {
    AdmissionsLocators.SAVEbtn.click();       
}

public void ManageOpen() throws InterruptedException {
    Thread.sleep(2000);
    js.executeScript("arguments[0].click();", AdmissionsLocators.ManageOpen);      
}

public void PayableFEES() {
    AdmissionsLocators.PayableFEES.sendKeys("100000");       
}

public void SCHOLARSHIP() {
    AdmissionsLocators.SCHOLARSHIP.sendKeys("50000");       
}

public void FEESINSTALLMENT() {
    AdmissionsLocators.FEESINSTALLMENT.sendKeys("2");       
}

public void SELECTdate() {
    AdmissionsLocators.SELECTdate.click();       
}

public void CLICKtoselect() {
    AdmissionsLocators.CLICKtoselect.click();       
}

public void SELECTdate1() {
    AdmissionsLocators.SELECTdate1.click();       
}

public void CLICKtoselect1() {
    AdmissionsLocators.CLICKtoselect1.click();       
}

public void CLICKsubmit() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.CLICKsubmit);       
}

public void NOTverified2() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.NOTverified2);       
}

public void verified2() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.verified2);       
}

public void OKverified2() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.OKverified2);       
}

public void FeesTemplateBack() {
    js.executeScript("arguments[0].click();", AdmissionsLocators.FeesTemplateBack);        
}

public void ViewIntakeBack() {
    js.executeScript("window.scrollBy(0,-1500)");
}
}