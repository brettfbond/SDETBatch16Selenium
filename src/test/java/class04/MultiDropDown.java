package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php", "Chrome");

        WebElement dd = CommonMethods.driver.findElement(By.xpath("//select[@name='States']"));

        Select select = new Select(dd);
        System.out.println(select.isMultiple());
        select.selectByVisibleText("California");
        select.selectByValue("Ohio");
        select.selectByIndex(7);
        Thread.sleep(4000);
        select.deselectByVisibleText("Ohio");
    }
}
