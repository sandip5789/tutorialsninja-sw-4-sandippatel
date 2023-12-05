package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    // Locators lists
    By menuLink = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktopsLink = By.linkText("Desktops");
    By laptopsAndNotebookLink = By.linkText("Laptops & Notebooks");
    By componentsLink = By.linkText("Components");
    By showAllLaptopsAndNoteBooksList = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        // 1.2 This method should click on the menu whatever name is passed as parameter
        List<WebElement> topMenuList = getListOfElements(menuLink);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(menuLink);
        }

    }

    public void mouseHoverOnDesktopsTabAndClick() {
        mouseHoverToElementAndClick(desktopsLink);
    }

    public void mouseHoverOnLaptopsAndNotebooksTabAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebookLink);
    }

    public void mouseHoverOnComponentsTabAndClick() {
        mouseHoverToElementAndClick(componentsLink);
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(showAllLaptopsAndNoteBooksList);

    }
}



