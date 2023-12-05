package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerAccountText = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstNameFiled = By.id("input-firstname");
    By lastNameFiled = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.id("input-confirm");
    By subscribeYesRadioButton = By.xpath("//label[normalize-space()='Yes']");
    By privacyPolicyCheckBox = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");




    public String getTextRegisterAccount() {
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameFiled, firstName + getAlphaNumericString(4));
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameFiled, lastName + getAlphaNumericString(4));
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email + getAlphaNumericString(4) + "@gmail.com");
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickOnSubscribeYesRadioButton(){
        clickOnElement(subscribeYesRadioButton);
    }
    public void clickOnPrivacyPolicyCheckBox(){
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}