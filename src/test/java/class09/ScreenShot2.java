package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

import static utils.CommonMethods.driver;
import static utils.CommonMethods.takeScreenshot;

public class ScreenShot2 {
    public static void main(String[] args) throws IOException {

        CommonMethods.openBrowserToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "Chrome");
        //        find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);

        takeScreenshot("ssTest.png");
    }
}
