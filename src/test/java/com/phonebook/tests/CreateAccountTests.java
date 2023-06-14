package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))) {
            driver.findElement(By.xpath("//button[.='Sign Out']")).click();
        }
        //click login field
        driver.findElement(By.xpath("//a[.='LOGIN']")).click();
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        //enter password field
        driver.findElement(By.cssSelector("[placeholder='Password']")).click();
        driver.findElement(By.cssSelector("[placeholder='Password']")).clear();
        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("dinQ123_");


        //enter email field
        driver.findElement(By.cssSelector("[placeholder='Email']")).click();
        driver.findElement(By.cssSelector("[placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("din@gmail.com");
        //click on Registration

        //assert user logged in(check Sign out button displayed)

    }



}
