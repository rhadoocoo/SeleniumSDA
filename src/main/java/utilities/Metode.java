package utilities;

import Locatori.Locatori;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Metode {
    ChromeDriver driver;
    Locatori locatori;

    public Metode(ChromeDriver driver){
        this.driver=driver;
        locatori=new Locatori();
    }
    public void apasButonul (String numeButon)
        {
            By buttonLocator = locatori.numeButon(numeButon);
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

}
