package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))) {
            click(By.xpath("//button[.='Sign Out']"));
        }
        //click login field
        click(By.xpath("//a[.='LOGIN']"));
    }

    @Test
    public void loginPositiveTest() {
        //enter password field
        type(By.cssSelector("[placeholder='Email']"), "din@gmail.com");
        type(By.cssSelector("[placeholder='Password']"), "dinQ1234$");
        //enter email field
        //click on Registration
        click(By.name("login"));
        //assert user logged in(check Sign out button displayed)
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }
}


