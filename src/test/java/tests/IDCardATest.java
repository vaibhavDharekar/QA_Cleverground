// CHANGE NAME FORMAT
package tests;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.IDCardA; // Importing the correct class for IDCardA

public class IDCardATest extends BaseTest {
    WebDriver driver;
    IDCardA IDCardA;

    @BeforeTest
    public void setup() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize the IDCardA page object
        IDCardA = new IDCardA(driver);
    }

    @Test(priority = 1)
    public void testCGLogin() {
        IDCardA.CGlogin("dhairyashil@cleverground.com", "Dhai@9677");
    }

    @Test(priority = 2)
    public void testShowInstitutes() {
        IDCardA.showInstitutes();
    }

    @Test(priority = 3)
    public void testSelectInstitutes() {
        IDCardA.selectInstitutes();
    }

    @Test(priority = 4)
    public void testClickIDCard() {
        IDCardA.clickIDCard();
    }
//Scenrio 1
    
//    @Test(priority = 5)
//    public void testSearchUser() {
//        IDCardA.searchUser("Dhairyashil");
//    }
    
    
    
    //Scenrio 2
    
    @Test(priority = 5)
    public void templates() {
        IDCardA.templates();
    }
    
    @Test(priority = 6)
    public void Clicktemplates() {
        IDCardA.Clicktemplates();
    }
    @Test(priority = 7)
    public void view() {
        IDCardA.view();
    }
    @Test(priority = 8)
    public void printDefault() {
        IDCardA.printDefault();
    }
    
    @Test(priority = 9)
    public void print() {
        IDCardA.print();
    }
   
    
    //Select logo
//    @Test(priority = 9)
//    public void smalllogo() {
//    	IDCardA.smalllogo("C:\\Users\\Dhairyashil\\Downloads\\image");
//		
//	}
//    @Test(priority = 9)
//    public void edit3() {
//        IDCardA.edit3();
//    }
//    @Test(priority = 10)
//    public void drop() {
//        IDCardA.drop();
//    }
//    @Test(priority = 11)
//    public void Name() {
//        IDCardA.Name();
//    }
//    @Test(priority = 12)
//    public void save() {
//        IDCardA.save();
//    }
//    @Test(priority = 13)
//    public void edit5() {
//        IDCardA.edit5();
//    }
//    @Test(priority = 14)
//    public void upper() {
//        IDCardA.upperText("Welcome to CGI in Pune");
//    }
//    @Test(priority = 15)
//    public void save2() {
//        IDCardA.save2();
//    }
//    @Test(priority = 16)
//    public void edit6() {
//        IDCardA.edit6();
//    }
//    @Test(priority = 17)
//    public void lower() {
//        IDCardA.lowerText("Thank You");
//    }
//    @Test(priority = 18)
//    public void save3() {
//        IDCardA.save3();
//    }
//    @Test(priority = 19)
//    public void printd() {
//        IDCardA.printd();
//    }

}
