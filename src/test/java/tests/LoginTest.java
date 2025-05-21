package tests;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    
    @Test(description = "Verify successful login with valid credentials")
    public void testSuccessfulLogin() {
        HomePage homePage = new HomePage();
        homePage.navigateToLoginScreen();
        
        LoginPage loginPage = new LoginPage();
        loginPage.login("alice", "mypassword");
        
        String actualMessage = loginPage.getLoginMessage();
        loginPage.clickOk();
        
        Assert.assertEquals(actualMessage, "You are logged in as alice", 
            "Login message doesn't match expected");
    }
    
    @Test(description = "Verify login fails with invalid credentials")
    public void testInvalidLogin() {
        HomePage homePage = new HomePage();
        homePage.navigateToLoginScreen();
        
        LoginPage loginPage = new LoginPage();
        loginPage.login("invalid", "credentials");
        
        String actualMessage = loginPage.getLoginMessage();
        loginPage.clickOk();
        
        Assert.assertEquals(actualMessage, "Invalid login credentials, please try again", 
            "Error message doesn't match expected");
    }
}