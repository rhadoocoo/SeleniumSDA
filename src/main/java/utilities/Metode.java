package utilities;

import Locatori.Locatori;
import StepDefinition.StepDefinitions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Metode extends StepDefinitions {
    ChromeDriver driver;
    Locatori locatori;



    public Metode(ChromeDriver driver){
        this.driver=driver;
        locatori=new Locatori();

    }


    public void pushButton (String buttonID)
        {

            By buttonLocator = locatori.numeButon(buttonID);
            WebElement element = driver.findElement(buttonLocator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();

        }

    public void astept(int x) {
        try {
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void dubluClick(String numeButon) {
        By buttonLocator = locatori.numeButon(numeButon);
        WebElement element = driver.findElement(buttonLocator);
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }
    public void confirmDubluClick(){
        String expectedText = "Congrats, you double clicked!";
        String actualText = driver.findElement(By.xpath("//*[@id=\"double-click-result\"]")).getText();
        if (!expectedText.equals(actualText)) throw new AssertionError("Textul nu este corect");
    }

    public void oprescAlerta(){
        Alert alert=driver.switchTo().alert();
        String alertText= alert.getText();
        String expectedText="Hello! I am an alert box!!";
        if(alertText.equals(expectedText)){
            System.out.println("Alerta conține textul așteptat.");
        } else {
            System.out.println("Alerta nu conține textul așteptat.");
        }
        alert.accept();
        }
    public void alertaDismiss(){
        Alert alert=driver.switchTo().alert();
        alert.dismiss();

    }
    public void alertaAccept(){
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    public void selectezFisierul() {
        WebElement inputFile= driver.findElement(By.id("file_upload"));
        String filePath = "D:\\Exemplu.txt";
        inputFile.sendKeys(filePath);

    }

    public void submit(String numeButon) {
        By buttonLocator = locatori.numeButon(numeButon);
        WebElement element = driver.findElement(buttonLocator);
        element.submit();
    }

    public void confirmareUpload(){
        String expectedText = "You have successfully uploaded \"Exemplu.txt\"";
        String actualText = driver.findElement(By.id("file_upload_response")).getText();
        if (!expectedText.equals(actualText)) throw new AssertionError("Nu s-a realizat upload");
    }

     public void cautProdus(String value,String numeCamp) throws InterruptedException {
            By fieldLocator=locatori.numeCamp(numeCamp);
            WebElement element = driver.findElement(fieldLocator);
            for (char litera :value.toCharArray()){
                element.sendKeys(Character.toString(litera));
                Thread.sleep(500);
            }
            Thread.sleep(2000);

    }
    public void searchItem(String searchItemResult){
        String expectedText = "Search results for: "+"'"+searchItemResult+"'";
        String actualText = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
        if (!expectedText.equals(actualText)) throw new AssertionError("Produsul cautat este corect");
    }
    public void searchItemList(String searchItem){
        List<WebElement> rezultate=driver.findElements(By.cssSelector("#maincontent > div.columns > div.column.main > div.search.results > div.products.wrapper.grid.products-grid > ol > li:nth-child(2) > div > div > strong > a"));
        for(WebElement rezultat:rezultate){
            String textRezultat=rezultat.getText();
            if (textRezultat.toLowerCase().contains(searchItem.toLowerCase())) {
                System.out.println("Rezultatul \"" + textRezultat + "\" are legătură cu termenul căutat \"" + searchItem + "\".");
            } else {
                System.out.println("Rezultatul \"" + textRezultat + "\" nu are legătură cu termenul căutat \"" + searchItem + "\".");
            }
        }

    }



}
