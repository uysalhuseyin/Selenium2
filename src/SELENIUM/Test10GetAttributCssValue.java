package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test10GetAttributCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));
        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));

        System.out.println(inputValEnter.getCssValue("color"));









        WaitClose();

    }
}
