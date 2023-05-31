package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/javascript-alert-box-demo.php", "Chrome");
        driver.findElement(By.xpath("//button[@onClick='myAlertFunction()']")).click();

        Thread.sleep(3000);

        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

        driver.findElement(By.xpath("//button[@onClick='myConfirmFunction()']")).click();
        Thread.sleep(3000);
        Alert confirmationAlert2 = driver.switchTo().alert();
        confirmationAlert2.dismiss();


    }
}
