package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditAccountPage {
    private WebDriver driver;
    private final int TIMEOUT_COOKIE = 6;
    private static final Logger log = LogManager.getLogger(EditAccountPage.class);
    //1-Locators
    private By firstNameSelector = By.cssSelector("#account_first_name");
    private By lastNameSelector = By.cssSelector("#account_last_name");
    private By emailCurrentAccount = By.cssSelector("#account_email");
    private By currentPasswordSelector = By.cssSelector("#password_current");
    private By newPassSelector = By.cssSelector("#password_1");
    private By confirmPassSelector = By.cssSelector("#password_2");
    private By savechangesSelector = By.cssSelector("[name='save_account_details']");
    private By accountDetailsChangedSuccessfulySelector = By.cssSelector(".woocommerce-message");

    //2-constructor of the page
    public EditAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    //Act

    public void enterFirstName(String firstname) {
        driver.findElement(firstNameSelector).sendKeys(firstname);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameSelector).sendKeys(lastName);
    }

    public void clickOnSaveChanges() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        //WebElement buttonSaveChanges = wait.until(ExpectedConditions.elementToBeClickable(savechangesSelector));
        //buttonSaveChanges.click();
        driver.findElement(savechangesSelector).click();
    }
    public void verifierAccountDetailsChangedSuccessfully(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement tesxtSaveChangesSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(savechangesSelector));
        tesxtSaveChangesSuccess.getText();
    }




}
