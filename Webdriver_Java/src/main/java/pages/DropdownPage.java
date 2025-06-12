package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option) {
        //Select select = new Select(driver.findElement(dropdown));
        //dropdownElement.selectByVisibleText(option);
    }
}
