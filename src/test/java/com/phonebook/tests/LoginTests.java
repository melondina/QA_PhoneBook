package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {
            app.clickOnSignOutButton();
        }
        app.clickOnLoginLink();
    }

    @Test
    public void loginPositiveTest() {
        //enter password field
        app.fillLoginRegistrationForm(new User()
                .setEmail("din@gmail.com")
                .setPassword("dinQ1234$"));
        //enter email field
        //click on Registration
        app.clickOnLoginButton();
        //assert user logged in(check Sign out button displayed)
        Assert.assertTrue(app.isSignOutButtonPresent());
    }

    @Test
    public void loginNegativeWithPasswordTest() {
        app.fillLoginRegistrationForm(new User()
                .setEmail("din@gmail.com"));
        app.clickOnLoginButton();
        Assert.assertTrue(app.isAlertPresent());
    }

}


