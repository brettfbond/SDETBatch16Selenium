package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[data-testid = 'open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name = 'firstname']")).sendKeys("brett");

    }
}
