package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactsTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {
            app.clickOnSignOutButton();
        }
        app.clickOnLoginLink();
        app.clickOnLoginLink();
        app.fillLoginRegistrationForm(new User().setEmail("din@gmail.com").setPassword("dinQ1234$"));
        app.clickOnLoginButton();
    }

    @Test
    public void addContactsPositiveTest() {
        app.clickOnAddLink();
//        int i = (int) (System.currentTimeMillis()/1000)/3600;
        app.fillAddContactForm("Adam", "Karl", "1234567890", "adam@gakds.com", "Leipzig", "fdhdgnjhmghm");
        app.clickOnSaveButton();
        Assert.assertTrue(app.isContactCreated("Adam"));
    }

    @AfterMethod
    public void removeContact() {
        app.clickOnContactField();
        app.clickOnRemoveButton();
    }

}
