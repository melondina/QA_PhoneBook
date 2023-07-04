package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        if(app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnLoginLink();
            app.getUser().login();
            app.getHeader().clickOnAddLink();
            app.getContact().addContact();
        } else {
            app.getHeader().clickOnSignOutButton();
        }
    }
    @Test
    public void removeContact() {
        app.getContact().sizeOfContacts();
        app.getContact().removeContact();
        Assert.assertTrue(!app.getContact().isContactListIsEmpty());
    }



}
