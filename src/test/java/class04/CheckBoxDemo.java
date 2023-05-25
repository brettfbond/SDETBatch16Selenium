package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class CheckBoxDemo {
    public static void main(String[] args) {
        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/basic-checkbox-demo.php", "Chrome");

        // Check the checkbox if not already checked
        var c1 = CommonMethods.driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        if (!c1.isSelected()) c1.click();

        List < WebElement> options = CommonMethods.driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement option : options ) {
            String value = option.getAttribute("value");
            if (value.equals("Option-3")) option.click();
            break;
        }

    }
}
