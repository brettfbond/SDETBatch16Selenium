package class03.HWclass03;

import org.openqa.selenium.By;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class HW02 {
    public static void main(String[] args) {
        CommonMethods.openBrowserToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D", "Chrome");
        driver.findElement(By.cssSelector("input[name='txtUsername'")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[value='LOGIN'")).click();
        var error = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        if (error.getText().equals("Password cannot be empty")) {
            System.out.println("Error message passes");
        } else System.out.println("Error message fails");
    }
}
