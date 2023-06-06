package class05.HWclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openBrowserToURL("https://chercher.tech/practice/frames", "Chrome");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(animals);
        select.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).sendKeys("This is some text");

        Thread.sleep(4000);
        driver.quit();


    }
}
