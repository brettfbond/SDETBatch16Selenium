package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class ActionClassDemo2 {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("https://jqueryui.com/droppable/", "Chrome");

        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable, droppable).perform();


    }
}
