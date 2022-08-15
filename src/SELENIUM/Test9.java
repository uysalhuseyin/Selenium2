package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test9 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        WebElement element= driver.findElement(By.id("user-name"));
        element.sendKeys("standard_user");
        Wait(2);

        WebElement element2= driver.findElement(By.id("password"));
        element2.sendKeys("secret_sauce");
        Wait(2);


        WebElement elemen3= driver.findElement(By.id("login-button"));
        elemen3.click();
        Wait(2);

        WebElement elemen4= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        elemen4.click();
        Wait(2);

        WebElement elemen5= driver.findElement(By.cssSelector("[name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        elemen5.click();
        Wait(2);

        WebElement elemen6= driver.findElement(By.cssSelector("[class='shopping_cart_badge']"));
        elemen6.click();
        Wait(2);

        WebElement elemen7= driver.findElement(By.id("checkout"));
        elemen7.click();
        Wait(2);

        WebElement elemen8= driver.findElement(By.id("first-name"));
        elemen8.sendKeys("Test");
        Wait(2);

        WebElement elemen9= driver.findElement(By.id("last-name"));
        elemen9.sendKeys("Test2");
        Wait(2);

        WebElement elemen10= driver.findElement(By.id("postal-code"));
        elemen10.sendKeys("aaaa");
        Wait(2);

        WebElement elemen11= driver.findElement(By.id("continue"));
        elemen11.click();
        Wait(2);

        WebElement elemen12= driver.findElement(By.id("finish"));
        elemen12.click();
        Wait(2);














        WaitClose();
    }
}
