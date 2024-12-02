package tests;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.FinalID; // Importing the correct class for FinalID

public class FinalIDtest extends BaseTest {
    WebDriver driver;
    FinalID FinalID;
    
    @BeforeTest
    public void setup() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize the FinalID page object
        FinalID = new FinalID(driver);
    }

    @Test(priority = 1)
    public void testCGLogin() {
        FinalID.CGlogin("dhairyashil@cleverground.com", "Dhai@9677");
    }

    @Test(priority = 2)
    public void testShowInstitutes() {
        FinalID.showInstitutes();
    }

    @Test(priority = 3)
    public void testSelectInstitutes() {
        FinalID.selectInstitutes();
    }

    @Test(priority = 4)
    public void testClickIDCard() {
        FinalID.clickIDCard();
    }
//Scenrio 1
    
//    @Test(priority = 5)
//    public void testSearchUser() {
//        FinalID.searchUser("Dhairyashil");
//    }
    
    
    
    //Scenrio 2
    
    @Test(priority = 5)
    public void templates() {
        FinalID.templates();
    }
    
    @Test(priority = 6)
    public void Clicktemplates() {
        FinalID.Clicktemplates();
    }
    @Test(priority = 7)
    public void view() {
        FinalID.view();
    }
//    @Test(priority = 8)
//    public void testEdit() {
//        FinalID.edit();
//    }
    
    
    //Select logo
//    @Test(priority = 9)
//    public void smalllogo() {
//    	FinalID.smalllogo("C:\\Users\\Dhairyashil\\Downloads\\image");
//		
//	}
    @Test(priority = 9)
    public void edit3() {
        FinalID.edit3();
    }
    @Test(priority = 10)
    public void drop() {
        FinalID.drop();
    }
    @Test(priority = 11)
    public void Name() {
        FinalID.Name();
    }
    @Test(priority = 12)
    public void save() throws InterruptedException {
        FinalID.save();
      //  Thread.sleep(15000);
    }
    @Test(priority = 13)
    public void edit5() {
        FinalID.edit5();
    }
    @Test(priority = 14)
    public void upper() {
        FinalID.upperText("Welcome to CGI in Pune");
    }
    @Test(priority = 15)
    public void save2() {
        FinalID.save2();
    }
    @Test(priority = 16)
    public void edit6() {
        FinalID.edit6();
    }
    @Test(priority = 17)
    public void lower() {
        FinalID.lowerText("Thank You");
    }
    @Test(priority = 18)
    public void save3() {
        FinalID.save3();
    }
    @Test(priority = 19)
    public void printd() {
        FinalID.printd();
    }
    @Test(priority = 20)
    public void print() {
        FinalID.print();
    }
}
