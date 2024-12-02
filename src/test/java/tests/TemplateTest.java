package tests;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.Template; // Importing the correct class for IDCard1

public class TemplateTest extends BaseTest {
    WebDriver driver;
    Template idCard1;

    @BeforeTest
    public void setup() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.get("https://master.cleverground.com/#/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize the IDCard1 page object
        idCard1 = new Template(driver);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    }

    @Test(priority = 1)
    public void testCGLogin() {
        idCard1.CGlogin("dhairyashil@cleverground.com", "Dhai@9677");
    }

    @Test(priority = 2)
    public void testShowInstitutes() {
        idCard1.showInstitutes();
    }

    @Test(priority = 3)
    public void testSelectInstitutes() {
        idCard1.selectInstitutes();
    }

    @Test(priority = 4)
    public void testClickIDCard() {
        idCard1.clickIDCard();
    }
//Scenrio 1
    
//    @Test(priority = 5)
//    public void testSearchUser() {
//        idCard1.searchUser("Dhairyashil");
//    }
    
    
    
    //Scenrio 2
    
    @Test(priority = 5)
    public void templates() {
        idCard1.templates();
    }
    
    @Test(priority = 6)
    public void Clicktemplates() {
        idCard1.Clicktemplates();
    }
    @Test(priority = 7)
    public void view() {
        idCard1.view();
    }
//    @Test(priority = 8)
//    public void testEdit() {
//        idCard1.edit();
//    }
    
    
    //Select logo
//    @Test(priority = 9)
//    public void smalllogo() {
//    	idCard1.smalllogo("C:\\Users\\Dhairyashil\\Downloads\\image");
//		
//	}
    @Test(priority = 9)
    public void edit3() {
        idCard1.edit3();
    }
    @Test(priority = 10)
    public void drop() {
        idCard1.drop();
    }
    @Test(priority = 11)
    public void Name() {
        idCard1.Name();
    }
    @Test(priority = 12)
    public void save() throws InterruptedException {
        idCard1.save();
      //  Thread.sleep(15000);
    }
    @Test(priority = 13)
    public void edit5() {
        idCard1.edit5();
    }
    @Test(priority = 14)
    public void upper() {
        idCard1.upperText("Welcome to CGI in Pune");
    }
    @Test(priority = 15)
    public void save2() {
        idCard1.save2();
    }
    @Test(priority = 16)
    public void edit6() {
        idCard1.edit6();
    }
    @Test(priority = 17)
    public void lower() {
        idCard1.lowerText("Thank You");
    }
    @Test(priority = 18)
    public void save3() {
        idCard1.save3();
    }
    @Test(priority = 19)
    public void printd() {
        idCard1.printd();
    }
    @Test(priority = 20)
    public void print() {
        idCard1.print();
    }
}
