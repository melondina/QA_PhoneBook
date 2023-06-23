package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager
            (System.getProperty("browser", Browser.CHROME.browserName()));

//    @BeforeMethod
    @BeforeSuite
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        app.init();
    }

//    @AfterMethod(enabled = false)
    @AfterSuite(enabled = false)
    public void tearDown() {
        app.stop();
    }

}
