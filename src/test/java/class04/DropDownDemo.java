package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class DropDownDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserToURL("https://www.facebook.com", "Chrome");
        var createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        Select select = new Select(days);
        select.selectByVisibleText("8");
        Thread.sleep(5000);
        select.selectByValue("26");
    }
}
