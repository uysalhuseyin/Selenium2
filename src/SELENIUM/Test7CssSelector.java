package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test7CssSelector extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement element= driver.findElement(By.id("u_nH7_4586_0"));
        element.click();
        Wait(3);
        WebElement element2=driver.findElement(By.id("u_nH7_4588"));
        element2.click();
        Wait(3);
        WebElement element3= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        element3.click();
        Wait(2);

        WebElement element4=driver.findElement(By.id("u_nH7_89585_0"));
        element4.click();
        Wait(2);
        WebElement element5=driver.findElement(By.id("u_nH7_4589_0"));
        element5.click();
        Wait(2);

        WebElement element6=driver.findElement(By.id("u_nH7_4597"));
        element6.click();
        Wait(2);

        WebElement element7=driver.findElement(By.cssSelector("[id=u_nH7_4597]>:nth-child(4)"));
        element7.click();
        Wait(3);


        WaitClose();
    }
}
