package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class JSExecutorDemo2 {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserToURL("https://amazon.com", "Chrome");
        JavascriptExecutor js = (JavascriptExecutor) driver;
          // scroll down
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
          // scroll up
        js.executeScript("window.scrollBy(0, -500)");

        WebElement allBtn = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
 //       allBtn.click();
        js.executeScript("arguments[0].click()", allBtn); // isn't working for some reason

    }
}
