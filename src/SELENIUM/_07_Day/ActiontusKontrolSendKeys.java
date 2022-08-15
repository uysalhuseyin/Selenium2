package SELENIUM._07_Day;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActiontusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        WebElement element= driver.findElement(By.id("autoCompleteSingle"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).click().keyDown(Keys.SHIFT)
                .sendKeys("a").keyUp(Keys.SHIFT)
                .sendKeys("hmet").build();
        Wait(2);
        aksiyon.perform();

        Wait(3);



     WaitClose();

    }
}
