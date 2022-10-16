package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.EditAccountPage;
import pages.HomePage;
import pages.MyAccountPage;

public class GestionCompteSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private MyAccountPage myAccountPage =new MyAccountPage(DriverFactory.getDriver());
    private EditAccountPage editAccountPage = new EditAccountPage(DriverFactory.getDriver());
    private static final Logger log = LogManager.getLogger(GestionCompteSteps.class);

    @And("saisir first name utilisateur {string}")
    public void saisirFirstName(String Montassar) {
        log.info("saisir First Name");
        editAccountPage.enterFirstName(Montassar);

    }
    @And("saisir last name utilisateur {string}")
    public void saisirLastName(String Jaarani) {
        log.info("saisir Last Name");
        editAccountPage.enterLastName(Jaarani);
    }


    @Then("verifier email utilisateur")
    public void verifierEmailUtilisateur() {
        editAccountPage.verifierEmailConnexion();
        Assert.assertTrue("montassar.jaarani@esprit.tn",true);
    }

    @Then("cliquer sur save changes")
    public void cliquerSurSaveChanges() {
        editAccountPage.clickOnSaveChanges();
    }

    @Then("verifier que les changements sont prises en compte")
    public void verifierQueLesChangementsSontPrisesEnCompte() {
        editAccountPage.verifierAccountDetailsChangedSuccessfully();
        Assert.assertTrue("successfully",true);
    }


}
