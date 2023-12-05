package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

    // 1 verifyUserShouldNavigateToDesktopsPageSuccessfully
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        // 1.1 Mouse hover on “Desktops” Tab and click
        topMenuPage.mouseHoverOnDesktopsTabAndClick();
        // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        topMenuPage.selectMenu("Show AllDesktops");
        // 1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = desktopsPage.getDeskTopsText();
        Assert.assertEquals(actualText,expectedText,"Not navigate to Desktop page");

    }
    // 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        // 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.mouseHoverOnLaptopsAndNotebooksTabAndClick();
       // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
       topMenuPage.selectMenu("Show AllLaptops & Notebooks");
       //  Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = laptopsAndNotebooksPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText,expectedText, "Not navigate to Laptops and Notebooks page");

    }
    @Test
    // 3. verifyUserShouldNavigateToComponentsPageSuccessfully
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        // 3.1 Mouse hover on “Components” Tab and click
        topMenuPage.mouseHoverOnComponentsTabAndClick();
        // 3.2 call selectMenu method and pass the menu = “Show All Components”
        topMenuPage.selectMenu("Show AllComponents");
        // 3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = componentsPage.getComponentsText();
        Assert.assertEquals(actualText,expectedText,"Not navigate to Components page");

    }






}
