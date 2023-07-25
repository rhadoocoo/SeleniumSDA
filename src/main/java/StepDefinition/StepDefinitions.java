package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ChromeConfig;

public class StepDefinitions {
        ChromeDriver driver ;
        @Given("Deschid browserul")
        public void utilizatorulDeschidePagina()
        {
        driver =  ChromeConfig.getChromeDriver();
        }

        @When("Accesez pagina {string}")
        public void accesezPagina(String url)
        {
        driver.get(url);
        }


        @Then("Pagina {string} este afisata corect")
        public void paginaAfisataCorect(String expectedUrl)
        {
        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.equals(expectedUrl) : "URL-ul nu este cel așteptat";
        }

        @Then("Inchid browserul")
            public void inchidBrowserul(){
        driver.quit();
    }
}