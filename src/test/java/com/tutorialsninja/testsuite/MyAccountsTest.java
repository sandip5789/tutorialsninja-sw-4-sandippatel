package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {


    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    SuccessPage successPage = new SuccessPage();
    LogoutPage logoutPage = new LogoutPage();


    // 1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // 1.1 Click on My Account Link.
        homePage.clockOnMyAccountLink();
        // 1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");
        // 1.3 Verify the text “Register Account”
        String expectedMessage = "Register Account";
        String actualMessage = registerPage.getTextRegisterAccount();
        Assert.assertEquals(actualMessage, expectedMessage, "Register page not displayed");
    }

    // 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // 2.1 Click on My Account Link.
        homePage.clockOnMyAccountLink();
        // 2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");
        //  2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = loginPage.getTextReturningCustomer();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");

    }

    // 3. Test name verifyThatUserRegisterAccountSuccessfully
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        // 3.1 Click on My Account Link.
        homePage.clockOnMyAccountLink();
        // 3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");
        // 3.3 Enter First Name
        registerPage.enterFirstName("prime");
        // 3.4 Enter Last Name
        registerPage.enterLastName("test");
        // 3.5 Enter Email
        registerPage.enterEmail("prime");
        // 3.6 Enter Telephone
        registerPage.enterTelephone("07578953647");
        // 3.7 Enter Password
        registerPage.enterPassword("test123");
        // 3.8 Enter Password Confirm
        registerPage.enterConfirmPassword("test123");
        // 3.9 Select Subscribe Yes radio button
        registerPage.clickOnSubscribeYesRadioButton();
        // 3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicyCheckBox();
        // 3.11 Click on Continue button
        registerPage.clickOnContinueButton();
        // 3.12 Verify the message “Your Account Has Been Created !”
        String expectedText = "Your Account Has Been Created!";
        String actualText = successPage.getTextYourAccountHasBeenCreated();
        Assert.assertEquals(expectedText, actualText, "Your Account Has Been Created!");
        // 3.13 Click on Continue button
        successPage.clickOnContinueButton();
        // 3.14 Click on My Account Link.
        homePage.clockOnMyAccountLink();
        // 3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
        // 3.16 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = logoutPage.getTextAccountLogout();
        Assert.assertEquals(actualMessage, expectedMessage, "Not logged out");
        // 3.17 Click on Continue button
        logoutPage.clickOnContinueButton();
    }

    // 4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        // 4.1 Click on My Account Link.
        homePage.clockOnMyAccountLink();
        // 4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");
        // 4.3 Enter Email address
        loginPage.enterEmailAddress("prime1233@gmail.com");
        // 4.5 Enter Password
        loginPage.enterPassword("test1234");
        // 4.6 Click on Login button
        loginPage.clickOnLoginButton();
        // 4.8 Click on My Account Link.
        homePage.clockOnMyAccountLink();
        // 4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
        // 4.10 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = logoutPage.getTextAccountLogout();
        Assert.assertEquals(actualMessage, expectedMessage, "Not logged out");
        // 4.11 Click on Continue button
        logoutPage.clickOnContinueButton();
    }
}