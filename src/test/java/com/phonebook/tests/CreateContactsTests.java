package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactsTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();
        app.getUser().fillLoginRegistrationForm(new User().setEmail("din@gmail.com").setPassword("dinQ1234$"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactsPositiveTest() {
        app.getHeader().clickOnAddLink();
//        int i = (int) (System.currentTimeMillis()/1000)/3600;
        app.getContact().fillAddContactForm(new Contact()
                .setName("Adam")
                .setSurname("Karl")
                .setPhone("1234567890")
                .setEmail("adam@gakds.com")
                .setAddress("Leipzig")
                .setDesc("fdhdgnjhmghm"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Adam"));
    }

//    @AfterMethod
//    public void removeContact() {
//        if(!app.getContact().isContactListIsEmpty()) {
//            app.getContact().clickOnContactField();
//            app.getContact().clickOnRemoveButton();
//        }
//    }

}
