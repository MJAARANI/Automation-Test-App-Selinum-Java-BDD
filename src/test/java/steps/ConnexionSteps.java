package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.MyAccountPage;

public class ConnexionSteps  {

    private MyAccountPage myAccountPage =new MyAccountPage(DriverFactory.getDriver());



    private static final Logger log = LogManager.getLogger(CreationCompteSteps.class);

    @And("saisir votre {string} de connexion")
    public void saisirMailAuth(String emailCompte) throws InterruptedException{
        log.info("saisir votre '<email>' de connexion");
        myAccountPage.saisirMailAuthentification(emailCompte);
    }
    @And("saisir votre {string}")
    public void saisirMdpAuth(String MDPcompte) throws InterruptedException {
        log.info("saisir un '<mdp>' valid");
        myAccountPage.saisirMotDePassAuthentification(MDPcompte);

    }
    @And("cliquer sur login")
    public void loginClick() {
        log.info("je clique sur dashboard");
        myAccountPage.loginClick();

    }
    @And("cliquer sur Orders")
    public void OrdersClick() {
        log.info("je clique sur dashboard");
        myAccountPage.ordersButton();

    }

    @And("cliquer sur Downloads")
    public void downloadsClick() {
        log.info("je clique sur Downloads");
        myAccountPage.downnloadsButton();

    }

    @And("cliquer sur Adresses")
        public void addressesClick() {
        log.info("je clique sur Adresses");
        myAccountPage.addressesButton();

    }
    @And("cliquer sur Account Details")
    public void accountDetailsClick() {
        log.info("je clique sur Account Details");
        myAccountPage.accountDetailsButton();

    }
    @And("cliquer sur Logout")
    public void logoutClick() {
        log.info("je clique sur Account Details");
        myAccountPage.logoutButton();

    }




}
