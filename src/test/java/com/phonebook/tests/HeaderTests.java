package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase {
    @Test
    public void homeLinkPresentTest() {
        isElementPresent(By.xpath("//a[text()='HOME']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='HOME']")));
    }
    public void aboutLinkPresentTest() {
        isElementPresent(By.xpath("//a[text()='ABOUT']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='ABOUT']")));
    }
    public void loginLinkPresentTest() {
        isElementPresent(By.xpath("//a[text()='LOGIN']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='LOGIN']")));
    }

    public void titleLinkPresentTest() {
        isElementPresent(By.xpath("//h1[text()='PHONEBOOK']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h1[text()='PHONEBOOK']")));
    }

}
