package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By checkoutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckoutButton = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstNameField = By.name("firstname");
    By lastNameFiled = By.name("lastname");
    By emailFiled = By.id("input-payment-email");
    By telephoneField = By.name("telephone");
    By addressField = By.name("address_1");
    By cityField = By.name("city");
    By postcodeField = By.name("postcode");
    By countryField = By.name("country_id");
    By regionField = By.name("zone_id");
    By continueButtonAfterAllField = By.xpath("//input[@id='button-guest']");
    By addCommentAreaFiled = By.xpath("//textarea[@name='comment']");
    By termsAndConditionCheckBox = By.xpath("//input[@name='agree']");
    By continueButtonAfterTermsAndCondition = By.xpath("//input[@id='button-payment-method']");
    By warningMessagePayment = By.xpath("//div[@class='alert alert-danger alert-dismissible']");


    public String checkoutTextDisplay() {
        return getTextFromElement(checkoutText);
    }

    public String newCustomerTextDisplay() {
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(guestCheckoutButton);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueButton);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);

    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameFiled, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailFiled, email);
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
    }

    public void enterCountry() {
        selectByVisibleTextFromDropDown(countryField, "United States");
    }

    public void enterRegionOrState() {
        selectByVisibleTextFromDropDown(regionField, "Buckinghamshire");
    }

    public void clockOnContinueButtonForCheckout() {
        clickOnElement(continueButtonAfterAllField);
    }
    public void addCommentAboutYourOrderInToTextArea(String comment){
        sendTextToElement(addCommentAreaFiled,comment);

    }
    public void checkOnTermsAndConditionCheckBox(){
        clickOnElement(termsAndConditionCheckBox);
    }
    public void clickOnContinueAfterTermsAndCondition(){
        clickOnElement(continueButtonAfterTermsAndCondition);
    }
    public String messageWarningPaymentMethodRequired(){
        return getTextFromElement(warningMessagePayment);
    }


}
