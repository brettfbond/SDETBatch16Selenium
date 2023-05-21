package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String currentURL = driver.getCurrentUrl();
        System.out.println("The current website is " + currentURL);
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        Thread.sleep(5000);

        driver.quit();

    }
}
