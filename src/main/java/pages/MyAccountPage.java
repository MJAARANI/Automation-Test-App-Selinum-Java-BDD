package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class MyAccountPage {
    private WebDriver driver;
    private final int TIMEOUT_COOKIE = 6;

    //1-locators
    ////////////////////////////////////////////////CreationCompteselector/////////////////////////////////////////////////////////////////
    private By saisirMailSelector = By.cssSelector("[name=email]");
    private By saisirMDPSelector = By.cssSelector("#reg_password");
    private By registerClickSelector = By.cssSelector("input[name='register']");
    private By dashboardButtonSelector = By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/'])[3]");

    private By verificationCreationCompteSelector = By.cssSelector("strong");



    ///////////////////////////////////////////////AuthentificationSelector///////////////////////////////////////////////////////////////
    private By saisirMailAuthSelector = By.cssSelector("#username");
    private By saisirMDPAuthSelector = By.cssSelector("#password");
    private By loginClickAuthSelector = By.cssSelector("[name=login]");
    private By ordersButtonSelector =By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/orders/'])[1]");
    private By downloadsButtonSelector =By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/downloads/'])[1]");
    private By addressesButtonSelector = By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/edit-address/'])[1]");
    private By accountDetailsButtonSelector =By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/edit-account/'])[1]");
    private By logoutButtonSelector = By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/customer-logout/'])[1]");
    ///////////////////////////////////////////////reinitialisationSelector///////////////////////////////////////////
    private By lostPassClickSelector = By.xpath("(//*[@href='https://practice.automationtesting.in/my-account/lost-password/'])[1]");


    private static final Logger log = LogManager.getLogger(HomePage.class);
    //2-Constructor of the page
    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }


    //3-page actions
    public void saisirMail(String email){

        double rand = Math.random();
        String inputEmail = email + rand + "@gmail.com";
        log.info("sasir mail valid");
        driver.findElement(saisirMailSelector).sendKeys(inputEmail);

    }
    public void saisirMotDePass(String mdp) throws InterruptedException {

        log.info("sasir mot de passe valid");
        WebElement field = driver.findElement(saisirMDPSelector);
        String text = mdp;
        for (int i = 0; i < text.length(); i++) {
            field.sendKeys(String.valueOf(text.charAt(i)));
            Thread.sleep(500);
        }
    }

    public void registerClick(){

        log.info("je clique sur register");
        driver.findElement(registerClickSelector).click();

    }
    public void DashboardButton()  {

        log.info("je clique sur Dashboard");
        //driver.findElement(dashboardButtonSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonRegister = wait.until(ExpectedConditions.elementToBeClickable(dashboardButtonSelector));
        buttonRegister.click();

    }

    public String verifierCreationDeCompte() {
        return driver.findElement(verificationCreationCompteSelector).getText();

    }

///////////////////////////////AuthentificationStepsMethod////////////////////////////////////////////////////////

    public void saisirMailAuthentification(String email){
        log.info("sasir ton mail de connexion");
        driver.findElement(saisirMailAuthSelector).sendKeys(email);
    }
    public void saisirMotDePassAuthentification(String mdp) throws InterruptedException {

        log.info("sasir mot de passe Authentification valid");
        WebElement field = driver.findElement(saisirMDPAuthSelector);
        String text = mdp;
        for (int i = 0; i < text.length(); i++) {
            field.sendKeys(String.valueOf(text.charAt(i)));
            Thread.sleep(500);
        }
    }
    public void loginClick(){
        log.info("je clique sur login");
        driver.findElement(loginClickAuthSelector).click();
    }

    public void ordersButton(){
        log.info("je clique sur Orders");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonOrders = wait.until(ExpectedConditions.elementToBeClickable(ordersButtonSelector));
        buttonOrders.click();
        //driver.findElement(ordersButtonSelector).click();

    }
    public void downnloadsButton(){
        log.info("je clique sur Downloads");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonDownloads = wait.until(ExpectedConditions.elementToBeClickable(downloadsButtonSelector));
        buttonDownloads.click();

    }
    public void addressesButton(){
        log.info("je clique sur Addresses");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonAddress = wait.until(ExpectedConditions.elementToBeClickable(addressesButtonSelector));
        buttonAddress.click();

    }
    public void accountDetailsButton(){
        log.info("je clique sur account details");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonAccountDetails = wait.until(ExpectedConditions.elementToBeClickable(accountDetailsButtonSelector));
        buttonAccountDetails.click();

    }
    public void logoutButton(){
        log.info("je clique sur Logout");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonLogout = wait.until(ExpectedConditions.elementToBeClickable(logoutButtonSelector));
        buttonLogout.click();

    }


/////////////////////////////////////////////////reinitialisationMdpSteps//////////////////////////////////////////////////


    public void lostYourPassClick(){
        log.info("je clique sur lost your password");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement buttonLostPass = wait.until(ExpectedConditions.elementToBeClickable(lostPassClickSelector));
        buttonLostPass.click();


    }




}
