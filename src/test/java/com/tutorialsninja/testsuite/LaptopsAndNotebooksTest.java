package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class LaptopsAndNotebooksTest extends TestBase {


    HomePage homePage = new HomePage();
    TopMenuPage topMenuPage = new TopMenuPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    // 1 Test name verifyProductsPriceDisplayHighToLowSuccessfully
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        // 1.1 Mouse hover on Laptops & Notebooks Tab.and click
        topMenuPage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        // 1.2 Click on “Show All Laptops & Notebooks”
        topMenuPage.clickOnShowAllLaptopsAndNotebooks();
        // 1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortByPriceHighToLow();
        // 1.4 Verify the Product price will arrange in High to Low order.
        laptopsAndNotebooksPage.selectSortByPriceHighToLow();
    }

    // 2. Test name verifyThatUserPlaceOrderSuccessfully
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnCurrencyDropdownAndClick();
        homePage.mouseHoverOn£PoundSterlingAndClick();
        // 2.1 Mouse hover on Laptops & Notebooks Tab and click
        topMenuPage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
        // 2.2 Click on “Show All Laptops & Notebooks”
        topMenuPage.clickOnShowAllLaptopsAndNotebooks();
        // 2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortByPriceHighToLow();
        // 2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.clickOnProductMacBook();
        // 2.5 Verify the text “MacBook”
        String expectedText = "MacBook";
        String actualText = macBookPage.getTextMacBook();
        Assert.assertEquals(actualText, expectedText, "MacBook");
        // 2.6 Click on ‘Add To Cart’ button
        macBookPage.clockOnAddToCart();
        // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedMessageSuccess = "Success: You have added MacBook to your shopping cart!";
        String actualMessageSuccess = macBookPage.getSuccessMessage();
        Assert.assertTrue(actualMessageSuccess.contains("Success: You have added MacBook to your shopping cart!"));
        // 2.8 Click on link “shopping cart” display into success message
        macBookPage.clockOnShoppingCartInToSuccessMessage();
        // 2.9 Verify the text "Shopping Cart"
        String expectedText1 = "Shopping Cart";
        String actualText1 = shoppingCartPage.getShoppingCartText();
        Assert.assertTrue(actualText1.contains("Shopping Cart"));
        // 2.10 Verify the Product name "MacBook"
        String expectedProductName = "MacBook";
        String actualProductName = shoppingCartPage.getMacBookText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name not display");
        // 2.11 Change Quantity "2"
        shoppingCartPage.changeQuantityTo2();
        // 2.12 Click on “Update”Tab
        shoppingCartPage.clickOnUpdateCart();
        // 2.13 Verify the message “Success:You have modified your shopping cart !”
        String expectedMessageDisplay = "Success:You have modified your shopping cart!";
        String actualMessageDisplay = shoppingCartPage.upDateShoppingCartMessage();
        Assert.assertTrue(actualMessageDisplay.contains("Success: You have modified your shopping cart!"));
        // 2.14 Verify the Total £737 .45
        String expectedTotalPriceDisplay = "£737.45";
        String actualTotalPriceDisplay = shoppingCartPage.getTotalText();
        Assert.assertEquals(actualTotalPriceDisplay, "£737.45", "Total not matched");
        // 2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckoutButton();
        // 2.16 Verify the text “Checkout”
        String expectedText2 = "Checkout";
        String actualText2 = checkOutPage.checkoutTextDisplay();
        Assert.assertEquals(actualText2, expectedText2, "Checkout");
        // 2.17 Verify the Text “New Customer”
        String expectedText3 = "New Customer";
        String actualText3 = checkOutPage.newCustomerTextDisplay();
        Assert.assertEquals(actualText3, expectedText3, "New Customer");
        // 2.18 Click on “Guest Checkout” radio button
        checkOutPage.clickOnGuestCheckoutRadioButton();
        // 2.19 Click on “Continue” tab
        checkOutPage.clickOnContinueTab();
        // 2.20 Fill the mandatory fields
        checkOutPage.enterFirstName("Rahul");
        checkOutPage.enterLastName("Dravid");
        Random random = new Random();
        checkOutPage.enterEmail("rahul" + random.nextInt() + "@gmail.com");
        checkOutPage.enterTelephone("075428856274");
        checkOutPage.enterAddress("10 Downing Street");
        checkOutPage.enterCity("London");
        checkOutPage.enterPostcode("MK10 8LN");
        checkOutPage.enterCountry();
        checkOutPage.enterRegionOrState();
        // 2.21 Click on “Continue” Button
        checkOutPage.clockOnContinueButtonForCheckout();
        // 2.22 Add Comments About your order into text area
        checkOutPage.addCommentAboutYourOrderInToTextArea("Please attached invoice inside package");
        // 2.23 Check the Terms & Conditions check box
        Thread.sleep(2000);
        checkOutPage.checkOnTermsAndConditionCheckBox();
        // 2.24 Click on “Continue” button
        checkOutPage.clickOnContinueAfterTermsAndCondition();
        // 2.25 Verify the message “Warning:Payment method required !”
        String expectedMessageWarning = "Warning: Payment method required!";
        String actualMessageWarning = checkOutPage.messageWarningPaymentMethodRequired();
        Assert.assertTrue(actualMessageWarning.contains("Warning: Payment method required!"));

    }

}
