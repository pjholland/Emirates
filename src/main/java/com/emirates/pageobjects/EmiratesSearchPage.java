package com.emirates.pageobjects;

import com.emirates.resources.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmiratesSearchPage extends BasePage {

    private String outaiport   = ("ctl00_c_CtWNW_ddlFrom-suggest");
    private String returnairport = ("ctl00_c_CtWNW_ddlTo-suggest");
    private String seardhbutton = ("ctl00_c_IBE_PB_FF");
    private String departuredatepicker = ("txtDepartDate");
    private String returndatepicker = ("txtarrivaldate");
    private String selectLanguageButton = ("ctl00_IBEHeader_ChooseCntryandLang");
    private String selectCountryEntryBox = ("search-country-input");


    public void open() throws InterruptedException {
        // Note hard coded URL used here - this would not happen in production code
        getDriver().get("https://fly4.emirates.com");
    }

    public void setOutairport() throws InterruptedException {
       // Thread.sleep(1000);
        getDriver().findElement(By.id(outaiport)).sendKeys("LON");
        getDriver().findElement(By.id(outaiport)).sendKeys(Keys.DOWN);
        getDriver().findElement(By.id(outaiport)).sendKeys(Keys.RETURN);
    }

    public void setReturnairrport(){
        getDriver().findElement(By.id(returnairport)).sendKeys("Dub");
        getDriver().findElement(By.id(returnairport)).sendKeys(Keys.DOWN);
        getDriver().findElement(By.id(returnairport)).sendKeys(Keys.RETURN);
    }

    public void clicksearchbutton(){
        getDriver().findElement(By.id(seardhbutton)).click();
    }

    public void setDepatureDate(){
        getDriver().findElement(By.id(departuredatepicker)).click();
        getDriver().findElement(By.id("day-1-6-2019")).click();
    }

    public void setReturnDate(){
        getDriver().findElement(By.id(returndatepicker)).click();
        getDriver().findElement(By.id("day-12-7-2019")).click();
    }

    public void selectLanguage()  {
        getDriver().findElement(By.id(selectLanguageButton)).click();
        getDriver().findElement(By.id(selectCountryEntryBox)).sendKeys("United Kingdom");
        getDriver().findElement(By.partialLinkText("English")).click();

    }

}
