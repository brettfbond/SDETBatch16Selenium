package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

import static utils.CommonMethods.driver;

public class DynamicTables2 {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "Chrome");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("53502A")) {
                System.out.println("Click on the checkbox on Row Number " + (i+1));
                driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]")).click();
            }

        }

        }
    }

