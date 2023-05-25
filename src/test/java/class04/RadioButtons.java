package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class RadioButtons {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/basic-radiobutton-demo.php", "Chrome");
        WebElement r1 = CommonMethods.driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();

        boolean r1IsSelected = r1.isSelected();
        System.out.println(r1IsSelected);

        boolean r1IsDisplayed = r1.isDisplayed();
        System.out.println(r1IsDisplayed);

        boolean r1IsEnabled = r1.isEnabled();
        System.out.println(r1IsEnabled);
    }
}
