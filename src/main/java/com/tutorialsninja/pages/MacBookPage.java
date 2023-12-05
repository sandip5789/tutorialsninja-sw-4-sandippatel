package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {

    By macBookText = By.xpath("//h1[normalize-space()='MacBook']");
    By addToCartLink = By.xpath("//button[@id='button-cart']");
    By successText = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCartLinkInSuccessMessage = By.xpath("//a[normalize-space()='shopping cart']");


    public String getTextMacBook(){
        return getTextFromElement(macBookText);
    }
    public void clockOnAddToCart(){
        clickOnElement(addToCartLink);
    }
    public String getSuccessMessage(){
        return getTextFromElement(successText);
    }
    public void clockOnShoppingCartInToSuccessMessage(){
        clickOnElement(shoppingCartLinkInSuccessMessage);
    }


}
