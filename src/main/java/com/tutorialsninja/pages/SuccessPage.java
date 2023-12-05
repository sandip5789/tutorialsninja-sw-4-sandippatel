package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class SuccessPage extends Utility {

    By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public String getTextYourAccountHasBeenCreated(){
        return getTextFromElement(accountCreatedText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}
