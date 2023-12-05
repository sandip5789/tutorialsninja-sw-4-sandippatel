package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productNameHpLp3065Text = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By modelProduct21Text = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalLink = By.xpath("//div[@class = 'table-responsive']/table[1]/tbody[1]/tr[1]/td[6]");
    By productNameMacBookText = By.xpath("//div[@class = 'table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By quantityLink = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By upDateCartButton = By.xpath("//i[@class='fa fa-refresh']");
    By successUpdateCartMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By checkoutButton = By.xpath("//a[@class='btn btn-primary']");


    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getProductNameHpLp3065Text(){
        return getTextFromElement(productNameHpLp3065Text);
    }
    public String getDeliveryDateText(){
        return getTextFromElement(deliveryDateText);
    }
    public String getModelProduct21Text(){
        return getTextFromElement(modelProduct21Text);
    }
    public String getTotalText(){
        return getTextFromElement(totalLink);
    }
    public String getMacBookText(){
        return getTextFromElement(productNameMacBookText);
    }
    public void changeQuantityTo2(){
        String s = Keys.CONTROL + "a";
        sendTextToElement(quantityLink,s);
        sendTextToElement(quantityLink,"2");
    }
    public void clickOnUpdateCart(){
        clickOnElement(upDateCartButton);
    }
    public String upDateShoppingCartMessage(){
     return getTextFromElement(successUpdateCartMessage);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }


}
