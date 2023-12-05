package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By sortByNameZToA = By.id("input-sort");
    By listOfProducts = By.xpath("//h4/a");
    By productArrangeInDescendingOrder = By.xpath("//h4/a");
    By sortByNameAToZ = By.id("input-sort");
    By productHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");


    public String getDeskTopsText(){
        return getTextFromElement(desktopsText);
    }

    public void selectSortByPositionNameZToA(){
        selectByVisibleTextFromDropDown(sortByNameZToA,"Name (Z - A)");

    }
    public void getProductArrangeInDescendingOrder(){
        verifyTheListIsDescendingOrder(productArrangeInDescendingOrder);
    }
    public void selectSortByPositionNameAToZ(){
        selectByVisibleTextFromDropDown(sortByNameAToZ, "Name (A - Z)");

    }
    public void selectProductHPLP3065 (){
        clickOnElement(productHPLP3065);
    }


}
