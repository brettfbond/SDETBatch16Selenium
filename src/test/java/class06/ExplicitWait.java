package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

import static utils.CommonMethods.driver;

public class ExplicitWait {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver", "Chrome");
        driver.findElement(By.xpath("//*[@id='enable-button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        driver.findElement(By.xpath("//button[text()='Button']")).click();

        driver.findElement(By.xpath("//button[@id='alert']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
