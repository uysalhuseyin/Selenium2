package SELENIUM;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");
        WebElement button1= driver.findElement(By.id("sp-cc-accept"));
        button1.click();
        WebElement menu=driver.findElement(By.id("searchDropdownBox"));
        Select menudb=new Select(menu);
        menudb.selectByVisibleText("Bahçe");
        Wait(2);
        WebElement button= driver.findElement(By.id("nav-search-submit-button"));
        button.click();
        Wait(2);
        WaitClose();
    }
}
