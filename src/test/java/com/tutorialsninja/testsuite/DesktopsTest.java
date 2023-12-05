package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HomePage homePage = new HomePage();
    HpLp3065Page hpLp3065Page = new HpLp3065Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    // 1.Test name verifyProductArrangeInAlphabeticalOrder
    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        // 1.1 Mouse hover on Desktops Tab.and click
        topMenuPage.mouseHoverOnDesktopsTabAndClick();
        // 1.2 Click on “Show All Desktops”
        topMenuPage.selectMenu("Show AllDesktops");
        // 1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectSortByPositionNameZToA();
        // 1.4 Verify the Product will arrange in Descending order.
        desktopsPage.getProductArrangeInDescendingOrder();

    }

    // 2. Test name verifyProductAddedToShoppingCartSuccessFully
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Mouse hover on Currency Dropdown and click
        homePage.mouseHoverOnCurrencyDropdownAndClick();
        // 2.2 Mouse hover on £Pound Sterling and click
        homePage.mouseHoverOn£PoundSterlingAndClick();
        // 2.3 Mouse hover on Desktops Tab.
        topMenuPage.mouseHoverOnDesktopsTabAndClick();
        // 2.4 Click on “Show All Desktops”
        topMenuPage.selectMenu("Show AllDesktops");
        // 2.5 Select Sort By position "Name: A to Z"
        desktopsPage.selectSortByPositionNameAToZ();
        // 2.6 Select product “HP LP3065”
        desktopsPage.selectProductHPLP3065();
        // 2.7 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = hpLp3065Page.getHpLp3065Text();
        Assert.assertEquals(actualText,expectedText,"HP LP3065 Product not display");
        // 2.8 Select Delivery Date "2023-11-27"
        hpLp3065Page.selectDeliveryDate();
        // 2.9.Enter Qty "1” using Select class.
        hpLp3065Page.enterQty();
        // 2.10 Click on “Add to Cart” button
        hpLp3065Page.clickOnAddToCartButton();
        // 2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Thread.sleep(2000);
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!";
        String actualText1 = hpLp3065Page.getSuccessMessage();
        Assert.assertTrue(actualText1.contains("Success: You have added HP LP3065 to your shopping cart!"));
        // 2.12 Click on link “shopping cart” display into success message
        hpLp3065Page.clickOnLinkShoppingCartDisplay();
        // 2.13 Verify the text "Shopping Cart"
        String expectedText2 = "Shopping Cart";
        String actualText2 = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualText2,expectedText2,"Shopping cart not Displayed");
        Assert.assertTrue(actualText2.contains("Shopping cart not Displayed"));
        // 2.14 Verify the Product name "HP LP3065"
        String expectedText3 = "HP LP3065";
        String actualText3 =  shoppingCartPage.getProductNameHpLp3065Text();
        Assert.assertEquals(actualText3,expectedText3,"Product name not matched");
        // 2.15 Verify the Delivery Date "2023-11-27"
        String expectedText4 = "2023-11-27";
        String actualText4 = shoppingCartPage.getDeliveryDateText();
        Assert.assertTrue(actualText4.contains("Delivery date not matched"));
        // 2.16 Verify the Model "Product21"
        String expectedText5 = "Product21";
        String actualText5 = shoppingCartPage.getModelProduct21Text();
        Assert.assertEquals(actualText5,expectedText5,"Model not matched");
        // 2.17 Verify the Total "£74.73"
        String expectedText6 = "£74.73";
        String actualText6 = shoppingCartPage.getTotalText();
        Assert.assertEquals(actualText6,expectedText6,"Total not matched");


    }

}
