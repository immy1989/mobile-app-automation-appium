package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {
    
    @AndroidFindBy(accessibility = "Echo Box")
    private MobileElement echoBox;
    
    @AndroidFindBy(accessibility = "Login Screen")
    private MobileElement loginScreen;
    
    @AndroidFindBy(accessibility = "List Demo")
    private MobileElement listDemo;
    
    @AndroidFindBy(accessibility = "Photo Demo")
    private MobileElement photoDemo;
    
    @AndroidFindBy(accessibility = "Webview Demo")
    private MobileElement webviewDemo;
    
    @AndroidFindBy(accessibility = "Clipboard Demo")
    private MobileElement clipboardDemo;
    
    @AndroidFindBy(accessibility = "Drag And Drop Demo")
    private MobileElement dragAndDropDemo;
    
    @AndroidFindBy(accessibility = "Geolocation Demo")
    private MobileElement geolocationDemo;
    
    public void navigateToLoginScreen() {
        click(loginScreen);
    }
    
    public void navigateToListDemo() {
        click(listDemo);
    }
}