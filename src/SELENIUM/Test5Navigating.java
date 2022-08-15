package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        Wait(3);
        driver.navigate().back();
        Wait(3);
        driver.navigate().forward();
        WaitClose();
    }
}
