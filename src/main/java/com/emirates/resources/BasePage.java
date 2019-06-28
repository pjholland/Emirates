package com.emirates.resources;


import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class BasePage {

    public enum Locators {
        xpath, id, name, classname, paritallinktext, linktext, tagname, css,
    }
    protected WebDriver getDriver() {
        return WebDriverSingleton.getInstance(WebDriverSingleton.Browsers.chrome);
    }

    public void navigateTo(String url)
    {
        getDriver().navigate().to(url);
    }

    public void navigateForward() {
        getDriver().navigate().forward();
    }

    public void confirmPageTitle(String title) {
        assertTrue(getDriver().getTitle().contains(title));
    }

    public void switchToFrame(String frameId) {
        getDriver().switchTo().frame(frameId);
    }

    public void switchToDefaultContent() {
        getDriver().switchTo().defaultContent();
    }


    public void elementHasText(Locators locator, String element, String elementText) throws Exception {
        String actualString = getWebElement(locator, element).getText();
        assertTrue(actualString.contains(elementText));
    }

    ////////////////////////////////////
    //extra base page webDriver functionality
    ////////////////////////////////////

    //a method to grab the web element using selenium WebDriver
    private WebElement getWebElement(Locators locator, String element) throws Exception {
        By byElement;
        switch (locator) {        //determine which locator item we are interested in
            case xpath: {
                byElement = By.xpath(element);
                break;
            }
            case css: {
                byElement = By.cssSelector(element);
                break;
            }
            case id: {
                byElement = By.id(element);
                break;
            }
            case name: {
                byElement = By.name(element);
                break;
            }
            case classname: {
                byElement = By.className(element);
                break;
            }
            case linktext: {
                byElement = By.linkText(element);
                break;
            }
            case paritallinktext: {
                byElement = By.partialLinkText(element);
                break;
            }
            case tagname: {
                byElement = By.tagName(element);
                break;
            }
            default: {
                throw new Exception();
            }
        }
        return getDriver().findElement(byElement);    //return our query

    }




}
