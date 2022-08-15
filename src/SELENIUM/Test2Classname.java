package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2Classname extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.trendyol.com/en/select-country");
        WebElement element= driver.findElement(By.className("country-actions"));
        System.out.println(element.getText());
//findElement ayni elemendan birden fazla var ise ilkini getirir.


        WaitClose();
    }
}
