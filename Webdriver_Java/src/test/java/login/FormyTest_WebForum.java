package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.Thank_You_Page;

public class FormyTest_WebForum extends BaseTests {

    @Test
    public void testFormSubmission() {
        // Navigate to the form page
        FormPage formPage = formyHomePage.clickCompleteWebFormLink();

        // Fill and submit the form with valid data, and pass true/false for radio and checkbox selections
        Thank_You_Page thankYouPage = formPage.submitForm("Tirasha", "Dinuki", "Tester", "2", "01/01/2023", true, true);

        // Verify if the "Thank You" message is displayed
        Assert.assertTrue(thankYouPage.isThankYouMessageDisplayed(), "Thank you message is not displayed!");
    }
}
