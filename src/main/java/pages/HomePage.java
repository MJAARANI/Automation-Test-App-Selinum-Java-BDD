package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    //By Locators object repository
    private By clickMyAccountSelector = By.id("menu-item-50");

    private static final Logger log = LogManager.getLogger(HomePage.class);
    //Constructor of the page
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    //page actions
    public void clickMyAccountButton() {

        log.info("Je clique sur le boutton My Account");
        driver.findElement(clickMyAccountSelector).click();
    }



}