package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;

public class BaseStaticDriver {
    public static WebDriver driver;

    static  {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);//Sadece ana sayfa yuklenirken en basta
        driver.manage().timeouts().implicitlyWait(dr);// butun webelement icin gecerli.

    }
    public static void WaitClose() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

        public static void Wait(int second) {
            try {
                Thread.sleep(second * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

