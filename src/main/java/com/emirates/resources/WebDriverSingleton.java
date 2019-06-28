package com.emirates.resources;


import org.junit.AfterClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    public enum Browsers {chrome, firefox}
    private static WebDriver driver;

   // private static WebDriver driver;

    public static WebDriver getInstance(Browsers browsers) {
        if (driver == null) {
            switch (browsers) {
                case chrome:
                    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
                    driver = new ChromeDriver();
                    Dimension d = new Dimension(1600, 1200);
                    driver.manage().window().setSize(d);
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case firefox:
                    System.setProperty("webdriver.gecko.driver", "C:\\gekodriver\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }




}