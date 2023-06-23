package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase {
    @Test
    public void homeLinkPresentTest() {
        Assert.assertTrue(app.getHeader().isHomeLinkPresent());
    }

    public void aboutLinkPresentTest() {
        Assert.assertTrue(app.getHeader().isAboutLinkPresent());
    }

    public void loginLinkPresentTest() {
       Assert.assertTrue(isLoginLinkPresent());
    }

    public boolean isLoginLinkPresent() {
        return app.getHeader().isElementPresent(By.xpath("//a[text()='LOGIN']"));
    }

    public void titleLinkPresentTest() {
        Assert.assertTrue(app.getHeader().isLogoPresent());
    }
}
