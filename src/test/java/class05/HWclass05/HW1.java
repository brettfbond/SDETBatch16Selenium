package class05.HWclass05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/javascript-alert-box-demo.php", "Chrome");
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Test");
        Thread.sleep(3000);
        alert.accept();
    }
}
