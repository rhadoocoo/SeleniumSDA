package StepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ChromeConfig;
import utilities.Metode;

public class StepDefinitions {
        ChromeDriver driver ;
        Metode metode;



        @Given("Deschid browserul")
        public void utilizatorulDeschidePagina()
        {
        driver =  ChromeConfig.getChromeDriver();
        metode = new Metode(driver);
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
        public void inchidBrowserul()
        {
        driver.quit();
        }

        @And("Apas butonul {string}")
                public void apasButonul(String numeButon){
        metode.apasButonul(numeButon);
        }

        @And("Astept {int} secunde")
        public void astept(int secunde){
            metode.astept(secunde);
        }

        @And("Dau dubluclick pe butonul {string}")
        public void dubluClick(String numeButon){
            metode.dubluClick(numeButon);
        }

        @And ("Confirm ca am dat dubluclick")
        public void confirmDubluClick(){
            metode.confirmDubluClick();
        }

        @And("Opresc alerta")
        public void oprescAlerta(){
            metode.oprescAlerta();
        }

        @And("Dau click pe Ok in alerta aparuta")
        public void acceptAlerta(){
            metode.alertaAccept();
        }
        @And("Dau click pe Cancel in alerta aparuta")
        public void dismissAlerta(){
            metode.alertaDismiss();
        }
        @And("Selectez fisierul pe care vreau sa il uploadez")
        public void selectezFisierul(){
            metode.selectezFisierul();
        }
        @And("Trimit apasand pe butonul {string}")
        public void submitFile(String numeButon){
            metode.apasButonul(numeButon);
        }
        @And("Primesc confirmare ca fisierul s-a uploadat cu succes")
        public void confirmareUpload(){
            metode.confirmareUpload();
        }



}