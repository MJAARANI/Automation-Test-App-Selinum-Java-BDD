package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.MyAccountPage;

public class DeconnexionSteps {
    private MyAccountPage myAccountPage =new MyAccountPage(DriverFactory.getDriver());
    private static final Logger log = LogManager.getLogger(DeconnexionSteps.class);

    @Then("verifier pavé Login")
    public void verifierPaveLOgin() {
        myAccountPage.verifierpaveLogin();
        Assert.assertTrue("Login",true);
    }

    @Then("verifier pavé Register")
    public void verifierPaveReg() {
        myAccountPage.verifierpaveRegister();
        Assert.assertTrue("Register",true);
    }


}
