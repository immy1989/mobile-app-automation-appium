package tests;

import base.TestBase;
import pages.HomePage;
import pages.ListDemoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends TestBase {
    
    @Test(description = "Verify item can be added to cart")
    public void testAddItemToCart() {
        String itemName = "Test Item " + System.currentTimeMillis();
        
        HomePage homePage = new HomePage();
        homePage.navigateToListDemo();
        
        ListDemoPage listDemoPage = new ListDemoPage();
        listDemoPage.addItemToCart(itemName);
        
        boolean isItemPresent = listDemoPage.isItemPresentInList(itemName);
        Assert.assertTrue(isItemPresent, "Item was not added to the list");
    }
}