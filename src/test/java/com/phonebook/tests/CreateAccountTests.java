package com.phonebook.tests;

import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        app.getUser().fillLoginRegistrationForm(new User().setEmail("din@gmail.com").setPassword("dinQ1234$"));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isAlertPresent());
    }
}
