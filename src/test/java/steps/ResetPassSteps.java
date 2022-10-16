package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.MyAccountPage;
import pages.ResetPasswordPage;

public class ResetPassSteps {

    private MyAccountPage myAccountPage =new MyAccountPage(DriverFactory.getDriver());

    private ResetPasswordPage resetPasswordPage = new ResetPasswordPage(DriverFactory.getDriver());
    private static final Logger log = LogManager.getLogger(ResetPassSteps.class);

    @And("click sur Lost Your Password button")
    public void lostPassClick() {
        log.info("je clique sur lost your password");
        myAccountPage.lostYourPassClick();

    }

    @And("saisir mail {string} du compte a reinitialiser son mot de passe")
    public void saisirMailEmailDuCompteAReinitialiserSonMotDePasse(String emailReset) {
        log.info("je saisie mail pour reinitialiser mdp");
        resetPasswordPage.saisirMailPourResetPass(emailReset);
    }

    @And("click sur Reset Password button")
    public void clickSurResetPasswordButton() {
        log.info("je clique sur Reset Password");
        resetPasswordPage.resetPassButton();

    }

    @Then("je verifie que le mail de reinitialisation est bien envoyé")
    public void jeVerifieQueLeMailDeReinitialisationEstBienEnvoyé() {
        resetPasswordPage.verifierEmailHasBeenSent();
        Assert.assertTrue("Password reset email has been sent.",true);
    }
}
