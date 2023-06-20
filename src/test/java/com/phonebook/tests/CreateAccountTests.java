package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {
            app.clickOnSignOutButton();
        }
        app.clickOnLoginLink();
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        app.fillLoginRegistrationForm(new User().setEmail("din@gmail.com").setPassword("dinQ1234$"));
        app.clickOnRegistrationButton();
        Assert.assertTrue(app.isAlertPresent());
    }
}
