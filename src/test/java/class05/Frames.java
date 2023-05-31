package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class Frames {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("https://chercher.tech/practice/frames", "Chrome");
        driver.switchTo().frame(1);
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).sendKeys("text");

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();

    }
}
