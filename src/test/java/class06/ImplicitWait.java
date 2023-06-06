package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;

import static utils.CommonMethods.driver;
import static utils.CommonMethods.sendText;

public class ImplicitWait {
    public static void main(String[] args) {
        CommonMethods.openBrowserToURL("https://www.fb.com", "Chrome");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abracadabra", firstName);



    }
}
