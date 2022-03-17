package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverUtility {

    static private ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
    static private WebDriver driver;
    static private ChromeOptions opt = new ChromeOptions();

    public static ThreadLocal<WebDriver> getDriver() {
        return tlDriver;
    }

    public synchronized static void initBrowser() {
        opt.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://fb.com");
        tlDriver.set(driver);
    }

    public synchronized static void quitBrowser() {
        tlDriver.get().quit();
    }


}
