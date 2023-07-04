package com.phonebook.tests;

import com.phonebook.fw.DataProviders;
import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.testng.Assert;
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

    @Test(dataProviderClass = DataProviders.class,dataProvider = "addContactFromCsvFile")
    public void addContactsFromCsvFilePositiveTest(Contact contact) {
        app.getHeader().clickOnAddLink();
        app.getContact().fillAddContactForm(contact);
        app.getContact().clickOnSaveButton();
    }

//    @AfterMethod
//    public void removeContact() {
//        if(!app.getContact().isContactListIsEmpty()) {
//            app.getContact().clickOnContactField();
//            app.getContact().clickOnRemoveButton();
//        }
//    }

}
