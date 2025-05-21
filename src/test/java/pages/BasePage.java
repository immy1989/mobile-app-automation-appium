package pages;

import base.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }
    
    protected void waitForVisibility(MobileElement element) {
        WebDriverWait wait = DriverManager.getWait();
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    protected void click(MobileElement element) {
        waitForVisibility(element);
        element.click();
    }
    
    protected void sendKeys(MobileElement element, String text) {
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
    }
    
    protected String getText(MobileElement element) {
        waitForVisibility(element);
        return element.getText();
    }
}