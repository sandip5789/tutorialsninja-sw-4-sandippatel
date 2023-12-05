package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LogoutPage extends Utility {

    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    public String getTextAccountLogout(){
        return getTextFromElement(accountLogoutText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
