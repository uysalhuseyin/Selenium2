package Projects;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumBasic extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/text-box");
        WebElement element= driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        element.sendKeys("Automation");
        Wait(2);
        //[placeholder='name@example.com']
        WebElement element2= driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        element2.sendKeys("Testing@gmail.com");
        Wait(2);
        WebElement element3= driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        element3.sendKeys("Testing Current Address");
        Wait(2);
        WebElement element4= driver.findElement(By.id("submit"));
        element4.click();
        Wait(2);

        WaitClose();


    }
}
