package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class JSExecutorDemo3 {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "Chrome");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        js.executeScript("arguments[0].click();", loginBtn);

    }
}
