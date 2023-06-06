package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserToURL(String url, String browser) {

        switch (browser) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static void closeBrowser() {
        if (driver != null) driver.quit();
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }
}
