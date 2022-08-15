package Projects;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumBasic2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        WebElement element= driver.findElement(By.id("username"));
        element.sendKeys("ttechno@gmail.com");
        Wait(2);

        WebElement element2= driver.findElement(By.id("password"));
        element2.sendKeys("techno123");
        Wait(2);


        WebElement element3= driver.findElement(By.id("log-in"));
        element3.click();
        Wait(2);


    }

}
