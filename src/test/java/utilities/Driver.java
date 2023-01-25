package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Driver {
    /*
        Driver daki temel mantık extents yöntemiyle değil yani TestBase class'ına extent etmek yerine
    Driver class'ından statik methodlar kullanarak driver oluştururuz.
    1-İlk olarak public static WebDriver getDriver() methodu oluşturmak. Bu method bize bir driver getirecek
    2-Driver'i kapatacağımız zaman da public static void closeDriver() methodu oluşturmak. İstediğimiz zaman
    bu methodla driver'i kapatacağız
     */
    static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {//EĞER DRIVER'A DEĞER ATANMAMIŞSA DEĞER ATA, EĞER DEĞER ATANMIŞŞSA DRİVER'I AYNI SAYFADA RETURN ET
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) { //Driver'a değer atanmışsa
            driver.close();
            driver = null;
        }
    }
    public static void quitDriver() {
        if (driver != null) { //Driver'a değer atanmışsa
            driver.quit();
            driver = null;
        }
    }
}
