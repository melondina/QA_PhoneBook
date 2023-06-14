package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    //before - setUp

    @Test
    public void openHomePageTest() {
//        System.out.println("Comp" + isHomeComponentPresent1());
        isElementPresent(By.xpath("//h1[text()='Home Component']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h1[text()='Home Component']")));
    }


    public boolean isHomeComponentPresent() {
        return  isElementPresent(By.xpath("//h1[text()='Home Component']"));
    }

    public boolean isHomeComponentPresent1() {
        return isElementPresent1(By.xpath("//h1[text()='Home Component']"));
    }


}


