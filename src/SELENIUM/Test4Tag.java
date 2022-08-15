package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test4Tag extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");
        List<WebElement> list=driver.findElements(By.tagName("a"));
        for (WebElement e:list
             ) {
            System.out.println(e.getText());

        }

        WaitClose();
    }
}
