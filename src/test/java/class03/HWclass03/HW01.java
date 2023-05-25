package class03.HWclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import static utils.CommonMethods.driver;


public class HW01 {
    public static void main(String[] args) {
        CommonMethods.openBrowserToURL("http://practice.syntaxtechs.net/input-form-demo.php", "Chrome");
        driver.findElement(By.cssSelector("input[data-bv-field = 'first_name']")).sendKeys("Brett");
        driver.findElement(By.cssSelector("input[data-bv-field = 'last_name']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[data-bv-field = 'email']")).sendKeys("brettbond@email.com");
        driver.findElement(By.cssSelector("input[data-bv-field = 'phone']")).sendKeys("90155555555");
        driver.findElement(By.cssSelector("input[data-bv-field = 'address']")).sendKeys("456 Elm St");
        driver.findElement(By.cssSelector("input[data-bv-field = 'city']")).sendKeys("Memphis");
        var state = driver.findElement(By.cssSelector("select[name='state'"));
        var select = new Select(state);
        select.selectByVisibleText("Tennessee");
        driver.findElement(By.cssSelector("input[data-bv-field = 'zip']")).sendKeys("38101");
        driver.findElement(By.cssSelector("input[placeholder = 'Website or domain name']")).sendKeys("https://www.brett.com");
        driver.findElement(By.cssSelector("input[value='no']")).click();
        driver.findElement(By.cssSelector("textarea[placeholder = 'Project Description']")).sendKeys("This project is for practicing Selenium.");

    }
}
