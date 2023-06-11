package class09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class RightAndDoubleClickActions {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("http://demo.guru99.com/test/simple_context_menu.html", "Chrome");
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        // Right click is also called context click
        action.contextClick(rightClick).perform();
        WebElement editOpt = driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(editOpt).perform(); // another way to click using Actions class
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        action.doubleClick().perform();
        alert = driver.switchTo().alert();
        alert.accept();

    }
}
