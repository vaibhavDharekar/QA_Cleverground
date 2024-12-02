package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.TestUtils;
import pages.Admission;
import pages.PersonalInfo;

public class PersonalInfoTest {

	WebDriver driver;
	PersonalInfo PersonalInfo;
	TestUtils utils;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        PersonalInfo = new PersonalInfo(driver); // Initialize Awards page here to avoid reinitializing in each test
        // Set WebDriver as an attribute in the test context
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver);
    }
    
    @BeforeClass
    public void CGlogin() throws InterruptedException {
    	PersonalInfo.CGlogin("dhairyashil@cleverground.com", "Dhai@9677");
		Thread.sleep(5000);
		
	}

    
    @BeforeMethod
    public void Scenario_1() {
    }

	//Scenario = 1 I am able to navigate Create Event Page and Create Event Type.
    
	

	@Test(priority=1)
	public void Showinstitude() throws InterruptedException {
		Thread.sleep(100);
		PersonalInfo.Showinstitude();
	}	  
	  
	@Test(priority=2)
	public void Selectinstitude() throws InterruptedException {
		Thread.sleep(200);
		PersonalInfo.Selectinstitude();
	}	  
	  
	@Test(priority=3)
	public void ShowRole() {
		PersonalInfo.ShowRole();
	}	  

	@Test(priority=4)
	public void SelectRole() {
		PersonalInfo.SelectRole();
	}	
	
	@Test(priority=5)
	public void SelectAdmission() {
		PersonalInfo.SelectAdmission();
	}
	@Test(priority=6)
	public void AdmissionPortal() {
		PersonalInfo.AdmissionPortal();
	}
	@Test(priority=7)
	public void Applied() {
		PersonalInfo.Applied();
	}
	@Test(priority=8)
	public void ViewApplication() {
		PersonalInfo.ViewApplication();
	}
	@Test(priority=9)
	public void PersonalView() {
		PersonalInfo.PersonalView();
	}
	@Test(priority=10)
	public void PersonalEdit() {
		PersonalInfo.PersonalEdit();
	}
	@Test(priority=11)
	public void Mr() {
		PersonalInfo.Mr();
	}
	@Test(priority=12)
	public void MrSelect() {
		PersonalInfo.MrSelect();
	}
	@Test(priority=13)
	public void PersonalFirstName() {
		PersonalInfo.PersonalFirstName();
	}
	@Test(priority=14)
	public void PersonalMiddleName() {
		PersonalInfo.PersonalMiddleName();
	}
	@Test(priority=15)
	public void PersonalLastName() {
		PersonalInfo.PersonalLastName();
	}
	@Test(priority=16)
	public void MotherNameP() {
		PersonalInfo.MotherNameP();
	}
	@Test(priority=17)
	public void PersonalEmail() {
		PersonalInfo.PersonalEmail();
	}
	@Test(priority=18)
	public void DOB() {
		PersonalInfo.DOB();
	}
	@Test(priority=19)
	public void DOBSelect() throws InterruptedException {
		Thread.sleep(1000);
		PersonalInfo.DOBSelect();
	}
	@Test(priority=20)
	public void Male() {
		PersonalInfo.Male();
	}
	@Test(priority=21)
	public void Contact() {
		PersonalInfo.Contact();
	}
	@Test(priority=22)
	public void AddContact() {
		PersonalInfo.AddContact();
	}
	@Test(priority=23)
	public void WhatsApp() {
		PersonalInfo.WhatsApp();
	}
	@Test(priority=24)
	public void AddressLine1() {
		PersonalInfo.AddressLine1();
	}
	@Test(priority=25)
	public void AddressLine2() {
		PersonalInfo.AddressLine2();
	}
	@Test(priority=26)
	public void Country() {
		PersonalInfo.Country();
	}
	@Test(priority=27)
	public void India() throws InterruptedException {
		Thread.sleep(500);
		PersonalInfo.India();
	}
	@Test(priority=28)
	public void StateP(){
		
		PersonalInfo.StateP();
	}
	@Test(priority=29)
	public void Maharashtra(){
		PersonalInfo.Maharashtra();
	}
	@Test(priority=30)
	public void District() throws InterruptedException{
		Thread.sleep(500);
		PersonalInfo.District();
	}
	@Test(priority=31)
	public void Kolhapur(){
		PersonalInfo.Kolhapur();
	}
	@Test(priority=32)
	public void Town(){
		PersonalInfo.Town();
	}
	@Test(priority=33)
	public void PinCodeP(){
		PersonalInfo.PinCodeP();
	}
	@Test(priority=34)
	public void ChackAddress(){
		PersonalInfo.ChackAddress();
	}
	@Test(priority=35)
	public void Nationality(){
		PersonalInfo.Nationality();
	}
	@Test(priority=36)
	public void Indian(){
		PersonalInfo.Indian();
	}
	@Test(priority=37)
	public void IsMinority(){
		PersonalInfo.IsMinority();
	}
	@Test(priority=38)
	public void MinorityNo(){
		PersonalInfo.MinorityNo();
	}
	@Test(priority=39)
	public void Religion(){
		PersonalInfo.Religion();
	}
	@Test(priority=40)
	public void Hindu(){
		PersonalInfo.Hindu();
	}
	@Test(priority=41)
	public void Caste(){
		PersonalInfo.Caste();
	}
	@Test(priority=42)
	public void Other(){
		PersonalInfo.Other();
	}
	@Test(priority=43)
	public void OtherCaste(){
		PersonalInfo.OtherCaste();
	}
	@Test(priority=44)
	public void Catagory(){
		PersonalInfo.Catagory();
	}
	@Test(priority=45)
	public void Open(){
		PersonalInfo.Open();
	}
	@Test(priority=46)
	public void MotherTongue() throws InterruptedException{
		PersonalInfo.MotherTongue();
	}
	@Test(priority=47)
	public void Hindi(){
		PersonalInfo.Hindi();
	}
	@Test(priority=48)
	public void Language(){
		PersonalInfo.Language();
	}
	@Test(priority=49)
	public void SelectedLanguage(){
		PersonalInfo.Hindi();
	}
	@Test(priority=50)
	public void Facebook(){
		PersonalInfo.FacebookId("DP123");
	}
	@Test(priority=51)
	public void Linkedin(){
		PersonalInfo.LinkedinId("DP123");
	}
	@Test(priority=52)
	public void Twitter(){
		PersonalInfo.TwitterId("DP123");
	}
	@Test(priority=53)
	public void Instagram(){
		PersonalInfo.InstagramId("DP123");
	}
	@Test(priority=54)
	public void SelectedLanguage2(){
		PersonalInfo.Hindi2();
	}
	@Test(priority=55)
	public void Profile(){
		PersonalInfo.ProfilePhoto("C:/Users/Asus/Desktop/download1.jpg");
	}
	@Test(priority=56)
	public void Confirm(){
		PersonalInfo.Confirm();
	}
	@Test(priority=57)
	public void Signature(){
		PersonalInfo.Signature("C:/Users/Asus/Desktop/download2.jpg");
	}
	@Test(priority=58)
	public void Confirm2() throws InterruptedException{
		PersonalInfo.Confirm2();
	}



}
