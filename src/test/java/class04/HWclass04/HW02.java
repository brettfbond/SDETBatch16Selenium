package class04.HWclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class HW02 {
    public static void main(String[] args) throws InterruptedException {
        CommonMethods.openBrowserToURL("http://www.fb.com", "Chrome");
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("11");
        WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
        Select selectDay = new Select(day);
        selectDay.selectByValue("19");
        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1980");
        Thread.sleep(4000);
        driver.quit();

    }
}
