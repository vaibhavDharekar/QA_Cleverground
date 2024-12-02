package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {

    // This method will provide the test data
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
            {"user1"}, // Test case 1
            {"user2"}, // Test case 2
            {"user3"}, // Test case 3
            {"user4"}, // Test case 4
            {"user5"}, // Test case 5
            {"user6"}, // Test case 6
            {"user7"}, // Test case 7
            {"user8"}, // Test case 8
            {"Vaibhav"}, // Test case 9
            {"user10"} // Test case 10
        };
    }

    // This test method will run with different inputs from the DataProvider
    @Test(dataProvider = "loginData")
    public void testLogin(String username) {
        System.out.println("Testing login with username: " + username);
        // Here you would add the actual code to perform the login action
        // e.g., driver.findElement(By.id("username")).sendKeys(username);
        // For demonstration, we're just printing the username
    }
}

