package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Formy_Home_Page {
    private WebDriver driver;

    private By complete_web_form = By.linkText("Complete Web Form");

    public Formy_Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    public FormPage clickCompleteWebFormLink() {
        driver.findElement(complete_web_form).click();
        return new FormPage(driver); // Navigate to the FormPage
    }
}
