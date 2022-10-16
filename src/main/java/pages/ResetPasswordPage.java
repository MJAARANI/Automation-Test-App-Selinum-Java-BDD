package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResetPasswordPage {
    private WebDriver driver;
    private final int TIMEOUT_COOKIE = 6;
    private static final Logger log = LogManager.getLogger(ResetPasswordPage.class);
    //1-locators
    private By saisirMailToResetPasswordSelector = By.id("user_login");
    private By resetPasswordButtonSelector = By.cssSelector("input[value='Reset Password']");
    private By emailHasBeenSentSelector = By.cssSelector(".woocommerce-message");
    //2-Constructor of the page
    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }


    //3-page actions
    public void saisirMailPourResetPass(String email){
        log.info("sasir ton mail pour pouvoir reinitialiser mdp");
        driver.findElement(saisirMailToResetPasswordSelector).sendKeys(email);
    }
    public void resetPassButton(){
        log.info("je clique sur Orders");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonresetPassword = wait.until(ExpectedConditions.elementToBeClickable(resetPasswordButtonSelector));
        buttonresetPassword.click();
        //driver.findElement(ordersButtonSelector).click();

    }

    public String verifierEmailHasBeenSent() {
        return driver.findElement(emailHasBeenSentSelector).getText();

    }






}
