package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
    
    @AndroidFindBy(accessibility = "username")
    private MobileElement usernameField;
    
    @AndroidFindBy(accessibility = "password")
    private MobileElement passwordField;
    
    @AndroidFindBy(accessibility = "loginBtn")
    private MobileElement loginButton;
    
    @AndroidFindBy(id = "android:id/message")
    private MobileElement loginMessage;
    
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okButton;
    
    public void enterUsername(String username) {
        sendKeys(usernameField, username);
    }
    
    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }
    
    public void clickLogin() {
        click(loginButton);
    }
    
    public String getLoginMessage() {
        return getText(loginMessage);
    }
    
    public void clickOk() {
        click(okButton);
    }
    
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}