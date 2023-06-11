package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

import static utils.CommonMethods.driver;

public class Calendars {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("https://www.aa.com/homePage.do?locale=en_US", "Chrome");
        driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();


        boolean monthFound = false;
        while (!monthFound) {
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])"));
            String currentMonth = month.getText();
            if (currentMonth.equals("August")) {
                System.out.println("You are on the right month");
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : allDates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("4")) {
                        date.click();
                    }
                }
                monthFound = true;
            } else {
                driver.findElement(By.xpath("//a[@data-handler='next']")).click();
            }
        }

    }
}
