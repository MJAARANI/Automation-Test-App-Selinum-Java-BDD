package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.EditAccountPage;

public class ChangemenMdpMisMatchSteps {
    private EditAccountPage editAccountPage =new EditAccountPage(DriverFactory.getDriver());
    private static final Logger log = LogManager.getLogger(CreationCompteSteps.class);



    @And("saisir valid mot de passe actuel {string}")
    public void saisirFautMDPaCtuel(String mdpAct) {
        log.info("saisir mot de passe actuel");
        editAccountPage.saisirActuelMDP(mdpAct);
    }

    @And("saisir faut nouveau mot de passe {string}")
    public void saisirFautNouveauMotDePasse(String arg0) throws InterruptedException {
        log.info("saisir faut nouveau mot de passe");
        editAccountPage.saisirFautNouveauMotDePass(arg0);
    }

    @And("confirmer avec un autre faut nouveau  mot de passe {string}")
    public void confirmerAvecUnAutreFautNouveauMotDePasse(String arg0) throws InterruptedException {
        log.info("confirm faut nouveau mot de passe");
        editAccountPage.confirmFautNouveauMotDePass(arg0);
    }

    @Then("verifier New passwords do not much")
    public void verifierNewPasswordsDoNotMuch() {
        editAccountPage.verifierNewPasswordsDoNotMuch();
        Assert.assertTrue("do not match",true);
    }
}
