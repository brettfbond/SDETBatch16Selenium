package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class KeysDemo {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx", "Chrome");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB);
        // After this you would still have to find the Webelement to send keys.
        // This is just an example of how we can press keys.
        // Often we might need to press ENTER
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);

    }
}
