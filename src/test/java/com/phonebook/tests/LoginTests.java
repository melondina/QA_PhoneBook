package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();
    }

    @Test(priority = 1)
    public void loginPositiveTest() {
        //enter password field
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("din@gmail.com")
                .setPassword("dinQ1234$"));
        //enter email field
        //click on Registration
        app.getUser().clickOnLoginButton();
        //assert user logged in(check Sign out button displayed)
        Assert.assertTrue(app.getHeader().isSignOutButtonPresent());
    }

    @Test(priority = 2)
    public void loginNegativeWithPasswordTest() {
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("din@gmail.com"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());
    }
}
