package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase {
    @Test
    public void homeLinkPresentTest() {
        Assert.assertTrue(app.isHomeLinkPresent());
    }

    public void aboutLinkPresentTest() {
        Assert.assertTrue(app.isAboutLinkPresent());
    }

    public void loginLinkPresentTest() {
       Assert.assertTrue(isLoginLinkPresent());
    }

    public boolean isLoginLinkPresent() {
        return app.isElementPresent(By.xpath("//a[text()='LOGIN']"));
    }

    public void titleLinkPresentTest() {
        Assert.assertTrue(app.isLogoPresent());
    }
}
