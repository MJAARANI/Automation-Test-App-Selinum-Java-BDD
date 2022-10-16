package pages;

import io.cucumber.java.en.And;
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
    private By currentPassIsIncorrect = By.cssSelector("ul[class='woocommerce-error'] li");
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
    public void verifierEmailConnexion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement emailUtilisateur = wait.until(ExpectedConditions.visibilityOfElementLocated(emailCurrentAccount));
        emailUtilisateur.getText();
    }

    public void clickOnSaveChanges() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonSaveChanges = wait.until(ExpectedConditions.elementToBeClickable(savechangesSelector));
        buttonSaveChanges.click();
        //driver.findElement(savechangesSelector).click();
    }
    public void verifierAccountDetailsChangedSuccessfully(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement tesxtSaveChangesSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(accountDetailsChangedSuccessfulySelector));
        tesxtSaveChangesSuccess.getText();
    }
    ///////////////////////ChangementMdpSteps//////////////////////////
    public void saisirFautMDP(String fautMDP) {
        driver.findElement(currentPasswordSelector).sendKeys(fautMDP);
    }
    public void saisirNouveauMotDePassValid(String mdp) throws InterruptedException {

        log.info("sasir nouveau mot de passe valid");
        WebElement field = driver.findElement(newPassSelector);
        String text = mdp;
        for (int i = 0; i < text.length(); i++) {
            field.sendKeys(String.valueOf(text.charAt(i)));
            Thread.sleep(500);
        }
    }
    public void confirmNouveauMotDePassValid(String mdp) throws InterruptedException {

        log.info("sasir nouveau mot de passe valid");
        WebElement field = driver.findElement(confirmPassSelector);
        String text = mdp;
        for (int i = 0; i < text.length(); i++) {
            field.sendKeys(String.valueOf(text.charAt(i)));
            Thread.sleep(500);
        }
    }
    public void verifierCurrentPasswordIsIncorrect(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement tesxtSaveChangesSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(currentPassIsIncorrect));
        tesxtSaveChangesSuccess.getText();
    }

    ///////////////////////////////ChangementMdpMisMuchSteps////////////////

    public void saisirActuelMDP(String actuelMDP) {
        log.info("sasir mot de passe actuel ");
        driver.findElement(currentPasswordSelector).sendKeys(actuelMDP);
    }
    public void saisirFautNouveauMotDePass(String mdp) throws InterruptedException {

        log.info("sasir faut nouveau mot de passe ");
        WebElement field = driver.findElement(newPassSelector);
        String text = mdp;
        for (int i = 0; i < text.length(); i++) {
            field.sendKeys(String.valueOf(text.charAt(i)));
            Thread.sleep(500);
        }
    }
    public void confirmFautNouveauMotDePass(String mdp) throws InterruptedException {

        log.info("sasir nouveau mot de passe valid");
        WebElement field = driver.findElement(confirmPassSelector);
        String text = mdp;
        for (int i = 0; i < text.length(); i++) {
            field.sendKeys(String.valueOf(text.charAt(i)));
            Thread.sleep(500);
        }
    }
    public void verifierNewPasswordsDoNotMuch(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement tesxtSaveChangesSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(currentPassIsIncorrect));
        tesxtSaveChangesSuccess.getText();
    }








}
