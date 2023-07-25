package Locatori;

import org.openqa.selenium.By;

public class Locatori {
    public By numeButon(String buttonName){
       switch(buttonName) {
           case "Accepta":
               return By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div");
           case "Limba":
               return By.id("vc3jof");
           case "QAPractice-Button-Actions":
               return By.xpath("//*[@id=\"actions\"]");
           case "QAPractice-Button-DoubleClick":
               return By.xpath("//*[@id=\"double-click\"]");
           case "QAPractice-Button-Doubleclick-action":
               return By.xpath("//*[@id=\"double-click-btn\"]");
           default:
                throw new IllegalArgumentException("Butonul nu exista");



       }
    }
}
