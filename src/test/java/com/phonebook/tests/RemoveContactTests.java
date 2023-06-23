package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveContactTests extends CreateContactsTests {
    @Test
    public void removeContact() {
        app.getContact().clickOnContactField();
        app.getContact().clickOnRemoveButton();
        Assert.assertTrue(!app.getContact().isContactListIsEmpty());
    }

}
