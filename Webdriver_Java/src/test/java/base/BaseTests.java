package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    protected FormPage formPage;
    protected Formy_Home_Page formyHomePage;
    protected Thank_You_Page thankYouPage;

    //protected HomePage homePage;
    //protected LoginPage loginPage;
    //protected SecureAreaPage secureAreaPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");

        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375,812));
        //driver.manage().window().fullscreen();

        //List<WebElement> links= driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();

        //System.out.println(driver.getTitle());
        //driver.quit();

        //WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        //inputsLink.click();

        //WebElement inputsLink2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        //inputsLink2.click();

        //List<WebElement> inputsLink3 = driver.findElements(By.tagName("li"));
        //System.out.println(inputsLink3.size());

        //homePage = new HomePage(driver);

        formyHomePage = new Formy_Home_Page(driver);


        }


    @AfterClass
    public void tearDown(){
        driver.quit();

    }

}
