package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Thank_You_Page {
    private WebDriver driver;

    private By thankYouMessage = By.xpath("//h1[contains(text(), 'Thanks for submitting your form!')]");

    public Thank_You_Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isThankYouMessageDisplayed() {
        return driver.findElement(thankYouMessage).isDisplayed(); // Check if the thank you message is displayed
    }
}
