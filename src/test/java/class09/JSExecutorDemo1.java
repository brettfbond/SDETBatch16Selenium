package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class JSExecutorDemo1 {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "Chrome");
        WebElement userNameTxtBox = driver.findElement(By.id("txtUsername"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.backgroundColor='blue'", userNameTxtBox);
        js.executeScript("arguments[0].style.border='2px solid red'", userNameTxtBox);
    }
}
