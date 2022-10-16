package runner;

import commun.ImportResultsToXray;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;


@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = false,
        features = "src/test/resources/features/gestionCompte.feature",
        glue = {"steps","AppHooks"},
        //tags = {"@POEI22-753"},
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)
public class Runner {
/*
    @AfterClass
    public static void remonte() throws NoSuchAlgorithmException, KeyStoreException, IOException, InterruptedException, KeyManagementException {
        ImportResultsToXray res = new ImportResultsToXray();
        res.RemonteResultats();
    }
 */
}
