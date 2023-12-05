package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HpLp3065Page extends Utility {

    By hpLp3065Text = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By calenderSymbolButton = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYearButton = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By monthAndYearNextArrowKey = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By dateSelectionFromCalender = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By qtySelectionButton = By.name("quantity");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCartDisplayLinkInToSuccessMessage = By.xpath("//a[contains(text(),'shopping cart')]");



    public String getHpLp3065Text (){
        return getTextFromElement(hpLp3065Text);
    }
    public void selectDeliveryDate(){
        String year = "2025";
        String month = "November";
        String date = "30";
        clickOnElement(calenderSymbolButton);
        while(true){
            String monthAndYear = driver.findElement(monthAndYearButton).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)){
                break;
            }else{
                clickOnElement(monthAndYearNextArrowKey);
            }
        }
        List<WebElement> allDates = getListOfElements(dateSelectionFromCalender);
        for (WebElement e : allDates){
            if (e.getText().equalsIgnoreCase(date)){
                e.click();
                break;
            }

        }
    }
    public void enterQty(){
        sendTextToElement(qtySelectionButton,"1");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String getSuccessMessage(){
        return getTextFromElement(successMessage);
    }
    public void clickOnLinkShoppingCartDisplay(){
        clickOnElement(shoppingCartDisplayLinkInToSuccessMessage);
    }

}
