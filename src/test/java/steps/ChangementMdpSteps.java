package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.EditAccountPage;


public class ChangementMdpSteps {
    private EditAccountPage editAccountPage =new EditAccountPage(DriverFactory.getDriver());
    private static final Logger log = LogManager.getLogger(CreationCompteSteps.class);

    @And("saisir faut mot de passe actuel {string}")
    public void saisirFautMDPaCtuel(String fautmdpAct) {
        log.info("saisir faut mot de passe actuel");
        editAccountPage.saisirFautMDP(fautmdpAct);
    }


    @And("saisir nouveau mot de passe {string}")
    public void saisirNouveauMotDePasse(String arg0) throws InterruptedException {
        log.info("saisir nouveau mot de passe valid");
        editAccountPage.saisirNouveauMotDePassValid(arg0);
    }

    @And("confirmer nouveau mot de passe {string}")
    public void confirmerNouveauMotDePasse(String arg0) throws InterruptedException {
        log.info("confirmer nouveau mot de passe valid");
        editAccountPage.confirmNouveauMotDePassValid(arg0);

    }

    @Then("verifier your current password is incorrect")
    public void verifierYourCurrentPasswordIsIncorrect() {
        editAccountPage.verifierCurrentPasswordIsIncorrect();
        Assert.assertTrue("incorrect",true);
    }
}
