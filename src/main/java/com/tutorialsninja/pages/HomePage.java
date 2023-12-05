package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By currencyLink = By.xpath("//span[normalize-space()='Currency']");
    By poundSterlingLink = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By myAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By myAccountListLink = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    public void mouseHoverOnCurrencyDropdownAndClick() {
        clickOnElement(currencyLink);
    }

    public void mouseHoverOn£PoundSterlingAndClick() {
        mouseHoverToElementAndClick(poundSterlingLink);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(myAccountListLink);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(myAccountListLink);
        }

    }
    public void clockOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
}