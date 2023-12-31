package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends BaseHelper{
    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginLink() {
        click(By.xpath("//a[.='LOGIN']"));
    }

    public void clickOnSignOutButton() {
        click(By.xpath("//button[.='Sign Out']"));
    }

    public boolean isHomeLinkPresent() {
        return isElementPresent(By.xpath("//a[text()='HOME']"));
    }

    public boolean isAboutLinkPresent() {
        return isElementPresent(By.xpath("//a[text()='ABOUT']"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//a[.='LOGIN']"));
    }

    public boolean isSignOutButtonPresent() {
        return isElementPresent(By.xpath("//button[.='Sign Out']"));
    }

    public void clickOnAddLink() {
        click(By.cssSelector("[href='/add']"));
    }

    public boolean isLogoPresent() {
        return isElementPresent(By.xpath("//h1[text()='PHONEBOOK']"));
    }
}
