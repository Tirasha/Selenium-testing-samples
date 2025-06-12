package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private WebDriver driver;

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By jobTitle = By.id("job-title");
    private By radioButton = By.id("radio-button-2");
    private By checkbox = By.id("checkbox-2");
    private By yearsOfExperience = By.id("select-menu");
    private By datepicker = By.id("datepicker");
    private By submitButton = By.xpath("//a[@class='btn btn-lg btn-primary']");
    private By thankYouMessage = By.xpath("//h1[contains(text(), 'Thanks for submitting your form!')]");

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public Thank_You_Page submitForm(String fName, String lName, String jTitle, String exp, String date, boolean isRadioSelected, boolean isCheckboxSelected) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(jobTitle).sendKeys(jTitle);

        if (isRadioSelected) {
            driver.findElement(radioButton).click();
        }

        if (isCheckboxSelected) {
            driver.findElement(checkbox).click();
        }

        driver.findElement(yearsOfExperience).sendKeys(exp);
        driver.findElement(datepicker).sendKeys(date);
        driver.findElement(submitButton).click();

        return new Thank_You_Page(driver); // Return the Thank You page object
    }

    public boolean isThankYouPage() {
        try {
            WebElement message = driver.findElement(thankYouMessage);
            return message != null;
        } catch (Exception e) {
            return false;
        }
    }
}
