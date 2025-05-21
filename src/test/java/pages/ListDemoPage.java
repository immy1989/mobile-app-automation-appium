package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class ListDemoPage extends BasePage {
    
    @AndroidFindBy(id = "com.theapp:id/input")
    private MobileElement itemInput;
    
    @AndroidFindBy(id = "com.theapp:id/add")
    private MobileElement addButton;
    
    @AndroidFindBy(id = "com.theapp:id/items")
    private List<MobileElement> itemList;
    
    public void enterItemName(String itemName) {
        sendKeys(itemInput, itemName);
    }
    
    public void clickAdd() {
        click(addButton);
    }
    
    public void addItemToCart(String itemName) {
        enterItemName(itemName);
        clickAdd();
    }
    
    public boolean isItemPresentInList(String itemName) {
        for (MobileElement item : itemList) {
            if (item.getText().equals(itemName)) {
                return true;
            }
        }
        return false;
    }
}