package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.Set;

import static utils.CommonMethods.driver;

public class WindowHandles {
    public static void main(String[] args) {

        String URL="http://accounts.google.com/signup";
        String browser="Chrome";
        CommonMethods.openBrowserToURL(URL,browser);

//click on the help button and privacy button
        WebElement helpBtn=driver.findElement(By.linkText("Help"));
        helpBtn.click();

        WebElement privacybtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacybtn.click();

        String mainPageHandle = driver.getWindowHandle();
        System.out.println("Main page handle is :" + mainPageHandle);

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equals("Google Account Help")) break;

            // System.out.println("The title associated with " + handle + " is: " + title);
        }
        System.out.println("the current focus is: " + driver.getTitle());

        driver.switchTo().window(mainPageHandle);
        System.out.println("The focus is on: " + driver.getTitle());
    }
}
