package steps;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.HomePage;
import pages.MyAccountPage;

public class CreationCompteSteps   {
    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private MyAccountPage myAccountPage =new MyAccountPage(DriverFactory.getDriver());


/////////////////////////////////ARRANGE/////////////////////////////////////

    private static final Logger log = LogManager.getLogger(CreationCompteSteps.class);


/////////////////////////////////////ACT///////////////////////////////////////////////////
    @Given("l'utilisateur est dans la Home Page")
    public void open() {
        DriverFactory.getDriver().get("https://practice.automationtesting.in/");
    }

    @When("click My Account button")
    public void MyAccountButton() {
        log.info("Je clique sur le boutton My Account");
        homePage.clickMyAccountButton();

        
    }

    @And("saisir un {string}")
    public void saisirMail(String email) {
        log.info("saisir un '<Email>' valid");
        myAccountPage.saisirMail(email);
    }


    @And("cliquer sur Register")
    public void registerClick() {
        log.info("je clique sur register");
        myAccountPage.registerClick();

    }
    @And("cliquer sur Dashboard")
    public void dashboardClick() throws InterruptedException {
        log.info("je clique sur dashboard");
        myAccountPage.DashboardButton();

    }
    @Then("verifier la création d'un compte")
    public void verifierLaCréationDUnCompte() {
        myAccountPage.verifierCreationDeCompte();
        Assert.assertTrue("Hello",true);

    }




}




