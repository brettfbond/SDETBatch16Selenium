package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class ActionClassDemo1 {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("http://amazon.com/", "Chrome");
        WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        Actions action = new Actions(driver);
        action.moveToElement(signIn);


    }
}
