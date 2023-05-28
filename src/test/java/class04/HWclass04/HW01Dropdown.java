package class04.HWclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class HW01Dropdown {
    public static void main(String[] args) throws InterruptedException {
        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php", "Chrome");
        WebElement dropdown = driver.findElement(By.cssSelector("select[id=select-demo]"));
        Select select = new Select(dropdown);
        select.selectByValue("Tuesday");
        Thread.sleep(3000);
        select.selectByValue("Thursday");
        Thread.sleep(3000);
        select.selectByValue("Friday");
        Thread.sleep(3000);
        driver.quit();
    }
}
