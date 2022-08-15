package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test6SendText extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement element=driver.findElement(By.partialLinkText("No, thanks!"));
        element.click();
        Wait(3);
        WebElement textBox= driver.findElement(By.id("user-message"));
        textBox.sendKeys("merhaba Selenium");
        Wait(3);

        WebElement button= driver.findElement(By.className("btn-default"));
        button.click();
        Wait(3);

        WebElement mesage= driver.findElement(By.id("display"));

        if (mesage.getText().contains("merhaba Selenium"))
            System.out.println("Test Success");
        else
            System.out.println("Test Faild");




         WaitClose();
    }
}
