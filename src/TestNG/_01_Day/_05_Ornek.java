package TestNG._01_Day;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Ornek extends BaseStaticDriver {

    void RegisterTest(){
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement element= driver.findElement(By.id("input-username"));
        element.sendKeys("barada2428");
        WebElement element2= driver.findElement(By.id("input-firstname"));
        element2.sendKeys("Nuri");
        WebElement element3= driver.findElement(By.id("input-lastname"));
        element2.sendKeys("aktepe");
        WebElement element4= driver.findElement(By.id("input-lastname"));
        element4.sendKeys("testaktepetest");
        WebElement element5= driver.findElement(By.id("input-country"));
        element5.click();
        WebElement element6= driver.findElement(By.cssSelector("value='3'"));
        element6.click();

        WaitClose();


    }
}
