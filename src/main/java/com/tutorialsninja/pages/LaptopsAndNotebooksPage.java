package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {


    By laptopsAndNotebooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By laptopsAndNotebooksListLink = By.xpath("//p[@class ='price']");
    By laptopsAndNotebooksSortByLink = By.xpath("//select[@id='input-sort']");
    By productPriceHighToLowList = By.xpath("//p[@class ='price']");
    By productMcBookLink = By.xpath("//a[normalize-space()='MacBook']");


    public String getLaptopsAndNotebooksText() {
        return getTextFromElement(laptopsAndNotebooks);

    }
    public void selectSortByPriceHighToLow(){
        selectByVisibleTextFromDropDown(laptopsAndNotebooksSortByLink,"Price (High > Low)");

    }
    public void productsArrangeInDescendingOrder() {
        // Get all the products price and stored into array list

        List<WebElement> products = getListOfElements(laptopsAndNotebooksListLink);
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = getListOfElements(productPriceHighToLowList);
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));

        }
        System.out.println(afterSortByPrice);

    }
    public void clickOnProductMacBook(){
        clickOnElement(productMcBookLink);
    }

}
